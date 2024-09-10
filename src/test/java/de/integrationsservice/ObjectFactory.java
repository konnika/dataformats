
package de.integrationsservice;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the de.gillardon.marzipan.integrationsservice package.
 * <p>An ObjectFactory allows you to programmatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _ServiceVersionResponse_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "serviceVersionResponse");
    private static final QName _Kreditgeschaeft_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Kreditgeschaeft");
    private static final QName _Zinsstruktur_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Zinsstruktur");
    private static final QName _Finanzplatz_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Finanzplatz");
    private static final QName _Deckungsbeitragsschema_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Deckungsbeitragsschema");
    private static final QName _Ratingszenario_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Ratingszenario");
    private static final QName _RisikoVarkost_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "RisikoVarkost");
    private static final QName _RisikoEigenkapitalkost_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "RisikoEigenkapitalkost");
    private static final QName _Risikokonfiguration_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Risikokonfiguration");
    private static final QName _Fehlerliste_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Fehlerliste");
    private static final QName _Plaene_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Plaene");
    private static final QName _Export_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Export");
    private static final QName _ExportAnfrage_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "ExportAnfrage");
    private static final QName _ImportAnfrage_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "ImportAnfrage");
    private static final QName _Import_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Import");
    private static final QName _Statusuebergang_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Statusuebergang");
    private static final QName _Ergebnis_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Ergebnis");
    private static final QName _Rekonditionierung_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Rekonditionierung");
    private static final QName _AutoImport_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "AutoImport");
    private static final QName _AutoUpdate_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "AutoUpdate");
    private static final QName _AutoUpdateKopfdaten_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "AutoUpdateKopfdaten");
    private static final QName _AutoUpdateKopfdatenResponse_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "AutoUpdateKopfdatenResponse");
    private static final QName _ImportMitMelden_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "ImportMitMelden");
    private static final QName _AktualitaetZinsstrukturListe_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "AktualitaetZinsstrukturListe");
    private static final QName _Geschaeft_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Geschaeft");
    private static final QName _Geschaefte_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Geschaefte");
    private static final QName _Zinsstrukturen_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Zinsstrukturen");
    private static final QName _Finanzplaetze_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Finanzplaetze");
    private static final QName _Deckungsbeitragsschemas_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Deckungsbeitragsschemas");
    private static final QName _Ratingszenarien_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Ratingszenarien");
    private static final QName _RisikoVarkosten_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "RisikoVarkosten");
    private static final QName _RisikoEigenkapitalkosten_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "RisikoEigenkapitalkosten");
    private static final QName _Risikokonfigurationen_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Risikokonfigurationen");
    private static final QName _Aufteilung_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Aufteilung");
    private static final QName _Validate_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "Validate");
    private static final QName _ZusaetzlicheErgebnisse_QNAME = new QName("http://www.gillardon.de/marzipan/integrationsservice", "ZusaetzlicheErgebnisse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.gillardon.marzipan.integrationsservice
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceVersionResponse }
     *
     * @return the new instance of {@link ServiceVersionResponse }
     */
    public ServiceVersionResponse createServiceVersionResponse() {
        return new ServiceVersionResponse();
    }

    /**
     * Create an instance of {@link Kreditgeschaeft }
     *
     * @return the new instance of {@link Kreditgeschaeft }
     */
    public Kreditgeschaeft createKreditgeschaeft() {
        return new Kreditgeschaeft();
    }

    /**
     * Create an instance of {@link Zinsstruktur }
     *
     * @return the new instance of {@link Zinsstruktur }
     */
    public Zinsstruktur createZinsstruktur() {
        return new Zinsstruktur();
    }

    /**
     * Create an instance of {@link Finanzplatz }
     *
     * @return the new instance of {@link Finanzplatz }
     */
    public Finanzplatz createFinanzplatz() {
        return new Finanzplatz();
    }

    /**
     * Create an instance of {@link Deckungsbeitragsschema }
     *
     * @return the new instance of {@link Deckungsbeitragsschema }
     */
    public Deckungsbeitragsschema createDeckungsbeitragsschema() {
        return new Deckungsbeitragsschema();
    }

    /**
     * Create an instance of {@link Ratingszenario }
     *
     * @return the new instance of {@link Ratingszenario }
     */
    public Ratingszenario createRatingszenario() {
        return new Ratingszenario();
    }

    /**
     * Create an instance of {@link RisikoVarkost }
     *
     * @return the new instance of {@link RisikoVarkost }
     */
    public RisikoVarkost createRisikoVarkost() {
        return new RisikoVarkost();
    }

    /**
     * Create an instance of {@link RisikoEigenkapitalkost }
     *
     * @return the new instance of {@link RisikoEigenkapitalkost }
     */
    public RisikoEigenkapitalkost createRisikoEigenkapitalkost() {
        return new RisikoEigenkapitalkost();
    }

    /**
     * Create an instance of {@link Risikokonfiguration }
     *
     * @return the new instance of {@link Risikokonfiguration }
     */
    public Risikokonfiguration createRisikokonfiguration() {
        return new Risikokonfiguration();
    }

    /**
     * Create an instance of {@link Fehlerliste }
     *
     * @return the new instance of {@link Fehlerliste }
     */
    public Fehlerliste createFehlerliste() {
        return new Fehlerliste();
    }

    /**
     * Create an instance of {@link Plaene }
     *
     * @return the new instance of {@link Plaene }
     */
    public Plaene createPlaene() {
        return new Plaene();
    }

    /**
     * Create an instance of {@link Export }
     *
     * @return the new instance of {@link Export }
     */
    public Export createExport() {
        return new Export();
    }

    /**
     * Create an instance of {@link ExportAnfrage }
     *
     * @return the new instance of {@link ExportAnfrage }
     */
    public ExportAnfrage createExportAnfrage() {
        return new ExportAnfrage();
    }

    /**
     * Create an instance of {@link ImportAnfrage }
     *
     * @return the new instance of {@link ImportAnfrage }
     */
    public ImportAnfrage createImportAnfrage() {
        return new ImportAnfrage();
    }

    /**
     * Create an instance of {@link Import }
     *
     * @return the new instance of {@link Import }
     */
    public Import createImport() {
        return new Import();
    }

    /**
     * Create an instance of {@link Statusuebergang }
     *
     * @return the new instance of {@link Statusuebergang }
     */
    public Statusuebergang createStatusuebergang() {
        return new Statusuebergang();
    }

    /**
     * Create an instance of {@link Ergebnis }
     *
     * @return the new instance of {@link Ergebnis }
     */
    public Ergebnis createErgebnis() {
        return new Ergebnis();
    }

    /**
     * Create an instance of {@link Rekonditionierung }
     *
     * @return the new instance of {@link Rekonditionierung }
     */
    public Rekonditionierung createRekonditionierung() {
        return new Rekonditionierung();
    }

    /**
     * Create an instance of {@link AutoImport }
     *
     * @return the new instance of {@link AutoImport }
     */
    public AutoImport createAutoImport() {
        return new AutoImport();
    }

    /**
     * Create an instance of {@link AutoUpdate }
     *
     * @return the new instance of {@link AutoUpdate }
     */
    public AutoUpdate createAutoUpdate() {
        return new AutoUpdate();
    }

    /**
     * Create an instance of {@link AutoUpdateKopfdaten }
     *
     * @return the new instance of {@link AutoUpdateKopfdaten }
     */
    public AutoUpdateKopfdaten createAutoUpdateKopfdaten() {
        return new AutoUpdateKopfdaten();
    }

    /**
     * Create an instance of {@link AutoUpdateKopfdatenResponse }
     *
     * @return the new instance of {@link AutoUpdateKopfdatenResponse }
     */
    public AutoUpdateKopfdatenResponse createAutoUpdateKopfdatenResponse() {
        return new AutoUpdateKopfdatenResponse();
    }

    /**
     * Create an instance of {@link ImportMitMelden }
     *
     * @return the new instance of {@link ImportMitMelden }
     */
    public ImportMitMelden createImportMitMelden() {
        return new ImportMitMelden();
    }

    /**
     * Create an instance of {@link AktualitaetZinsstrukturListe }
     *
     * @return the new instance of {@link AktualitaetZinsstrukturListe }
     */
    public AktualitaetZinsstrukturListe createAktualitaetZinsstrukturListe() {
        return new AktualitaetZinsstrukturListe();
    }

    /**
     * Create an instance of {@link Geschaeft }
     *
     * @return the new instance of {@link Geschaeft }
     */
    public Geschaeft createGeschaeft() {
        return new Geschaeft();
    }

    /**
     * Create an instance of {@link Geschaefte }
     *
     * @return the new instance of {@link Geschaefte }
     */
    public Geschaefte createGeschaefte() {
        return new Geschaefte();
    }

    /**
     * Create an instance of {@link Zinsstrukturen }
     *
     * @return the new instance of {@link Zinsstrukturen }
     */
    public Zinsstrukturen createZinsstrukturen() {
        return new Zinsstrukturen();
    }

    /**
     * Create an instance of {@link Finanzplaetze }
     *
     * @return the new instance of {@link Finanzplaetze }
     */
    public Finanzplaetze createFinanzplaetze() {
        return new Finanzplaetze();
    }

    /**
     * Create an instance of {@link Deckungsbeitragsschemas }
     *
     * @return the new instance of {@link Deckungsbeitragsschemas }
     */
    public Deckungsbeitragsschemas createDeckungsbeitragsschemas() {
        return new Deckungsbeitragsschemas();
    }

    /**
     * Create an instance of {@link Ratingszenarien }
     *
     * @return the new instance of {@link Ratingszenarien }
     */
    public Ratingszenarien createRatingszenarien() {
        return new Ratingszenarien();
    }

    /**
     * Create an instance of {@link RisikoVarkosten }
     *
     * @return the new instance of {@link RisikoVarkosten }
     */
    public RisikoVarkosten createRisikoVarkosten() {
        return new RisikoVarkosten();
    }

    /**
     * Create an instance of {@link RisikoEigenkapitalkosten }
     *
     * @return the new instance of {@link RisikoEigenkapitalkosten }
     */
    public RisikoEigenkapitalkosten createRisikoEigenkapitalkosten() {
        return new RisikoEigenkapitalkosten();
    }

    /**
     * Create an instance of {@link Risikokonfigurationen }
     *
     * @return the new instance of {@link Risikokonfigurationen }
     */
    public Risikokonfigurationen createRisikokonfigurationen() {
        return new Risikokonfigurationen();
    }

    /**
     * Create an instance of {@link Aufteilung }
     *
     * @return the new instance of {@link Aufteilung }
     */
    public Aufteilung createAufteilung() {
        return new Aufteilung();
    }

    /**
     * Create an instance of {@link Validate }
     *
     * @return the new instance of {@link Validate }
     */
    public Validate createValidate() {
        return new Validate();
    }

    /**
     * Create an instance of {@link ZusaetzlicheErgebnisse }
     *
     * @return the new instance of {@link ZusaetzlicheErgebnisse }
     */
    public ZusaetzlicheErgebnisse createZusaetzlicheErgebnisse() {
        return new ZusaetzlicheErgebnisse();
    }

    /**
     * Create an instance of {@link Logindaten }
     *
     * @return the new instance of {@link Logindaten }
     */
    public Logindaten createLogindaten() {
        return new Logindaten();
    }

    /**
     * Create an instance of {@link Kalkulation }
     *
     * @return the new instance of {@link Kalkulation }
     */
    public Kalkulation createKalkulation() {
        return new Kalkulation();
    }

    /**
     * Create an instance of {@link ZusaetzlicheExportFelder }
     *
     * @return the new instance of {@link ZusaetzlicheExportFelder }
     */
    public ZusaetzlicheExportFelder createZusaetzlicheExportFelder() {
        return new ZusaetzlicheExportFelder();
    }

    /**
     * Create an instance of {@link Kalkulationsparameter }
     *
     * @return the new instance of {@link Kalkulationsparameter }
     */
    public Kalkulationsparameter createKalkulationsparameter() {
        return new Kalkulationsparameter();
    }

    /**
     * Create an instance of {@link Liquikosten }
     *
     * @return the new instance of {@link Liquikosten }
     */
    public Liquikosten createLiquikosten() {
        return new Liquikosten();
    }

    /**
     * Create an instance of {@link Kontofuehrung }
     *
     * @return the new instance of {@link Kontofuehrung }
     */
    public Kontofuehrung createKontofuehrung() {
        return new Kontofuehrung();
    }

    /**
     * Create an instance of {@link StatusuebergangHistory }
     *
     * @return the new instance of {@link StatusuebergangHistory }
     */
    public StatusuebergangHistory createStatusuebergangHistory() {
        return new StatusuebergangHistory();
    }

    /**
     * Create an instance of {@link Iopc }
     *
     * @return the new instance of {@link Iopc }
     */
    public Iopc createIopc() {
        return new Iopc();
    }

    /**
     * Create an instance of {@link GedecktUngedeckt }
     *
     * @return the new instance of {@link GedecktUngedeckt }
     */
    public GedecktUngedeckt createGedecktUngedeckt() {
        return new GedecktUngedeckt();
    }

    /**
     * Create an instance of {@link Risikodaten }
     *
     * @return the new instance of {@link Risikodaten }
     */
    public Risikodaten createRisikodaten() {
        return new Risikodaten();
    }

    /**
     * Create an instance of {@link ImpliziteOptionen }
     *
     * @return the new instance of {@link ImpliziteOptionen }
     */
    public ImpliziteOptionen createImpliziteOptionen() {
        return new ImpliziteOptionen();
    }

    /**
     * Create an instance of {@link RollOver }
     *
     * @return the new instance of {@link RollOver }
     */
    public RollOver createRollOver() {
        return new RollOver();
    }

    /**
     * Create an instance of {@link Treppenrechner }
     *
     * @return the new instance of {@link Treppenrechner }
     */
    public Treppenrechner createTreppenrechner() {
        return new Treppenrechner();
    }

    /**
     * Create an instance of {@link Abloesung }
     *
     * @return the new instance of {@link Abloesung }
     */
    public Abloesung createAbloesung() {
        return new Abloesung();
    }

    /**
     * Create an instance of {@link Bonussparplan }
     *
     * @return the new instance of {@link Bonussparplan }
     */
    public Bonussparplan createBonussparplan() {
        return new Bonussparplan();
    }

    /**
     * Create an instance of {@link SparenRate }
     *
     * @return the new instance of {@link SparenRate }
     */
    public SparenRate createSparenRate() {
        return new SparenRate();
    }

    /**
     * Create an instance of {@link Abgrenzungen }
     *
     * @return the new instance of {@link Abgrenzungen }
     */
    public Abgrenzungen createAbgrenzungen() {
        return new Abgrenzungen();
    }

    /**
     * Create an instance of {@link Tilgungsplan }
     *
     * @return the new instance of {@link Tilgungsplan }
     */
    public Tilgungsplan createTilgungsplan() {
        return new Tilgungsplan();
    }

    /**
     * Create an instance of {@link Cashflows }
     *
     * @return the new instance of {@link Cashflows }
     */
    public Cashflows createCashflows() {
        return new Cashflows();
    }

    /**
     * Create an instance of {@link CashflowListe }
     *
     * @return the new instance of {@link CashflowListe }
     */
    public CashflowListe createCashflowListe() {
        return new CashflowListe();
    }

    /**
     * Create an instance of {@link ZeroBondAbzinsungskonto }
     *
     * @return the new instance of {@link ZeroBondAbzinsungskonto }
     */
    public ZeroBondAbzinsungskonto createZeroBondAbzinsungskonto() {
        return new ZeroBondAbzinsungskonto();
    }

    /**
     * Create an instance of {@link DBSchema }
     *
     * @return the new instance of {@link DBSchema }
     */
    public DBSchema createDBSchema() {
        return new DBSchema();
    }

    /**
     * Create an instance of {@link Sachbearbeiter }
     *
     * @return the new instance of {@link Sachbearbeiter }
     */
    public Sachbearbeiter createSachbearbeiter() {
        return new Sachbearbeiter();
    }

    /**
     * Create an instance of {@link Sparengeschaeft }
     *
     * @return the new instance of {@link Sparengeschaeft }
     */
    public Sparengeschaeft createSparengeschaeft() {
        return new Sparengeschaeft();
    }

    /**
     * Create an instance of {@link Gesamtkosten }
     *
     * @return the new instance of {@link Gesamtkosten }
     */
    public Gesamtkosten createGesamtkosten() {
        return new Gesamtkosten();
    }

    /**
     * Create an instance of {@link Prolongation }
     *
     * @return the new instance of {@link Prolongation }
     */
    public Prolongation createProlongation() {
        return new Prolongation();
    }

    /**
     * Create an instance of {@link TilgungZeile }
     *
     * @return the new instance of {@link TilgungZeile }
     */
    public TilgungZeile createTilgungZeile() {
        return new TilgungZeile();
    }

    /**
     * Create an instance of {@link Kosten }
     *
     * @return the new instance of {@link Kosten }
     */
    public Kosten createKosten() {
        return new Kosten();
    }

    /**
     * Create an instance of {@link DBStufe }
     *
     * @return the new instance of {@link DBStufe }
     */
    public DBStufe createDBStufe() {
        return new DBStufe();
    }

    /**
     * Create an instance of {@link Bonitaet }
     *
     * @return the new instance of {@link Bonitaet }
     */
    public Bonitaet createBonitaet() {
        return new Bonitaet();
    }

    /**
     * Create an instance of {@link Ratingkonfiguration }
     *
     * @return the new instance of {@link Ratingkonfiguration }
     */
    public Ratingkonfiguration createRatingkonfiguration() {
        return new Ratingkonfiguration();
    }

    /**
     * Create an instance of {@link Institutsdaten }
     *
     * @return the new instance of {@link Institutsdaten }
     */
    public Institutsdaten createInstitutsdaten() {
        return new Institutsdaten();
    }

    /**
     * Create an instance of {@link InstitutsdatenForAutoUpdateKopfdaten }
     *
     * @return the new instance of {@link InstitutsdatenForAutoUpdateKopfdaten }
     */
    public InstitutsdatenForAutoUpdateKopfdaten createInstitutsdatenForAutoUpdateKopfdaten() {
        return new InstitutsdatenForAutoUpdateKopfdaten();
    }

    /**
     * Create an instance of {@link Kundendaten }
     *
     * @return the new instance of {@link Kundendaten }
     */
    public Kundendaten createKundendaten() {
        return new Kundendaten();
    }

    /**
     * Create an instance of {@link Druckdaten }
     *
     * @return the new instance of {@link Druckdaten }
     */
    public Druckdaten createDruckdaten() {
        return new Druckdaten();
    }

    /**
     * Create an instance of {@link FinanzplaetzeNamen }
     *
     * @return the new instance of {@link FinanzplaetzeNamen }
     */
    public FinanzplaetzeNamen createFinanzplaetzeNamen() {
        return new FinanzplaetzeNamen();
    }

    /**
     * Create an instance of {@link Kontofuehrungsgebuehr }
     *
     * @return the new instance of {@link Kontofuehrungsgebuehr }
     */
    public Kontofuehrungsgebuehr createKontofuehrungsgebuehr() {
        return new Kontofuehrungsgebuehr();
    }

    /**
     * Create an instance of {@link KontoSicherheiten }
     *
     * @return the new instance of {@link KontoSicherheiten }
     */
    public KontoSicherheiten createKontoSicherheiten() {
        return new KontoSicherheiten();
    }

    /**
     * Create an instance of {@link Optionsrechte }
     *
     * @return the new instance of {@link Optionsrechte }
     */
    public Optionsrechte createOptionsrechte() {
        return new Optionsrechte();
    }

    /**
     * Create an instance of {@link AnnuTilgungen }
     *
     * @return the new instance of {@link AnnuTilgungen }
     */
    public AnnuTilgungen createAnnuTilgungen() {
        return new AnnuTilgungen();
    }

    /**
     * Create an instance of {@link Sonderzahlungen }
     *
     * @return the new instance of {@link Sonderzahlungen }
     */
    public Sonderzahlungen createSonderzahlungen() {
        return new Sonderzahlungen();
    }

    /**
     * Create an instance of {@link Zinsanpassungstermine }
     *
     * @return the new instance of {@link Zinsanpassungstermine }
     */
    public Zinsanpassungstermine createZinsanpassungstermine() {
        return new Zinsanpassungstermine();
    }

    /**
     * Create an instance of {@link OvernightReferenzzinsen }
     *
     * @return the new instance of {@link OvernightReferenzzinsen }
     */
    public OvernightReferenzzinsen createOvernightReferenzzinsen() {
        return new OvernightReferenzzinsen();
    }

    /**
     * Create an instance of {@link Nominalzinsstaffel }
     *
     * @return the new instance of {@link Nominalzinsstaffel }
     */
    public Nominalzinsstaffel createNominalzinsstaffel() {
        return new Nominalzinsstaffel();
    }

    /**
     * Create an instance of {@link ApeDisagioerst }
     *
     * @return the new instance of {@link ApeDisagioerst }
     */
    public ApeDisagioerst createApeDisagioerst() {
        return new ApeDisagioerst();
    }

    /**
     * Create an instance of {@link ApeSondertilgungen }
     *
     * @return the new instance of {@link ApeSondertilgungen }
     */
    public ApeSondertilgungen createApeSondertilgungen() {
        return new ApeSondertilgungen();
    }

    /**
     * Create an instance of {@link Bonussaetze }
     *
     * @return the new instance of {@link Bonussaetze }
     */
    public Bonussaetze createBonussaetze() {
        return new Bonussaetze();
    }

    /**
     * Create an instance of {@link Abgrenzung }
     *
     * @return the new instance of {@link Abgrenzung }
     */
    public Abgrenzung createAbgrenzung() {
        return new Abgrenzung();
    }

    /**
     * Create an instance of {@link TilgungsplanRow }
     *
     * @return the new instance of {@link TilgungsplanRow }
     */
    public TilgungsplanRow createTilgungsplanRow() {
        return new TilgungsplanRow();
    }

    /**
     * Create an instance of {@link AbzinsungskontoRow }
     *
     * @return the new instance of {@link AbzinsungskontoRow }
     */
    public AbzinsungskontoRow createAbzinsungskontoRow() {
        return new AbzinsungskontoRow();
    }

    /**
     * Create an instance of {@link DbPosition }
     *
     * @return the new instance of {@link DbPosition }
     */
    public DbPosition createDbPosition() {
        return new DbPosition();
    }

    /**
     * Create an instance of {@link SachbearbeiterGruppen }
     *
     * @return the new instance of {@link SachbearbeiterGruppen }
     */
    public SachbearbeiterGruppen createSachbearbeiterGruppen() {
        return new SachbearbeiterGruppen();
    }

    /**
     * Create an instance of {@link Nebenkosten }
     *
     * @return the new instance of {@link Nebenkosten }
     */
    public Nebenkosten createNebenkosten() {
        return new Nebenkosten();
    }

    /**
     * Create an instance of {@link FtpcKriterien }
     *
     * @return the new instance of {@link FtpcKriterien }
     */
    public FtpcKriterien createFtpcKriterien() {
        return new FtpcKriterien();
    }

    /**
     * Create an instance of {@link FtpcSpreads }
     *
     * @return the new instance of {@link FtpcSpreads }
     */
    public FtpcSpreads createFtpcSpreads() {
        return new FtpcSpreads();
    }

    /**
     * Create an instance of {@link Sondertilgungen }
     *
     * @return the new instance of {@link Sondertilgungen }
     */
    public Sondertilgungen createSondertilgungen() {
        return new Sondertilgungen();
    }

    /**
     * Create an instance of {@link Teilvalutierungen }
     *
     * @return the new instance of {@link Teilvalutierungen }
     */
    public Teilvalutierungen createTeilvalutierungen() {
        return new Teilvalutierungen();
    }

    /**
     * Create an instance of {@link Tilgungssatzwechsel }
     *
     * @return the new instance of {@link Tilgungssatzwechsel }
     */
    public Tilgungssatzwechsel createTilgungssatzwechsel() {
        return new Tilgungssatzwechsel();
    }

    /**
     * Create an instance of {@link Zinswechsel }
     *
     * @return the new instance of {@link Zinswechsel }
     */
    public Zinswechsel createZinswechsel() {
        return new Zinswechsel();
    }

    /**
     * Create an instance of {@link Ratenwechsel }
     *
     * @return the new instance of {@link Ratenwechsel }
     */
    public Ratenwechsel createRatenwechsel() {
        return new Ratenwechsel();
    }

    /**
     * Create an instance of {@link Ratenstufen }
     *
     * @return the new instance of {@link Ratenstufen }
     */
    public Ratenstufen createRatenstufen() {
        return new Ratenstufen();
    }

    /**
     * Create an instance of {@link Bewegungsstufen }
     *
     * @return the new instance of {@link Bewegungsstufen }
     */
    public Bewegungsstufen createBewegungsstufen() {
        return new Bewegungsstufen();
    }

    /**
     * Create an instance of {@link Zinssaetze }
     *
     * @return the new instance of {@link Zinssaetze }
     */
    public Zinssaetze createZinssaetze() {
        return new Zinssaetze();
    }

    /**
     * Create an instance of {@link ZinsstrukturStuetzstellen }
     *
     * @return the new instance of {@link ZinsstrukturStuetzstellen }
     */
    public ZinsstrukturStuetzstellen createZinsstrukturStuetzstellen() {
        return new ZinsstrukturStuetzstellen();
    }

    /**
     * Create an instance of {@link FesteFeiertage }
     *
     * @return the new instance of {@link FesteFeiertage }
     */
    public FesteFeiertage createFesteFeiertage() {
        return new FesteFeiertage();
    }

    /**
     * Create an instance of {@link KirchlicheFeiertage }
     *
     * @return the new instance of {@link KirchlicheFeiertage }
     */
    public KirchlicheFeiertage createKirchlicheFeiertage() {
        return new KirchlicheFeiertage();
    }

    /**
     * Create an instance of {@link LaenderspezifischeFeiertage }
     *
     * @return the new instance of {@link LaenderspezifischeFeiertage }
     */
    public LaenderspezifischeFeiertage createLaenderspezifischeFeiertage() {
        return new LaenderspezifischeFeiertage();
    }

    /**
     * Create an instance of {@link KostenVorhaltewerte }
     *
     * @return the new instance of {@link KostenVorhaltewerte }
     */
    public KostenVorhaltewerte createKostenVorhaltewerte() {
        return new KostenVorhaltewerte();
    }

    /**
     * Create an instance of {@link KostenListe }
     *
     * @return the new instance of {@link KostenListe }
     */
    public KostenListe createKostenListe() {
        return new KostenListe();
    }

    /**
     * Create an instance of {@link Bonitaeten }
     *
     * @return the new instance of {@link Bonitaeten }
     */
    public Bonitaeten createBonitaeten() {
        return new Bonitaeten();
    }

    /**
     * Create an instance of {@link Migrationswahrscheinlichkeiten }
     *
     * @return the new instance of {@link Migrationswahrscheinlichkeiten }
     */
    public Migrationswahrscheinlichkeiten createMigrationswahrscheinlichkeiten() {
        return new Migrationswahrscheinlichkeiten();
    }

    /**
     * Create an instance of {@link Ausfallwahrscheinlichkeiten }
     *
     * @return the new instance of {@link Ausfallwahrscheinlichkeiten }
     */
    public Ausfallwahrscheinlichkeiten createAusfallwahrscheinlichkeiten() {
        return new Ausfallwahrscheinlichkeiten();
    }

    /**
     * Create an instance of {@link SzenarioWktenPds }
     *
     * @return the new instance of {@link SzenarioWktenPds }
     */
    public SzenarioWktenPds createSzenarioWktenPds() {
        return new SzenarioWktenPds();
    }

    /**
     * Create an instance of {@link DynamisierungsTabelle }
     *
     * @return the new instance of {@link DynamisierungsTabelle }
     */
    public DynamisierungsTabelle createDynamisierungsTabelle() {
        return new DynamisierungsTabelle();
    }

    /**
     * Create an instance of {@link RisikokonfigurationParameter }
     *
     * @return the new instance of {@link RisikokonfigurationParameter }
     */
    public RisikokonfigurationParameter createRisikokonfigurationParameter() {
        return new RisikokonfigurationParameter();
    }

    /**
     * Create an instance of {@link Institutsdatenvariabel }
     *
     * @return the new instance of {@link Institutsdatenvariabel }
     */
    public Institutsdatenvariabel createInstitutsdatenvariabel() {
        return new Institutsdatenvariabel();
    }

    /**
     * Create an instance of {@link InstitutskriterienAuswahl }
     *
     * @return the new instance of {@link InstitutskriterienAuswahl }
     */
    public InstitutskriterienAuswahl createInstitutskriterienAuswahl() {
        return new InstitutskriterienAuswahl();
    }

    /**
     * Create an instance of {@link InstitutskriterienWert }
     *
     * @return the new instance of {@link InstitutskriterienWert }
     */
    public InstitutskriterienWert createInstitutskriterienWert() {
        return new InstitutskriterienWert();
    }

    /**
     * Create an instance of {@link InstitutskriterienDatum }
     *
     * @return the new instance of {@link InstitutskriterienDatum }
     */
    public InstitutskriterienDatum createInstitutskriterienDatum() {
        return new InstitutskriterienDatum();
    }

    /**
     * Create an instance of {@link KontoSicherheit }
     *
     * @return the new instance of {@link KontoSicherheit }
     */
    public KontoSicherheit createKontoSicherheit() {
        return new KontoSicherheit();
    }

    /**
     * Create an instance of {@link Optionsrecht }
     *
     * @return the new instance of {@link Optionsrecht }
     */
    public Optionsrecht createOptionsrecht() {
        return new Optionsrecht();
    }

    /**
     * Create an instance of {@link AnnuTilgung }
     *
     * @return the new instance of {@link AnnuTilgung }
     */
    public AnnuTilgung createAnnuTilgung() {
        return new AnnuTilgung();
    }

    /**
     * Create an instance of {@link Sonderzahlung }
     *
     * @return the new instance of {@link Sonderzahlung }
     */
    public Sonderzahlung createSonderzahlung() {
        return new Sonderzahlung();
    }

    /**
     * Create an instance of {@link OvernightReferenzzins }
     *
     * @return the new instance of {@link OvernightReferenzzins }
     */
    public OvernightReferenzzins createOvernightReferenzzins() {
        return new OvernightReferenzzins();
    }

    /**
     * Create an instance of {@link Zinsanpassungstermin }
     *
     * @return the new instance of {@link Zinsanpassungstermin }
     */
    public Zinsanpassungstermin createZinsanpassungstermin() {
        return new Zinsanpassungstermin();
    }

    /**
     * Create an instance of {@link Neuernominalzins }
     *
     * @return the new instance of {@link Neuernominalzins }
     */
    public Neuernominalzins createNeuernominalzins() {
        return new Neuernominalzins();
    }

    /**
     * Create an instance of {@link ApeSondertilgung }
     *
     * @return the new instance of {@link ApeSondertilgung }
     */
    public ApeSondertilgung createApeSondertilgung() {
        return new ApeSondertilgung();
    }

    /**
     * Create an instance of {@link Bonussatz }
     *
     * @return the new instance of {@link Bonussatz }
     */
    public Bonussatz createBonussatz() {
        return new Bonussatz();
    }

    /**
     * Create an instance of {@link Einmalkosten }
     *
     * @return the new instance of {@link Einmalkosten }
     */
    public Einmalkosten createEinmalkosten() {
        return new Einmalkosten();
    }

    /**
     * Create an instance of {@link RegelmaessigeKostenBetrag }
     *
     * @return the new instance of {@link RegelmaessigeKostenBetrag }
     */
    public RegelmaessigeKostenBetrag createRegelmaessigeKostenBetrag() {
        return new RegelmaessigeKostenBetrag();
    }

    /**
     * Create an instance of {@link RegelmaessigeKostenProzent }
     *
     * @return the new instance of {@link RegelmaessigeKostenProzent }
     */
    public RegelmaessigeKostenProzent createRegelmaessigeKostenProzent() {
        return new RegelmaessigeKostenProzent();
    }

    /**
     * Create an instance of {@link Teilvalutierung }
     *
     * @return the new instance of {@link Teilvalutierung }
     */
    public Teilvalutierung createTeilvalutierung() {
        return new Teilvalutierung();
    }

    /**
     * Create an instance of {@link Neuertilgungssatz }
     *
     * @return the new instance of {@link Neuertilgungssatz }
     */
    public Neuertilgungssatz createNeuertilgungssatz() {
        return new Neuertilgungssatz();
    }

    /**
     * Create an instance of {@link Neuerzinssatz }
     *
     * @return the new instance of {@link Neuerzinssatz }
     */
    public Neuerzinssatz createNeuerzinssatz() {
        return new Neuerzinssatz();
    }

    /**
     * Create an instance of {@link Neuerate }
     *
     * @return the new instance of {@link Neuerate }
     */
    public Neuerate createNeuerate() {
        return new Neuerate();
    }

    /**
     * Create an instance of {@link Ratenstufe }
     *
     * @return the new instance of {@link Ratenstufe }
     */
    public Ratenstufe createRatenstufe() {
        return new Ratenstufe();
    }

    /**
     * Create an instance of {@link BewegungsstufenTreppe }
     *
     * @return the new instance of {@link BewegungsstufenTreppe }
     */
    public BewegungsstufenTreppe createBewegungsstufenTreppe() {
        return new BewegungsstufenTreppe();
    }

    /**
     * Create an instance of {@link Zinssatz }
     *
     * @return the new instance of {@link Zinssatz }
     */
    public Zinssatz createZinssatz() {
        return new Zinssatz();
    }

    /**
     * Create an instance of {@link Stuetzstelle }
     *
     * @return the new instance of {@link Stuetzstelle }
     */
    public Stuetzstelle createStuetzstelle() {
        return new Stuetzstelle();
    }

    /**
     * Create an instance of {@link Feiertag }
     *
     * @return the new instance of {@link Feiertag }
     */
    public Feiertag createFeiertag() {
        return new Feiertag();
    }

    /**
     * Create an instance of {@link AmerikanischeFeiertage }
     *
     * @return the new instance of {@link AmerikanischeFeiertage }
     */
    public AmerikanischeFeiertage createAmerikanischeFeiertage() {
        return new AmerikanischeFeiertage();
    }

    /**
     * Create an instance of {@link BritischeFeiertage }
     *
     * @return the new instance of {@link BritischeFeiertage }
     */
    public BritischeFeiertage createBritischeFeiertage() {
        return new BritischeFeiertage();
    }

    /**
     * Create an instance of {@link JapanischeFeiertage }
     *
     * @return the new instance of {@link JapanischeFeiertage }
     */
    public JapanischeFeiertage createJapanischeFeiertage() {
        return new JapanischeFeiertage();
    }

    /**
     * Create an instance of {@link Vorhaltewert }
     *
     * @return the new instance of {@link Vorhaltewert }
     */
    public Vorhaltewert createVorhaltewert() {
        return new Vorhaltewert();
    }

    /**
     * Create an instance of {@link Migrationswahrscheinlichkeit }
     *
     * @return the new instance of {@link Migrationswahrscheinlichkeit }
     */
    public Migrationswahrscheinlichkeit createMigrationswahrscheinlichkeit() {
        return new Migrationswahrscheinlichkeit();
    }

    /**
     * Create an instance of {@link Ausfallwahrscheinlichkeit }
     *
     * @return the new instance of {@link Ausfallwahrscheinlichkeit }
     */
    public Ausfallwahrscheinlichkeit createAusfallwahrscheinlichkeit() {
        return new Ausfallwahrscheinlichkeit();
    }

    /**
     * Create an instance of {@link SzenarioWktenPd }
     *
     * @return the new instance of {@link SzenarioWktenPd }
     */
    public SzenarioWktenPd createSzenarioWktenPd() {
        return new SzenarioWktenPd();
    }

    /**
     * Create an instance of {@link DynamisierungsTabelleZeile }
     *
     * @return the new instance of {@link DynamisierungsTabelleZeile }
     */
    public DynamisierungsTabelleZeile createDynamisierungsTabelleZeile() {
        return new DynamisierungsTabelleZeile();
    }

    /**
     * Create an instance of {@link RisikokonfigurationQFaktoren }
     *
     * @return the new instance of {@link RisikokonfigurationQFaktoren }
     */
    public RisikokonfigurationQFaktoren createRisikokonfigurationQFaktoren() {
        return new RisikokonfigurationQFaktoren();
    }

    /**
     * Create an instance of {@link RisikokonfigurationParameterDynamisierungstabelle }
     *
     * @return the new instance of {@link RisikokonfigurationParameterDynamisierungstabelle }
     */
    public RisikokonfigurationParameterDynamisierungstabelle createRisikokonfigurationParameterDynamisierungstabelle() {
        return new RisikokonfigurationParameterDynamisierungstabelle();
    }

    /**
     * Create an instance of {@link Fehler }
     *
     * @return the new instance of {@link Fehler }
     */
    public Fehler createFehler() {
        return new Fehler();
    }

    /**
     * Create an instance of {@link InstitutsdatenvariabelEintrag }
     *
     * @return the new instance of {@link InstitutsdatenvariabelEintrag }
     */
    public InstitutsdatenvariabelEintrag createInstitutsdatenvariabelEintrag() {
        return new InstitutsdatenvariabelEintrag();
    }

    /**
     * Create an instance of {@link InstitutskriteriaAuswahl }
     *
     * @return the new instance of {@link InstitutskriteriaAuswahl }
     */
    public InstitutskriteriaAuswahl createInstitutskriteriaAuswahl() {
        return new InstitutskriteriaAuswahl();
    }

    /**
     * Create an instance of {@link InstitutskriteriaWert }
     *
     * @return the new instance of {@link InstitutskriteriaWert }
     */
    public InstitutskriteriaWert createInstitutskriteriaWert() {
        return new InstitutskriteriaWert();
    }

    /**
     * Create an instance of {@link InstitutskriteriaDatum }
     *
     * @return the new instance of {@link InstitutskriteriaDatum }
     */
    public InstitutskriteriaDatum createInstitutskriteriaDatum() {
        return new InstitutskriteriaDatum();
    }

    /**
     * Create an instance of {@link EinmalkostenKosten }
     *
     * @return the new instance of {@link EinmalkostenKosten }
     */
    public EinmalkostenKosten createEinmalkostenKosten() {
        return new EinmalkostenKosten();
    }

    /**
     * Create an instance of {@link RegelmaessigeKostenBetragKosten }
     *
     * @return the new instance of {@link RegelmaessigeKostenBetragKosten }
     */
    public RegelmaessigeKostenBetragKosten createRegelmaessigeKostenBetragKosten() {
        return new RegelmaessigeKostenBetragKosten();
    }

    /**
     * Create an instance of {@link RegelmaessigeKostenProzentKosten }
     *
     * @return the new instance of {@link RegelmaessigeKostenProzentKosten }
     */
    public RegelmaessigeKostenProzentKosten createRegelmaessigeKostenProzentKosten() {
        return new RegelmaessigeKostenProzentKosten();
    }

    /**
     * Create an instance of {@link StuetzstelleLaufzeit }
     *
     * @return the new instance of {@link StuetzstelleLaufzeit }
     */
    public StuetzstelleLaufzeit createStuetzstelleLaufzeit() {
        return new StuetzstelleLaufzeit();
    }

    /**
     * Create an instance of {@link AusfallwahrscheinlichkeitLaufzeit }
     *
     * @return the new instance of {@link AusfallwahrscheinlichkeitLaufzeit }
     */
    public AusfallwahrscheinlichkeitLaufzeit createAusfallwahrscheinlichkeitLaufzeit() {
        return new AusfallwahrscheinlichkeitLaufzeit();
    }

    /**
     * Create an instance of {@link RisikokonfigurationQFaktor }
     *
     * @return the new instance of {@link RisikokonfigurationQFaktor }
     */
    public RisikokonfigurationQFaktor createRisikokonfigurationQFaktor() {
        return new RisikokonfigurationQFaktor();
    }

    /**
     * Create an instance of {@link GezeichnetesKapital }
     *
     * @return the new instance of {@link GezeichnetesKapital }
     */
    public GezeichnetesKapital createGezeichnetesKapital() {
        return new GezeichnetesKapital();
    }

    /**
     * Create an instance of {@link FehlerParameterliste }
     *
     * @return the new instance of {@link FehlerParameterliste }
     */
    public FehlerParameterliste createFehlerParameterliste() {
        return new FehlerParameterliste();
    }

    /**
     * Create an instance of {@link FehlerParameterlisteParameter }
     *
     * @return the new instance of {@link FehlerParameterlisteParameter }
     */
    public FehlerParameterlisteParameter createFehlerParameterlisteParameter() {
        return new FehlerParameterlisteParameter();
    }

    /**
     * Create an instance of {@link Cashflow }
     *
     * @return the new instance of {@link Cashflow }
     */
    public Cashflow createCashflow() {
        return new Cashflow();
    }

    /**
     * Create an instance of {@link RasterungTilgungsplan }
     *
     * @return the new instance of {@link RasterungTilgungsplan }
     */
    public RasterungTilgungsplan createRasterungTilgungsplan() {
        return new RasterungTilgungsplan();
    }

    /**
     * Create an instance of {@link Verwaltungsdaten }
     *
     * @return the new instance of {@link Verwaltungsdaten }
     */
    public Verwaltungsdaten createVerwaltungsdaten() {
        return new Verwaltungsdaten();
    }

    /**
     * Create an instance of {@link Verwaltungsdatenwert }
     *
     * @return the new instance of {@link Verwaltungsdatenwert }
     */
    public Verwaltungsdatenwert createVerwaltungsdatenwert() {
        return new Verwaltungsdatenwert();
    }

    /**
     * Create an instance of {@link FtpcKriterium }
     *
     * @return the new instance of {@link FtpcKriterium }
     */
    public FtpcKriterium createFtpcKriterium() {
        return new FtpcKriterium();
    }

    /**
     * Create an instance of {@link FtpcSpread }
     *
     * @return the new instance of {@link FtpcSpread }
     */
    public FtpcSpread createFtpcSpread() {
        return new FtpcSpread();
    }

    /**
     * Create an instance of {@link AktualitaetZinsstruktur }
     *
     * @return the new instance of {@link AktualitaetZinsstruktur }
     */
    public AktualitaetZinsstruktur createAktualitaetZinsstruktur() {
        return new AktualitaetZinsstruktur();
    }

    /**
     * Create an instance of {@link KreditgeschaeftSelektionExport }
     *
     * @return the new instance of {@link KreditgeschaeftSelektionExport }
     */
    public KreditgeschaeftSelektionExport createKreditgeschaeftSelektionExport() {
        return new KreditgeschaeftSelektionExport();
    }

    /**
     * Create an instance of {@link ZinsstrukturenSelektion }
     *
     * @return the new instance of {@link ZinsstrukturenSelektion }
     */
    public ZinsstrukturenSelektion createZinsstrukturenSelektion() {
        return new ZinsstrukturenSelektion();
    }

    /**
     * Create an instance of {@link Alleaus }
     *
     * @return the new instance of {@link Alleaus }
     */
    public Alleaus createAlleaus() {
        return new Alleaus();
    }

    /**
     * Create an instance of {@link NamenSelektion }
     *
     * @return the new instance of {@link NamenSelektion }
     */
    public NamenSelektion createNamenSelektion() {
        return new NamenSelektion();
    }

    /**
     * Create an instance of {@link Teilgeschaefte }
     *
     * @return the new instance of {@link Teilgeschaefte }
     */
    public Teilgeschaefte createTeilgeschaefte() {
        return new Teilgeschaefte();
    }

    /**
     * Create an instance of {@link Teilgeschaeft }
     *
     * @return the new instance of {@link Teilgeschaeft }
     */
    public Teilgeschaeft createTeilgeschaeft() {
        return new Teilgeschaeft();
    }

    /**
     * Create an instance of {@link KreditgeschaeftSelektionImport }
     *
     * @return the new instance of {@link KreditgeschaeftSelektionImport }
     */
    public KreditgeschaeftSelektionImport createKreditgeschaeftSelektionImport() {
        return new KreditgeschaeftSelektionImport();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceVersionResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ServiceVersionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "serviceVersionResponse")
    public JAXBElement<ServiceVersionResponse> createServiceVersionResponse(ServiceVersionResponse value) {
        return new JAXBElement<>(_ServiceVersionResponse_QNAME, ServiceVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Kreditgeschaeft }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Kreditgeschaeft }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Kreditgeschaeft")
    public JAXBElement<Kreditgeschaeft> createKreditgeschaeft(Kreditgeschaeft value) {
        return new JAXBElement<>(_Kreditgeschaeft_QNAME, Kreditgeschaeft.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Zinsstruktur }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Zinsstruktur }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Zinsstruktur")
    public JAXBElement<Zinsstruktur> createZinsstruktur(Zinsstruktur value) {
        return new JAXBElement<>(_Zinsstruktur_QNAME, Zinsstruktur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Finanzplatz }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Finanzplatz }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Finanzplatz")
    public JAXBElement<Finanzplatz> createFinanzplatz(Finanzplatz value) {
        return new JAXBElement<>(_Finanzplatz_QNAME, Finanzplatz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deckungsbeitragsschema }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Deckungsbeitragsschema }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Deckungsbeitragsschema")
    public JAXBElement<Deckungsbeitragsschema> createDeckungsbeitragsschema(Deckungsbeitragsschema value) {
        return new JAXBElement<>(_Deckungsbeitragsschema_QNAME, Deckungsbeitragsschema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ratingszenario }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Ratingszenario }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Ratingszenario")
    public JAXBElement<Ratingszenario> createRatingszenario(Ratingszenario value) {
        return new JAXBElement<>(_Ratingszenario_QNAME, Ratingszenario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisikoVarkost }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RisikoVarkost }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "RisikoVarkost")
    public JAXBElement<RisikoVarkost> createRisikoVarkost(RisikoVarkost value) {
        return new JAXBElement<>(_RisikoVarkost_QNAME, RisikoVarkost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisikoEigenkapitalkost }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RisikoEigenkapitalkost }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "RisikoEigenkapitalkost")
    public JAXBElement<RisikoEigenkapitalkost> createRisikoEigenkapitalkost(RisikoEigenkapitalkost value) {
        return new JAXBElement<>(_RisikoEigenkapitalkost_QNAME, RisikoEigenkapitalkost.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Risikokonfiguration }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Risikokonfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Risikokonfiguration")
    public JAXBElement<Risikokonfiguration> createRisikokonfiguration(Risikokonfiguration value) {
        return new JAXBElement<>(_Risikokonfiguration_QNAME, Risikokonfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fehlerliste }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Fehlerliste }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Fehlerliste")
    public JAXBElement<Fehlerliste> createFehlerliste(Fehlerliste value) {
        return new JAXBElement<>(_Fehlerliste_QNAME, Fehlerliste.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Plaene }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Plaene }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Plaene")
    public JAXBElement<Plaene> createPlaene(Plaene value) {
        return new JAXBElement<>(_Plaene_QNAME, Plaene.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Export }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Export }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Export")
    public JAXBElement<Export> createExport(Export value) {
        return new JAXBElement<>(_Export_QNAME, Export.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportAnfrage }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ExportAnfrage }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "ExportAnfrage")
    public JAXBElement<ExportAnfrage> createExportAnfrage(ExportAnfrage value) {
        return new JAXBElement<>(_ExportAnfrage_QNAME, ExportAnfrage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportAnfrage }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ImportAnfrage }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "ImportAnfrage")
    public JAXBElement<ImportAnfrage> createImportAnfrage(ImportAnfrage value) {
        return new JAXBElement<>(_ImportAnfrage_QNAME, ImportAnfrage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Import }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Import }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Import")
    public JAXBElement<Import> createImport(Import value) {
        return new JAXBElement<>(_Import_QNAME, Import.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Statusuebergang }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Statusuebergang }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Statusuebergang")
    public JAXBElement<Statusuebergang> createStatusuebergang(Statusuebergang value) {
        return new JAXBElement<>(_Statusuebergang_QNAME, Statusuebergang.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ergebnis }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Ergebnis }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Ergebnis")
    public JAXBElement<Ergebnis> createErgebnis(Ergebnis value) {
        return new JAXBElement<>(_Ergebnis_QNAME, Ergebnis.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rekonditionierung }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Rekonditionierung }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Rekonditionierung")
    public JAXBElement<Rekonditionierung> createRekonditionierung(Rekonditionierung value) {
        return new JAXBElement<>(_Rekonditionierung_QNAME, Rekonditionierung.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoImport }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AutoImport }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "AutoImport")
    public JAXBElement<AutoImport> createAutoImport(AutoImport value) {
        return new JAXBElement<>(_AutoImport_QNAME, AutoImport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoUpdate }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AutoUpdate }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "AutoUpdate")
    public JAXBElement<AutoUpdate> createAutoUpdate(AutoUpdate value) {
        return new JAXBElement<>(_AutoUpdate_QNAME, AutoUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoUpdateKopfdaten }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AutoUpdateKopfdaten }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "AutoUpdateKopfdaten")
    public JAXBElement<AutoUpdateKopfdaten> createAutoUpdateKopfdaten(AutoUpdateKopfdaten value) {
        return new JAXBElement<>(_AutoUpdateKopfdaten_QNAME, AutoUpdateKopfdaten.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutoUpdateKopfdatenResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AutoUpdateKopfdatenResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "AutoUpdateKopfdatenResponse")
    public JAXBElement<AutoUpdateKopfdatenResponse> createAutoUpdateKopfdatenResponse(AutoUpdateKopfdatenResponse value) {
        return new JAXBElement<>(_AutoUpdateKopfdatenResponse_QNAME, AutoUpdateKopfdatenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportMitMelden }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ImportMitMelden }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "ImportMitMelden")
    public JAXBElement<ImportMitMelden> createImportMitMelden(ImportMitMelden value) {
        return new JAXBElement<>(_ImportMitMelden_QNAME, ImportMitMelden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AktualitaetZinsstrukturListe }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AktualitaetZinsstrukturListe }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "AktualitaetZinsstrukturListe")
    public JAXBElement<AktualitaetZinsstrukturListe> createAktualitaetZinsstrukturListe(AktualitaetZinsstrukturListe value) {
        return new JAXBElement<>(_AktualitaetZinsstrukturListe_QNAME, AktualitaetZinsstrukturListe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Geschaeft }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Geschaeft }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Geschaeft")
    public JAXBElement<Geschaeft> createGeschaeft(Geschaeft value) {
        return new JAXBElement<>(_Geschaeft_QNAME, Geschaeft.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Geschaefte }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Geschaefte }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Geschaefte")
    public JAXBElement<Geschaefte> createGeschaefte(Geschaefte value) {
        return new JAXBElement<>(_Geschaefte_QNAME, Geschaefte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Zinsstrukturen }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Zinsstrukturen }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Zinsstrukturen")
    public JAXBElement<Zinsstrukturen> createZinsstrukturen(Zinsstrukturen value) {
        return new JAXBElement<>(_Zinsstrukturen_QNAME, Zinsstrukturen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Finanzplaetze }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Finanzplaetze }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Finanzplaetze")
    public JAXBElement<Finanzplaetze> createFinanzplaetze(Finanzplaetze value) {
        return new JAXBElement<>(_Finanzplaetze_QNAME, Finanzplaetze.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deckungsbeitragsschemas }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Deckungsbeitragsschemas }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Deckungsbeitragsschemas")
    public JAXBElement<Deckungsbeitragsschemas> createDeckungsbeitragsschemas(Deckungsbeitragsschemas value) {
        return new JAXBElement<>(_Deckungsbeitragsschemas_QNAME, Deckungsbeitragsschemas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ratingszenarien }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Ratingszenarien }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Ratingszenarien")
    public JAXBElement<Ratingszenarien> createRatingszenarien(Ratingszenarien value) {
        return new JAXBElement<>(_Ratingszenarien_QNAME, Ratingszenarien.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisikoVarkosten }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RisikoVarkosten }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "RisikoVarkosten")
    public JAXBElement<RisikoVarkosten> createRisikoVarkosten(RisikoVarkosten value) {
        return new JAXBElement<>(_RisikoVarkosten_QNAME, RisikoVarkosten.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RisikoEigenkapitalkosten }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RisikoEigenkapitalkosten }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "RisikoEigenkapitalkosten")
    public JAXBElement<RisikoEigenkapitalkosten> createRisikoEigenkapitalkosten(RisikoEigenkapitalkosten value) {
        return new JAXBElement<>(_RisikoEigenkapitalkosten_QNAME, RisikoEigenkapitalkosten.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Risikokonfigurationen }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Risikokonfigurationen }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Risikokonfigurationen")
    public JAXBElement<Risikokonfigurationen> createRisikokonfigurationen(Risikokonfigurationen value) {
        return new JAXBElement<>(_Risikokonfigurationen_QNAME, Risikokonfigurationen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Aufteilung }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Aufteilung }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Aufteilung")
    public JAXBElement<Aufteilung> createAufteilung(Aufteilung value) {
        return new JAXBElement<>(_Aufteilung_QNAME, Aufteilung.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Validate }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Validate }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "Validate")
    public JAXBElement<Validate> createValidate(Validate value) {
        return new JAXBElement<>(_Validate_QNAME, Validate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZusaetzlicheErgebnisse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ZusaetzlicheErgebnisse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.gillardon.de/marzipan/integrationsservice", name = "ZusaetzlicheErgebnisse")
    public JAXBElement<ZusaetzlicheErgebnisse> createZusaetzlicheErgebnisse(ZusaetzlicheErgebnisse value) {
        return new JAXBElement<>(_ZusaetzlicheErgebnisse_QNAME, ZusaetzlicheErgebnisse.class, null, value);
    }

}
