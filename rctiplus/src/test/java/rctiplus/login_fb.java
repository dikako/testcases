package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_fb {
	WebDriver driver;
	public login_fb (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Login_Fb() {
		String getUrl = driver.getCurrentUrl();
		System.out.println("Share Facebook Url : " + getUrl);
		driver.findElement(By.xpath("//input[@type='text'][@name='email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][@name='email']")).sendKeys("dikakoko04@gmail.com");
		driver.findElement(By.xpath("//input[@type='password'][@name='pass']")).clear();
		driver.findElement(By.xpath("//input[@type='password'][@name='pass']")).sendKeys("Dikakoko04****");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	}
}
