package com.weather.common;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Properties;

public class Utility {

	private String host_Service_URL = null;
	private String app_Id = null;
	private String City_ids = null;
	private String service_URL = null;
	private String output_file_name = null;
	private String outputdir = null;
	private static final Utility utility = new Utility();

	/**
	 * private constructor
	 */
	private Utility() {

	}

	/**
	 * This method will return the singleton class object
	 * 
	 * @return
	 */
	public static Utility getInstsnace() {
		return utility;
	}

	/**
	 * This method will generate the url to connect remote web service with
	 * required parameters Following mapping values are coming from property
	 * file 2147714 - Sydney 2158177 - Melbourne, AU 2078025 - Adelaide 2172517 -
	 * Canberra, AU 2063523 - Perth, AU 2174003 - Brisbane, AU 2163355 - Hobart,
	 * AU 2176187 - Bendigo, AU 2177091 - Ballarat, AU 7281840 - Paramatta, AU
	 * 2154219 - Orange, AU
	 */
	public void generateWebServiceURL() {
		if (host_Service_URL != null && app_Id != null) {
			StringBuilder sbuilder = new StringBuilder();
			sbuilder.append(host_Service_URL);
			sbuilder.append("?id=");
			sbuilder.append(City_ids);
			sbuilder.append("&units=metric&appid=");
			sbuilder.append(app_Id);
			System.out.println("-----------------*********************-------------------------");
			System.out.println("System has generated this url to connect remote webservice "+ sbuilder.toString());
			System.out.println("-----------------*********************-------------------------");
			
			service_URL = sbuilder.toString();
		} else {
			System.out
					.println("HOST_SERVICE_URL or APP_ID value is not initialized properly. Please check the config property file");
		}

	}

	/**
	 * This method will read the property file from properties folder
	 * 
	 * @throws IOException
	 */
	public void loadPropertyFile() throws IOException {
		Properties prop = new Properties();
		String propFileName = "dev.service.properties";
		InputStream inputStream = getClass().getClassLoader()
				.getResourceAsStream(propFileName);
		if (inputStream != null) {
			prop.load(inputStream);
			host_Service_URL = prop.getProperty("remote.host_service_url");
			app_Id = prop.getProperty("app_id");
			City_ids = prop.getProperty("city_ids");
			output_file_name = prop.getProperty("outputfile");
			outputdir = prop.getProperty("outputdir");
		} else {
			System.out.println("property file not found in the classpath ");
			throw new FileNotFoundException("property file '" + propFileName
					+ "' not found in the classpath");
		}
	}

	/**
	 * This method will return file name based on static file name and today's
	 * date
	 * 
	 * @return
	 */
	public String getFileName() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH); // 0 to 11
		int day = cal.get(Calendar.DATE);
		return Utility.getInstsnace().getOutputFilename() + day + "_" + month
				+ "_" + year;
	}

	/**
	 * 
	 * @return
	 */
	public String getserviceURL() {
		return service_URL;
	}

	/**
	 * 
	 * @return
	 */
	public String getOutputFilename() {
		return output_file_name;
	}

	/**
	 * 
	 * @return
	 */
	public String getOutputdir() {
		return outputdir;
	}

}