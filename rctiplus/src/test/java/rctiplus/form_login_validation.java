package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class form_login_validation {
	WebDriver driver;
	public form_login_validation (WebDriver driver) {
		this.driver = driver;
	}
	
	public void form_validation_login() {
		String mail = "dikakoko04@gmail.com";
		String pass = "dikakoko";
		
		//form kosong emailphone & password semua kosong
		WebElement emailphone = driver.findElement(By.xpath("//input[@type='text'][@name='emailphone']"));
		emailphone.clear();
		emailphone.sendKeys("");
		WebElement password = driver.findElement(By.xpath("//input[@type='password'][@name='password']"));
		password.clear();
		password.sendKeys("");
		WebElement button = driver.findElement(By.xpath("//button[text()='Sign In']"));
		button.click();
		
		//alert form kosong emailphone & password semua kosong
		WebElement alert_mailphone = driver.findElement(By.xpath("//small[text()='Please fill your phone number or email address here']"));
		assert alert_mailphone.getText().contains("Please fill your phone number or email address here");
		WebElement alert_pass = driver.findElement(By.xpath("//small[text()='Please enter your password']"));
		assert alert_pass.getText().contains("Please enter your password");
		
		//form emailphone kosong
		emailphone.clear();
		emailphone.sendKeys("");
		password.clear();
		password.sendKeys(pass);
		
		//alert form emailphone kosong
		assert alert_mailphone.getText().contains("Please fill your phone number or email address here");
		
		//form password kosong
		emailphone.clear();
		emailphone.sendKeys(mail);
		password.clear();
		password.sendKeys("");
		
		//alert password kosong
		assert alert_pass.getText().contains("Please enter your password");
		
		
	}
}
