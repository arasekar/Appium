package com.MobileTesting;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class ApiDemoLongPress {
	
		public static AndroidDriver driver;
		public static AppiumDriverLocalService service;
		public static String appiumJsPath = "C:\\Users\\aravi\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";
		public static String ipAddress = "0.0.0.0";
		public static String basepath = "/wd/hub/";
		public static int port = 4723;
		public static String logFilePath = "C:\\Users\\aravi\\OneDrive\\Desktop\\Testing Course Docs\\Appium";
		public static String platformName = "Android";
		public static String platFormVersion = "13";
		public static String udid = "RZ8RA0YTD4P";
		public static String deviceName = "Aravind's A22";
		public static String appPackage = "io.appium.android.apis";
		public static String appActivity = "io.appium.android.apis.ApiDemos";
		
		public static void main(String[] args) throws MalformedURLException {
			
					service=new AppiumServiceBuilder().withAppiumJS(new File(appiumJsPath))
					.withIPAddress(ipAddress)
					.withArgument(GeneralServerFlag.BASEPATH, basepath) //if its uiautomator2 then this line is not required
					.usingPort(port)
					.withLogFile(new File(logFilePath))
					.build();
					
					service.start();
					
					System.out.println("Appium started");
					
					
					UiAutomator2Options option = new UiAutomator2Options()
							.setPlatformName(platformName)
							.setPlatformVersion(platFormVersion)
							.setUdid(udid)
							.setDeviceName(deviceName)
							.setAppPackage(appPackage)
							.setAppActivity(appActivity);
					
					URL url = new URL("http://0.0.0.0:4723/wd/hub");
					driver = new AndroidDriver(url, option);
	}

}
