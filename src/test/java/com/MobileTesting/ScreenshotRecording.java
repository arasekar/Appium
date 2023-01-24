package com.MobileTesting;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.screenrecording.CanRecordScreen;

public class ScreenshotRecording {
	
public static AndroidDriver driver;
	
	public static void main(String[] args) throws IOException 
	{
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android" );
		capabilities.setCapability("platformVersion","12");
		capabilities.setCapability("deviceName", "Aravind's A22");
		capabilities.setCapability("udid", "192.168.29.92:5555");
		capabilities.setCapability("appPackage","com.google.android.calculator");
		capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
		
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		driver=new AndroidDriver(url,capabilities);
		
		((CanRecordScreen) driver).startRecordingScreen();
	
		WebElement five = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
		WebElement pi = driver.findElement(By.id("com.google.android.calculator:id/const_pi"));
		WebElement multiply = driver.findElement(By.id("com.google.android.calculator:id/op_mul"));
		WebElement five1 = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
		WebElement pi1 = driver.findElement(By.id("com.google.android.calculator:id/const_pi"));
		WebElement equalto = driver.findElement(By.id("com.google.android.calculator:id/eq"));
		
		five.click();
		pi.click();
		multiply.click();
		five1.click();
		pi1.click();
		equalto.click();
		
		String timestanp1=new Timestamp(System.currentTimeMillis()).toString().replaceAll("[^0-9]","_");
		String stopRecordingScreen = ((CanRecordScreen)driver).stopRecordingScreen();
		byte[] decodeVideo = Base64.getMimeDecoder().decode(stopRecordingScreen);
		Path testVideodir = Paths.get(System.getProperty("user.dir")+"/Videos");
		Files.createDirectories(testVideodir);
		Path testVideoFileLocation = Paths.get(testVideodir.toString(),String.format("%s-%s.%s", "Test",timestanp1,"mp4"));
		Files.write(testVideoFileLocation, decodeVideo);
		
		String timestanp=new Timestamp(System.currentTimeMillis()).toString().replaceAll("[^0-9]","_");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\aravi\\eclipse-workspace\\java\\Appium\\src\\screenshot\\"+timestanp+".png");
		FileUtils.copyFile(source, destination);
		
	}
}
