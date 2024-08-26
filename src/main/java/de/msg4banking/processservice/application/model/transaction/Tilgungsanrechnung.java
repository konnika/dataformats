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

import java.time.LocalDate;
import java.util.Objects;

/**
 * Angabe der Tilgungsanrechnungszeitpunkte
 */
@JsonPropertyOrder({
        Tilgungsanrechnung.JSON_PROPERTY_ERSTE_TILGUNGSANRECHNUNG_AM,
        Tilgungsanrechnung.JSON_PROPERTY_MODUS,
        Tilgungsanrechnung.JSON_PROPERTY_RHYTHMUS,
        Tilgungsanrechnung.JSON_PROPERTY_TAG
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-13T14:12:50.387795700+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class Tilgungsanrechnung {
    public static final String JSON_PROPERTY_ERSTE_TILGUNGSANRECHNUNG_AM = "ersteTilgungsanrechnungAm";
    private LocalDate ersteTilgungsanrechnungAm;

    public static final String JSON_PROPERTY_MODUS = "modus";
    private AnrechnungsModus modus;

    public static final String JSON_PROPERTY_RHYTHMUS = "rhythmus";
    private PerAnnoAngabe rhythmus;

    public static final String JSON_PROPERTY_TAG = "tag";
    private UltimoTag tag;

    public Tilgungsanrechnung() {
    }

    public Tilgungsanrechnung ersteTilgungsanrechnungAm(LocalDate ersteTilgungsanrechnungAm) {

        this.ersteTilgungsanrechnungAm = ersteTilgungsanrechnungAm;
        return this;
    }

    /**
     * Dieses Datum gibt das erste Tilgungsanrechnungdatum an.
     *
     * @return ersteTilgungsanrechnungAm
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_ERSTE_TILGUNGSANRECHNUNG_AM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public LocalDate getErsteTilgungsanrechnungAm() {
        return ersteTilgungsanrechnungAm;
    }


    @JsonProperty(JSON_PROPERTY_ERSTE_TILGUNGSANRECHNUNG_AM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setErsteTilgungsanrechnungAm(LocalDate ersteTilgungsanrechnungAm) {
        this.ersteTilgungsanrechnungAm = ersteTilgungsanrechnungAm;
    }

    public Tilgungsanrechnung modus(AnrechnungsModus modus) {

        this.modus = modus;
        return this;
    }

    /**
     * Get modus
     *
     * @return modus
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_MODUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public AnrechnungsModus getModus() {
        return modus;
    }


    @JsonProperty(JSON_PROPERTY_MODUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setModus(AnrechnungsModus modus) {
        this.modus = modus;
    }

    public Tilgungsanrechnung rhythmus(PerAnnoAngabe rhythmus) {

        this.rhythmus = rhythmus;
        return this;
    }

    /**
     * Get rhythmus
     *
     * @return rhythmus
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_RHYTHMUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public PerAnnoAngabe getRhythmus() {
        return rhythmus;
    }


    @JsonProperty(JSON_PROPERTY_RHYTHMUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRhythmus(PerAnnoAngabe rhythmus) {
        this.rhythmus = rhythmus;
    }

    public Tilgungsanrechnung tag(UltimoTag tag) {

        this.tag = tag;
        return this;
    }

    /**
     * Get tag
     *
     * @return tag
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_TAG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public UltimoTag getTag() {
        return tag;
    }


    @JsonProperty(JSON_PROPERTY_TAG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTag(UltimoTag tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tilgungsanrechnung tilgungsanrechnung = (Tilgungsanrechnung) o;
        return Objects.equals(this.ersteTilgungsanrechnungAm, tilgungsanrechnung.ersteTilgungsanrechnungAm) &&
                Objects.equals(this.modus, tilgungsanrechnung.modus) &&
                Objects.equals(this.rhythmus, tilgungsanrechnung.rhythmus) &&
                Objects.equals(this.tag, tilgungsanrechnung.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ersteTilgungsanrechnungAm, modus, rhythmus, tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tilgungsanrechnung {\n");
        sb.append("    ersteTilgungsanrechnungAm: ").append(toIndentedString(ersteTilgungsanrechnungAm)).append("\n");
        sb.append("    modus: ").append(toIndentedString(modus)).append("\n");
        sb.append("    rhythmus: ").append(toIndentedString(rhythmus)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

