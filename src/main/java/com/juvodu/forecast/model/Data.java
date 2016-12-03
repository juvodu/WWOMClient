
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
    "request",
    "nearest_area",
    "weather"
})
public class Data {

    @JsonProperty("request")
    private List<Request> request = new ArrayList<Request>();
    @JsonProperty("nearest_area")
    private List<NearestArea> nearestArea = new ArrayList<NearestArea>();
    @JsonProperty("weather")
    private List<Weather> weather = new ArrayList<Weather>();

    /**
     * 
     * @return
     *     The request
     */
    @JsonProperty("request")
    public List<Request> getRequest() {
        return request;
    }

    /**
     * 
     * @param request
     *     The request
     */
    @JsonProperty("request")
    public void setRequest(List<Request> request) {
        this.request = request;
    }

    /**
     * 
     * @return
     *     The nearestArea
     */
    @JsonProperty("nearest_area")
    public List<NearestArea> getNearestArea() {
        return nearestArea;
    }

    /**
     * 
     * @param nearestArea
     *     The nearest_area
     */
    @JsonProperty("nearest_area")
    public void setNearestArea(List<NearestArea> nearestArea) {
        this.nearestArea = nearestArea;
    }

    /**
     * 
     * @return
     *     The weather
     */
    @JsonProperty("weather")
    public List<Weather> getWeather() {
        return weather;
    }

    /**
     * 
     * @param weather
     *     The weather
     */
    @JsonProperty("weather")
    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(request).append(nearestArea).append(weather).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data) == false) {
            return false;
        }
        Data rhs = ((Data) other);
        return new EqualsBuilder().append(request, rhs.request).append(nearestArea, rhs.nearestArea).append(weather, rhs.weather).isEquals();
    }

}
