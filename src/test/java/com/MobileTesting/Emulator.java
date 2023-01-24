package com.MobileTesting;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.GsmCallActions;

public class Emulator {
	
	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		
		capabilities.setCapability("platformName", "Android" );
		capabilities.setCapability("udid", "emulator-5554");
		capabilities.setCapability("app","C:\\Users\\aravi\\eclipse-workspace\\java\\Appium\\src\\test\\resources\\apks\\com.google.android.calculator_7.8.com.apk");
		
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		driver=new AndroidDriver(url,capabilities);
		
		driver.openNotifications();
		driver.getBatteryInfo();
		driver.makeGsmCall("9566127067", GsmCallActions.CALL);
	}
}
