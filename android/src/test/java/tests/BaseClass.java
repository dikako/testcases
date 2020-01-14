package tests;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	AppiumDriver<WebElement> driver;
	
	@BeforeTest
	public void setup() {
		try {
		DesiredCapabilities caps  = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "test");
		caps.setCapability(MobileCapabilityType.UDID, "a9cae442");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		//caps.setCapability(MobileCapabilityType.APP, "");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		URL run = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<WebElement>(run, caps);
		//driver = new AndroidDriver<WebElement>(run, caps);
		//driver = new IOSDriver<WebElement>(run, caps);
		
		} catch(Exception e) {
			System.out.println("Cause is : " + e.getCause());
			System.out.println("Message is : " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	public void test() {
		System.out.println("This Im");
	}
	
	@AfterTest
	public void setdown() {
		
	}
}
