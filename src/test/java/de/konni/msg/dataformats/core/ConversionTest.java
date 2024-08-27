package de.konni.msg.dataformats.core;

import de.konni.msg.dataformats.core.mappings.FirstSimpleMapping;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {
    @Test
    void convertObject() {
        var values = List.of(
                new Value(new Path("benutzername"), Type.STRING, "benutzername"),
                new Value(new Path("institutsname"), Type.STRING, "institutsname"),
                new Value(new Path("kopfdaten.kundendaten.kundennummer"), Type.STRING, "kopfdaten.kundendaten.kundennummer")
        );
        var data = new Data(TestDataFormats.transactionMetadataUpdate(), values);
        List<Mapping> mappings = List.of(new FirstSimpleMapping());

        var conversion = new Conversion(TestDataFormats.transactionMetadataUpdate(), TestDataFormats.transactionMetadataUpdateTarget(), mappings);
        var converted = conversion.applyTo(data);

        var value = converted.get(new Path("user"));
        assertNotNull(value);
        assertTrue(value.is(Type.STRING));
        assertTrue(value.hasObject());
        assertEquals("BENUTZERNAME", value.object());
    }
}
