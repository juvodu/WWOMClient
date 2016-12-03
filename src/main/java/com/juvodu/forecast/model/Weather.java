
package com.juvodu.forecast.model;

import java.util.ArrayList;
import java.util.List;
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
    "date",
    "astronomy",
    "maxtempC",
    "maxtempF",
    "mintempC",
    "mintempF",
    "tides",
    "hourly"
})
public class Weather {

    @JsonProperty("date")
    private String date;
    @JsonProperty("astronomy")
    private List<Astronomy> astronomy = new ArrayList<Astronomy>();
    @JsonProperty("maxtempC")
    private String maxtempC;
    @JsonProperty("maxtempF")
    private String maxtempF;
    @JsonProperty("mintempC")
    private String mintempC;
    @JsonProperty("mintempF")
    private String mintempF;
    @JsonProperty("tides")
    private List<Tide> tides = new ArrayList<Tide>();
    @JsonProperty("hourly")
    private List<Hourly> hourly = new ArrayList<Hourly>();

    /**
     * 
     * @return
     *     The date
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * 
     * @param date
     *     The date
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 
     * @return
     *     The astronomy
     */
    @JsonProperty("astronomy")
    public List<Astronomy> getAstronomy() {
        return astronomy;
    }

    /**
     * 
     * @param astronomy
     *     The astronomy
     */
    @JsonProperty("astronomy")
    public void setAstronomy(List<Astronomy> astronomy) {
        this.astronomy = astronomy;
    }

    /**
     * 
     * @return
     *     The maxtempC
     */
    @JsonProperty("maxtempC")
    public String getMaxtempC() {
        return maxtempC;
    }

    /**
     * 
     * @param maxtempC
     *     The maxtempC
     */
    @JsonProperty("maxtempC")
    public void setMaxtempC(String maxtempC) {
        this.maxtempC = maxtempC;
    }

    /**
     * 
     * @return
     *     The maxtempF
     */
    @JsonProperty("maxtempF")
    public String getMaxtempF() {
        return maxtempF;
    }

    /**
     * 
     * @param maxtempF
     *     The maxtempF
     */
    @JsonProperty("maxtempF")
    public void setMaxtempF(String maxtempF) {
        this.maxtempF = maxtempF;
    }

    /**
     * 
     * @return
     *     The mintempC
     */
    @JsonProperty("mintempC")
    public String getMintempC() {
        return mintempC;
    }

    /**
     * 
     * @param mintempC
     *     The mintempC
     */
    @JsonProperty("mintempC")
    public void setMintempC(String mintempC) {
        this.mintempC = mintempC;
    }

    /**
     * 
     * @return
     *     The mintempF
     */
    @JsonProperty("mintempF")
    public String getMintempF() {
        return mintempF;
    }

    /**
     * 
     * @param mintempF
     *     The mintempF
     */
    @JsonProperty("mintempF")
    public void setMintempF(String mintempF) {
        this.mintempF = mintempF;
    }

    /**
     * 
     * @return
     *     The tides
     */
    @JsonProperty("tides")
    public List<Tide> getTides() {
        return tides;
    }

    /**
     * 
     * @param tides
     *     The tides
     */
    @JsonProperty("tides")
    public void setTides(List<Tide> tides) {
        this.tides = tides;
    }

    /**
     * 
     * @return
     *     The hourly
     */
    @JsonProperty("hourly")
    public List<Hourly> getHourly() {
        return hourly;
    }

    /**
     * 
     * @param hourly
     *     The hourly
     */
    @JsonProperty("hourly")
    public void setHourly(List<Hourly> hourly) {
        this.hourly = hourly;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(date).append(astronomy).append(maxtempC).append(maxtempF).append(mintempC).append(mintempF).append(tides).append(hourly).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Weather) == false) {
            return false;
        }
        Weather rhs = ((Weather) other);
        return new EqualsBuilder().append(date, rhs.date).append(astronomy, rhs.astronomy).append(maxtempC, rhs.maxtempC).append(maxtempF, rhs.maxtempF).append(mintempC, rhs.mintempC).append(mintempF, rhs.mintempF).append(tides, rhs.tides).append(hourly, rhs.hourly).isEquals();
    }

}
