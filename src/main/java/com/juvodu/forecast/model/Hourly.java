
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
    "time",
    "tempC",
    "tempF",
    "windspeedMiles",
    "windspeedKmph",
    "winddirDegree",
    "winddir16Point",
    "weatherCode",
    "weatherIconUrl",
    "weatherDesc",
    "precipMM",
    "humidity",
    "visibility",
    "pressure",
    "cloudcover",
    "HeatIndexC",
    "HeatIndexF",
    "DewPointC",
    "DewPointF",
    "WindChillC",
    "WindChillF",
    "WindGustMiles",
    "WindGustKmph",
    "FeelsLikeC",
    "FeelsLikeF",
    "sigHeight_m",
    "swellHeight_m",
    "swellHeight_ft",
    "swellDir",
    "swellDir16Point",
    "swellPeriod_secs",
    "waterTemp_C",
    "waterTemp_F"
})
public class Hourly {

    @JsonProperty("time")
    private String time;
    @JsonProperty("tempC")
    private String tempC;
    @JsonProperty("tempF")
    private String tempF;
    @JsonProperty("windspeedMiles")
    private String windspeedMiles;
    @JsonProperty("windspeedKmph")
    private String windspeedKmph;
    @JsonProperty("winddirDegree")
    private String winddirDegree;
    @JsonProperty("winddir16Point")
    private String winddir16Point;
    @JsonProperty("weatherCode")
    private String weatherCode;
    @JsonProperty("weatherIconUrl")
    private List<WeatherIconUrl> weatherIconUrl = new ArrayList<WeatherIconUrl>();
    @JsonProperty("weatherDesc")
    private List<WeatherDesc> weatherDesc = new ArrayList<WeatherDesc>();
    @JsonProperty("precipMM")
    private String precipMM;
    @JsonProperty("humidity")
    private String humidity;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("pressure")
    private String pressure;
    @JsonProperty("cloudcover")
    private String cloudcover;
    @JsonProperty("HeatIndexC")
    private String heatIndexC;
    @JsonProperty("HeatIndexF")
    private String heatIndexF;
    @JsonProperty("DewPointC")
    private String dewPointC;
    @JsonProperty("DewPointF")
    private String dewPointF;
    @JsonProperty("WindChillC")
    private String windChillC;
    @JsonProperty("WindChillF")
    private String windChillF;
    @JsonProperty("WindGustMiles")
    private String windGustMiles;
    @JsonProperty("WindGustKmph")
    private String windGustKmph;
    @JsonProperty("FeelsLikeC")
    private String feelsLikeC;
    @JsonProperty("FeelsLikeF")
    private String feelsLikeF;
    @JsonProperty("sigHeight_m")
    private String sigHeightM;
    @JsonProperty("swellHeight_m")
    private String swellHeightM;
    @JsonProperty("swellHeight_ft")
    private String swellHeightFt;
    @JsonProperty("swellDir")
    private String swellDir;
    @JsonProperty("swellDir16Point")
    private String swellDir16Point;
    @JsonProperty("swellPeriod_secs")
    private String swellPeriodSecs;
    @JsonProperty("waterTemp_C")
    private String waterTempC;
    @JsonProperty("waterTemp_F")
    private String waterTempF;

    /**
     * 
     * @return
     *     The time
     */
    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * 
     * @return
     *     The tempC
     */
    @JsonProperty("tempC")
    public String getTempC() {
        return tempC;
    }

    /**
     * 
     * @param tempC
     *     The tempC
     */
    @JsonProperty("tempC")
    public void setTempC(String tempC) {
        this.tempC = tempC;
    }

    /**
     * 
     * @return
     *     The tempF
     */
    @JsonProperty("tempF")
    public String getTempF() {
        return tempF;
    }

    /**
     * 
     * @param tempF
     *     The tempF
     */
    @JsonProperty("tempF")
    public void setTempF(String tempF) {
        this.tempF = tempF;
    }

    /**
     * 
     * @return
     *     The windspeedMiles
     */
    @JsonProperty("windspeedMiles")
    public String getWindspeedMiles() {
        return windspeedMiles;
    }

    /**
     * 
     * @param windspeedMiles
     *     The windspeedMiles
     */
    @JsonProperty("windspeedMiles")
    public void setWindspeedMiles(String windspeedMiles) {
        this.windspeedMiles = windspeedMiles;
    }

    /**
     * 
     * @return
     *     The windspeedKmph
     */
    @JsonProperty("windspeedKmph")
    public String getWindspeedKmph() {
        return windspeedKmph;
    }

