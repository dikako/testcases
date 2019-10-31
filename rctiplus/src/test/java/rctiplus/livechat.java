package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class livechat {
	WebDriver driver;
	public livechat(WebDriver driver) {
		this.driver = driver;
	}
	
	public void liveChat() {
		driver.get("https://rctiplus.com/login");
		driver.findElement(By.cssSelector("input[type=text][name='emailphone']")).sendKeys("dikakoko04@gmail.com", Keys.TAB);
		driver.findElement(By.cssSelector("input[type=password][name='password']")).sendKeys("dikakoko");
		driver.findElement(By.cssSelector("button[class='btn btn-sign']")).click();
		
		driver.get("https://rctiplus.com/tv/rcti");
		WebElement status = driver.findElement(By.xpath("//text()[.='Available']/ancestor::h5[1]"));
		assert status.getText().contains("Available");
		driver.findElement(By.cssSelector("div[placeholder='Type here to start chat ...']")).sendKeys("Mantab nih", Keys.ENTER);
		WebElement chat = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[6782]/p[1]"));
		assert chat.getText().contains("Mantab nih");
	}
}
