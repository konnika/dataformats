package de.konni.msg.dataformats.core;

import java.util.List;

public class TestDataFormats {
    public static DataFormat transactionMetadataUpdate() {
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
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar[].schluessel"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar[].text"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar[].checkbox"), Type.BOOLEAN),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar[].datum"), Type.DATE)
//                new ValueFormat(new Path("institutskriterien"), Type.OBJECT),
//    "institutskriterien": {
//      "$ref": "./Institutskriterien.json"
//    }
        );
        return new DataFormat(DataFormatId.PROS_TRANSACTION_METADATA_UPDATE, values);
    }
}
