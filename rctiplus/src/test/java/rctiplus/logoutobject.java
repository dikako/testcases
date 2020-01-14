package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class logoutobject {
	WebDriver driver;
	public logoutobject (WebDriver driver) {
		this.driver = driver;
	}
	
	public void logout_object() {
		//Logout
		WebElement dot = driver.findElement(By.xpath("//a[@id='navbarDropdownMenuLink']"));
		dot.click();
		WebElement logout = driver.findElement(By.xpath("//a[text()='Sign Out']"));
		logout.click();
		
		String logout_url = driver.getCurrentUrl();
		Assert.assertEquals(logout_url, logout_url);
		System.out.println("Logout Url : " + logout_url);
	}
}
