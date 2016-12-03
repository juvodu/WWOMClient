
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
    "tide_data"
})
public class Tide {

    @JsonProperty("tide_data")
    private List<TideDatum> tideData = new ArrayList<TideDatum>();

    /**
     * 
     * @return
     *     The tideData
     */
    @JsonProperty("tide_data")
    public List<TideDatum> getTideData() {
        return tideData;
    }

    /**
     * 
     * @param tideData
     *     The tide_data
     */
    @JsonProperty("tide_data")
    public void setTideData(List<TideDatum> tideData) {
        this.tideData = tideData;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tideData).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tide) == false) {
            return false;
        }
        Tide rhs = ((Tide) other);
        return new EqualsBuilder().append(tideData, rhs.tideData).isEquals();
    }

}
