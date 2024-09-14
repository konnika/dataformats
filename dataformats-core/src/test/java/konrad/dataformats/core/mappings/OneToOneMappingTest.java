package konrad.dataformats.core.mappings;

import konrad.dataformats.core.Assertions;
import konrad.dataformats.core.Data;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.TestDataFormats;
import konrad.dataformats.core.Value;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OneToOneMappingTest {

    @Test
    void stringWorks() {
        var mapping = new OneToOneMapping(TestDataFormats.tree(), TestDataFormats.mirrorTree(),
                new Path("value"), new Path("mirrorValue"));

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
                new Path("leaves.[].value"), new Path("mirrorLeaves.[].mirrorValue"));

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
                new Path("mirrorBranches.[].mirrorLeaves.[].bigMirrorNumber"));

        var values = List.of(
                new Value(new Path("branches.[0].leaves.[0].bigNumber"), BigDecimal.valueOf(11)),
                new Value(new Path("branches.[0].leaves.[1].bigNumber"), BigDecimal.valueOf(12)),
                new Value(new Path("branches.[1].leaves.[0].bigNumber"), BigDecimal.valueOf(13)),
                new Value(new Path("branches.[1].leaves.[1].bigNumber"), BigDecimal.valueOf(14))
        );
        var before = new Data(TestDataFormats.bigTree(), values);
        var after = new Data(TestDataFormats.bigMirrorTree(), Collections.emptyList());

        mapping.applyTo(before, after);

        Assertions.assertValue(after, "mirrorBranches.[0].mirrorLeaves.[0].bigMirrorNumber", BigDecimal.valueOf(11));
        Assertions.assertValue(after, "mirrorBranches.[0].mirrorLeaves.[1].bigMirrorNumber", BigDecimal.valueOf(12));
        Assertions.assertValue(after, "mirrorBranches.[1].mirrorLeaves.[0].bigMirrorNumber", BigDecimal.valueOf(13));
        Assertions.assertValue(after, "mirrorBranches.[1].mirrorLeaves.[1].bigMirrorNumber", BigDecimal.valueOf(14));
    }

    @Test
    void enumWorks() {
        var mapping = new OneToOneMapping(TestDataFormats.tree(), TestDataFormats.mirrorTree(),
                new Path("branch.leaf.color"), new Path("mirrorBranch.mirrorLeaf.mirrorColor"));

        var values = List.of(new Value(new Path("branch.leaf.color"), "RED"));
        var before = new Data(TestDataFormats.tree(), values);
        var after = new Data(TestDataFormats.mirrorTree(), Collections.emptyList());

        mapping.applyTo(before, after);

        assertEquals(1, after.toMap().size());
        Assertions.assertValue(after, "mirrorBranch.mirrorLeaf.mirrorColor", "MIRROR_RED");
    }


    private static void assertValue(Data data, String path, String value) {
        var expected = new Value(new Path(path), value);
        var actual = data.getValue(new Path(path));
        assertNotNull(actual);
        assertTrue(actual.hasObject());
        assertEquals(expected, actual);
    }

    private static void assertValue(Data data, String path) {
        assertValue(data, path, "xxx");
    }
}
