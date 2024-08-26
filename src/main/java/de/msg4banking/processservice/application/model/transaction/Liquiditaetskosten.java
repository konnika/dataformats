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
 * Liquiditaetskosten
 */
@JsonPropertyOrder({
        Liquiditaetskosten.JSON_PROPERTY_LIQUIDITAETSBARWERT,
        Liquiditaetskosten.JSON_PROPERTY_LIQUIDITAETSSPREAD_NOMINAL,
        Liquiditaetskosten.JSON_PROPERTY_LIQUIDITAETSSPREAD_EFFEKTIV,
        Liquiditaetskosten.JSON_PROPERTY_EINSTAND_SWAP_NOMINAL,
        Liquiditaetskosten.JSON_PROPERTY_EINSTAND_SWAP_EFFEKTIV,
        Liquiditaetskosten.JSON_PROPERTY_LIQUIDITAETSKOSTENBASIS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-13T14:12:50.387795700+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class Liquiditaetskosten {
    public static final String JSON_PROPERTY_LIQUIDITAETSBARWERT = "liquiditaetsbarwert";
    private BigDecimal liquiditaetsbarwert;

    public static final String JSON_PROPERTY_LIQUIDITAETSSPREAD_NOMINAL = "liquiditaetsspreadNominal";
    private BigDecimal liquiditaetsspreadNominal;

    public static final String JSON_PROPERTY_LIQUIDITAETSSPREAD_EFFEKTIV = "liquiditaetsspreadEffektiv";
    private BigDecimal liquiditaetsspreadEffektiv;

    public static final String JSON_PROPERTY_EINSTAND_SWAP_NOMINAL = "einstandSwapNominal";
    private BigDecimal einstandSwapNominal;

    public static final String JSON_PROPERTY_EINSTAND_SWAP_EFFEKTIV = "einstandSwapEffektiv";
    private BigDecimal einstandSwapEffektiv;

    public static final String JSON_PROPERTY_LIQUIDITAETSKOSTENBASIS = "liquiditaetskostenbasis";
    private Liquiditaetskostenbasis liquiditaetskostenbasis;

    public Liquiditaetskosten() {
    }

    public Liquiditaetskosten liquiditaetsbarwert(BigDecimal liquiditaetsbarwert) {

        this.liquiditaetsbarwert = liquiditaetsbarwert;
        return this;
    }

    /**
     * Der Liquiditätsbarwert.
     *
     * @return liquiditaetsbarwert
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_LIQUIDITAETSBARWERT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getLiquiditaetsbarwert() {
        return liquiditaetsbarwert;
    }


    @JsonProperty(JSON_PROPERTY_LIQUIDITAETSBARWERT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLiquiditaetsbarwert(BigDecimal liquiditaetsbarwert) {
        this.liquiditaetsbarwert = liquiditaetsbarwert;
    }

    public Liquiditaetskosten liquiditaetsspreadNominal(BigDecimal liquiditaetsspreadNominal) {

        this.liquiditaetsspreadNominal = liquiditaetsspreadNominal;
        return this;
    }

    /**
     * Der nominale Liquiditätsspread (in Prozent).
     *
     * @return liquiditaetsspreadNominal
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_LIQUIDITAETSSPREAD_NOMINAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getLiquiditaetsspreadNominal() {
        return liquiditaetsspreadNominal;
    }


    @JsonProperty(JSON_PROPERTY_LIQUIDITAETSSPREAD_NOMINAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLiquiditaetsspreadNominal(BigDecimal liquiditaetsspreadNominal) {
        this.liquiditaetsspreadNominal = liquiditaetsspreadNominal;
    }

    public Liquiditaetskosten liquiditaetsspreadEffektiv(BigDecimal liquiditaetsspreadEffektiv) {

        this.liquiditaetsspreadEffektiv = liquiditaetsspreadEffektiv;
        return this;
    }

    /**
     * Der effektive Liquiditätsspread (in Prozent).
     *
     * @return liquiditaetsspreadEffektiv
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_LIQUIDITAETSSPREAD_EFFEKTIV)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getLiquiditaetsspreadEffektiv() {
        return liquiditaetsspreadEffektiv;
    }


    @JsonProperty(JSON_PROPERTY_LIQUIDITAETSSPREAD_EFFEKTIV)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLiquiditaetsspreadEffektiv(BigDecimal liquiditaetsspreadEffektiv) {
        this.liquiditaetsspreadEffektiv = liquiditaetsspreadEffektiv;
    }

    public Liquiditaetskosten einstandSwapNominal(BigDecimal einstandSwapNominal) {

        this.einstandSwapNominal = einstandSwapNominal;
        return this;
    }

    /**
     * Der nominale Einstand (in Prozent) bzgl. der Swapkurve. Spread auf die Swapkurve.
     *
     * @return einstandSwapNominal
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_EINSTAND_SWAP_NOMINAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getEinstandSwapNominal() {
        return einstandSwapNominal;
    }


    @JsonProperty(JSON_PROPERTY_EINSTAND_SWAP_NOMINAL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEinstandSwapNominal(BigDecimal einstandSwapNominal) {
        this.einstandSwapNominal = einstandSwapNominal;
    }

    public Liquiditaetskosten einstandSwapEffektiv(BigDecimal einstandSwapEffektiv) {

        this.einstandSwapEffektiv = einstandSwapEffektiv;
        return this;
    }

    /**
     * Der effektive Einstand (in Prozent) bzgl. der Swapkurve. Spread auf die Swapkurve.
     *
     * @return einstandSwapEffektiv
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_EINSTAND_SWAP_EFFEKTIV)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getEinstandSwapEffektiv() {
        return einstandSwapEffektiv;
    }


    @JsonProperty(JSON_PROPERTY_EINSTAND_SWAP_EFFEKTIV)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEinstandSwapEffektiv(BigDecimal einstandSwapEffektiv) {
        this.einstandSwapEffektiv = einstandSwapEffektiv;
    }

    public Liquiditaetskosten liquiditaetskostenbasis(Liquiditaetskostenbasis liquiditaetskostenbasis) {

        this.liquiditaetskostenbasis = liquiditaetskostenbasis;
        return this;
    }

    /**
     * Get liquiditaetskostenbasis
     *
     * @return liquiditaetskostenbasis
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_LIQUIDITAETSKOSTENBASIS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Liquiditaetskostenbasis getLiquiditaetskostenbasis() {
        return liquiditaetskostenbasis;
    }


    @JsonProperty(JSON_PROPERTY_LIQUIDITAETSKOSTENBASIS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLiquiditaetskostenbasis(Liquiditaetskostenbasis liquiditaetskostenbasis) {
        this.liquiditaetskostenbasis = liquiditaetskostenbasis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Liquiditaetskosten liquiditaetskosten = (Liquiditaetskosten) o;
        return Objects.equals(this.liquiditaetsbarwert, liquiditaetskosten.liquiditaetsbarwert) &&
                Objects.equals(this.liquiditaetsspreadNominal, liquiditaetskosten.liquiditaetsspreadNominal) &&
                Objects.equals(this.liquiditaetsspreadEffektiv, liquiditaetskosten.liquiditaetsspreadEffektiv) &&
                Objects.equals(this.einstandSwapNominal, liquiditaetskosten.einstandSwapNominal) &&
                Objects.equals(this.einstandSwapEffektiv, liquiditaetskosten.einstandSwapEffektiv) &&
                Objects.equals(this.liquiditaetskostenbasis, liquiditaetskosten.liquiditaetskostenbasis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(liquiditaetsbarwert, liquiditaetsspreadNominal, liquiditaetsspreadEffektiv, einstandSwapNominal, einstandSwapEffektiv, liquiditaetskostenbasis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Liquiditaetskosten {\n");
        sb.append("    liquiditaetsbarwert: ").append(toIndentedString(liquiditaetsbarwert)).append("\n");
        sb.append("    liquiditaetsspreadNominal: ").append(toIndentedString(liquiditaetsspreadNominal)).append("\n");
        sb.append("    liquiditaetsspreadEffektiv: ").append(toIndentedString(liquiditaetsspreadEffektiv)).append("\n");
        sb.append("    einstandSwapNominal: ").append(toIndentedString(einstandSwapNominal)).append("\n");
        sb.append("    einstandSwapEffektiv: ").append(toIndentedString(einstandSwapEffektiv)).append("\n");
        sb.append("    liquiditaetskostenbasis: ").append(toIndentedString(liquiditaetskostenbasis)).append("\n");
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

