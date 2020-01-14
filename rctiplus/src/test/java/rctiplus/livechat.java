package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import rctiplus.chat;
import rctiplus.loginobject;

public class livechat {
	WebDriver driver;
	public livechat(WebDriver driver) {
		this.driver = driver;
	}
	
	public void liveChat() throws InterruptedException {
		driver.get("https://rctiplus.com/login");
		loginobject page_login = new loginobject(driver);
		page_login.login_object();
		
		driver.get("https://rctiplus.com/login");
		WebElement klik_live = driver.findElement(By.xpath("//a[contains(text(),'LIVE TV')]"));
		klik_live.click();
		Thread.sleep(30000); //waktu tunggu 30s 
		chat page = new chat(driver);
		page.cek_chat();
		WebElement klik_mnc = driver.findElement(By.cssSelector("img[src='https://rctiplus.com/assets/image/elements/logo-mnctv.png']"));
		klik_mnc.click();
		Thread.sleep(30000); //waktu tunggu 30s 
		chat page_mnc = new chat(driver);
		page_mnc.cek_chat();
		WebElement klik_gtv = driver.findElement(By.cssSelector("img[src='https://rctiplus.com/assets/image/elements/logo-gtv.png']"));
		klik_gtv.click();
		Thread.sleep(30000); //waktu tunggu 30s 
		chat page_gtv = new chat(driver);
		page_gtv.cek_chat();
		WebElement klik_i = driver.findElement(By.cssSelector("img[src='https://rctiplus.com/assets/image/elements/logo-inews.png']"));
		klik_i.click();
		Thread.sleep(30000); //waktu tunggu 30s 
		chat page_i = new chat(driver);
		page_i.cek_chat();
	}
}
