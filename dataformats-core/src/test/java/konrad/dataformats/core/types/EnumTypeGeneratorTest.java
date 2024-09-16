package konrad.dataformats.core.types;

import konrad.dataformats.core.creation.EnumTypeGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EnumTypeGeneratorTest {
    @ParameterizedTest
    @ValueSource(strings = {
            "ENUM:myEnum:a,b,c",
            "ENUM:konrad.dataformats.testobjects.tree.Color.class",
            "ENUM:konrad.dataformats.testobjects.tree.Color.class:a,b,c",
            "ENUM:a,b,c",
            "ENUM:x.y.z"
    })
    void validCsvIsAccepted(String csv) {
        assertTrue(new EnumTypeGenerator().acceptsCsv(csv));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "ENUM:",
            "ENUM:x:y:z"
    })
    void invalidCsvIsNotAccepted(String csv) {
        assertFalse(new EnumTypeGenerator().acceptsCsv(csv));
    }

    @Test
    void fromIdAndValuesWorks() {
        var csv = "ENUM:myEnum:a,b,c";
        var type = new EnumTypeGenerator().fromCsv(csv);
        assertTrue(type.hasId("myEnum"));
        assertTrue(type.accepts("a"));
        assertTrue(type.accepts("b"));
        assertTrue(type.accepts("c"));
        assertFalse(type.accepts("d"));
    }

    @Test
    void fromClassWorks() {
        var csv = "ENUM:konrad.dataformats.testobjects.tree.Color";
        var type = new EnumTypeGenerator().fromCsv(csv);
        assertTrue(type.accepts("GREEN"));
        assertTrue(type.accepts("YELLOW"));
        assertTrue(type.accepts("RED"));
        assertTrue(type.accepts("BROWN"));
        assertFalse(type.accepts("Green"));
        assertFalse(type.accepts("Blue"));
    }

    @Test
    void fromValuesWorks() {
        var csv = "ENUM:GREEN,YELLOW,RED,BROWN";
        var type = new EnumTypeGenerator().fromCsv(csv);
        assertTrue(type.accepts("GREEN"));
        assertTrue(type.accepts("YELLOW"));
        assertTrue(type.accepts("RED"));
        assertTrue(type.accepts("BROWN"));
        assertFalse(type.accepts("Green"));
        assertFalse(type.accepts("BLUE"));
    }
}