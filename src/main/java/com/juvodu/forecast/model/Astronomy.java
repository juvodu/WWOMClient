
package com.juvodu.forecast.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "sunrise",
    "sunset",
    "moonrise",
    "moonset"
})
public class Astronomy {

    @JsonProperty("sunrise")
    private String sunrise;
    @JsonProperty("sunset")
    private String sunset;
    @JsonProperty("moonrise")
    private String moonrise;
    @JsonProperty("moonset")
    private String moonset;

    /**
     * 
     * @return
     *     The sunrise
     */
    @JsonProperty("sunrise")
    public String getSunrise() {
        return sunrise;
    }

    /**
     * 
     * @param sunrise
     *     The sunrise
     */
    @JsonProperty("sunrise")
    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    /**
     * 
     * @return
     *     The sunset
     */
    @JsonProperty("sunset")
    public String getSunset() {
        return sunset;
    }

    /**
     * 
     * @param sunset
     *     The sunset
     */
    @JsonProperty("sunset")
    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    /**
     * 
     * @return
     *     The moonrise
     */
    @JsonProperty("moonrise")
    public String getMoonrise() {
        return moonrise;
    }

    /**
     * 
     * @param moonrise
     *     The moonrise
     */
    @JsonProperty("moonrise")
    public void setMoonrise(String moonrise) {
        this.moonrise = moonrise;
    }

    /**
     * 
     * @return
     *     The moonset
     */
    @JsonProperty("moonset")
    public String getMoonset() {
        return moonset;
    }

    /**
     * 
     * @param moonset
     *     The moonset
     */
    @JsonProperty("moonset")
    public void setMoonset(String moonset) {
        this.moonset = moonset;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sunrise).append(sunset).append(moonrise).append(moonset).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Astronomy) == false) {
            return false;
        }
        Astronomy rhs = ((Astronomy) other);
        return new EqualsBuilder().append(sunrise, rhs.sunrise).append(sunset, rhs.sunset).append(moonrise, rhs.moonrise).append(moonset, rhs.moonset).isEquals();
    }

}
