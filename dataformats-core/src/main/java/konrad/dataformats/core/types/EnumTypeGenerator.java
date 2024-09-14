package konrad.dataformats.core.types;

import java.util.Arrays;

public class EnumTypeGenerator implements TypeGenerator {
    private static final String ERROR_MESSAGE_CSV_FORMAT = "DataFormat CSV is expected to have a type value of: ENUM:value1,value2,value3. Got ";

    @Override
    public boolean acceptsCsv(String value) {
        return value.startsWith("ENUM:");
    }

    @Override
    public Type fromCsv(String value) {
        if (value.startsWith("ENUM:")) {
            var enumValuesIndex = value.indexOf(":");
            if (enumValuesIndex == -1) {
                throw new RuntimeException(ERROR_MESSAGE_CSV_FORMAT + value);
            }
            var enumValuesString = value.substring(enumValuesIndex + 1).trim();
            if (enumValuesString.isBlank()) {
                throw new RuntimeException(ERROR_MESSAGE_CSV_FORMAT + value);
            }
            var values = enumValuesString.split(",");
            if (values.length < 1) {
                throw new RuntimeException(ERROR_MESSAGE_CSV_FORMAT + value);
            }
            return new EnumType(new TypeId(enumValuesString), Arrays.stream(values).toList());
        }

        throw new RuntimeException("Enum Type cannot be created from value: " + value);
    }
}
