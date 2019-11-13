package rctiplus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class exclusive {
	WebDriver driver;
	public exclusive (WebDriver driver) {
		this.driver = driver;
	}
	
	public void cekexclusive() {
		//Klik Exclusive
		driver.findElement(By.xpath("//a[text()='EXCLUSIVE']")).click();
		String url_exclusive = driver.getCurrentUrl();
		Assert.assertEquals(url_exclusive, "https://rctiplus.com/exclusive");
		System.out.println("Exclusive Url : " + url_exclusive);
		exclusive konten = new exclusive(driver);
		konten.cekImgCount();
		 
		//Klik Clip
		driver.findElement(By.xpath("//h2[text()='Clip']")).click();
		String url_clip = driver.getCurrentUrl();
		Assert.assertEquals(url_clip, "https://rctiplus.com/exclusive/clip");
		System.out.println("Clip Url : " + url_clip);
		konten.cekImgCount();
		
		//Klik Photo
		driver.findElement(By.xpath("//h2[text()='Photo']")).click();
		String url_photo = driver.getCurrentUrl();
		Assert.assertEquals(url_photo, "https://rctiplus.com/exclusive/photo");
		System.out.println("Photo Url : " + url_photo);
		konten.cekImgCount();
		
		//Klik Entertainment
		driver.findElement(By.xpath("//h2[text()='Entertainment']")).click();
		String url_entertainment = driver.getCurrentUrl();
		Assert.assertEquals(url_entertainment, "https://rctiplus.com/exclusive/entertainment");
		System.out.println("Entertainment Url : " + url_entertainment);
		konten.cekImgCount();
		
		//Klik News
		driver.findElement(By.xpath("//h2[text()='News']")).click();
		String url_news = driver.getCurrentUrl();
		Assert.assertEquals(url_news, "https://rctiplus.com/exclusive/news");
		System.out.println("News Url : " + url_news);
		konten.cekImgCount();
		
		//Klik Bloopers
		driver.findElement(By.xpath("//h2[text()='Bloopers']")).click();
		String url_bloopers = driver.getCurrentUrl();
		Assert.assertEquals(url_bloopers, "https://rctiplus.com/exclusive/bloopers");
		System.out.println("Bloopers Url : " + url_bloopers);
		konten.cekImgCount();
		
		//Klik BTS
		driver.findElement(By.xpath("//h2[text()='Behind The Scenes']")).click();
		String url_bts = driver.getCurrentUrl();
		Assert.assertEquals(url_bts, "https://rctiplus.com/exclusive/behind-the-scenes");
		System.out.println("BTS Url : " + url_bts);
		konten.cekImgCount();
		
	}
	
	
	//Cek jumlah konten
	public void cekImgCount() {
		List<WebElement> imglist = driver.findElements(By.cssSelector("img[class='user-simple-line-icons']"));
		System.out.println("Jumlah Konten : " + imglist.size());
		
	}
}
