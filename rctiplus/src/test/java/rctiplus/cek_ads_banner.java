package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import rctiplus.ads_banner;

public class cek_ads_banner {
	WebDriver driver;
	public cek_ads_banner (WebDriver driver) {
		this.driver = driver;
	}
	public void Cek_Ads_Banner() throws InterruptedException {
		ads_banner page_banner = new ads_banner(driver);
		WebElement klik_live = driver.findElement(By.xpath("//a[contains(text(),'LIVE TV')]"));
		klik_live.click();
		Thread.sleep(300000);//Waktu tunggu 5 menit
		page_banner.testAds();
		WebElement klik_mnc = driver.findElement(By.cssSelector("img[src='https://rctiplus.com/assets/image/elements/logo-mnctv.png']"));
		klik_mnc.click();
		Thread.sleep(300000);//Waktu tunggu 5 menit
		page_banner.testAds();
		WebElement klik_gtv = driver.findElement(By.cssSelector("img[src='https://rctiplus.com/assets/image/elements/logo-gtv.png']"));
		klik_gtv.click();
		Thread.sleep(300000);//Waktu tunggu 5 menit
		page_banner.testAds();
		WebElement klik_i = driver.findElement(By.cssSelector("img[src='https://rctiplus.com/assets/image/elements/logo-inews.png']"));
		klik_i.click();
		Thread.sleep(300000);//Waktu tunggu 5 menit
		page_banner.testAds();
	}
}
