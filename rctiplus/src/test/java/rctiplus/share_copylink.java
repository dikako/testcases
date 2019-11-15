package rctiplus;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class share_copylink {
	WebDriver driver;
	public share_copylink (WebDriver driver) {
		this.driver = driver;
	}

	public void cekshare_copylink() throws InterruptedException {
		driver.get("https://rctiplus.com/exclusive");
		WebElement popup = driver.findElement(By.cssSelector("img[class='user-simple-share-icons share ']"));
		popup.click();
		
		String window = driver.getWindowHandle();
		System.out.println("Handle Windows : " + window);
		WebElement copy = driver.findElement(By.xpath("//button[text()='Copy']"));
		copy.click();
		
		Set<String> winhandles = driver.getWindowHandles();
		for (String handle: winhandles) {
			if(!handle.equals(window)) {
				driver.switchTo().window(handle);
				Thread.sleep(10000);
			}
		}
		
		WebElement url_bar = driver.findElement(By.xpath("/html[1]/body[1]"));
		url_bar.sendKeys(Keys.chord(Keys.CONTROL, "l"));
		url_bar.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		url_bar.sendKeys(Keys.chord(Keys.ENTER));
		String url_keys = driver.getCurrentUrl();
		System.out.println("Ini Url yang di Copy : " + url_keys);
	}
}
