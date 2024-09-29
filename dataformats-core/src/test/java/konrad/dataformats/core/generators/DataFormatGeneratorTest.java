package konrad.dataformats.core.generators;

import konrad.dataformats.core.DataFormatId;
import konrad.dataformats.core.TestDataFormats;
import konrad.dataformats.core.TestObjects;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DataFormatGeneratorTest {
    @Test
    void testApply() {
        // given
        var generator = new DataFormatGenerator(new TypeGeneratorRegistry());

        // when
        var dataFormat = generator.fromObject(new DataFormatId("tree"), TestObjects.tree());

        // then
        var expected = TestDataFormats.tree();
        // TODO remove me
//        var notExpectedValueFormats = new ArrayList<>(dataFormat.valueFormats());
//        notExpectedValueFormats.removeAll(expected.valueFormats());
//        notExpectedValueFormats.forEach(vf -> System.out.println(vf.path()));

        assertEquals(expected.valueFormats().size(), dataFormat.valueFormats().size());
        assertTrue(dataFormat.valueFormats().containsAll(expected.valueFormats()));
    }

}