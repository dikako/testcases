package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import rctiplus.login;

public class livechat {
	WebDriver driver;
	public livechat(WebDriver driver) {
		this.driver = driver;
	}
	
	public void liveChat() {
		login login = new login(driver);
		login.ceklogin();
		
		driver.get("https://rctiplus.com/tv/rcti");
		WebElement status = driver.findElement(By.xpath("//text()[.='Available']/ancestor::h5[1]"));
		assert status.getText().contains("Available");
		driver.findElement(By.cssSelector("div[placeholder='Type here to start chat ...']")).sendKeys("Mantab nih", Keys.ENTER);
		WebElement chat = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[6782]/p[1]"));
		assert chat.getText().contains("Mantab nih");
	}
}
