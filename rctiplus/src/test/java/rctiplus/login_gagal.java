package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login_gagal {
	WebDriver driver;
	public login_gagal (WebDriver driver) {
		this.driver = driver;
	}
	
	public void cek_login_gagal () {
		//Get Url
		String url = driver.getCurrentUrl();
		System.out.println("Login Url : " + url);
		
		//variabel user & pass
		String user = "dikakoko04@gmail.com";
		String pass = "passwordsalah";
		
		//Skenario Login Gagal
		WebElement input_user = driver.findElement(By.cssSelector("input[type=text][name='emailphone']"));
		input_user.clear();
		input_user.sendKeys(user, Keys.TAB);
		System.out.println("Input User : " + user);
		WebElement input_pass = driver.findElement(By.cssSelector("input[type=password][name='password']"));
		input_pass.clear();
		input_pass.sendKeys(pass);
		System.out.println("Input Password : " + pass);
		WebElement klik_but = driver.findElement(By.cssSelector("button[class='btn btn-sign']"));
		klik_but.click();
		
		//Assert login Success
		String alert = "Wrong Email/Phone Number or Password, Try again or click forgot password to recover your account";
		WebElement login_success = driver.findElement(By.xpath("//div[text()='Wrong Email/Phone Number or Password, Try again or click forgot password to recover your account']"));
		login_success.getText().contains(alert);
		System.out.println("Alert : " + alert);
	}
}
