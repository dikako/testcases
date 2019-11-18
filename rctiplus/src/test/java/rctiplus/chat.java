package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class chat {
	WebDriver driver;
	public chat (WebDriver driver) {
		this.driver = driver;
	}
	
	public void cek_chat() {
		String input_chat = "Mantab nih";
		WebElement status = driver.findElement(By.xpath("//text()[.='Available']/ancestor::h5[1]"));
		assert status.getText().contains("Available");
		driver.findElement(By.cssSelector("div[placeholder='Type here to start chat ...']")).sendKeys("Mantab nih", Keys.ENTER);
		WebElement chat = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[6782]/p[1]"));
		assert chat.getText().contains(input_chat);
		System.out.println("Isi Chat : " + input_chat);
	}
}
