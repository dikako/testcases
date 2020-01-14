package rctiplusandroidtest;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Rctiplus_Test {
	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		try {
			
		} catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}
	
	public static void openRctiplus() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		//Set Devices
		cap.setCapability("deviceName", "test");
		cap.setCapability("udid", "a9cae442");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.1.1");
		
		//Set App
		cap.setCapability("appPackage", "com.fta.rctitv");
		cap.setCapability("appActivity", "com.fta.rctitv.ui.main.MainActivity");
		
		//Test
		URL url = new URL("http://localhost:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url , cap);
		System.out.println("Application Started");
	}
}

