package rctiplus;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ads_banner {
	WebDriver driver;
	public ads_banner(WebDriver driver) {
		this.driver = driver;
	}
	
	public void testAds() throws InterruptedException {
		Boolean ads = driver.findElement(By.cssSelector("img[id='fta-live_vast_static']")).isDisplayed();
		System.out.println("Apakah iklan Tampil? " + (ads ? "" : "NOT ") + " Tampil");
		Assert.assertTrue(ads);
	}
}
