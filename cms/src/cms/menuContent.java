package cms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class menuContent {
	WebDriver driver;
	public menuContent(WebDriver driver) {
		this.driver = driver;
	}
	
	public void content() {
		driver.findElement(By.xpath("//input[@type='text'][@name='username']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][@name='username']")).sendKeys("user_content");
		driver.findElement(By.xpath("//input[@type='password'][@name='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password'][@name='password']")).sendKeys("login123");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		
		driver.findElement(By.xpath("//span[text()='CONTENT']")).click();
		assert driver.findElement(By.xpath("//span[text()='HOMEPAGE']")).getText().contains("HOMEPAGE");
		assert driver.findElement(By.xpath("//span[text()='EPISODE']")).getText().contains("EPISODE");
		assert driver.findElement(By.xpath("//span[text()='EXTRA']")).getText().contains("EXTRA");
		assert driver.findElement(By.xpath("//span[text()='CLIP']")).getText().contains("CLIP");
		assert driver.findElement(By.xpath("//span[text()='PHOTO']")).getText().contains("PHOTO");
		assert driver.findElement(By.xpath("//span[text()='SPECIAL']")).getText().contains("SPECIAL");
		
		
	}
}
