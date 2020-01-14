package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import rctiplus.liveobject;
public class live {
	WebDriver driver;
	public live (WebDriver driver) {
		this.driver = driver;
	}
	public void ceklive() throws InterruptedException {
		WebElement klik_live = driver.findElement(By.xpath("//a[contains(text(),'LIVE TV')]"));
		klik_live.click();
		
		liveobject page_live = new liveobject(driver);
		page_live.live_object();
		
		WebElement klik_mnc = driver.findElement(By.cssSelector("img[src='https://rctiplus.com/assets/image/elements/logo-mnctv.png']"));
		klik_mnc.click();
		page_live.live_object();
		
		WebElement klik_gtv = driver.findElement(By.cssSelector("img[src='https://rctiplus.com/assets/image/elements/logo-gtv.png']"));
		klik_gtv.click();
		page_live.live_object();
		
		WebElement klik_i = driver.findElement(By.cssSelector("img[src='https://rctiplus.com/assets/image/elements/logo-inews.png']"));
		klik_i.click();
		page_live.live_object();
	}
}
