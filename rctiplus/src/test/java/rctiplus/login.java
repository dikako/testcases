package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class login {
	WebDriver driver;
	public login (WebDriver driver) {
		this.driver = driver;
	}
	
	public void ceklogin() {
		driver.get("https://rctiplus.com/login");
		driver.findElement(By.cssSelector("input[type=text][name='emailphone']")).clear();
		driver.findElement(By.cssSelector("input[type=text][name='emailphone']")).sendKeys("dikakoko04@gmail.com", Keys.TAB);
		driver.findElement(By.cssSelector("input[type=password][name='password']")).clear();
		driver.findElement(By.cssSelector("input[type=password][name='password']")).sendKeys("dikakoko");
		driver.findElement(By.cssSelector("button[class='btn btn-sign']")).click();
	}
}
