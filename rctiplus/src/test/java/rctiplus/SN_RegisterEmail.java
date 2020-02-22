package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SN_RegisterEmail {
	WebDriver driver;
	public SN_RegisterEmail(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Register_P() {
		
		String email = "";
		String password = "";
		String emailAllert = "";
		driver.get("");
		
		WebElement inputEmail = driver.findElement(By.xpath("//input[@type='email'][@name='email']"));
		inputEmail.clear();
		inputEmail.sendKeys("");
		WebElement inputPassword = driver.findElement(By.xpath("//input[@type='password'][@name='password']"));
		inputPassword.clear();
		inputPassword.sendKeys("");
		WebElement reinputPassword = driver.findElement(By.xpath("//input[@type='password'][@name='password_confirmation']"));
		reinputPassword.clear();
		reinputPassword.sendKeys("");
		WebElement buttonNext = driver.findElement(By.xpath("//button[text()='Next']"));
		buttonNext.click();
		
//		// Validate
//		WebElement emailAlert = driver.findElement(By.xpath("//small[text()='Please enter your email correctly']"));
//		emailAlert.getText().contains(arg0)
	}
}
