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
		String mail_null = "";
		String pass_null = "";
		
		//form kosong emailphone & password semua kosong
		WebElement emailphone = driver.findElement(By.xpath("//input[@type='text'][@name='emailphone']"));
		emailphone.clear();
		emailphone.sendKeys(mail_null);
		System.out.println("Input User : " + mail_null);
		WebElement password = driver.findElement(By.xpath("//input[@type='password'][@name='password']"));
		password.clear();
		password.sendKeys(pass_null);
		System.out.println("Input Pass : " + pass_null);
		WebElement button = driver.findElement(By.xpath("//button[text()='Sign In']"));
		button.click();
		
		//alert form kosong emailphone & password semua kosong
		WebElement alert_mailphone = driver.findElement(By.xpath("//small[text()='Please fill your phone number or email address here']"));
		assert alert_mailphone.getText().contains("Please fill your phone number or email address here");
		String alert_mailkosong = alert_mailphone.getText();
		System.out.println("Alert User Kosong : " + alert_mailkosong);
		WebElement alert_pass = driver.findElement(By.xpath("//small[text()='Please enter your password']"));
		assert alert_pass.getText().contains("Please enter your password");
		String alert_passkosong = alert_pass.getText();
		System.out.println("Alert Pass Kosong : " + alert_passkosong);
		
		//form emailphone kosong
		WebElement emailphone_1 = driver.findElement(By.xpath("//input[@type='text'][@name='emailphone']"));
		emailphone_1.clear();
		emailphone_1.sendKeys(mail_null);
		System.out.println("Input User : " + mail_null);
		WebElement password_1 = driver.findElement(By.xpath("//input[@type='password'][@name='password']"));
		password_1.clear();
		password_1.sendKeys(pass);
		System.out.println("Input Pass : " + pass);
		WebElement button_1 = driver.findElement(By.xpath("//button[text()='Sign In']"));
		button_1.click();
		
		//alert form emailphone kosong
		WebElement alert_mailphone1 = driver.findElement(By.xpath("//small[text()='Please fill your phone number or email address here']"));
		assert alert_mailphone1.getText().contains("Please fill your phone number or email address here");
		String alert_mailkosong1 = alert_mailphone1.getText();
		System.out.println("Alert User Kosong : " + alert_mailkosong1);
		
		//form password kosong
		WebElement emailphone_2 = driver.findElement(By.xpath("//input[@type='text'][@name='emailphone']"));
		emailphone_2.clear();
		emailphone_2.sendKeys(mail);
		System.out.println("Input User : " + mail);
		WebElement password_3 = driver.findElement(By.xpath("//input[@type='password'][@name='password']"));
		password_3.clear();
		password_3.sendKeys(pass_null);
		System.out.println("Input Pass : " + pass_null);
		WebElement button_3 = driver.findElement(By.xpath("//button[text()='Sign In']"));
		button_3.click();
		
		//alert password kosong
		WebElement alert_pass1 = driver.findElement(By.xpath("//small[text()='Please enter your password']"));
		assert alert_pass1.getText().contains("Please enter your password");
		String alert_passkosong2 = alert_pass1.getText();
		System.out.println("Alert Pass Kosong : " + alert_passkosong2);
		
		
	}
}
