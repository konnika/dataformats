package de.konni.msg.dataformats.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DataFormatTest {
    private DataFormat dataFormat;

    @BeforeEach
    void setUp() {
        var values = List.of(
                new ValueFormat(new Path("benutzername"), Type.STRING),
                new ValueFormat(new Path("institutsname"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.kundendaten.kundennummer"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.kundendaten.name.vorname"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.kundendaten.name.nachname"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.kundendaten.name.titel"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.kundendaten.nameFrau.vorname"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.kundendaten.nameFrau.nachname"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.kundendaten.nameFrau.titel"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.kundendaten.adresse.strasse"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.kundendaten.adresse.plz"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.kundendaten.adresse.ort"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.kundendaten.adresse.land"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.kundendaten.anrede"), Type.ENUM("FRAU", "HERR", "FIRMA", "EHELEUTE", "HERRUNDFRAU")),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.iban"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.bic"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.kontonummer"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.betriebsstelle"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.kundenansprechpartner"), Type.STRING),
//                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar"), Type.ARRAY),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar[].schluessel"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar[].text"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar[].checkbox"), Type.BOOLEAN),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar[].datum"), Type.DATE)
//                new ValueFormat(new Path("institutskriterien"), Type.OBJECT),
//    "institutskriterien": {
//      "$ref": "./Institutskriterien.json"
//    }
        );
        dataFormat = new DataFormat("PROS/TransactionMetadataUpdate", values);
    }

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