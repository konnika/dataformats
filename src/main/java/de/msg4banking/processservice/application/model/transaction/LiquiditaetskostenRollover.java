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
 * LiquiditaetskostenRollover
 */
@JsonPropertyOrder({
        LiquiditaetskostenRollover.JSON_PROPERTY_BASISSPREAD,
        LiquiditaetskostenRollover.JSON_PROPERTY_LIQUIDITAETSBARWERT,
        LiquiditaetskostenRollover.JSON_PROPERTY_LIQUIDITAETSSPREAD_NOMINAL,
        LiquiditaetskostenRollover.JSON_PROPERTY_LIQUIDITAETSSPREAD_EFFEKTIV,
        LiquiditaetskostenRollover.JSON_PROPERTY_SPREAD_AUF_SWAPKURVE,
        LiquiditaetskostenRollover.JSON_PROPERTY_EINSTAND_SWAP_EFFEKTIV,
        LiquiditaetskostenRollover.JSON_PROPERTY_SPREAD_ABWEICHENDE_ZINSZAHLUNG,
        LiquiditaetskostenRollover.JSON_PROPERTY_LIQUIDITAETSKOSTENBASIS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-13T14:12:50.387795700+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class LiquiditaetskostenRollover {
    public static final String JSON_PROPERTY_BASISSPREAD = "basisspread";
    private BigDecimal basisspread;

    public static final String JSON_PROPERTY_LIQUIDITAETSBARWERT = "liquiditaetsbarwert";
    private BigDecimal liquiditaetsbarwert;

    public static final String JSON_PROPERTY_LIQUIDITAETSSPREAD_NOMINAL = "liquiditaetsspreadNominal";
    private BigDecimal liquiditaetsspreadNominal;

    public static final String JSON_PROPERTY_LIQUIDITAETSSPREAD_EFFEKTIV = "liquiditaetsspreadEffektiv";
    private BigDecimal liquiditaetsspreadEffektiv;

    public static final String JSON_PROPERTY_SPREAD_AUF_SWAPKURVE = "spreadAufSwapkurve";
    private BigDecimal spreadAufSwapkurve;

    public static final String JSON_PROPERTY_EINSTAND_SWAP_EFFEKTIV = "einstandSwapEffektiv";
    private BigDecimal einstandSwapEffektiv;

    public static final String JSON_PROPERTY_SPREAD_ABWEICHENDE_ZINSZAHLUNG = "spreadAbweichendeZinszahlung";
    private BigDecimal spreadAbweichendeZinszahlung;

    public static final String JSON_PROPERTY_LIQUIDITAETSKOSTENBASIS = "liquiditaetskostenbasis";
    private Liquiditaetskostenbasis liquiditaetskostenbasis;

    public LiquiditaetskostenRollover() {
    }

    public LiquiditaetskostenRollover basisspread(BigDecimal basisspread) {

        this.basisspread = basisspread;
        return this;
    }

    /**
     * Basisspread; Spread zwischen risikolos und Swap.
     *
     * @return basisspread
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_BASISSPREAD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getBasisspread() {
        return basisspread;
    }


    @JsonProperty(JSON_PROPERTY_BASISSPREAD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBasisspread(BigDecimal basisspread) {
        this.basisspread = basisspread;
    }

    public LiquiditaetskostenRollover liquiditaetsbarwert(BigDecimal liquiditaetsbarwert) {

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

    public LiquiditaetskostenRollover liquiditaetsspreadNominal(BigDecimal liquiditaetsspreadNominal) {

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

    public LiquiditaetskostenRollover liquiditaetsspreadEffektiv(BigDecimal liquiditaetsspreadEffektiv) {

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

    public LiquiditaetskostenRollover spreadAufSwapkurve(BigDecimal spreadAufSwapkurve) {

        this.spreadAufSwapkurve = spreadAufSwapkurve;
        return this;
    }

    /**
     * Der nominale Einstand (in Prozent) bzgl. der Swapkurve. Spread auf die Swapkurve.
     *
     * @return spreadAufSwapkurve
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_SPREAD_AUF_SWAPKURVE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getSpreadAufSwapkurve() {
        return spreadAufSwapkurve;
    }


    @JsonProperty(JSON_PROPERTY_SPREAD_AUF_SWAPKURVE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSpreadAufSwapkurve(BigDecimal spreadAufSwapkurve) {
        this.spreadAufSwapkurve = spreadAufSwapkurve;
    }

    public LiquiditaetskostenRollover einstandSwapEffektiv(BigDecimal einstandSwapEffektiv) {

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

    public LiquiditaetskostenRollover spreadAbweichendeZinszahlung(BigDecimal spreadAbweichendeZinszahlung) {

        this.spreadAbweichendeZinszahlung = spreadAbweichendeZinszahlung;
        return this;
    }

    /**
     * Nominaler Spread in der Margenrechnung bei von Zinsrhythmus abweichendem Referenzzinsrhythmus in %.
     *
     * @return spreadAbweichendeZinszahlung
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_SPREAD_ABWEICHENDE_ZINSZAHLUNG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getSpreadAbweichendeZinszahlung() {
        return spreadAbweichendeZinszahlung;
    }


    @JsonProperty(JSON_PROPERTY_SPREAD_ABWEICHENDE_ZINSZAHLUNG)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSpreadAbweichendeZinszahlung(BigDecimal spreadAbweichendeZinszahlung) {
        this.spreadAbweichendeZinszahlung = spreadAbweichendeZinszahlung;
    }

    public LiquiditaetskostenRollover liquiditaetskostenbasis(Liquiditaetskostenbasis liquiditaetskostenbasis) {

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
        LiquiditaetskostenRollover liquiditaetskostenRollover = (LiquiditaetskostenRollover) o;
        return Objects.equals(this.basisspread, liquiditaetskostenRollover.basisspread) &&
                Objects.equals(this.liquiditaetsbarwert, liquiditaetskostenRollover.liquiditaetsbarwert) &&
                Objects.equals(this.liquiditaetsspreadNominal, liquiditaetskostenRollover.liquiditaetsspreadNominal) &&
                Objects.equals(this.liquiditaetsspreadEffektiv, liquiditaetskostenRollover.liquiditaetsspreadEffektiv) &&
                Objects.equals(this.spreadAufSwapkurve, liquiditaetskostenRollover.spreadAufSwapkurve) &&
                Objects.equals(this.einstandSwapEffektiv, liquiditaetskostenRollover.einstandSwapEffektiv) &&
                Objects.equals(this.spreadAbweichendeZinszahlung, liquiditaetskostenRollover.spreadAbweichendeZinszahlung) &&
                Objects.equals(this.liquiditaetskostenbasis, liquiditaetskostenRollover.liquiditaetskostenbasis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basisspread, liquiditaetsbarwert, liquiditaetsspreadNominal, liquiditaetsspreadEffektiv, spreadAufSwapkurve, einstandSwapEffektiv, spreadAbweichendeZinszahlung, liquiditaetskostenbasis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiquiditaetskostenRollover {\n");
        sb.append("    basisspread: ").append(toIndentedString(basisspread)).append("\n");
        sb.append("    liquiditaetsbarwert: ").append(toIndentedString(liquiditaetsbarwert)).append("\n");
        sb.append("    liquiditaetsspreadNominal: ").append(toIndentedString(liquiditaetsspreadNominal)).append("\n");
        sb.append("    liquiditaetsspreadEffektiv: ").append(toIndentedString(liquiditaetsspreadEffektiv)).append("\n");
        sb.append("    spreadAufSwapkurve: ").append(toIndentedString(spreadAufSwapkurve)).append("\n");
        sb.append("    einstandSwapEffektiv: ").append(toIndentedString(einstandSwapEffektiv)).append("\n");
        sb.append("    spreadAbweichendeZinszahlung: ").append(toIndentedString(spreadAbweichendeZinszahlung)).append("\n");
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

