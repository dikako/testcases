package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

		WebElement liveTv = driver.findElement(By.cssSelector("a[href='https://rctiplus.com/tv/rcti']"));
		liveTv.click();
		Thread.sleep(2000);
		//Click on play button
		Thread.sleep(30000); // waktu tunggu 30s
		WebElement status = driver.findElement(By.xpath("//h5[@id='status-chat']"));
		assert status.getText().contains("Available");
		WebElement test_chat = driver.findElement(By.cssSelector("div[placeholder='Type here to start chat ...']"));
		test_chat.sendKeys("Mantab nih", Keys.ENTER);
		Thread.sleep(5000);
		WebElement chat = driver.findElement(By.cssSelector("*[class='sent btn-block']	"));
		assert chat.getText().contains("Mantab nih");
		System.out.println("Isi Chat : " + "Mantab nih");
	}
}
