package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.ios.IOSDriver;


public class main {
	
	
	
	public static void main(String args[]) { 	
		
		 WebDriver driver = null;
		 
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability("platformName", "iOS");
//		 capabilities.setCapability("udid", "1232123123131231");
		 capabilities.setCapability("deviceName", "iPhone Simulator");
		 capabilities.setCapability("noReset", true);
		 capabilities.setCapability("fastReset", true);
		 capabilities.setCapability("platformVersion", "11.3");
		 capabilities.setCapability("bundleId", "com.natsu.AppiumDemo");
		 capabilities.setCapability("automationName", "XCUITest");
		 
		 //driver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);e('http://localhost:4723/wd/hub',
		 try {
			driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"AppiumDemo\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTextField[1]")).sendKeys("admin");			
			driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"AppiumDemo\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTextField[2]")).sendKeys("123456");
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"登录\"]")).click();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} 
	} 
}
