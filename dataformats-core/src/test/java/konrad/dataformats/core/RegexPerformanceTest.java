package konrad.dataformats.core;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

@Disabled("Run manually to compare performance")
class RegexPerformanceTest {
    private static final ArrayList<String> STRINGS = new ArrayList<>();
    private static final ArrayList<ArrayList<String>> LIST_OF_LISTS_OF_STRING = new ArrayList<>();

    @BeforeAll
    static void beforeAll() {
        for (int i = 0; i < 1_000_000; i++) {
            STRINGS.add("value.[0].string");
        }

        for (int i = 0; i < 200_000; i++) {
            int r = (int) (Math.random() * 1000);
            var string = "value.string." + r + "element.[].string";
            LIST_OF_LISTS_OF_STRING.add(new ArrayList<>(Arrays.stream(string.split("\\.")).toList()));
        }
    }

    @Test
    void regexStringVsPatternPerformanceString() {
        var time = new Time();
        time.start();
        Pattern pattern = Pattern.compile("\\[\\d+]");
        STRINGS.forEach(s -> pattern.matcher(s).matches());
        time.stopAndLog("regex as compiled Pattern");
    }

    @Test
    void regexStringVsPatternPerformancePattern() {
        var time = new Time();
        time.start();
        String regex = "\\[\\d+]";
        STRINGS.forEach(s -> s.matches(regex));
        time.stopAndLog("regex as string");
    }

    @Test
    void listOfStringsPerformanceAnyMatchPattern() {
        var time = new Time();
        time.start();
        Pattern pattern = Pattern.compile("\\[]");
        LIST_OF_LISTS_OF_STRING.forEach(list -> list.stream().anyMatch(element -> pattern.matcher(element).matches()));
        time.stopAndLog("list of strings: list anyMatch with pattern");
    }

    @Test
    void listOfStringsPerformanceAsStringIndexOf() {
        var listOfStrings = LIST_OF_LISTS_OF_STRING.stream().map(list -> String.join(".", list)).toList();

        var time = new Time();
        time.start();
        listOfStrings.stream().map(string -> string.indexOf("[]") > -1);
        time.stopAndLog("list of strings: string index of");
    }

    @Test
    void listOfStringsPerformanceAsStringContains() {
        var listOfStrings = LIST_OF_LISTS_OF_STRING.stream().map(list -> String.join(".", list)).toList();

        var time = new Time();
        time.start();
        listOfStrings.stream().map(string -> string.contains("[]"));
        time.stopAndLog("list of strings: string contains");
    }

    @Test
    void listOfStringsPerformancePatternFindString() {
        var listOfStrings = LIST_OF_LISTS_OF_STRING.stream().map(list -> String.join(".", list)).toList();
        Pattern pattern = Pattern.compile("\\[]");

        var time = new Time();
        time.start();
        listOfStrings.stream().map(string -> pattern.matcher(string).find());
        time.stopAndLog("list of strings: pattern find string");
    }
}
