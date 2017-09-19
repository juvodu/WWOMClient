package com.juvodu.forecast.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.web.client.RestTemplate;

import com.juvodu.forecast.exception.WWOMClientException;
import com.juvodu.forecast.model.Forecast;

/**
 * A simple WWOM Java Rest Client for retrieving Forcasts from World Weather
 * online in JSON Format.
 *
 * @author Juri Tichomirow
 */
public class WWOMClient {

	private static final Logger log = Logger.getLogger(WWOMClient.class);
	private static final String BASE_URI = "https://api.worldweatheronline.com/premium/v1/marine.ashx";
	private static final String PARAM_KEY = "?key=";
	private static final String PARAM_LOCATION = "&q=";
	private static final String PARAM_TIDE = "&tide=";
	private static final String PARAM_TIME_PERIOD = "&tp=";
	private static final String PARAM_LANG = "&lang=";
	private static final String PARAM_INCLUDE_LOCATION = "&includelocation=";


	private RestTemplate restTemplate;

	public WWOMClient(){
        this.restTemplate = new RestTemplate();
	}

	/**
	 * Gets the forecast.
	 * 
	 *  https://developer.worldweatheronline.com/premium-api-explorer.aspx
	 *      for API Documentation
	 *
	 * @param location
	 *            the location
	 * @param includeLocation
	 *            - optional
	 * @param tp
	 *            - optional
	 * @param tide
	 *            - optional
	 * @param lang
	 *            the lang
	 * @return the forecast
	 * @throws WWOMClientException
	 *             the WWOM client exception
	 */
	public Forecast getForecast(String location, boolean includeLocation, int tp, boolean tide, String lang)
			throws WWOMClientException {

		// validate required parameters
		if (StringUtils.isBlank(location)) {
			throw new WWOMClientException("No Location specified.");
		}

		String apiKey = getApiKeyFromProperties();
		if (StringUtils.isBlank(apiKey)) {
			throw new WWOMClientException("No World Weather Online API key specified.");
		}

		if (!validateTimePeriod(tp)) {
			throw new WWOMClientException("Time Period must be 1, 3, 6, 12 or 24 hours.");
		}

		String uri = BASE_URI + PARAM_KEY + apiKey + PARAM_LOCATION + location + "&format=json" + PARAM_TIME_PERIOD
				+ tp;

		// add optional parameters
		if (includeLocation) {
			uri += PARAM_INCLUDE_LOCATION + "yes";
		}
		if (tide) {
			uri += PARAM_TIDE + "yes";
		}
		if (!StringUtils.isBlank(lang)) {
			uri += PARAM_LANG + lang;
		}
		return restTemplate.getForObject(uri, Forecast.class);
    }

	/**
	 * Gets the forecast.
	 *
	 * @param location
	 *            the location
	 * @return the forecast
	 * @throws WWOMClientException
	 *             the WWOM client exception
	 */
	public Forecast getForecast(String location) throws WWOMClientException {

		return getForecast(location, false, 6, false, null);
	}

	private boolean validateTimePeriod(int tp) {

		List<Integer> tps = Arrays.asList(1, 3, 6, 12, 24);
		return tps.contains(tp);
	}

	private String getApiKeyFromProperties() {

		Properties prop = new Properties();
		String propFileName = "wwom.properties";
		String apiKey = null;

		try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName)) {
			if (inputStream != null) {
				prop.load(inputStream);
				apiKey = prop.getProperty("com.wwom.apikey");
			} else {
				throw new FileNotFoundException("Property file '" + propFileName + "' not found in the classpath.");
			}
		} catch (IOException ex) {
			log.error(ex.getMessage());
		}
		return apiKey;
	}
}
