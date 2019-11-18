package rctiplus;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class title {
	WebDriver driver;
	public title (WebDriver driver) {
		this.driver = driver;
	}
	
	public void cektitle() {
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println("Page Url : " + url);
		Assert.assertEquals(url, "https://rctiplus.com/");
		System.out.println("Page Title : " + title);
		Assert.assertEquals(title, "RCTI+ - Live Streaming Program 4 TV Terpopuler");
	}
}
