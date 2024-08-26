/*
 * Geschäfte
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 24.2.0-SNAPSHOT
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.msg4banking.processservice.application.model.transaction;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;

import java.util.Objects;

/**
 * KalkulationsdatenRollover
 */
@JsonPropertyOrder({
        KalkulationsdatenRollover.JSON_PROPERTY_EFFEKTIVDATEN,
        KalkulationsdatenRollover.JSON_PROPERTY_LIQUIDITAETSKOSTEN,
        KalkulationsdatenRollover.JSON_PROPERTY_MARGEDATEN,
        KalkulationsdatenRollover.JSON_PROPERTY_TEILDECKUNGSDATEN,
        KalkulationsdatenRollover.JSON_PROPERTY_NOMINALDATEN,
        KalkulationsdatenRollover.JSON_PROPERTY_REFERENZZINSDATEN,
        KalkulationsdatenRollover.JSON_PROPERTY_OVERNIGHTDATEN,
        KalkulationsdatenRollover.JSON_PROPERTY_EFFEKTIVDATEN_LIQUIDITAETSBINDUNGSSICHT,
        KalkulationsdatenRollover.JSON_PROPERTY_MARGEDATEN_LIQUIDITAETSBINDUNGSSICHT,
        KalkulationsdatenRollover.JSON_PROPERTY_NOMINALDATEN_LIQUIDITAETSBINDUNGSSICHT,
        KalkulationsdatenRollover.JSON_PROPERTY_TEILDECKUNGSDATEN_LIQUIDITAETSBINDUNGSSICHT,
        KalkulationsdatenRollover.JSON_PROPERTY_NOMINALDATEN_ZINSBINDUNGSSICHT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-13T14:12:50.387795700+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class KalkulationsdatenRollover {
    public static final String JSON_PROPERTY_EFFEKTIVDATEN = "effektivdaten";
    private EffektivdatenRollover effektivdaten;

    public static final String JSON_PROPERTY_LIQUIDITAETSKOSTEN = "liquiditaetskosten";
    private LiquiditaetskostenRollover liquiditaetskosten;

    public static final String JSON_PROPERTY_MARGEDATEN = "margedaten";
    private MargedatenRollover margedaten;

    public static final String JSON_PROPERTY_TEILDECKUNGSDATEN = "teildeckungsdaten";
    private TeildeckungsdatenRollover teildeckungsdaten;

    public static final String JSON_PROPERTY_NOMINALDATEN = "nominaldaten";
    private NominaldatenRollover nominaldaten;

    public static final String JSON_PROPERTY_REFERENZZINSDATEN = "referenzzinsdaten";
    private Referenzzinsdaten referenzzinsdaten;

    public static final String JSON_PROPERTY_OVERNIGHTDATEN = "overnightdaten";
    private Overnightdaten overnightdaten;

    public static final String JSON_PROPERTY_EFFEKTIVDATEN_LIQUIDITAETSBINDUNGSSICHT = "effektivdatenLiquiditaetsbindungssicht";
    private EffektivdatenRolloverSicht effektivdatenLiquiditaetsbindungssicht;

    public static final String JSON_PROPERTY_MARGEDATEN_LIQUIDITAETSBINDUNGSSICHT = "margedatenLiquiditaetsbindungssicht";
    private MargedatenRolloverSicht margedatenLiquiditaetsbindungssicht;

    public static final String JSON_PROPERTY_NOMINALDATEN_LIQUIDITAETSBINDUNGSSICHT = "nominaldatenLiquiditaetsbindungssicht";
    private NominaldatenRolloverSicht nominaldatenLiquiditaetsbindungssicht;

    public static final String JSON_PROPERTY_TEILDECKUNGSDATEN_LIQUIDITAETSBINDUNGSSICHT = "teildeckungsdatenLiquiditaetsbindungssicht";
    private TeildeckungsdatenRolloverSicht teildeckungsdatenLiquiditaetsbindungssicht;

    public static final String JSON_PROPERTY_NOMINALDATEN_ZINSBINDUNGSSICHT = "nominaldatenZinsbindungssicht";
    private NominaldatenRolloverSicht nominaldatenZinsbindungssicht;

    public KalkulationsdatenRollover() {
    }

    public KalkulationsdatenRollover effektivdaten(EffektivdatenRollover effektivdaten) {

        this.effektivdaten = effektivdaten;
        return this;
    }

    /**
     * Get effektivdaten
     *
     * @return effektivdaten
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_EFFEKTIVDATEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public EffektivdatenRollover getEffektivdaten() {
        return effektivdaten;
    }


    @JsonProperty(JSON_PROPERTY_EFFEKTIVDATEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEffektivdaten(EffektivdatenRollover effektivdaten) {
        this.effektivdaten = effektivdaten;
    }

    public KalkulationsdatenRollover liquiditaetskosten(LiquiditaetskostenRollover liquiditaetskosten) {

        this.liquiditaetskosten = liquiditaetskosten;
        return this;
    }

    /**
     * Get liquiditaetskosten
     *
     * @return liquiditaetskosten
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_LIQUIDITAETSKOSTEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public LiquiditaetskostenRollover getLiquiditaetskosten() {
        return liquiditaetskosten;
    }


    @JsonProperty(JSON_PROPERTY_LIQUIDITAETSKOSTEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLiquiditaetskosten(LiquiditaetskostenRollover liquiditaetskosten) {
        this.liquiditaetskosten = liquiditaetskosten;
    }

    public KalkulationsdatenRollover margedaten(MargedatenRollover margedaten) {

        this.margedaten = margedaten;
        return this;
    }

    /**
     * Get margedaten
     *
     * @return margedaten
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_MARGEDATEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public MargedatenRollover getMargedaten() {
        return margedaten;
    }


    @JsonProperty(JSON_PROPERTY_MARGEDATEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMargedaten(MargedatenRollover margedaten) {
        this.margedaten = margedaten;
    }

    public KalkulationsdatenRollover teildeckungsdaten(TeildeckungsdatenRollover teildeckungsdaten) {

        this.teildeckungsdaten = teildeckungsdaten;
        return this;
    }

    /**
     * Get teildeckungsdaten
     *
     * @return teildeckungsdaten
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_TEILDECKUNGSDATEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public TeildeckungsdatenRollover getTeildeckungsdaten() {
        return teildeckungsdaten;
    }


    @JsonProperty(JSON_PROPERTY_TEILDECKUNGSDATEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTeildeckungsdaten(TeildeckungsdatenRollover teildeckungsdaten) {
        this.teildeckungsdaten = teildeckungsdaten;
    }

    public KalkulationsdatenRollover nominaldaten(NominaldatenRollover nominaldaten) {

        this.nominaldaten = nominaldaten;
        return this;
    }

    /**
     * Get nominaldaten
     *
     * @return nominaldaten
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_NOMINALDATEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public NominaldatenRollover getNominaldaten() {
        return nominaldaten;
    }


    @JsonProperty(JSON_PROPERTY_NOMINALDATEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNominaldaten(NominaldatenRollover nominaldaten) {
        this.nominaldaten = nominaldaten;
    }

    public KalkulationsdatenRollover referenzzinsdaten(Referenzzinsdaten referenzzinsdaten) {

        this.referenzzinsdaten = referenzzinsdaten;
        return this;
    }

    /**
     * Get referenzzinsdaten
     *
     * @return referenzzinsdaten
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_REFERENZZINSDATEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Referenzzinsdaten getReferenzzinsdaten() {
        return referenzzinsdaten;
    }


    @JsonProperty(JSON_PROPERTY_REFERENZZINSDATEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReferenzzinsdaten(Referenzzinsdaten referenzzinsdaten) {
        this.referenzzinsdaten = referenzzinsdaten;
    }

    public KalkulationsdatenRollover overnightdaten(Overnightdaten overnightdaten) {

        this.overnightdaten = overnightdaten;
        return this;
    }

    /**
     * Get overnightdaten
     *
     * @return overnightdaten
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_OVERNIGHTDATEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Overnightdaten getOvernightdaten() {
        return overnightdaten;
    }


    @JsonProperty(JSON_PROPERTY_OVERNIGHTDATEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOvernightdaten(Overnightdaten overnightdaten) {
        this.overnightdaten = overnightdaten;
    }

    public KalkulationsdatenRollover effektivdatenLiquiditaetsbindungssicht(EffektivdatenRolloverSicht effektivdatenLiquiditaetsbindungssicht) {

        this.effektivdatenLiquiditaetsbindungssicht = effektivdatenLiquiditaetsbindungssicht;
        return this;
    }

    /**
     * Get effektivdatenLiquiditaetsbindungssicht
     *
     * @return effektivdatenLiquiditaetsbindungssicht
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_EFFEKTIVDATEN_LIQUIDITAETSBINDUNGSSICHT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public EffektivdatenRolloverSicht getEffektivdatenLiquiditaetsbindungssicht() {
        return effektivdatenLiquiditaetsbindungssicht;
    }


    @JsonProperty(JSON_PROPERTY_EFFEKTIVDATEN_LIQUIDITAETSBINDUNGSSICHT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEffektivdatenLiquiditaetsbindungssicht(EffektivdatenRolloverSicht effektivdatenLiquiditaetsbindungssicht) {
        this.effektivdatenLiquiditaetsbindungssicht = effektivdatenLiquiditaetsbindungssicht;
    }

    public KalkulationsdatenRollover margedatenLiquiditaetsbindungssicht(MargedatenRolloverSicht margedatenLiquiditaetsbindungssicht) {

        this.margedatenLiquiditaetsbindungssicht = margedatenLiquiditaetsbindungssicht;
        return this;
    }

    /**
     * Get margedatenLiquiditaetsbindungssicht
     *
     * @return margedatenLiquiditaetsbindungssicht
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_MARGEDATEN_LIQUIDITAETSBINDUNGSSICHT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public MargedatenRolloverSicht getMargedatenLiquiditaetsbindungssicht() {
        return margedatenLiquiditaetsbindungssicht;
    }


    @JsonProperty(JSON_PROPERTY_MARGEDATEN_LIQUIDITAETSBINDUNGSSICHT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMargedatenLiquiditaetsbindungssicht(MargedatenRolloverSicht margedatenLiquiditaetsbindungssicht) {
        this.margedatenLiquiditaetsbindungssicht = margedatenLiquiditaetsbindungssicht;
    }

    public KalkulationsdatenRollover nominaldatenLiquiditaetsbindungssicht(NominaldatenRolloverSicht nominaldatenLiquiditaetsbindungssicht) {

        this.nominaldatenLiquiditaetsbindungssicht = nominaldatenLiquiditaetsbindungssicht;
        return this;
    }

    /**
     * Get nominaldatenLiquiditaetsbindungssicht
     *
     * @return nominaldatenLiquiditaetsbindungssicht
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_NOMINALDATEN_LIQUIDITAETSBINDUNGSSICHT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public NominaldatenRolloverSicht getNominaldatenLiquiditaetsbindungssicht() {
        return nominaldatenLiquiditaetsbindungssicht;
    }


    @JsonProperty(JSON_PROPERTY_NOMINALDATEN_LIQUIDITAETSBINDUNGSSICHT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNominaldatenLiquiditaetsbindungssicht(NominaldatenRolloverSicht nominaldatenLiquiditaetsbindungssicht) {
        this.nominaldatenLiquiditaetsbindungssicht = nominaldatenLiquiditaetsbindungssicht;
    }

    public KalkulationsdatenRollover teildeckungsdatenLiquiditaetsbindungssicht(TeildeckungsdatenRolloverSicht teildeckungsdatenLiquiditaetsbindungssicht) {

        this.teildeckungsdatenLiquiditaetsbindungssicht = teildeckungsdatenLiquiditaetsbindungssicht;
        return this;
    }

    /**
     * Get teildeckungsdatenLiquiditaetsbindungssicht
     *
     * @return teildeckungsdatenLiquiditaetsbindungssicht
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_TEILDECKUNGSDATEN_LIQUIDITAETSBINDUNGSSICHT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public TeildeckungsdatenRolloverSicht getTeildeckungsdatenLiquiditaetsbindungssicht() {
        return teildeckungsdatenLiquiditaetsbindungssicht;
    }


    @JsonProperty(JSON_PROPERTY_TEILDECKUNGSDATEN_LIQUIDITAETSBINDUNGSSICHT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTeildeckungsdatenLiquiditaetsbindungssicht(TeildeckungsdatenRolloverSicht teildeckungsdatenLiquiditaetsbindungssicht) {
        this.teildeckungsdatenLiquiditaetsbindungssicht = teildeckungsdatenLiquiditaetsbindungssicht;
    }

    public KalkulationsdatenRollover nominaldatenZinsbindungssicht(NominaldatenRolloverSicht nominaldatenZinsbindungssicht) {

        this.nominaldatenZinsbindungssicht = nominaldatenZinsbindungssicht;
        return this;
    }

    /**
     * Get nominaldatenZinsbindungssicht
     *
     * @return nominaldatenZinsbindungssicht
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_NOMINALDATEN_ZINSBINDUNGSSICHT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public NominaldatenRolloverSicht getNominaldatenZinsbindungssicht() {
        return nominaldatenZinsbindungssicht;
    }


    @JsonProperty(JSON_PROPERTY_NOMINALDATEN_ZINSBINDUNGSSICHT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNominaldatenZinsbindungssicht(NominaldatenRolloverSicht nominaldatenZinsbindungssicht) {
        this.nominaldatenZinsbindungssicht = nominaldatenZinsbindungssicht;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KalkulationsdatenRollover kalkulationsdatenRollover = (KalkulationsdatenRollover) o;
        return Objects.equals(this.effektivdaten, kalkulationsdatenRollover.effektivdaten) &&
                Objects.equals(this.liquiditaetskosten, kalkulationsdatenRollover.liquiditaetskosten) &&
                Objects.equals(this.margedaten, kalkulationsdatenRollover.margedaten) &&
                Objects.equals(this.teildeckungsdaten, kalkulationsdatenRollover.teildeckungsdaten) &&
                Objects.equals(this.nominaldaten, kalkulationsdatenRollover.nominaldaten) &&
                Objects.equals(this.referenzzinsdaten, kalkulationsdatenRollover.referenzzinsdaten) &&
                Objects.equals(this.overnightdaten, kalkulationsdatenRollover.overnightdaten) &&
                Objects.equals(this.effektivdatenLiquiditaetsbindungssicht, kalkulationsdatenRollover.effektivdatenLiquiditaetsbindungssicht) &&
                Objects.equals(this.margedatenLiquiditaetsbindungssicht, kalkulationsdatenRollover.margedatenLiquiditaetsbindungssicht) &&
                Objects.equals(this.nominaldatenLiquiditaetsbindungssicht, kalkulationsdatenRollover.nominaldatenLiquiditaetsbindungssicht) &&
                Objects.equals(this.teildeckungsdatenLiquiditaetsbindungssicht, kalkulationsdatenRollover.teildeckungsdatenLiquiditaetsbindungssicht) &&
                Objects.equals(this.nominaldatenZinsbindungssicht, kalkulationsdatenRollover.nominaldatenZinsbindungssicht);
    }

    @Override
    public int hashCode() {
        return Objects.hash(effektivdaten, liquiditaetskosten, margedaten, teildeckungsdaten, nominaldaten, referenzzinsdaten, overnightdaten, effektivdatenLiquiditaetsbindungssicht, margedatenLiquiditaetsbindungssicht, nominaldatenLiquiditaetsbindungssicht, teildeckungsdatenLiquiditaetsbindungssicht, nominaldatenZinsbindungssicht);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KalkulationsdatenRollover {\n");
        sb.append("    effektivdaten: ").append(toIndentedString(effektivdaten)).append("\n");
        sb.append("    liquiditaetskosten: ").append(toIndentedString(liquiditaetskosten)).append("\n");
        sb.append("    margedaten: ").append(toIndentedString(margedaten)).append("\n");
        sb.append("    teildeckungsdaten: ").append(toIndentedString(teildeckungsdaten)).append("\n");
        sb.append("    nominaldaten: ").append(toIndentedString(nominaldaten)).append("\n");
        sb.append("    referenzzinsdaten: ").append(toIndentedString(referenzzinsdaten)).append("\n");
        sb.append("    overnightdaten: ").append(toIndentedString(overnightdaten)).append("\n");
        sb.append("    effektivdatenLiquiditaetsbindungssicht: ").append(toIndentedString(effektivdatenLiquiditaetsbindungssicht)).append("\n");
        sb.append("    margedatenLiquiditaetsbindungssicht: ").append(toIndentedString(margedatenLiquiditaetsbindungssicht)).append("\n");
        sb.append("    nominaldatenLiquiditaetsbindungssicht: ").append(toIndentedString(nominaldatenLiquiditaetsbindungssicht)).append("\n");
        sb.append("    teildeckungsdatenLiquiditaetsbindungssicht: ").append(toIndentedString(teildeckungsdatenLiquiditaetsbindungssicht)).append("\n");
        sb.append("    nominaldatenZinsbindungssicht: ").append(toIndentedString(nominaldatenZinsbindungssicht)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