    /**
     * 
     * @param windspeedKmph
     *     The windspeedKmph
     */
    @JsonProperty("windspeedKmph")
    public void setWindspeedKmph(String windspeedKmph) {
        this.windspeedKmph = windspeedKmph;
    }

    /**
     * 
     * @return
     *     The winddirDegree
     */
    @JsonProperty("winddirDegree")
    public String getWinddirDegree() {
        return winddirDegree;
    }

    /**
     * 
     * @param winddirDegree
     *     The winddirDegree
     */
    @JsonProperty("winddirDegree")
    public void setWinddirDegree(String winddirDegree) {
        this.winddirDegree = winddirDegree;
    }

    /**
     * 
     * @return
     *     The winddir16Point
     */
    @JsonProperty("winddir16Point")
    public String getWinddir16Point() {
        return winddir16Point;
    }

    /**
     * 
     * @param winddir16Point
     *     The winddir16Point
     */
    @JsonProperty("winddir16Point")
    public void setWinddir16Point(String winddir16Point) {
        this.winddir16Point = winddir16Point;
    }

    /**
     * 
     * @return
     *     The weatherCode
     */
    @JsonProperty("weatherCode")
    public String getWeatherCode() {
        return weatherCode;
    }

    /**
     * 
     * @param weatherCode
     *     The weatherCode
     */
    @JsonProperty("weatherCode")
    public void setWeatherCode(String weatherCode) {
        this.weatherCode = weatherCode;
    }

    /**
     * 
     * @return
     *     The weatherIconUrl
     */
    @JsonProperty("weatherIconUrl")
    public List<WeatherIconUrl> getWeatherIconUrl() {
        return weatherIconUrl;
    }

    /**
     * 
     * @param weatherIconUrl
     *     The weatherIconUrl
     */
    @JsonProperty("weatherIconUrl")
    public void setWeatherIconUrl(List<WeatherIconUrl> weatherIconUrl) {
        this.weatherIconUrl = weatherIconUrl;
    }

    /**
     * 
     * @return
     *     The weatherDesc
     */
    @JsonProperty("weatherDesc")
    public List<WeatherDesc> getWeatherDesc() {
        return weatherDesc;
    }

    /**
     * 
     * @param weatherDesc
     *     The weatherDesc
     */
    @JsonProperty("weatherDesc")
    public void setWeatherDesc(List<WeatherDesc> weatherDesc) {
        this.weatherDesc = weatherDesc;
    }

    /**
     * 
     * @return
     *     The precipMM
     */
    @JsonProperty("precipMM")
    public String getPrecipMM() {
        return precipMM;
    }

    /**
     * 
     * @param precipMM
     *     The precipMM
     */
    @JsonProperty("precipMM")
    public void setPrecipMM(String precipMM) {
        this.precipMM = precipMM;
    }

    /**
     * 
     * @return
     *     The humidity
     */
    @JsonProperty("humidity")
    public String getHumidity() {
        return humidity;
    }

    /**
     * 
     * @param humidity
     *     The humidity
     */
    @JsonProperty("humidity")
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    /**
     * 
     * @return
     *     The visibility
     */
    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    /**
     * 
     * @param visibility
     *     The visibility
     */
    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * 
     * @return
     *     The pressure
     */
    @JsonProperty("pressure")
    public String getPressure() {
        return pressure;
    }

    /**
     * 
     * @param pressure
     *     The pressure
     */
    @JsonProperty("pressure")
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    /**
     * 
     * @return
     *     The cloudcover
     */
    @JsonProperty("cloudcover")
    public String getCloudcover() {
        return cloudcover;
    }

    /**
     * 
     * @param cloudcover
     *     The cloudcover
     */
    @JsonProperty("cloudcover")
    public void setCloudcover(String cloudcover) {
        this.cloudcover = cloudcover;
    }

    /**
     * 
     * @return
     *     The heatIndexC
     */
    @JsonProperty("HeatIndexC")
    public String getHeatIndexC() {
        return heatIndexC;
    }

    /**
     * 
     * @param heatIndexC
     *     The HeatIndexC
     */
    @JsonProperty("HeatIndexC")
    public void setHeatIndexC(String heatIndexC) {
        this.heatIndexC = heatIndexC;
    }

    /**
     * 
     * @return
     *     The heatIndexF
     */
    @JsonProperty("HeatIndexF")
    public String getHeatIndexF() {
        return heatIndexF;
    }

    /**
     * 
     * @param heatIndexF
     *     The HeatIndexF
     */
    @JsonProperty("HeatIndexF")
    public void setHeatIndexF(String heatIndexF) {
        this.heatIndexF = heatIndexF;
    }

