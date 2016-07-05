package com.weather.common;

import com.weather.service.impl.WeatherServiceImpl;

public class ServiceFactory {

	private static final WeatherServiceImpl weatherServiceImpl = new WeatherServiceImpl();

	private ServiceFactory() {

	}

	public static WeatherServiceImpl getWeatherServiceInstance() {
		return weatherServiceImpl;
	}
}