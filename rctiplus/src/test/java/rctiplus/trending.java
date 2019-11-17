package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class trending {
	WebDriver driver;
	public trending (WebDriver driver) {
		this.driver = driver;
	}
	
	public void cektrending() {
		WebElement trending = driver.findElement(By.xpath("//a[text()='TRENDING']"));
		trending.click();
		
		WebElement berita = driver.findElement(By.xpath("//h2[text()='Berita Terkini']"));
		berita.click();
		String valid_url1 = driver.getCurrentUrl();
		Assert.assertEquals(valid_url1, "https://rctiplus.com/trending/1/berita-terkini");
		System.out.println("1. Berita Terkini Url : " + valid_url1);
		
		WebElement hiburan = driver.findElement(By.xpath("//h2[text()='Hiburan']"));
		hiburan.click();
		String valid_url2 = driver.getCurrentUrl();
		Assert.assertEquals(valid_url2, "https://rctiplus.com/trending/2/hiburan");
		System.out.println("2. Hiburan Url : " + valid_url2);
		
		WebElement gaya_hidup = driver.findElement(By.xpath("//h2[text()='Gaya Hidup']"));
		gaya_hidup.click();
		String valid_url3 = driver.getCurrentUrl();
		Assert.assertEquals(valid_url3, "https://rctiplus.com/trending/3/gaya-hidup");
		System.out.println("3. Gaya Hidup Url : " + valid_url3);
		
		WebElement olahraga = driver.findElement(By.xpath("//h2[text()='Olah Raga']"));
		olahraga.click();
		String valid_url4 = driver.getCurrentUrl();
		Assert.assertEquals(valid_url4, "https://rctiplus.com/trending/4/olah-raga");
		System.out.println("4. Olahraga Url : " + valid_url4);
		
		WebElement kesehatan = driver.findElement(By.xpath("//h2[text()='Kesehatan']"));
		kesehatan.click();
		String valid_url5 = driver.getCurrentUrl();
		Assert.assertEquals(valid_url5, "https://rctiplus.com/trending/6/kesehatan");
		System.out.println("5. Kesehatan Url : " + valid_url5);
	}
}
