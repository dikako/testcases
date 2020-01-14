package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginobject {
	WebDriver driver;
	public loginobject (WebDriver driver) {
		this.driver = driver;
	}
	
	public void login_object() {
		//Get Url
		String url = driver.getCurrentUrl();
		System.out.println("Login Url : " + url);
		//variabel user & pass
		String user = "dikakoko04@gmail.com";
		String pass = "dikakoko";
				
		//Skenario Login Success
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
		String url_user = driver.getCurrentUrl();
		System.out.println("Url User : " + url_user);
				
		//Assert login Success
		String email_user = "dikakoko04@gmail.com";
		WebElement login_success = driver.findElement(By.xpath("//li[text()='dikakoko04@gmail.com']"));
		login_success.getText().contains(email_user);
		System.out.println("Login Sukses Untuk email : " + email_user);
	}
}
