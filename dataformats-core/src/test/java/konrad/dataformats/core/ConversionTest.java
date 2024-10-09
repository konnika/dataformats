package konrad.dataformats.core;

import konrad.dataformats.core.generators.ConversionGenerator;
import konrad.dataformats.core.generators.MappingGeneratorRegistry;
import konrad.dataformats.core.mappings.EnumToEnumMapping;
import konrad.dataformats.core.mappings.Mapping;
import konrad.dataformats.core.mappings.OneToOneMapping;
import konrad.dataformats.core.registries.TypeConversionRegistry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class ConversionTest {
    private TypeConversionRegistry typeConversionRegistry;
    private MappingGeneratorRegistry mappingGeneratorRegistry;

    @BeforeEach
    void setUp() {
        typeConversionRegistry = new TypeConversionRegistry();
        mappingGeneratorRegistry = new MappingGeneratorRegistry(typeConversionRegistry);
    }

    @Test
    void convertObject() {
        var values = List.of(
                new Value(new Path("value"), "tree"),
                new Value(new Path("branch.value"), true),
                new Value(new Path("branch.nullValue"), null),
                new Value(new Path("branch.leaf.color"), "GREEN"),
                new Value(new Path("branch.leaf.value"), "branch.leaf"),
                new Value(new Path("leaves.[0].color"), "RED"),
                new Value(new Path("leaves.[0].value"), "tree.leaf1"),
                new Value(new Path("leaves.[1].color"), "YELLOW"),
                new Value(new Path("leaves.[1].value"), "tree.leaf2")
        );
        var data = new Data(TestDataFormats.tree(), values);

        List<Mapping> mappings = List.of(
                mirrorMapping("value", "mirrorValue"),
                mirrorMapping("branch.value", "mirrorBranch.mirrorValue"),
                mirrorMapping("branch.nullValue", "mirrorBranch.mirrorNullValue"),
                mirrorColorMapping("branch.leaf.color", "mirrorBranch.mirrorLeaf.mirrorColor"),
                mirrorMapping("branch.leaf.value", "mirrorBranch.mirrorLeaf.mirrorValue"),
                mirrorColorMapping("leaves.[].color", "mirrorLeaves.[].mirrorColor"),
                mirrorMapping("leaves.[].value", "mirrorLeaves.[].mirrorValue"));

        var conversion = new Conversion(TestDataFormats.tree(), TestDataFormats.mirrorTree(), mappings);
        var converted = conversion.applyTo(data);

        Assertions.assertValue(converted, "mirrorValue", "tree");
        Assertions.assertValue(converted, "mirrorBranch.mirrorValue", true);
        Assertions.assertNoValue(converted, "mirrorBranch.mirrorNullValue");
        Assertions.assertValue(converted, "mirrorBranch.mirrorLeaf.mirrorColor", "MIRROR_GREEN");
        Assertions.assertValue(converted, "mirrorBranch.mirrorLeaf.mirrorValue", "branch.leaf");
        Assertions.assertValue(converted, "mirrorLeaves.[0].mirrorColor", "MIRROR_RED");
        Assertions.assertValue(converted, "mirrorLeaves.[0].mirrorValue", "tree.leaf1");
        Assertions.assertValue(converted, "mirrorLeaves.[1].mirrorColor", "MIRROR_YELLOW");
        Assertions.assertValue(converted, "mirrorLeaves.[1].mirrorValue", "tree.leaf2");
    }

    private OneToOneMapping mirrorMapping(String path, String mirrorPath) {
        return new OneToOneMapping(TestDataFormats.tree(), TestDataFormats.mirrorTree(), new Path(path), new Path(mirrorPath), typeConversionRegistry);
    }

    private EnumToEnumMapping mirrorColorMapping(String path, String mirrorPath) {
        var enumMappings = Map.of(
                "GREEN", "MIRROR_GREEN",
                "YELLOW", "MIRROR_YELLOW",
                "RED", "MIRROR_RED",
                "BROWN", "MIRROR_BROWN"
        );
        return new EnumToEnumMapping(TestDataFormats.tree(), TestDataFormats.mirrorTree(), new Path(path), new Path(mirrorPath), enumMappings);
    }

    @Test
    void fromCsvWorks() {
        var csv = List.of(
                "1:1;value;mirrorValue",
                "1:1;branch.value;mirrorBranch.mirrorValue",
                "1:1:ENUM;branch.leaf.color;mirrorBranch.mirrorLeaf.mirrorColor;RED:MIRROR_RED,GREEN:MIRROR_GREEN,BLUE:MIRROR_BLUE",
                "1:1;leaves.[].value;mirrorLeaves.[].mirrorValue");

        var conversionGenerator = new ConversionGenerator(mappingGeneratorRegistry);
        var conversion = conversionGenerator.fromCsv(TestDataFormats.tree(), TestDataFormats.mirrorTree(), csv);

        var values = List.of(
                new Value(new Path("value"), "tree"),
                new Value(new Path("branch.value"), true),
                new Value(new Path("branch.leaf.color"), "GREEN"),
                new Value(new Path("leaves.[0].value"), "tree.leaf1"),
                new Value(new Path("leaves.[1].value"), "tree.leaf2")
        );
        var data = new Data(TestDataFormats.tree(), values);

        var converted = conversion.applyTo(data);

        Assertions.assertValue(converted, "mirrorValue", "tree");
        Assertions.assertValue(converted, "mirrorBranch.mirrorValue", true);
        Assertions.assertValue(converted, "mirrorBranch.mirrorLeaf.mirrorColor", "MIRROR_GREEN");
        Assertions.assertValue(converted, "mirrorLeaves.[0].mirrorValue", "tree.leaf1");
        Assertions.assertValue(converted, "mirrorLeaves.[1].mirrorValue", "tree.leaf2");
    }
}
