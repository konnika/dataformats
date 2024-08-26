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
 * Effektivdaten
 */
@JsonPropertyOrder({
        Effektivdaten.JSON_PROPERTY_EFFEKTIVZINS_I_C_M_A,
        Effektivdaten.JSON_PROPERTY_EFFEKTIVZINS_P_ANG_V,
        Effektivdaten.JSON_PROPERTY_EFFEKTIVZINS_P_ANG_V_UNGERUNDET,
        Effektivdaten.JSON_PROPERTY_EFFEKTIVZINSMETHODE,
        Effektivdaten.JSON_PROPERTY_PANGVMODUS,
        Effektivdaten.JSON_PROPERTY_ZINSUSANCE_EFFEKTIV
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-13T14:12:50.387795700+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class Effektivdaten {
    public static final String JSON_PROPERTY_EFFEKTIVZINS_I_C_M_A = "effektivzinsICMA";
    private BigDecimal effektivzinsICMA;

    public static final String JSON_PROPERTY_EFFEKTIVZINS_P_ANG_V = "effektivzinsPAngV";
    private BigDecimal effektivzinsPAngV;

    public static final String JSON_PROPERTY_EFFEKTIVZINS_P_ANG_V_UNGERUNDET = "effektivzinsPAngVUngerundet";
    private BigDecimal effektivzinsPAngVUngerundet;

    public static final String JSON_PROPERTY_EFFEKTIVZINSMETHODE = "effektivzinsmethode";
    private Effektivzinsmethode effektivzinsmethode;

    public static final String JSON_PROPERTY_PANGVMODUS = "pangvmodus";
    private PAngVModus pangvmodus;

    public static final String JSON_PROPERTY_ZINSUSANCE_EFFEKTIV = "zinsusanceEffektiv";
    private Usance zinsusanceEffektiv;

    public Effektivdaten() {
    }

    public Effektivdaten effektivzinsICMA(BigDecimal effektivzinsICMA) {

        this.effektivzinsICMA = effektivzinsICMA;
        return this;
    }

    /**
     * Der Effektivzins gemäß ICMA (früher: AIBD).
     *
     * @return effektivzinsICMA
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_EFFEKTIVZINS_I_C_M_A)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getEffektivzinsICMA() {
        return effektivzinsICMA;
    }


    @JsonProperty(JSON_PROPERTY_EFFEKTIVZINS_I_C_M_A)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEffektivzinsICMA(BigDecimal effektivzinsICMA) {
        this.effektivzinsICMA = effektivzinsICMA;
    }

    public Effektivdaten effektivzinsPAngV(BigDecimal effektivzinsPAngV) {

        this.effektivzinsPAngV = effektivzinsPAngV;
        return this;
    }

    /**
     * Der Effektivzins gemäß PAngV (Preisangabenverordnung).
     *
     * @return effektivzinsPAngV
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_EFFEKTIVZINS_P_ANG_V)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getEffektivzinsPAngV() {
        return effektivzinsPAngV;
    }


    @JsonProperty(JSON_PROPERTY_EFFEKTIVZINS_P_ANG_V)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEffektivzinsPAngV(BigDecimal effektivzinsPAngV) {
        this.effektivzinsPAngV = effektivzinsPAngV;
    }

    public Effektivdaten effektivzinsPAngVUngerundet(BigDecimal effektivzinsPAngVUngerundet) {

        this.effektivzinsPAngVUngerundet = effektivzinsPAngVUngerundet;
        return this;
    }

    /**
     * Der ungerundete Effektivzins gemäß PAngV (Preisangabenverordnung).
     *
     * @return effektivzinsPAngVUngerundet
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_EFFEKTIVZINS_P_ANG_V_UNGERUNDET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getEffektivzinsPAngVUngerundet() {
        return effektivzinsPAngVUngerundet;
    }


    @JsonProperty(JSON_PROPERTY_EFFEKTIVZINS_P_ANG_V_UNGERUNDET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEffektivzinsPAngVUngerundet(BigDecimal effektivzinsPAngVUngerundet) {
        this.effektivzinsPAngVUngerundet = effektivzinsPAngVUngerundet;
    }

    public Effektivdaten effektivzinsmethode(Effektivzinsmethode effektivzinsmethode) {

        this.effektivzinsmethode = effektivzinsmethode;
        return this;
    }

    /**
     * Get effektivzinsmethode
     *
     * @return effektivzinsmethode
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_EFFEKTIVZINSMETHODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Effektivzinsmethode getEffektivzinsmethode() {
        return effektivzinsmethode;
    }


    @JsonProperty(JSON_PROPERTY_EFFEKTIVZINSMETHODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEffektivzinsmethode(Effektivzinsmethode effektivzinsmethode) {
        this.effektivzinsmethode = effektivzinsmethode;
    }

    public Effektivdaten pangvmodus(PAngVModus pangvmodus) {

        this.pangvmodus = pangvmodus;
        return this;
    }

    /**
     * Get pangvmodus
     *
     * @return pangvmodus
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_PANGVMODUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public PAngVModus getPangvmodus() {
        return pangvmodus;
    }


    @JsonProperty(JSON_PROPERTY_PANGVMODUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPangvmodus(PAngVModus pangvmodus) {
        this.pangvmodus = pangvmodus;
    }

    public Effektivdaten zinsusanceEffektiv(Usance zinsusanceEffektiv) {

        this.zinsusanceEffektiv = zinsusanceEffektiv;
        return this;
    }

    /**
     * Get zinsusanceEffektiv
     *
     * @return zinsusanceEffektiv
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_ZINSUSANCE_EFFEKTIV)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Usance getZinsusanceEffektiv() {
        return zinsusanceEffektiv;
    }


    @JsonProperty(JSON_PROPERTY_ZINSUSANCE_EFFEKTIV)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setZinsusanceEffektiv(Usance zinsusanceEffektiv) {
        this.zinsusanceEffektiv = zinsusanceEffektiv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Effektivdaten effektivdaten = (Effektivdaten) o;
        return Objects.equals(this.effektivzinsICMA, effektivdaten.effektivzinsICMA) &&
                Objects.equals(this.effektivzinsPAngV, effektivdaten.effektivzinsPAngV) &&
                Objects.equals(this.effektivzinsPAngVUngerundet, effektivdaten.effektivzinsPAngVUngerundet) &&
                Objects.equals(this.effektivzinsmethode, effektivdaten.effektivzinsmethode) &&
                Objects.equals(this.pangvmodus, effektivdaten.pangvmodus) &&
                Objects.equals(this.zinsusanceEffektiv, effektivdaten.zinsusanceEffektiv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(effektivzinsICMA, effektivzinsPAngV, effektivzinsPAngVUngerundet, effektivzinsmethode, pangvmodus, zinsusanceEffektiv);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Effektivdaten {\n");
        sb.append("    effektivzinsICMA: ").append(toIndentedString(effektivzinsICMA)).append("\n");
        sb.append("    effektivzinsPAngV: ").append(toIndentedString(effektivzinsPAngV)).append("\n");
        sb.append("    effektivzinsPAngVUngerundet: ").append(toIndentedString(effektivzinsPAngVUngerundet)).append("\n");
        sb.append("    effektivzinsmethode: ").append(toIndentedString(effektivzinsmethode)).append("\n");
        sb.append("    pangvmodus: ").append(toIndentedString(pangvmodus)).append("\n");
        sb.append("    zinsusanceEffektiv: ").append(toIndentedString(zinsusanceEffektiv)).append("\n");
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

