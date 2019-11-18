package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import rctiplus.chat;

public class livechat {
	WebDriver driver;
	public livechat(WebDriver driver) {
		this.driver = driver;
	}
	
	public void liveChat() {
		//variabel user & pass
		String user = "dikakoko04@gmail.com";
		String pass = "dikakoko";
		//Skenario Login Success
		driver.get("https://rctiplus.com/login");
		WebElement input_user = driver.findElement(By.cssSelector("input[type=text][name='emailphone']"));
		input_user.clear();
		input_user.sendKeys(user, Keys.TAB);
		System.out.println("Input User : " + user);
		WebElement input_pass = driver.findElement(By.cssSelector("input[type=password][name='password']"));
		input_pass.clear();
		input_pass.sendKeys(pass);
		System.out.println("Input Password : " + pass);
		WebElement klik_but = driver.findElement(By.cssSelector("button[class='btn btn-sign']"));
		klik_but.click();
		
		//Live RCTI
		driver.get("https://rctiplus.com/tv/rcti");
		String url_rcti = driver.getCurrentUrl();
		System.out.println("Live Chat On : " + url_rcti);
		chat page = new chat(driver);
		page.cek_chat();
		
//		//Live MNCTV
//		driver.get("https://rctiplus.com/tv/mnctv");
//		String url_mnctv = driver.getCurrentUrl();
//		System.out.println("Live Chat On : " + url_mnctv);
//		page.cek_chat();
//		
//		//Live MNCTV
//		driver.get("https://rctiplus.com/tv/gtv");
//		String url_gtv = driver.getCurrentUrl();
//		System.out.println("Live Chat On : " + url_gtv);
//		page.cek_chat();
//				
//		//Live MNCTV
//		driver.get("https://rctiplus.com/tv/inews");
//		String url_inews = driver.getCurrentUrl();
//		System.out.println("Live Chat On : " + url_inews);
//		page.cek_chat();
		
	}
}
