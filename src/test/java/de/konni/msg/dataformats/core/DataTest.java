package de.konni.msg.dataformats.core;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.msg4banking.processservice.application.model.transaction.*;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class DataTest {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void createDataFromObject() {
        var object = new KopfdatenUpdateRequest();
        object.benutzername("benutzername");
        object.kopfdaten(new KopfdatenIn());
        object.getKopfdaten().kundendaten(new Kundendaten());
        object.getKopfdaten().getKundendaten().kundennummer("kundennummer");

        var data = Data.from(mapFrom(object), TestDataFormats.transactionMetadataUpdate());

        var value = data.get(new Path("benutzername"));
        assertNotNull(value);
        assertTrue(value.is(Type.STRING));
        assertTrue(value.hasObject());
        assertEquals("benutzername", value.object());

        var nonValue = data.get(new Path("institutsname"));
        assertNotNull(nonValue);
        assertTrue(nonValue.is(Type.STRING));
        assertTrue(nonValue.isEmpty());
        assertNull(nonValue.object());

        var nestedValue = data.get(new Path("kopfdaten.kundendaten.kundennummer"));
        assertNotNull(nestedValue);
        assertTrue(nestedValue.is(Type.STRING));
        assertTrue(nestedValue.hasObject());
        assertEquals("kundennummer", nestedValue.object());
    }

    @Test
    void createDataFromObjectWithArray() {
        var object = new KopfdatenUpdateRequest();
        object.kopfdaten(new KopfdatenIn());
        object.getKopfdaten().verwaltungsdaten(new VerwaltungsdatenIn());
        var list = List.of(new VerwaltungsdatenwertKonfigurierbar(), new VerwaltungsdatenwertKonfigurierbar());
        list.get(0).schluessel("schluessel[0]");
        list.get(1).schluessel("schluessel[1]");
        object.getKopfdaten().getVerwaltungsdaten().verwaltungsdatenKonfigurierbar(list);

        var data = Data.from(mapFrom(object), TestDataFormats.transactionMetadataUpdate());

        var value0 = data.get(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].schluessel"));
        assertNotNull(value0);
        assertTrue(value0.is(Type.STRING));
        assertTrue(value0.hasObject());
        assertEquals("schluessel[0]", value0.object());

        var value1 = data.get(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[1].schluessel"));
        assertNotNull(value1);
        assertTrue(value1.is(Type.STRING));
        assertTrue(value1.hasObject());
        assertEquals("schluessel[1]", value1.object());
    }

    private Map<String, Object> mapFrom(KopfdatenUpdateRequest object) {
        return objectMapper.convertValue(object, new TypeReference<>() {
        });
    }
}
