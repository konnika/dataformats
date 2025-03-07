package konrad.dataformats.core.generators;

import konrad.dataformats.core.Assertions;
import konrad.dataformats.core.DataFormat;
import konrad.dataformats.core.DataFormatId;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.TestDataFormats;
import konrad.dataformats.core.TestObjects;
import konrad.dataformats.core.ValueFormat;
import konrad.dataformats.core.registries.TypeRegistry;
import konrad.dataformats.core.types.BigIntegerType;
import konrad.dataformats.core.types.BooleanType;
import konrad.dataformats.core.types.EnumType;
import konrad.dataformats.core.types.IntegerType;
import konrad.dataformats.core.types.StringType;
import konrad.dataformats.testobjects.bigmirrortree.BigMirrorBranch;
import konrad.dataformats.testobjects.bigmirrortree.BigMirrorLeaf;
import konrad.dataformats.testobjects.bigmirrortree.BigMirrorTree;
import konrad.dataformats.testobjects.tree.Color;
import konrad.dataformats.testobjects.tree.Leaf;
import konrad.dataformats.testobjects.tree.Tree;
import konrad.dataformats.testobjects.weirdtree.WeirdTree;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DataFormatGeneratorTest {
    @Test
    void fromCsvWorks() {
        var csv = List.of(
                "value;java.lang.String",
                "branch.value;java.lang.Boolean",
                "branch.leaf.color;ENUM:GREEN,YELLOW,RED,BROWN",
                "leaves.[].value;java.lang.String");

        var dataFormatGenerator = new DataFormatGenerator(new TypeGeneratorRegistry(), new TypeRegistry());
        var format = dataFormatGenerator.fromCsv(TestDataFormats.tree().id(), csv);

        Assertions.assertValue(format, "value", new StringType());
        Assertions.assertValue(format, "branch.value", new BooleanType());
        Assertions.assertValue(format, "branch.leaf.color", new EnumType(List.of("GREEN", "YELLOW", "RED", "BROWN")));
        Assertions.assertValue(format, "leaves.[].value", new StringType());
    }

    @Test
    void fromClassWorksOnTree() {
        var typeRegistry = new TypeRegistry();
        var enums = List.of(Color.class);
        enums.forEach(e -> typeRegistry.add(new EnumType(e)));

        var generator = new DataFormatGenerator(new TypeGeneratorRegistry(), typeRegistry);

        Map<Path, Class<?>> knownListTypes = Map.of(new Path("leaves"), Leaf.class);
        var dataFormat = generator.fromClass(Tree.class, knownListTypes);

        var expected = TestDataFormats.tree();
        assertEquals(expected.valueFormats().size(), dataFormat.valueFormats().size());
        assertTrue(dataFormat.valueFormats().containsAll(expected.valueFormats()));
    }

    @Test
    void fromClassWorksOnBigMirrorTree() {
        var generator = new DataFormatGenerator(new TypeGeneratorRegistry(), new TypeRegistry());

        Map<Path, Class<?>> knownListTypes = Map.of(
                new Path("mirrorBranches"), BigMirrorBranch.class,
                new Path("mirrorBranches.[].bigMirrorLeaves"), BigMirrorLeaf.class);
        var dataFormat = generator.fromClass(BigMirrorTree.class, knownListTypes);

        var expected = TestDataFormats.bigMirrorTree();
        assertEquals(expected.valueFormats().size(), dataFormat.valueFormats().size());
        assertTrue(dataFormat.valueFormats().containsAll(expected.valueFormats()));
    }

    @Test
    void fromClassWorksOnListOfStrings() {
        Map<Path, Class<?>> knownListTypes = new HashMap<>();
        knownListTypes.put(new Path("weirdValues"), String.class);

        var dataFormat = new DataFormatGenerator(new TypeGeneratorRegistry(), new TypeRegistry())
                .fromClass(WeirdTree.class, knownListTypes);

        assertEquals(3, dataFormat.valueFormats().size());
        assertEquals(new Path("weirdValues.[]"), dataFormat.valueFormats().get(0).path());
        assertEquals(new StringType(), dataFormat.valueFormats().get(0).type());
    }

    @Test
    void toCsvWorks() {
        var dataFormat = TestDataFormats.tree();
        var generator = new DataFormatGenerator(new TypeGeneratorRegistry(), new TypeRegistry());
        var csv = generator.toCsv(dataFormat);

        var expected = List.of(
                "value;java.lang.String",
                "branch.value;java.lang.Boolean",
                "branch.nullValue;java.lang.String",
                "branch.leaf.color;ENUM:konrad.dataformats.testobjects.tree.Color",
                "branch.leaf.value;java.lang.String",
                "leaves.[].color;ENUM:konrad.dataformats.testobjects.tree.Color",
                "leaves.[].value;java.lang.String"
        );

        assertEquals(expected.size(), csv.size());
        assertEquals(String.join("\n", expected), String.join("\n", csv));
    }

    @Test
    void toAndFromCsvWorkTogether() {
        var expected = TestDataFormats.tree();
        var generator = new DataFormatGenerator(new TypeGeneratorRegistry(), new TypeRegistry());
        var csv = generator.toCsv(expected);

        var actual = generator.fromCsv(expected.id(), csv);
        assertEquals(expected, actual);
    }

    @Test
    void staticFieldsAreFiltered() {
        var typeRegistry = new TypeRegistry();
        typeRegistry.add(new EnumType(Color.class));
        var generator = new DataFormatGenerator(new TypeGeneratorRegistry(), typeRegistry);
        var dataFormat = generator.fromClass(StaticTree.class, Map.of());

        var expected = new DataFormat(new DataFormatId("staticTree"), List.of(
                new ValueFormat(new Path("staticTreeValue"), new StringType())
        ));

        assertEquals(expected.valueFormats().size(), dataFormat.valueFormats().size());
        assertTrue(dataFormat.valueFormats().containsAll(expected.valueFormats()));
    }

    @Test
    void knownTypesAndPrimitivesAreRecognized() {
        var generator = new DataFormatGenerator(new TypeGeneratorRegistry(), new TypeRegistry());
        var dataFormat = generator.fromClass(BigIntegerTree.class, Map.of());

        var expected = new DataFormat(new DataFormatId("bigIntegerTree"), List.of(
                new ValueFormat(new Path("bigInt"), new BigIntegerType()),
                new ValueFormat(new Path("integer"), new IntegerType()),
                new ValueFormat(new Path("primitiveInt"), new IntegerType())
        ));

        assertEquals(expected.valueFormats().size(), dataFormat.valueFormats().size());
        assertTrue(dataFormat.valueFormats().containsAll(expected.valueFormats()));
    }

    class StaticTree {
        static final String STATIC = "static";
        static final Tree STATIC_OBJECT = TestObjects.tree();
        String staticTreeValue;
    }

    class BigIntegerTree {
        int primitiveInt;
        Integer integer;
        BigInteger bigInt;
    }
}