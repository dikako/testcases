package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SP_Register {
	WebDriver driver;

	public SP_Register(WebDriver driver) {
		this.driver = driver;
	}
	
	public void TestLogin1() throws InterruptedException {
		driver.get("http://149.129.235.143/login");
		Thread.sleep(4000);
		WebElement un = driver.findElement(By.xpath("//input[@type='text'][@name='username']"));
		un.sendKeys("dikakoko.com");
		Thread.sleep(4000);
		WebElement pw = driver.findElement(By.xpath("//input[@type='password'][@name='password']"));
		pw.sendKeys("ekjfhejfhdjgh");
		Thread.sleep(4000);
		WebElement bt = driver.findElement(By.xpath("//button[text()='Log In']"));
		bt.click();
		
		WebElement valid = driver.findElement(By.cssSelector("*[class='text-danger']"));
		assert valid.getText().contains("Please try again, email is incorrect");
		
	}
}
