package rctiplus;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class lupa_password {
	WebDriver driver;
	public lupa_password (WebDriver driver) {
		this.driver = driver;
	}

	public void cek_lupa_password() throws InterruptedException {
		String email = "dikakoko04@gmail.com";
		String pass = "dikakoko";
		//String pass_email = "04Nov1998**";
		String xpath_alert = "//div[contains(text(),'Succsess, Please check your email. Click the link in the email to reset your password (Please also check your Spam)')]";
		String alert = "Succsess, Please check your email. Click the link in the email to reset your password (Please also check your Spam)";
		driver.get("https://rctiplus.com/login");
		//Klik lupa password
		WebElement lupa = driver.findElement(By.xpath("//a[text()='Forgot Password?']"));
		lupa.click();
		assert driver.findElement(By.xpath("//h4[text()='Trouble Logging In?']")).getText().contains("Trouble Logging In?");
		WebElement emailphone = driver.findElement(By.xpath("//input[@type='text'][@name='emailphone']"));
		emailphone.sendKeys(email);
		WebElement sendlink = driver.findElement(By.xpath("//button[text()='Send Link']"));
		sendlink.click();
		Thread.sleep(5000);
		assert driver.findElement(By.xpath(xpath_alert)).getText().contains(alert);
		driver.get("http://gmail.com/");
		gmailobject go = PageFactory.initElements(driver, gmailobject.class);
		go.enterEmail("dikakoko04@gmail.com");
		go.enterPassword("04Nov1998**");
		go.clickEmail("Forgot Password from RCTI+");
		String window = driver.getWindowHandle();
		System.out.println("Handle Windows : " + window);		
		WebElement change_password = driver.findElement(By.xpath("//a[text()='Change Password']"));
		change_password.click();
		Set<String> winhandles = driver.getWindowHandles();
		for (String handle: winhandles) {
			if(!handle.equals(window)) {
				driver.switchTo().window(handle);
				Thread.sleep(10000);
			}
		}
		WebElement pass1 = driver.findElement(By.xpath("//input[@type='password'][@name='password']"));
		pass1.sendKeys(pass,Keys.TAB);
		WebElement pass2 = driver.findElement(By.xpath("//input[@type='password'][@name='password_confirmation']"));
		pass2.sendKeys(pass);
		WebElement next = driver.findElement(By.xpath("//button[text()='Next']"));
		next.click();
		String title = driver.getTitle();
		System.out.println("Page Title : " + title);
		Assert.assertEquals(title, "RCTI+ - Live Streaming Program 4 TV Terpopuler");	
	}
}
