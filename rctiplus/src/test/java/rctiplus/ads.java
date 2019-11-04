package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ads {
	WebDriver driver;
	public ads(WebDriver driver) {
		this.driver = driver;
	}
	
	public void testAds() {
		driver.get("https://rc-ssr-new.rctiplus.com/");
		Boolean ads = driver.findElement(By.className("i-amphtml-fill-content i-amphtml-replaced-content")).isDisplayed();
		System.out.println("Apakah iklan Tampil? " + (ads ? "" : "NOT ") + " Tampil");
		Assert.assertTrue(ads);
//		Boolean ads = driver.findElement(By.cssSelector("img[id='vid-player_vast_static']")).isDisplayed();
//		System.out.println("Apakah iklan Tampil? " + (ads ? "" : "NOT ") + " Tampil");
//		Assert.assertTrue(ads);
		
		
	}
}
