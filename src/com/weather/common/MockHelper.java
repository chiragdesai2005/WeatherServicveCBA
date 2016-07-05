package com.weather.common;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MockHelper {

	public String getResultData() {
		String fileAsString = null;
		try {
			// String dataset = System.getProperty("user.dir") +
			// File.pathSeparator+"src"+File.pathSeparator+"result/result.txt";
			InputStream in = getClass().getClassLoader().getResourceAsStream(
					"result.txt");
			BufferedReader buffReader = new BufferedReader(
					new InputStreamReader(in));
			String line = buffReader.readLine();
			StringBuilder sb = new StringBuilder();
			while (line != null) {
				sb.append(line).append("\n");
				line = buffReader.readLine();
			}
			fileAsString = sb.toString();
			System.out.println("");
			System.out.println("File read and parsed successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileAsString;

	}

}