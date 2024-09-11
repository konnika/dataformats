package konrad.dataformats.core;

import konrad.dataformats.core.DataFormat;
import konrad.dataformats.core.DataFormatId;
import konrad.dataformats.core.Path;
import konrad.dataformats.core.Type;
import konrad.dataformats.core.ValueFormat;

import java.util.List;

public class TestDataFormats {
    public static final DataFormatId PROS_TRANSACTION_METADATA_UPDATE = new DataFormatId("PROS_TRANSACTION_METADATA_UPDATE");
    public static final DataFormatId PROS_TRANSACTION_METADATA_UPDATE_MARZIPAN = new DataFormatId("PROS_TRANSACTION_METADATA_UPDATE_MARZIPAN");
    public static final DataFormatId PROS_TRANSACTION_METADATA_UPDATE_ENGLISH = new DataFormatId("PROS_TRANSACTION_METADATA_UPDATE_ENGLISH");

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
                new ValueFormat(new Path("kopfdaten.kundendaten.anrede"), Type.enumType("FRAU", "HERR", "FIRMA", "EHELEUTE", "HERRUNDFRAU")),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.iban"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.bic"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.kontonummer"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.betriebsstelle"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.kundenansprechpartner"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[].schluessel"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[].text"), Type.STRING),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[].checkbox"), Type.BOOLEAN),
                new ValueFormat(new Path("kopfdaten.verwaltungsdaten.verwaltungsdatenKonfigurierbar.[].datum"), Type.DATE)
//                new ValueFormat(new Path("institutskriterien"), Type.OBJECT),
//    "institutskriterien": {
//      "$ref": "./Institutskriterien.json"
//    }
        );
        return new DataFormat(PROS_TRANSACTION_METADATA_UPDATE, values);
    }

    public static DataFormat transactionMetadataUpdateEnglish() {
        var values = List.of(
                new ValueFormat(new Path("user"), Type.STRING),
                new ValueFormat(new Path("tenant"), Type.STRING),
                new ValueFormat(new Path("header.customer.accountNumber"), Type.STRING),
                new ValueFormat(new Path("header.customer.self.first"), Type.STRING),
                new ValueFormat(new Path("header.customer.self.family"), Type.STRING),
                new ValueFormat(new Path("header.customer.self.title"), Type.STRING),
                new ValueFormat(new Path("header.customer.wife.first"), Type.STRING),
                new ValueFormat(new Path("header.customer.wife.family"), Type.STRING),
                new ValueFormat(new Path("header.customer.wife.title"), Type.STRING),
                new ValueFormat(new Path("header.customer.address.street"), Type.STRING),
                new ValueFormat(new Path("header.customer.address.zip"), Type.STRING),
                new ValueFormat(new Path("header.customer.address.city"), Type.STRING),
                new ValueFormat(new Path("header.customer.address.country"), Type.STRING),
                new ValueFormat(new Path("header.customer.salutation"), Type.enumType("MISSES", "MISTER", "COMPANY", "MISTER & MISSES", "MISTER & MISSES")),
                new ValueFormat(new Path("header.administration.iban"), Type.STRING),
                new ValueFormat(new Path("header.administration.bic"), Type.STRING),
                new ValueFormat(new Path("header.administration.accountNumber"), Type.STRING),
                new ValueFormat(new Path("header.administration.location"), Type.STRING),
                new ValueFormat(new Path("header.administration.customerContact"), Type.STRING),
                new ValueFormat(new Path("header.administration.administrationConfigurable.[].key"), Type.STRING),
                new ValueFormat(new Path("header.administration.administrationConfigurable.[].text"), Type.STRING),
                new ValueFormat(new Path("header.administration.administrationConfigurable.[].checkbox"), Type.BOOLEAN),
                new ValueFormat(new Path("header.administration.administrationConfigurable.[].date"), Type.DATE)
        );
        return new DataFormat(PROS_TRANSACTION_METADATA_UPDATE_ENGLISH, values);
    }

    public static DataFormat transactionMetadataUpdateMarzipan() {
        var values = List.of(
                new ValueFormat(new Path("username"), Type.STRING),
                new ValueFormat(new Path("institutsname"), Type.STRING),
                new ValueFormat(new Path("kundendaten.kundennummer"), Type.STRING),
                new ValueFormat(new Path("kundendaten.anrede"), Type.enumType("ANREDE_FRAU", "ANREDE_HERR", "ANREDE_FIRMA", "ANREDE_EHELEUTE", "ANREDE_HERRUNDFRAU")),
                new ValueFormat(new Path("kundendaten.nachname"), Type.STRING),
                new ValueFormat(new Path("kundendaten.vorname"), Type.STRING),
                new ValueFormat(new Path("kundendaten.titel"), Type.STRING),
                new ValueFormat(new Path("kundendaten.strasse"), Type.STRING),
                new ValueFormat(new Path("kundendaten.plz"), Type.STRING),
                new ValueFormat(new Path("kundendaten.wohnort"), Type.STRING),
                new ValueFormat(new Path("kundendaten.land"), Type.STRING),
                new ValueFormat(new Path("kundendaten.nachnameFrau"), Type.STRING),
                new ValueFormat(new Path("kundendaten.vornameFrau"), Type.STRING),
                new ValueFormat(new Path("kundendaten.titelFrau"), Type.STRING),
                new ValueFormat(new Path("institutsdaten.iban"), Type.STRING),
                new ValueFormat(new Path("institutsdaten.bic"), Type.STRING),
                new ValueFormat(new Path("institutsdaten.kontonummer"), Type.STRING),
                new ValueFormat(new Path("institutsdaten.betriebsstelle"), Type.STRING),
                new ValueFormat(new Path("institutsdaten.berater"), Type.STRING),
                new ValueFormat(new Path("verwaltungsdaten.verwaltungsdatenwert.[].schluessel"), Type.STRING),
                new ValueFormat(new Path("verwaltungsdaten.verwaltungsdatenwert.[].stringWert"), Type.STRING),
                new ValueFormat(new Path("verwaltungsdaten.verwaltungsdatenwert.[].dateWert"), Type.STRING),
                new ValueFormat(new Path("verwaltungsdaten.verwaltungsdatenwert.[].checkbox"), Type.BOOLEAN)
        );
        return new DataFormat(PROS_TRANSACTION_METADATA_UPDATE_MARZIPAN, values);
    }
}
