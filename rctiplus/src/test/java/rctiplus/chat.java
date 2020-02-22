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

	public void cek_chat() throws InterruptedException {
		String input_chat = "Mantab nih";
		WebElement status = driver.findElement(By.xpath("//h5[@id='status-chat']"));
		assert status.getText().contains("Available");
		WebElement test_chat = driver.findElement(By.cssSelector("div[placeholder='Type here to start chat ...']"));
		test_chat.sendKeys("Mantab nih", Keys.ENTER);
		Thread.sleep(5000);
		WebElement chat = driver.findElement(By.xpath("//p[contains(text(),'Mantab nih')]"));
		assert chat.getText().contains(input_chat);
		System.out.println("Isi Chat : " + input_chat);
	}
}
