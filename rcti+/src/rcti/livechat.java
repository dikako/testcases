package rcti;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class livechat {
	WebDriver driver;
	public livechat(WebDriver driver) {
		this.driver = driver;
	}
	
	public void liveChat() {
		driver.get("https://rctiplus.com/login");
		driver.findElement(By.cssSelector("input[type=text][name='emailphone']")).sendKeys("dikakoko04@gmail.com", Keys.TAB);
		driver.findElement(By.cssSelector("input[type=password][name='password']")).sendKeys("lkjhgfdsa");
		driver.findElement(By.cssSelector("button[class='btn btn-sign']")).click();
		driver.get("https://rctiplus.com/tv/rcti");
		driver.findElement(By.cssSelector("div[placeholder='Type here to start chat ...']")).sendKeys("Mantab nih", Keys.ENTER);
	}
}
