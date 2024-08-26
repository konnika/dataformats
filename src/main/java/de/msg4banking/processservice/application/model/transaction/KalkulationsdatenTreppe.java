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
 * KalkulationsdatenTreppe
 */
@JsonPropertyOrder({
        KalkulationsdatenTreppe.JSON_PROPERTY_EFFEKTIVDATEN,
        KalkulationsdatenTreppe.JSON_PROPERTY_MARGEDATEN,
        KalkulationsdatenTreppe.JSON_PROPERTY_NOMINALDATEN,
        KalkulationsdatenTreppe.JSON_PROPERTY_LIQUIDITAETSKOSTEN,
        KalkulationsdatenTreppe.JSON_PROPERTY_TEILDECKUNGSDATEN
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-13T14:12:50.387795700+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class KalkulationsdatenTreppe {
    public static final String JSON_PROPERTY_EFFEKTIVDATEN = "effektivdaten";
    private Effektivdaten effektivdaten;

    public static final String JSON_PROPERTY_MARGEDATEN = "margedaten";
    private Margedaten margedaten;

    public static final String JSON_PROPERTY_NOMINALDATEN = "nominaldaten";
    private NominaldatenTreppe nominaldaten;

    public static final String JSON_PROPERTY_LIQUIDITAETSKOSTEN = "liquiditaetskosten";
    private Liquiditaetskosten liquiditaetskosten;

    public static final String JSON_PROPERTY_TEILDECKUNGSDATEN = "teildeckungsdaten";
    private TeildeckungsdatenTreppe teildeckungsdaten;

    public KalkulationsdatenTreppe() {
    }

    public KalkulationsdatenTreppe effektivdaten(Effektivdaten effektivdaten) {

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

    public Effektivdaten getEffektivdaten() {
        return effektivdaten;
    }


    @JsonProperty(JSON_PROPERTY_EFFEKTIVDATEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEffektivdaten(Effektivdaten effektivdaten) {
        this.effektivdaten = effektivdaten;
    }

    public KalkulationsdatenTreppe margedaten(Margedaten margedaten) {

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

    public Margedaten getMargedaten() {
        return margedaten;
    }


    @JsonProperty(JSON_PROPERTY_MARGEDATEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMargedaten(Margedaten margedaten) {
        this.margedaten = margedaten;
    }

    public KalkulationsdatenTreppe nominaldaten(NominaldatenTreppe nominaldaten) {

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

    public NominaldatenTreppe getNominaldaten() {
        return nominaldaten;
    }


    @JsonProperty(JSON_PROPERTY_NOMINALDATEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setNominaldaten(NominaldatenTreppe nominaldaten) {
        this.nominaldaten = nominaldaten;
    }

    public KalkulationsdatenTreppe liquiditaetskosten(Liquiditaetskosten liquiditaetskosten) {

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

    public Liquiditaetskosten getLiquiditaetskosten() {
        return liquiditaetskosten;
    }


    @JsonProperty(JSON_PROPERTY_LIQUIDITAETSKOSTEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLiquiditaetskosten(Liquiditaetskosten liquiditaetskosten) {
        this.liquiditaetskosten = liquiditaetskosten;
    }

    public KalkulationsdatenTreppe teildeckungsdaten(TeildeckungsdatenTreppe teildeckungsdaten) {

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

    public TeildeckungsdatenTreppe getTeildeckungsdaten() {
        return teildeckungsdaten;
    }


    @JsonProperty(JSON_PROPERTY_TEILDECKUNGSDATEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTeildeckungsdaten(TeildeckungsdatenTreppe teildeckungsdaten) {
        this.teildeckungsdaten = teildeckungsdaten;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KalkulationsdatenTreppe kalkulationsdatenTreppe = (KalkulationsdatenTreppe) o;
        return Objects.equals(this.effektivdaten, kalkulationsdatenTreppe.effektivdaten) &&
                Objects.equals(this.margedaten, kalkulationsdatenTreppe.margedaten) &&
                Objects.equals(this.nominaldaten, kalkulationsdatenTreppe.nominaldaten) &&
                Objects.equals(this.liquiditaetskosten, kalkulationsdatenTreppe.liquiditaetskosten) &&
                Objects.equals(this.teildeckungsdaten, kalkulationsdatenTreppe.teildeckungsdaten);
    }

    @Override
    public int hashCode() {
        return Objects.hash(effektivdaten, margedaten, nominaldaten, liquiditaetskosten, teildeckungsdaten);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KalkulationsdatenTreppe {\n");
        sb.append("    effektivdaten: ").append(toIndentedString(effektivdaten)).append("\n");
        sb.append("    margedaten: ").append(toIndentedString(margedaten)).append("\n");
        sb.append("    nominaldaten: ").append(toIndentedString(nominaldaten)).append("\n");
        sb.append("    liquiditaetskosten: ").append(toIndentedString(liquiditaetskosten)).append("\n");
        sb.append("    teildeckungsdaten: ").append(toIndentedString(teildeckungsdaten)).append("\n");
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

