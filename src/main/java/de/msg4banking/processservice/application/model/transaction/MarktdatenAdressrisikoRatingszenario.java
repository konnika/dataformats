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

import java.util.Objects;

/**
 * MarktdatenAdressrisikoRatingszenario
 */
@JsonPropertyOrder({
        MarktdatenAdressrisikoRatingszenario.JSON_PROPERTY_NAME,
        MarktdatenAdressrisikoRatingszenario.JSON_PROPERTY_KONFIGURATION,
        MarktdatenAdressrisikoRatingszenario.JSON_PROPERTY_RATINGKLASSE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-13T14:12:50.387795700+02:00[Europe/Berlin]", comments = "Generator version: 7.7.0")
public class MarktdatenAdressrisikoRatingszenario {
    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_KONFIGURATION = "konfiguration";
    private String konfiguration;

    public static final String JSON_PROPERTY_RATINGKLASSE = "ratingklasse";
    private String ratingklasse;

    public MarktdatenAdressrisikoRatingszenario() {
    }

    public MarktdatenAdressrisikoRatingszenario name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @jakarta.annotation.Nullable

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getName() {
        return name;
    }


    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public MarktdatenAdressrisikoRatingszenario konfiguration(String konfiguration) {

        this.konfiguration = konfiguration;
        return this;
    }

    /**
     * Get konfiguration
     *
     * @return konfiguration
     */
    @jakarta.annotation.Nullable

    @JsonProperty(JSON_PROPERTY_KONFIGURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getKonfiguration() {
        return konfiguration;
    }


    @JsonProperty(JSON_PROPERTY_KONFIGURATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setKonfiguration(String konfiguration) {
        this.konfiguration = konfiguration;
    }

    public MarktdatenAdressrisikoRatingszenario ratingklasse(String ratingklasse) {

        this.ratingklasse = ratingklasse;
        return this;
    }

    /**
     * Get ratingklasse
     *
     * @return ratingklasse
     */
    @jakarta.annotation.Nullable

    @JsonProperty(JSON_PROPERTY_RATINGKLASSE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getRatingklasse() {
        return ratingklasse;
    }


    @JsonProperty(JSON_PROPERTY_RATINGKLASSE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRatingklasse(String ratingklasse) {
        this.ratingklasse = ratingklasse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarktdatenAdressrisikoRatingszenario marktdatenAdressrisikoRatingszenario = (MarktdatenAdressrisikoRatingszenario) o;
        return Objects.equals(this.name, marktdatenAdressrisikoRatingszenario.name) &&
                Objects.equals(this.konfiguration, marktdatenAdressrisikoRatingszenario.konfiguration) &&
                Objects.equals(this.ratingklasse, marktdatenAdressrisikoRatingszenario.ratingklasse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, konfiguration, ratingklasse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarktdatenAdressrisikoRatingszenario {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    konfiguration: ").append(toIndentedString(konfiguration)).append("\n");
        sb.append("    ratingklasse: ").append(toIndentedString(ratingklasse)).append("\n");
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

