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

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Risikodaten
 */
@JsonPropertyOrder({
        Risikodaten.JSON_PROPERTY_BONITAETSPRAEMIE,
        Risikodaten.JSON_PROPERTY_RISIKOUEBERNAHMEPRAEMIE,
        Risikodaten.JSON_PROPERTY_ERWARTETER_VERLUST
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-13T14:12:50.387795700+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class Risikodaten {
    public static final String JSON_PROPERTY_BONITAETSPRAEMIE = "bonitaetspraemie";
    private BigDecimal bonitaetspraemie;

    public static final String JSON_PROPERTY_RISIKOUEBERNAHMEPRAEMIE = "risikouebernahmepraemie";
    private BigDecimal risikouebernahmepraemie;

    public static final String JSON_PROPERTY_ERWARTETER_VERLUST = "erwarteterVerlust";
    private BigDecimal erwarteterVerlust;

    public Risikodaten() {
    }

    public Risikodaten bonitaetspraemie(BigDecimal bonitaetspraemie) {

        this.bonitaetspraemie = bonitaetspraemie;
        return this;
    }

    /**
     * Risikoprämie.
     *
     * @return bonitaetspraemie
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_BONITAETSPRAEMIE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getBonitaetspraemie() {
        return bonitaetspraemie;
    }


    @JsonProperty(JSON_PROPERTY_BONITAETSPRAEMIE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBonitaetspraemie(BigDecimal bonitaetspraemie) {
        this.bonitaetspraemie = bonitaetspraemie;
    }

    public Risikodaten risikouebernahmepraemie(BigDecimal risikouebernahmepraemie) {

        this.risikouebernahmepraemie = risikouebernahmepraemie;
        return this;
    }

    /**
     * Risikoübernahmeprämie.
     *
     * @return risikouebernahmepraemie
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_RISIKOUEBERNAHMEPRAEMIE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getRisikouebernahmepraemie() {
        return risikouebernahmepraemie;
    }


    @JsonProperty(JSON_PROPERTY_RISIKOUEBERNAHMEPRAEMIE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRisikouebernahmepraemie(BigDecimal risikouebernahmepraemie) {
        this.risikouebernahmepraemie = risikouebernahmepraemie;
    }

    public Risikodaten erwarteterVerlust(BigDecimal erwarteterVerlust) {

        this.erwarteterVerlust = erwarteterVerlust;
        return this;
    }

    /**
     * Der erwartete Verlust.
     *
     * @return erwarteterVerlust
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_ERWARTETER_VERLUST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getErwarteterVerlust() {
        return erwarteterVerlust;
    }


    @JsonProperty(JSON_PROPERTY_ERWARTETER_VERLUST)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setErwarteterVerlust(BigDecimal erwarteterVerlust) {
        this.erwarteterVerlust = erwarteterVerlust;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Risikodaten risikodaten = (Risikodaten) o;
        return Objects.equals(this.bonitaetspraemie, risikodaten.bonitaetspraemie) &&
                Objects.equals(this.risikouebernahmepraemie, risikodaten.risikouebernahmepraemie) &&
                Objects.equals(this.erwarteterVerlust, risikodaten.erwarteterVerlust);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bonitaetspraemie, risikouebernahmepraemie, erwarteterVerlust);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Risikodaten {\n");
        sb.append("    bonitaetspraemie: ").append(toIndentedString(bonitaetspraemie)).append("\n");
        sb.append("    risikouebernahmepraemie: ").append(toIndentedString(risikouebernahmepraemie)).append("\n");
        sb.append("    erwarteterVerlust: ").append(toIndentedString(erwarteterVerlust)).append("\n");
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

