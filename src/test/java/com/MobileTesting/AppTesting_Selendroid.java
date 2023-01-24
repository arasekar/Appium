package com.MobileTesting;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class AppTesting_Selendroid {

	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "12");
		capabilities.setCapability("deviceName", "Aravind's A22");
		capabilities.setCapability("udid", "192.168.29.92:5555");
		capabilities.setCapability("appPackage", "io.selendroid.testapp");
		capabilities.setCapability("appActivity", ".HomeScreenActivity");

		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url, capabilities);

		WebElement cont = driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
		cont.click();
		Thread.sleep(2000);
		WebElement ok = driver.findElement(By.id("android:id/button1"));
		ok.click();
		WebElement folder = driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration"));
		folder.click();
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("io.selendroid.testapp:id/inputUsername"));
		username.sendKeys("Aravind");
		WebElement email = driver.findElement(By.id("io.selendroid.testapp:id/inputEmail"));
		email.sendKeys("Aravind@gmail.com");
		WebElement password = driver.findElement(By.id("io.selendroid.testapp:id/inputPassword"));
		password.sendKeys("12345");
		WebElement name = driver.findElement(By.id("io.selendroid.testapp:id/inputName"));
		name.clear();
		name.sendKeys("Greens");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.id("io.selendroid.testapp:id/input_preferedProgrammingLanguage")).click();
		driver.findElement(By.xpath("//*[@text='Java']")).click();
		driver.findElement(By.id("io.selendroid.testapp:id/input_adds")).click();
		driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("io.selendroid.testapp:id/buttonRegisterUser")).click();
	}
}
