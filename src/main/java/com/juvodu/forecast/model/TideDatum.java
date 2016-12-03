
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
    "tideTime",
    "tideHeight_mt",
    "tideDateTime",
    "tide_type"
})
public class TideDatum {

    @JsonProperty("tideTime")
    private String tideTime;
    @JsonProperty("tideHeight_mt")
    private String tideHeightMt;
    @JsonProperty("tideDateTime")
    private String tideDateTime;
    @JsonProperty("tide_type")
    private String tideType;

    /**
     * 
     * @return
     *     The tideTime
     */
    @JsonProperty("tideTime")
    public String getTideTime() {
        return tideTime;
    }

    /**
     * 
     * @param tideTime
     *     The tideTime
     */
    @JsonProperty("tideTime")
    public void setTideTime(String tideTime) {
        this.tideTime = tideTime;
    }

    /**
     * 
     * @return
     *     The tideHeightMt
     */
    @JsonProperty("tideHeight_mt")
    public String getTideHeightMt() {
        return tideHeightMt;
    }

    /**
     * 
     * @param tideHeightMt
     *     The tideHeight_mt
     */
    @JsonProperty("tideHeight_mt")
    public void setTideHeightMt(String tideHeightMt) {
        this.tideHeightMt = tideHeightMt;
    }

    /**
     * 
     * @return
     *     The tideDateTime
     */
    @JsonProperty("tideDateTime")
    public String getTideDateTime() {
        return tideDateTime;
    }

    /**
     * 
     * @param tideDateTime
     *     The tideDateTime
     */
    @JsonProperty("tideDateTime")
    public void setTideDateTime(String tideDateTime) {
        this.tideDateTime = tideDateTime;
    }

    /**
     * 
     * @return
     *     The tideType
     */
    @JsonProperty("tide_type")
    public String getTideType() {
        return tideType;
    }

    /**
     * 
     * @param tideType
     *     The tide_type
     */
    @JsonProperty("tide_type")
    public void setTideType(String tideType) {
        this.tideType = tideType;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tideTime).append(tideHeightMt).append(tideDateTime).append(tideType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TideDatum) == false) {
            return false;
        }
        TideDatum rhs = ((TideDatum) other);
        return new EqualsBuilder().append(tideTime, rhs.tideTime).append(tideHeightMt, rhs.tideHeightMt).append(tideDateTime, rhs.tideDateTime).append(tideType, rhs.tideType).isEquals();
    }

}
