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
 * Die Sondervereinbarungen des Kredits (Sondertilgungen, Teilvalutierungen, Raten- und Zinswechsel).
 */
@JsonPropertyOrder({
        Sondervereinbarungen.JSON_PROPERTY_RATENWECHSEL,
        Sondervereinbarungen.JSON_PROPERTY_SONDERTILGUNGEN,
        Sondervereinbarungen.JSON_PROPERTY_TEILVALUTIERUNGEN,
        Sondervereinbarungen.JSON_PROPERTY_TILGUNGSSATZWECHSEL,
        Sondervereinbarungen.JSON_PROPERTY_ZINSWECHSEL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-13T14:12:50.387795700+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class Sondervereinbarungen {
    public static final String JSON_PROPERTY_RATENWECHSEL = "ratenwechsel";
    private Ratenwechsel ratenwechsel;

    public static final String JSON_PROPERTY_SONDERTILGUNGEN = "sondertilgungen";
    private Sondertilgungen sondertilgungen;

    public static final String JSON_PROPERTY_TEILVALUTIERUNGEN = "teilvalutierungen";
    private Teilvalutierungen teilvalutierungen;

    public static final String JSON_PROPERTY_TILGUNGSSATZWECHSEL = "tilgungssatzwechsel";
    private Tilgungssatzwechsel tilgungssatzwechsel;

    public static final String JSON_PROPERTY_ZINSWECHSEL = "zinswechsel";
    private Zinswechsel zinswechsel;

    public Sondervereinbarungen() {
    }

    public Sondervereinbarungen ratenwechsel(Ratenwechsel ratenwechsel) {

        this.ratenwechsel = ratenwechsel;
        return this;
    }

    /**
     * Get ratenwechsel
     *
     * @return ratenwechsel
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_RATENWECHSEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Ratenwechsel getRatenwechsel() {
        return ratenwechsel;
    }


    @JsonProperty(JSON_PROPERTY_RATENWECHSEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRatenwechsel(Ratenwechsel ratenwechsel) {
        this.ratenwechsel = ratenwechsel;
    }

    public Sondervereinbarungen sondertilgungen(Sondertilgungen sondertilgungen) {

        this.sondertilgungen = sondertilgungen;
        return this;
    }

    /**
     * Get sondertilgungen
     *
     * @return sondertilgungen
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_SONDERTILGUNGEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Sondertilgungen getSondertilgungen() {
        return sondertilgungen;
    }


    @JsonProperty(JSON_PROPERTY_SONDERTILGUNGEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSondertilgungen(Sondertilgungen sondertilgungen) {
        this.sondertilgungen = sondertilgungen;
    }

    public Sondervereinbarungen teilvalutierungen(Teilvalutierungen teilvalutierungen) {

        this.teilvalutierungen = teilvalutierungen;
        return this;
    }

    /**
     * Get teilvalutierungen
     *
     * @return teilvalutierungen
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_TEILVALUTIERUNGEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Teilvalutierungen getTeilvalutierungen() {
        return teilvalutierungen;
    }


    @JsonProperty(JSON_PROPERTY_TEILVALUTIERUNGEN)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTeilvalutierungen(Teilvalutierungen teilvalutierungen) {
        this.teilvalutierungen = teilvalutierungen;
    }

    public Sondervereinbarungen tilgungssatzwechsel(Tilgungssatzwechsel tilgungssatzwechsel) {

        this.tilgungssatzwechsel = tilgungssatzwechsel;
        return this;
    }

    /**
     * Get tilgungssatzwechsel
     *
     * @return tilgungssatzwechsel
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_TILGUNGSSATZWECHSEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Tilgungssatzwechsel getTilgungssatzwechsel() {
        return tilgungssatzwechsel;
    }


    @JsonProperty(JSON_PROPERTY_TILGUNGSSATZWECHSEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTilgungssatzwechsel(Tilgungssatzwechsel tilgungssatzwechsel) {
        this.tilgungssatzwechsel = tilgungssatzwechsel;
    }

    public Sondervereinbarungen zinswechsel(Zinswechsel zinswechsel) {

        this.zinswechsel = zinswechsel;
        return this;
    }

    /**
     * Get zinswechsel
     *
     * @return zinswechsel
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_ZINSWECHSEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Zinswechsel getZinswechsel() {
        return zinswechsel;
    }


    @JsonProperty(JSON_PROPERTY_ZINSWECHSEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setZinswechsel(Zinswechsel zinswechsel) {
        this.zinswechsel = zinswechsel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Sondervereinbarungen sondervereinbarungen = (Sondervereinbarungen) o;
        return Objects.equals(this.ratenwechsel, sondervereinbarungen.ratenwechsel) &&
                Objects.equals(this.sondertilgungen, sondervereinbarungen.sondertilgungen) &&
                Objects.equals(this.teilvalutierungen, sondervereinbarungen.teilvalutierungen) &&
                Objects.equals(this.tilgungssatzwechsel, sondervereinbarungen.tilgungssatzwechsel) &&
                Objects.equals(this.zinswechsel, sondervereinbarungen.zinswechsel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ratenwechsel, sondertilgungen, teilvalutierungen, tilgungssatzwechsel, zinswechsel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Sondervereinbarungen {\n");
        sb.append("    ratenwechsel: ").append(toIndentedString(ratenwechsel)).append("\n");
        sb.append("    sondertilgungen: ").append(toIndentedString(sondertilgungen)).append("\n");
        sb.append("    teilvalutierungen: ").append(toIndentedString(teilvalutierungen)).append("\n");
        sb.append("    tilgungssatzwechsel: ").append(toIndentedString(tilgungssatzwechsel)).append("\n");
        sb.append("    zinswechsel: ").append(toIndentedString(zinswechsel)).append("\n");
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

