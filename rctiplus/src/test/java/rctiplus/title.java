package rctiplus;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class title {
	WebDriver driver;

	public title(WebDriver driver) {
		this.driver = driver;
	}

	public void cektitle() {
		String titlePage = "RCTI+ - Live Streaming Program 4 TV Terpopuler";
		String urlPage = "https://rctiplus.com/";
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		System.out.println("Page Url : " + url);
		Assert.assertEquals(url, urlPage);
		System.out.println("Page Title : " + title);
		Assert.assertEquals(title, titlePage);
	}
}