    /**
     * 
     * @return
     *     The dewPointC
     */
    @JsonProperty("DewPointC")
    public String getDewPointC() {
        return dewPointC;
    }

    /**
     * 
     * @param dewPointC
     *     The DewPointC
     */
    @JsonProperty("DewPointC")
    public void setDewPointC(String dewPointC) {
        this.dewPointC = dewPointC;
    }

    /**
     * 
     * @return
     *     The dewPointF
     */
    @JsonProperty("DewPointF")
    public String getDewPointF() {
        return dewPointF;
    }

    /**
     * 
     * @param dewPointF
     *     The DewPointF
     */
    @JsonProperty("DewPointF")
    public void setDewPointF(String dewPointF) {
        this.dewPointF = dewPointF;
    }

    /**
     * 
     * @return
     *     The windChillC
     */
    @JsonProperty("WindChillC")
    public String getWindChillC() {
        return windChillC;
    }

    /**
     * 
     * @param windChillC
     *     The WindChillC
     */
    @JsonProperty("WindChillC")
    public void setWindChillC(String windChillC) {
        this.windChillC = windChillC;
    }

    /**
     * 
     * @return
     *     The windChillF
     */
    @JsonProperty("WindChillF")
    public String getWindChillF() {
        return windChillF;
    }

    /**
     * 
     * @param windChillF
     *     The WindChillF
     */
    @JsonProperty("WindChillF")
    public void setWindChillF(String windChillF) {
        this.windChillF = windChillF;
    }

    /**
     * 
     * @return
     *     The windGustMiles
     */
    @JsonProperty("WindGustMiles")
    public String getWindGustMiles() {
        return windGustMiles;
    }

    /**
     * 
     * @param windGustMiles
     *     The WindGustMiles
     */
    @JsonProperty("WindGustMiles")
    public void setWindGustMiles(String windGustMiles) {
        this.windGustMiles = windGustMiles;
    }

    /**
     * 
     * @return
     *     The windGustKmph
     */
    @JsonProperty("WindGustKmph")
    public String getWindGustKmph() {
        return windGustKmph;
    }

    /**
     * 
     * @param windGustKmph
     *     The WindGustKmph
     */
    @JsonProperty("WindGustKmph")
    public void setWindGustKmph(String windGustKmph) {
        this.windGustKmph = windGustKmph;
    }

    /**
     * 
     * @return
     *     The feelsLikeC
     */
    @JsonProperty("FeelsLikeC")
    public String getFeelsLikeC() {
        return feelsLikeC;
    }

    /**
     * 
     * @param feelsLikeC
     *     The FeelsLikeC
     */
    @JsonProperty("FeelsLikeC")
    public void setFeelsLikeC(String feelsLikeC) {
        this.feelsLikeC = feelsLikeC;
    }

    /**
     * 
     * @return
     *     The feelsLikeF
     */
    @JsonProperty("FeelsLikeF")
    public String getFeelsLikeF() {
        return feelsLikeF;
    }

    /**
     * 
     * @param feelsLikeF
     *     The FeelsLikeF
     */
    @JsonProperty("FeelsLikeF")
    public void setFeelsLikeF(String feelsLikeF) {
        this.feelsLikeF = feelsLikeF;
    }

    /**
     * 
     * @return
     *     The sigHeightM
     */
    @JsonProperty("sigHeight_m")
    public String getSigHeightM() {
        return sigHeightM;
    }

    /**
     * 
     * @param sigHeightM
     *     The sigHeight_m
     */
    @JsonProperty("sigHeight_m")
    public void setSigHeightM(String sigHeightM) {
        this.sigHeightM = sigHeightM;
    }

    /**
     * 
     * @return
     *     The swellHeightM
     */
    @JsonProperty("swellHeight_m")
    public String getSwellHeightM() {
        return swellHeightM;
    }

    /**
     * 
     * @param swellHeightM
     *     The swellHeight_m
     */
    @JsonProperty("swellHeight_m")
    public void setSwellHeightM(String swellHeightM) {
        this.swellHeightM = swellHeightM;
    }

    /**
     * 
     * @return
     *     The swellHeightFt
     */
    @JsonProperty("swellHeight_ft")
    public String getSwellHeightFt() {
        return swellHeightFt;
    }

    /**
     * 
     * @param swellHeightFt
     *     The swellHeight_ft
     */
    @JsonProperty("swellHeight_ft")
    public void setSwellHeightFt(String swellHeightFt) {
        this.swellHeightFt = swellHeightFt;
    }

