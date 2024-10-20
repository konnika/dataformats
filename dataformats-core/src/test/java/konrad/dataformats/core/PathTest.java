package konrad.dataformats.core;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PathTest {

    @Test
    void allConcretePathsWorksForListOfStrings() {
        var path = new Path("value.[].string");
        Map<String, Object> map = Map.of("value", List.of(
                Map.of("string", "one"),
                Map.of("string", "two"),
                Map.of("string", "three")));

        var paths = path.allConcretePaths(map);

        assertEquals(3, paths.size());
        assertEquals(new Path("value.[0].string"), paths.get(0));
        assertEquals(new Path("value.[1].string"), paths.get(1));
        assertEquals(new Path("value.[2].string"), paths.get(2));
    }

    @Test
    void allConcretePathsWorksForMyProblemInProcessService() {
        var path = new Path("value.[]");
        Map<String, Object> map = Map.of("value", List.of("one", "two", "three"));

        var paths = path.allConcretePaths(map);

        assertEquals(3, paths.size());
        assertEquals(new Path("value.[0]"), paths.get(0));
        assertEquals(new Path("value.[1]"), paths.get(1));
        assertEquals(new Path("value.[2]"), paths.get(2));
    }

    @Test
    void isConcretePathWorks() {
        var path = new Path("branches.[0].leaves.[0].bigNumber");
        assertTrue(path.isConcreteArrayPath());
    }

    @Test
    void patternMatcherWorks() {
        var path = new Path("branches.[0].leaves.[0].bigNumber");
        var pattern = Pattern.compile("\\[\\d+]");
        assertFalse(pattern.matcher(path.asString()).matches());
        assertTrue(pattern.matcher(path.asString()).find());
    }
}