package konrad.dataformats.core.mappings;

import konrad.dataformats.core.Assertions;
import konrad.dataformats.core.Data;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.TestDataFormats;
import konrad.dataformats.core.TestObjectMapper;
import konrad.dataformats.core.TestObjects;
import konrad.dataformats.core.Value;
import konrad.dataformats.core.generators.DataFormatGenerator;
import konrad.dataformats.core.generators.TypeGeneratorRegistry;
import konrad.dataformats.core.registries.TypeConversionRegistry;
import konrad.dataformats.core.registries.TypeRegistry;
import konrad.dataformats.testobjects.weirdtree.WeirdTree;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OneToOneMappingTest {

    @Test
    void stringWorks() {
        var mapping = new OneToOneMapping(TestDataFormats.tree(), TestDataFormats.mirrorTree(),
                new Path("value"), new Path("mirrorValue"),
                new TypeConversionRegistry());

        var values = List.of(new Value(new Path("value"), "xxx"));
        var before = new Data(TestDataFormats.tree(), values);
        var after = new Data(TestDataFormats.mirrorTree(), Collections.emptyList());

        mapping.applyTo(before, after);

        assertEquals(1, after.toMap().size());
        Assertions.assertValue(after, "mirrorValue", "xxx");
    }

    @Test
    void stringInListWorks() {
        var mapping = new OneToOneMapping(TestDataFormats.tree(), TestDataFormats.mirrorTree(),
                new Path("leaves.[].value"), new Path("mirrorLeaves.[].mirrorValue"),
                new TypeConversionRegistry());

        var values = List.of(new Value(new Path("leaves.[0].value"), "xxx"));
        var before = new Data(TestDataFormats.tree(), values);
        var after = new Data(TestDataFormats.mirrorTree(), Collections.emptyList());

        mapping.applyTo(before, after);

        assertEquals(1, after.toMap().size());
        Assertions.assertValue(after, "mirrorLeaves.[0].mirrorValue", "xxx");
    }

    @Test
    void listInListWorks() {
        var mapping = new OneToOneMapping(TestDataFormats.bigTree(), TestDataFormats.bigMirrorTree(),
                new Path("branches.[].leaves.[].bigNumber"),
                new Path("mirrorBranches.[].bigMirrorLeaves.[].bigMirrorNumber"),
                new TypeConversionRegistry());

        var values = List.of(
                new Value(new Path("branches.[0].leaves.[0].bigNumber"), BigDecimal.valueOf(11)),
                new Value(new Path("branches.[0].leaves.[1].bigNumber"), BigDecimal.valueOf(12)),
                new Value(new Path("branches.[1].leaves.[0].bigNumber"), BigDecimal.valueOf(13)),
                new Value(new Path("branches.[1].leaves.[1].bigNumber"), BigDecimal.valueOf(14))
        );
        var before = new Data(TestDataFormats.bigTree(), values);
        var after = new Data(TestDataFormats.bigMirrorTree(), Collections.emptyList());

        mapping.applyTo(before, after);

        Assertions.assertValue(after, "mirrorBranches.[0].bigMirrorLeaves.[0].bigMirrorNumber", BigDecimal.valueOf(11));
        Assertions.assertValue(after, "mirrorBranches.[0].bigMirrorLeaves.[1].bigMirrorNumber", BigDecimal.valueOf(12));
        Assertions.assertValue(after, "mirrorBranches.[1].bigMirrorLeaves.[0].bigMirrorNumber", BigDecimal.valueOf(13));
        Assertions.assertValue(after, "mirrorBranches.[1].bigMirrorLeaves.[1].bigMirrorNumber", BigDecimal.valueOf(14));
    }

    @Test
    void listOfStringsWorks() {
        Map<Path, Class<?>> knownListTypes = new HashMap<>();
        knownListTypes.put(new Path("weirdValues"), String.class);
        var weirdTreeFormat = new DataFormatGenerator(new TypeGeneratorRegistry(), new TypeRegistry())
                .fromClass(WeirdTree.class, knownListTypes);

        var mapping = new OneToOneMapping(weirdTreeFormat, weirdTreeFormat,
                new Path("weirdValues.[]"), new Path("weirdValues.[]"),
                new TypeConversionRegistry());

        var weirdTree = TestObjects.weirdTree();

        var before = Data.from(TestObjectMapper.toMap(weirdTree), weirdTreeFormat);
        var after = new Data(weirdTreeFormat, Collections.emptyList());

        mapping.applyTo(before, after);

        Assertions.assertValue(after, "weirdValues.[0]", "one");
        Assertions.assertValue(after, "weirdValues.[1]", "two");
        Assertions.assertValue(after, "weirdValues.[2]", "three");
    }
}
