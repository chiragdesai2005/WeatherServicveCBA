package com.weather;

import com.weather.common.GenerateResultFile;
import com.weather.common.ServiceFactory;
import com.weather.common.Utility;
import com.weather.model.ResultData;
import com.weather.service.WeatherService;

public class WeatherServiceClient {

	/**
	 * The Main class implements an application that simply call mock web
	 * service and generate standard output file.
	 */

	public static void main(String args[]) {
		try {
			System.out.println("-----------------*********************-------------------------");
			System.out.println("          WeatherServiceClient program starts");
			System.out.println("-----------------*********************-------------------------");
			WeatherServiceClient main = new WeatherServiceClient();
			main.doProcess();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error while processing application request "
					+ e.getMessage());
		}
	}

	/**
	 * This method is created so Integrated Test case can be executed
	 * 
	 * @throws Exception
	 */
	public void doProcess() throws Exception {
		// Load Property file
		Utility.getInstsnace().loadPropertyFile();

		// Generate Web service URL
		Utility.getInstsnace().generateWebServiceURL();

		// Call Web service from factory of service objects
		WeatherService weatherService = ServiceFactory
				.getWeatherServiceInstance();
		ResultData resultData = weatherService.callWebserviceForResultData();

		// Generate Result output file
		GenerateResultFile.generateOutputFile(resultData);
	}
}
