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

        var data = Data.from(toMap(object), TestDataFormats.transactionMetadataUpdate());

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

        var data = Data.from(toMap(object), TestDataFormats.transactionMetadataUpdate());

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

    @Test
    void createObjectFromData() {
        var values = List.of(
                new Value(new Path("benutzername"), Type.STRING, "benutzername"),
                new Value(new Path("institutsname"), Type.STRING, "institutsname"),
                new Value(new Path("kopfdaten.kundendaten.kundennummer"), Type.STRING, "kopfdaten.kundendaten.kundennummer")
        );
        var data = new Data(TestDataFormats.transactionMetadataUpdate(), values);

        var map = data.toMap();
        var object = toObject(map, KopfdatenUpdateRequest.class);

        assertEquals("benutzername", object.getBenutzername());
        assertEquals("institutsname", object.getInstitutsname());
        assertEquals("kopfdaten.kundendaten.kundennummer", object.getKopfdaten().getKundendaten().getKundennummer());
    }

    @Test
    void createObjectFromDataWithArray() {
        var values = List.of(
                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[0].schluessel"), Type.STRING, "schluessel[0]"),
                new Value(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[1].schluessel"), Type.STRING, "schluessel[1]")
        );
        var data = new Data(TestDataFormats.transactionMetadataUpdate(), values);

        var map = data.toMap();
        var object = toObject(map, KopfdatenUpdateRequest.class);

        var list = object.getKopfdaten().getVerwaltungsdaten().getVerwaltungsdatenKonfigurierbar();
        assertEquals("schluessel[0]", list.get(0).getSchluessel());
        assertEquals("schluessel[1]", list.get(1).getSchluessel());
    }

    private <T> T toObject(Map<String, Object> map, Class<T> aClass) {
        return objectMapper.convertValue(map, aClass);
    }

    private Map<String, Object> toMap(KopfdatenUpdateRequest object) {
        return objectMapper.convertValue(object, new TypeReference<>() {
        });
    }
}