    /**
     * 
     * @return
     *     The swellDir
     */
    @JsonProperty("swellDir")
    public String getSwellDir() {
        return swellDir;
    }

    /**
     * 
     * @param swellDir
     *     The swellDir
     */
    @JsonProperty("swellDir")
    public void setSwellDir(String swellDir) {
        this.swellDir = swellDir;
    }

    /**
     * 
     * @return
     *     The swellDir16Point
     */
    @JsonProperty("swellDir16Point")
    public String getSwellDir16Point() {
        return swellDir16Point;
    }

    /**
     * 
     * @param swellDir16Point
     *     The swellDir16Point
     */
    @JsonProperty("swellDir16Point")
    public void setSwellDir16Point(String swellDir16Point) {
        this.swellDir16Point = swellDir16Point;
    }

    /**
     * 
     * @return
     *     The swellPeriodSecs
     */
    @JsonProperty("swellPeriod_secs")
    public String getSwellPeriodSecs() {
        return swellPeriodSecs;
    }

    /**
     * 
     * @param swellPeriodSecs
     *     The swellPeriod_secs
     */
    @JsonProperty("swellPeriod_secs")
    public void setSwellPeriodSecs(String swellPeriodSecs) {
        this.swellPeriodSecs = swellPeriodSecs;
    }

    /**
     * 
     * @return
     *     The waterTempC
     */
    @JsonProperty("waterTemp_C")
    public String getWaterTempC() {
        return waterTempC;
    }

    /**
     * 
     * @param waterTempC
     *     The waterTemp_C
     */
    @JsonProperty("waterTemp_C")
    public void setWaterTempC(String waterTempC) {
        this.waterTempC = waterTempC;
    }

    /**
     * 
     * @return
     *     The waterTempF
     */
    @JsonProperty("waterTemp_F")
    public String getWaterTempF() {
        return waterTempF;
    }

    /**
     * 
     * @param waterTempF
     *     The waterTemp_F
     */
    @JsonProperty("waterTemp_F")
    public void setWaterTempF(String waterTempF) {
        this.waterTempF = waterTempF;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(time).append(tempC).append(tempF).append(windspeedMiles).append(windspeedKmph).append(winddirDegree).append(winddir16Point).append(weatherCode).append(weatherIconUrl).append(weatherDesc).append(precipMM).append(humidity).append(visibility).append(pressure).append(cloudcover).append(heatIndexC).append(heatIndexF).append(dewPointC).append(dewPointF).append(windChillC).append(windChillF).append(windGustMiles).append(windGustKmph).append(feelsLikeC).append(feelsLikeF).append(sigHeightM).append(swellHeightM).append(swellHeightFt).append(swellDir).append(swellDir16Point).append(swellPeriodSecs).append(waterTempC).append(waterTempF).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Hourly) == false) {
            return false;
        }
        Hourly rhs = ((Hourly) other);
        return new EqualsBuilder().append(time, rhs.time).append(tempC, rhs.tempC).append(tempF, rhs.tempF).append(windspeedMiles, rhs.windspeedMiles).append(windspeedKmph, rhs.windspeedKmph).append(winddirDegree, rhs.winddirDegree).append(winddir16Point, rhs.winddir16Point).append(weatherCode, rhs.weatherCode).append(weatherIconUrl, rhs.weatherIconUrl).append(weatherDesc, rhs.weatherDesc).append(precipMM, rhs.precipMM).append(humidity, rhs.humidity).append(visibility, rhs.visibility).append(pressure, rhs.pressure).append(cloudcover, rhs.cloudcover).append(heatIndexC, rhs.heatIndexC).append(heatIndexF, rhs.heatIndexF).append(dewPointC, rhs.dewPointC).append(dewPointF, rhs.dewPointF).append(windChillC, rhs.windChillC).append(windChillF, rhs.windChillF).append(windGustMiles, rhs.windGustMiles).append(windGustKmph, rhs.windGustKmph).append(feelsLikeC, rhs.feelsLikeC).append(feelsLikeF, rhs.feelsLikeF).append(sigHeightM, rhs.sigHeightM).append(swellHeightM, rhs.swellHeightM).append(swellHeightFt, rhs.swellHeightFt).append(swellDir, rhs.swellDir).append(swellDir16Point, rhs.swellDir16Point).append(swellPeriodSecs, rhs.swellPeriodSecs).append(waterTempC, rhs.waterTempC).append(waterTempF, rhs.waterTempF).isEquals();
    }

}
