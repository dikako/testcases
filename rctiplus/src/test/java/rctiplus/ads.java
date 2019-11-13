package rctiplus;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ads {
	WebDriver driver;
	public ads(WebDriver driver) {
		this.driver = driver;
	}
	
	public void testAds() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		
		//Click on play button
		jse.executeScript("jwplayer().play();");
		Thread.sleep(300000);
		Boolean ads = driver.findElement(By.cssSelector("img[id='fta-live_vast_static']")).isDisplayed();
		System.out.println("Apakah iklan Tampil? " + (ads ? "" : "NOT ") + " Tampil");
		Assert.assertTrue(ads);
	}
}
