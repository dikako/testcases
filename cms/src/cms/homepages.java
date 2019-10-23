package cms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepages {
	WebDriver driver;
	public homepages(WebDriver driver) {
		this.driver = driver;
	}
	public void homepage() {
		driver.findElement(By.xpath("//input[@type='text'][@name='username']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][@name='username']")).sendKeys("user_content");
		driver.findElement(By.xpath("//input[@type='password'][@name='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password'][@name='password']")).sendKeys("login123");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		
		driver.findElement(By.xpath("//span[text()='CONTENT']")).click();
		driver.findElement(By.xpath("//span[text()='HOMEPAGE']")).click();
		assert driver.findElement(By.xpath("//text()[contains(.,'Homepage')]/ancestor::a[1]")).getText().contains("Homepage");
		assert driver.findElement(By.xpath("//text()[contains(.,'Banner')]/ancestor::a[1]")).getText().contains("Banner");
		assert driver.findElement(By.xpath("//text()[contains(.,'Live Streaming')]/ancestor::a[1]")).getText().contains("Live Streaming");
		assert driver.findElement(By.xpath("//text()[contains(.,'Genre')]/ancestor::a[1]")).getText().contains("Genre");
		assert driver.findElement(By.xpath("//text()[contains(.,'Extra Type')]/ancestor::a[1]")).getText().contains("Extra Type");
		assert driver.findElement(By.xpath("//text()[contains(.,'Category')]/ancestor::a[1]")).getText().contains("Category");
	}
}
