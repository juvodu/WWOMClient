
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
    "latitude",
    "longitude",
    "distance_miles"
})
public class NearestArea {

    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("distance_miles")
    private String distanceMiles;

    /**
     * 
     * @return
     *     The latitude
     */
    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param latitude
     *     The latitude
     */
    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 
     * @return
     *     The longitude
     */
    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param longitude
     *     The longitude
     */
    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 
     * @return
     *     The distanceMiles
     */
    @JsonProperty("distance_miles")
    public String getDistanceMiles() {
        return distanceMiles;
    }

    /**
     * 
     * @param distanceMiles
     *     The distance_miles
     */
    @JsonProperty("distance_miles")
    public void setDistanceMiles(String distanceMiles) {
        this.distanceMiles = distanceMiles;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(latitude).append(longitude).append(distanceMiles).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NearestArea) == false) {
            return false;
        }
        NearestArea rhs = ((NearestArea) other);
        return new EqualsBuilder().append(latitude, rhs.latitude).append(longitude, rhs.longitude).append(distanceMiles, rhs.distanceMiles).isEquals();
    }

}
