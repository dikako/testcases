package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import rctiplus.loginobject;
public class history {
	WebDriver driver;
	public history (WebDriver driver) {
		this.driver = driver;
	}
	public void cek_history() throws InterruptedException {
		String vod = "Lyodra Jago Nyanyi Melayu !";
		String url_video = "https://rctiplus.com/programs/568/live-chat-plus/episode/6786/lyodra-jago-nyanyi-melayu";
		String url_user = "https://rctiplus.com/users";
		String url_login = "https://rctiplus.com/login";
		driver.get(url_login);
		loginobject page_login = new loginobject(driver);
		page_login.login_object();
		driver.get(url_video);
		liveobject page = new liveobject(driver);
		page.live_object();
		Thread.sleep(10000);
		String url_v = driver.getCurrentUrl();
		System.out.println("Url Video : " + url_v);
		driver.get(url_user);
		Thread.sleep(10000);
		WebElement klikHistory = driver.findElement(By.cssSelector("a[href='https://rctiplus.com/users/history']"));
		klikHistory.click();
		Thread.sleep(5000);
		WebElement cek_cw = driver.findElement(By.xpath("//li[text()='Lyodra Jago Nyanyi Melayu !']"));
		assert cek_cw.getText().contains(vod);
		WebElement klik_history = driver.findElement(By.xpath("//a[contains(text(),'History')]"));
		klik_history.click();
		WebElement cek_history = driver.findElement(By.xpath("//li[text()='Lyodra Jago Nyanyi Melayu !']"));
		assert cek_history.getText().contains(vod);
		WebElement delete_all = driver.findElement(By.xpath("//a[contains(text(),'Delete All')]"));
		delete_all.click();	
//		List<WebElement> list = (List<WebElement>) driver.findElement(By.xpath("img[class='lazy']"));
//		System.out.println(list.size());	
	}
}
