package com.MobileTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class AppTesting_Calc 
{
	public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException 
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
		
//		String currentPackage = driver.getCurrentPackage();
//		System.out.println(currentPackage);
//		System.out.println(driver.currentActivity());
		
//		WebElement seven = driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
//		WebElement add = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
//		WebElement nine = driver.findElement(By.id("com.google.android.calculator:id/digit_9"));
//		WebElement equalto = driver.findElement(By.id("com.google.android.calculator:id/eq"));
		
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
		
		}
	}
