package com.MobileTesting;

import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Scroll_Myntra {
	
	public static AndroidDriver driver;

	public static void main(String[] args) throws Throwable {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		UiAutomator2Options options=new UiAutomator2Options()
//				.setPlatformName("Android")
//				.setPlatformVersion("12")
//				.setDeviceName("Aravind's A22")
//				.setUdid("192.168.29.92:5555")
//				.setAppPackage("com.myntra.android")
//				.setAppActivity(".SplashActivity")
//				.setNoReset(true)
//				.setFullReset(false);
		
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "12");
		capabilities.setCapability("deviceName", "Aravind's A22");
		capabilities.setCapability("udid", "192.168.29.92:5555");
		capabilities.setCapability("appPackage", "com.myntra.android");
		capabilities.setCapability("appActivity", ".SplashActivity");
		capabilities.setCapability("noReset", "true");
		capabilities.setCapability("fullReset", "false");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url, capabilities);
		//driver = new AndroidDriver(url, options);
		
		Dimension size = driver.manage().window().getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println("Height is: "+height);
		System.out.println("Width is: "+width);
		
		Thread.sleep(7000);
		
		PointerInput finger=new PointerInput(PointerInput.Kind.TOUCH,"finger");
		
		Sequence swipe1=new Sequence(finger,1);
		swipe1.addAction(finger.createPointerMove(Duration.ofSeconds(0),PointerInput.Origin.viewport(), 587, 1300));
		swipe1.addAction(finger.createPointerDown(0));
		swipe1.addAction(finger.createPointerMove(Duration.ofMillis(500),PointerInput.Origin.viewport(), 513, 694));
		swipe1.addAction(finger.createPointerUp(0));
		driver.perform(Arrays.asList(swipe1));
		
		Thread.sleep(2000);
		
		Sequence swipe2=new Sequence(finger,1);
		swipe2.addAction(finger.createPointerMove(Duration.ofSeconds(0),PointerInput.Origin.viewport(), 578, 1105));
		swipe2.addAction(finger.createPointerDown(0));
		swipe2.addAction(finger.createPointerMove(Duration.ofMillis(500),PointerInput.Origin.viewport(), 185, 1092));
		swipe2.addAction(finger.createPointerUp(0));
		driver.perform(Arrays.asList(swipe2));
		
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"search\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"search_default_search_text_input\"]"));
		Actions action=new Actions(driver);
		action.sendKeys("Jeans men").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc=\"image_image_container\"])[2]/android.widget.ImageView")).click();
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"buy_button\"]/android.view.ViewGroup")).click();
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"size_select_1\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).click();
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"buy_done_button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"buy_button\"]/android.view.ViewGroup")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[6]/android.view.View/android.widget.Button")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.widget.Button")).click();
	}

}
