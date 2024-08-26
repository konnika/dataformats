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
import java.time.LocalDate;
import java.util.Objects;

/**
 * Die Eingaben für den Tagesgeldzinssatz.
 */
@JsonPropertyOrder({
        Tagesgeldzins.JSON_PROPERTY_FAELLIGKEIT,
        Tagesgeldzins.JSON_PROPERTY_ZINSSATZ
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-13T14:12:50.387795700+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class Tagesgeldzins {
    public static final String JSON_PROPERTY_FAELLIGKEIT = "faelligkeit";
    private LocalDate faelligkeit;

    public static final String JSON_PROPERTY_ZINSSATZ = "zinssatz";
    private BigDecimal zinssatz;

    public Tagesgeldzins() {
    }

    public Tagesgeldzins faelligkeit(LocalDate faelligkeit) {

        this.faelligkeit = faelligkeit;
        return this;
    }

    /**
     * Die Fälligkeit des Tagesgeldzinssatzes.
     *
     * @return faelligkeit
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_FAELLIGKEIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public LocalDate getFaelligkeit() {
        return faelligkeit;
    }


    @JsonProperty(JSON_PROPERTY_FAELLIGKEIT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFaelligkeit(LocalDate faelligkeit) {
        this.faelligkeit = faelligkeit;
    }

    public Tagesgeldzins zinssatz(BigDecimal zinssatz) {

        this.zinssatz = zinssatz;
        return this;
    }

    /**
     * Die Höhe des Tagesgeldzinssatzes.
     *
     * @return zinssatz
     */
    @jakarta.annotation.Nullable
    @Valid

    @JsonProperty(JSON_PROPERTY_ZINSSATZ)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BigDecimal getZinssatz() {
        return zinssatz;
    }


    @JsonProperty(JSON_PROPERTY_ZINSSATZ)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setZinssatz(BigDecimal zinssatz) {
        this.zinssatz = zinssatz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tagesgeldzins tagesgeldzins = (Tagesgeldzins) o;
        return Objects.equals(this.faelligkeit, tagesgeldzins.faelligkeit) &&
                Objects.equals(this.zinssatz, tagesgeldzins.zinssatz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faelligkeit, zinssatz);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tagesgeldzins {\n");
        sb.append("    faelligkeit: ").append(toIndentedString(faelligkeit)).append("\n");
        sb.append("    zinssatz: ").append(toIndentedString(zinssatz)).append("\n");
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

