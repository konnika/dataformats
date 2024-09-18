package konrad.dataformats.core.generators;

import konrad.dataformats.core.TestObjectMapper;
import konrad.dataformats.core.TestObjects;
import konrad.dataformats.testobjects.weirdtree.NullObject;
import konrad.dataformats.testobjects.weirdtree.WeirdTree;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CsvGeneratorTest {
    @Test
    void analyzingValuesWorksInGeneral() {
        // given
        var tree = TestObjectMapper.toMap(TestObjects.tree());
        var generator = new CsvGenerator();

        // when
        generator.analyze(tree);

        // then
        assertEquals(9, generator.values().size());
    }

    @Test
    void analyzingWorksForStringLists() {
        // given
        var weirdTree = TestObjectMapper.toMap(TestObjects.weirdTree());
        var generator = new CsvGenerator();

        // when
        generator.analyze(weirdTree);

        // then
        assertEquals(4, generator.values().size());
    }

    @Test
    void analyzingMultipleObjectsWorks() {
        // given
        var weirdTree = TestObjectMapper.toMap(TestObjects.weirdTree());
        var weirdTree2 = TestObjectMapper.toMap(new WeirdTree(Collections.emptyList(), new NullObject("abc", "def")));

        var generator = new CsvGenerator();

        // when
        generator.analyze(weirdTree);
        generator.analyze(weirdTree2);

        // then
        assertEquals(6, generator.values().size());
    }
}
