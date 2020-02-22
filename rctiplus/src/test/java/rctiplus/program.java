package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class program {
	WebDriver driver;
	public program (WebDriver driver) {
		this.driver = driver;
	}
	
	public void cek_program() throws InterruptedException {
		WebElement banner = driver.findElement(By.cssSelector("img[class='img-fix']"));
		banner.click();
		liveobject page = new liveobject(driver);
		page.live_object();
	}
}
