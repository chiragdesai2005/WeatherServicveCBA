package com.weather;

import java.io.File;

import junit.framework.Assert;

import org.junit.Test;

import com.weather.common.Utility;

@SuppressWarnings("deprecation")
/**
 * Test case to run end to end logic and check resultant file is generated
 * 
 * 
 */
public class WeatherServiceTest {
	@Test
	public void testGenerateOutputFile() throws Exception {
		WeatherServiceClient weatherServiceClient = new WeatherServiceClient();
		weatherServiceClient.doProcess();
		File f = new File(Utility.getInstsnace().getFileName());
		System.out.println(f.exists());
		Assert.assertTrue(f.exists());
	}
}