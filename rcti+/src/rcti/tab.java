package rcti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class tab {
	WebDriver driver;
	public tab (WebDriver driver) {
		this.driver = driver;
	}
	
	public void tabtest() throws Exception {
		
		Actions a = new Actions(driver); {
			a.moveToElement(driver.findElement(By.xpath("//a[text()='Gmail']"))).doubleClick().build().perform();
			
			a.contextClick(driver.findElement(By.xpath("//input[@type='email'][@name='identifier']"))).build().perform();
			Thread.sleep(2000);
			
		};
	}
}
