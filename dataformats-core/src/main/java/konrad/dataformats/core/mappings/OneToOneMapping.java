package konrad.dataformats.core.mappings;

import konrad.dataformats.core.Data;
import konrad.dataformats.core.DataFormat;
import konrad.dataformats.core.DataFormatId;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.Value;
import konrad.dataformats.core.types.BigDecimalType;
import konrad.dataformats.core.types.BigIntegerType;
import konrad.dataformats.core.types.DoubleType;
import konrad.dataformats.core.types.EnumType;
import konrad.dataformats.core.types.IntegerType;
import konrad.dataformats.core.types.StringType;
import konrad.dataformats.core.types.Type;
import konrad.dataformats.core.validation.DataFormatsException;
import konrad.dataformats.core.validation.Validations;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public class OneToOneMapping implements Mapping {
    private final DataFormat fromFormat;
    private final DataFormat toFormat;
    private final Path fromPath;
    private final Path toPath;
    private final Type fromType;
    private final Type toType;

    public OneToOneMapping(DataFormat fromFormat, DataFormat toFormat, Path fromPath, Path toPath) {
        this.fromFormat = Validations.validateNotNull(fromFormat, "fromFormat");
        this.toFormat = Validations.validateNotNull(toFormat, "toFormat");
        this.fromPath = Validations.validateNotNull(fromPath, "from");
        this.toPath = Validations.validateNotNull(toPath, "to");
        this.fromType = fromFormat.get(fromPath).type();
        this.toType = toFormat.get(toPath).type();

        validate();
    }

    private void validate() {
        if (fromPath.isConcreteArrayPath()) {
            throw new DataFormatsException("Path should be abstract: " + fromPath);
        }

        if (toPath.isConcreteArrayPath()) {
            throw new DataFormatsException("Path should be abstract: " + toPath);
        }
    }

    @Override
    public void applyTo(Data in, Data out) {
        var paths = fromPath.allConcretePaths(in.toMap());

        for (var path : paths) {
            var before = in.getValue(path);
            if (before.hasObject()) {
                var afterPath = path.copyArrayIndicesTo(toPath);
                var afterObject = convertValue(before.object(), fromType, toType);
                var afterValue = new Value(afterPath, afterObject);
                out.addOrFailIfHasObject(afterValue);
            }
        }
    }

    @Override
    public boolean matches(DataFormatId in, DataFormatId out) {
        return Objects.equals(in, fromFormat.id()) && Objects.equals(out, toFormat.id());
    }

    private Object convertValue(Object object, Type fromType, Type toType) {
        if (fromType.equals(toType)) {
            return object;
        }

        if (fromType instanceof EnumType fromEnum && toType instanceof EnumType toEnum) {
            if (fromEnum.enumValueCount() == toEnum.enumValueCount()) {
                var index = fromEnum.enumValueIndex((String) object);
                return toEnum.enumValueAt(index);
            }
            throw new DataFormatsException("Type conversion from enum " + fromType + " to enum " + toType + " is not possible because of a different number of values");
        }

        if (fromType instanceof EnumType fromEnum && toType instanceof StringType) {
            return fromEnum.enumValueIndex((String) object);
        }
        if (fromType instanceof StringType && toType instanceof EnumType toEnum) {
            if (toEnum.accepts(object)) {
                return object;
            } else {
                throw new DataFormatsException("Type conversion from " + fromType + " to " + toType + " is not possible because the value is not in the target enum: " + object);
            }
        }

        if (fromType instanceof BigIntegerType && toType instanceof IntegerType) {
            return ((BigInteger) object).intValueExact();
        }
        if (fromType instanceof IntegerType && toType instanceof BigIntegerType) {
            return BigInteger.valueOf((Integer) object);
        }

        if (fromType instanceof DoubleType && toType instanceof BigDecimalType) {
            return BigDecimal.valueOf((Double) object);
        }
        if (fromType instanceof BigDecimalType && toType instanceof DoubleType) {
            return ((BigDecimal) object).doubleValue();
        }

        // TODO continue here: implement more conversions: Double<->BigDecimal
        throw new DataFormatsException("Type conversion from " + fromType + " to " + toType + " is not yet supported. Paths: " + fromPath + ", " + toPath);
    }
}