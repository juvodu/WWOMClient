package com.juvodu.forecast.controller;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.juvodu.forecast.exception.WWOMClientException;
import com.juvodu.forecast.model.Astronomy;
import com.juvodu.forecast.model.Data;
import com.juvodu.forecast.model.Forecast;
import com.juvodu.forecast.model.Hourly;
import com.juvodu.forecast.model.NearestArea;
import com.juvodu.forecast.model.Tide;
import com.juvodu.forecast.model.TideDatum;
import com.juvodu.forecast.model.Weather;

public class WWOMClientTest {

	private WWOMClient client;

	@Before
	public void setup() {
		client = new WWOMClient();
	}

	@Test
	public void givenValidDataThenSuccess() throws WWOMClientException {

		Forecast forecast = client.getForecast("28.538989, -14.000069");
		assertNotNull(forecast);
	}

	@Test
	public void givenValidDataWithParametersThanSuccess() throws WWOMClientException {

		Forecast forecasts = client.getForecast("28.538989, -14.000069", true, 24, true, "de");
		assertNotNull(forecasts);
		Data data = forecasts.getData();

		List<Weather> weathers = data.getWeather();
		assertFalse(weathers.isEmpty());
		Weather weather = weathers.get(0);
		assertNotNull(weather);
		assertNotNull(weather.getDate());
		assertNotNull(weather.getMaxtempC());
		assertNotNull(weather.getMaxtempF());
		assertNotNull(weather.getMintempC());
		assertNotNull(weather.getMintempF());
		assertNotNull(weather.getHourly());
		assertNotNull(weather.getAstronomy());
		assertNotNull(weather.getTides());

		List<Hourly> hourlies = weather.getHourly();
		assertFalse(hourlies.isEmpty());
		Hourly hourly = hourlies.get(0);
		assertNotNull(hourly);
		assertNotNull(hourly.getCloudcover());
		assertNotNull(hourly.getDewPointC());
		assertNotNull(hourly.getDewPointF());
		assertNotNull(hourly.getFeelsLikeC());
		assertNotNull(hourly.getFeelsLikeF());
		assertNotNull(hourly.getHeatIndexC());
		assertNotNull(hourly.getHeatIndexF());
		assertNotNull(hourly.getHumidity());
		assertNotNull(hourly.getPrecipMM());
		assertNotNull(hourly.getPressure());
		assertNotNull(hourly.getSigHeightM());
		assertNotNull(hourly.getSwellDir());
		assertNotNull(hourly.getSwellDir16Point());
		assertNotNull(hourly.getSwellHeightFt());
		assertNotNull(hourly.getSwellHeightM());
		assertNotNull(hourly.getSwellPeriodSecs());
		assertNotNull(hourly.getTempC());
		assertNotNull(hourly.getTempF());
		assertNotNull(hourly.getTime());
		assertNotNull(hourly.getVisibility());
		assertNotNull(hourly.getWaterTempC());
		assertNotNull(hourly.getWaterTempF());
		assertNotNull(hourly.getWeatherCode());
		assertNotNull(hourly.getWeatherDesc());
		assertNotNull(hourly.getWeatherIconUrl());
		assertNotNull(hourly.getWindChillC());
		assertNotNull(hourly.getWindChillF());
		assertNotNull(hourly.getWinddir16Point());
		assertNotNull(hourly.getWindGustKmph());
		assertNotNull(hourly.getWindGustMiles());
		assertNotNull(hourly.getWindspeedKmph());
		assertNotNull(hourly.getWindspeedMiles());

		List<Astronomy> astronomies = weather.getAstronomy();
		assertFalse(astronomies.isEmpty());
		Astronomy astronomy = astronomies.get(0);
		assertNotNull(astronomy);
		assertNotNull(astronomy.getMoonrise());
		assertNotNull(astronomy.getMoonset());
		assertNotNull(astronomy.getSunrise());
		assertNotNull(astronomy.getSunset());

		List<Tide> tides = weather.getTides();
		assertFalse(tides.isEmpty());
		Tide tide = tides.get(0);
		assertNotNull(tide);
		List<TideDatum> tideDatas = tide.getTideData();
		assertFalse(tideDatas.isEmpty());
		TideDatum tideDatum = tideDatas.get(0);
		assertNotNull(tideDatum);
		assertNotNull(tideDatum.getTideDateTime());
		assertNotNull(tideDatum.getTideHeightMt());
		assertNotNull(tideDatum.getTideTime());
		assertNotNull(tideDatum.getTideType());

		List<NearestArea> nearestAreas = data.getNearestArea();
		assertFalse(nearestAreas.isEmpty());
		NearestArea nearestArea = nearestAreas.get(0);
		assertNotNull(nearestArea);
		assertNotNull(nearestArea.getDistanceMiles());
		assertNotNull(nearestArea.getLatitude());
		assertNotNull(nearestArea.getLongitude());

	}

	@Test
	public void givenInvalidDataWithParametersThanException() {

		try {
			client.getForecast("");
			fail("Exception should be thrown as invalid Location passed.");
		} catch (WWOMClientException e) {
			// expected exception
		}

		try {
			client.getForecast(null);
			fail("Exception should be thrown as invalid Location passed.");
		} catch (WWOMClientException e) {
			// expected exception
		}
	}

	@Test
	public void givenInvalidDataWithParametersThenException() {

		try {
			client.getForecast("28.538989, -14.000069", true, -1, true, null);
		} catch (WWOMClientException e) {
			// expected exception
		}
	}
}
