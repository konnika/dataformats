package de.konni.msg.dataformats.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DataFormatTest {
    private final DataFormat dataFormat = TestDataFormats.transactionMetadataUpdate();

    @Test
    void containsWorks() {
        assertTrue(dataFormat.contains(new Path("benutzername")));
        assertTrue(dataFormat.contains(new Path("institutsname")));
        assertTrue(dataFormat.contains(new Path("kopfdaten.kundendaten.kundennummer")));
        assertTrue(dataFormat.contains(new Path("kopfdaten.kundendaten.nameFrau.nachname")));
        assertFalse(dataFormat.contains(new Path("xxx")));
    }

    @Test
    void getPathAndTypeWorks() {
        assertTrue(dataFormat.get(new Path("benutzername")).map(vf -> vf.has(Type.STRING)).orElse(false));
        assertTrue(dataFormat.get(new Path("institutsname")).map(vf -> vf.has(Type.STRING)).orElse(false));
        assertTrue(dataFormat.get(new Path("kopfdaten.kundendaten.kundennummer")).map(vf -> vf.has(Type.STRING)).orElse(false));
        assertTrue(dataFormat.get(new Path("kopfdaten.kundendaten.nameFrau.nachname")).map(vf -> vf.has(Type.STRING)).orElse(false));
    }

    @Test
    void enumWorks() {
        assertTrue(dataFormat.get(new Path("kopfdaten.kundendaten.anrede")).map(vf -> vf.has(Type.ENUM("FRAU", "HERR", "FIRMA", "EHELEUTE", "HERRUNDFRAU"))).orElse(false));
        assertTrue(dataFormat.get(new Path("kopfdaten.kundendaten.anrede")).map(vf -> vf.has(Type.ENUM("HERR", "FIRMA", "EHELEUTE", "HERRUNDFRAU", "FRAU"))).orElse(false));
        assertFalse(dataFormat.get(new Path("kopfdaten.kundendaten.anrede")).map(vf -> vf.has(Type.ENUM("HERR", "FIRMA", "EHELEUTE", "HERRUNDFRAU"))).orElse(true));
        assertFalse(dataFormat.get(new Path("kopfdaten.kundendaten.anrede")).map(vf -> vf.has(Type.ENUM("xxx"))).orElse(true));
        assertFalse(dataFormat.get(new Path("kopfdaten.kundendaten.anrede")).map(vf -> vf.has(Type.ENUM())).orElse(true));
    }
}