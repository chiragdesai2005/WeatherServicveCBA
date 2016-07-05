package com.weather.common;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.weather.model.ResultData;
import com.weather.model.Weather;

public class GenerateResultFile implements Serializable {

	private static final long serialVersionUID = -4443740988844355075L;
	private static final String FILE_SEPARATOR = "|";
	private static final SimpleDateFormat dateFormatGmt = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	/**
	 * Generate a file o/p file based on the given result data There is
	 * no field level mapping for the o/p file content
	 * 
	 * @param resultData
	 * @throws Exception
	 */
	public static void generateOutputFile(ResultData resultData)
			throws Exception {
		if (resultData != null) {
			File file = new File(Utility.getInstsnace().getFileName());
			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fileWritter = new FileWriter(file.getName(), false);
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
			bufferWritter.write(generateFileContentDataString(resultData));
			bufferWritter.close();
			System.out.println("-----------------*********************-------------------------");
			System.out.println("File generated successfully " + file.getAbsolutePath() );
			System.out.println("-----------------*********************-------------------------");
		}
	}

	/**
	 * This method is responsible for generating file content
	 * 
	 * @param resultData
	 * @return String
	 * @throws Exception
	 */
	private static String generateFileContentDataString(ResultData resultData)
			throws Exception {
		List<com.weather.model.List> dataList = resultData.getList();
		StringBuilder sbuffer = new StringBuilder();
		for (com.weather.model.List data : dataList) {
			sbuffer.append(data.getName().substring(0, 3).toUpperCase());// City
																			// name
			sbuffer.append(FILE_SEPARATOR);
			sbuffer.append(data.getCoord().getLon() + ","
					+ data.getCoord().getLat());// Longitude, Latitude
			sbuffer.append(FILE_SEPARATOR);
			try {
				Date date = new Date(data.getDt() * 1000L);
				sbuffer.append(dateFormatGmt.format(date));
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("Error while parsing date object");
			}// Time of data calculation, unix, UTC
			sbuffer.append(FILE_SEPARATOR);
			Weather weather = data.getWeather().get(0);
			sbuffer.append(weather.getMain());// Weather Condition
			sbuffer.append(FILE_SEPARATOR);
			sbuffer.append(data.getMain().getTemp());// Temperature
			sbuffer.append(FILE_SEPARATOR);
			sbuffer.append(data.getMain().getPressure());// Pressure
			sbuffer.append(FILE_SEPARATOR);
			sbuffer.append(data.getMain().getHumidity());// Humidity
			sbuffer.append("\n");// New line char
		}
		return sbuffer.toString();
	}

}
