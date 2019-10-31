package rctiplus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mylist {
	WebDriver driver;
	public mylist(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Verifmylist() {
		driver.get("https://rctiplus.com");
		WebElement content = driver.findElement(By.cssSelector("div[class='box-content']"));
		content.get(new Random().nextInt(content.size())).click();
	}
}
