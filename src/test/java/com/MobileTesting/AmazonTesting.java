package com.MobileTesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AmazonTesting {
	
	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		
		UiAutomator2Options options=new UiAutomator2Options()
				.setPlatformName("Android")
				.setPlatformVersion("12")
				.setDeviceName("Aravind's A22")
				.setUdid("192.168.29.92:5555")
				.setAppPackage("com.myntra.android")
				.setAppActivity(".SplashActivity")
				.setNoReset(true)
				.setFullReset(false);
				
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url, options);
	}

}
