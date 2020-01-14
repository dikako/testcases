package rctiplus;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class share_twitter {
	WebDriver driver;
	public share_twitter (WebDriver driver) {
		this.driver = driver;
	}

	public void cekshare_twitter() throws InterruptedException {
		//share twitter
		driver.get("https://rctiplus.com/exclusive");
		WebElement popup = driver.findElement(By.cssSelector("img[class='user-simple-share-icons share ']"));
		popup.click();
		
		String window = driver.getWindowHandle();
		System.out.println("Handle Windows : " + window);
		WebElement newWindow = driver.findElement(By.xpath("//div[@class='modal-overlay active']//li[2]//a[1]//img[1]"));
		newWindow.click();
		Set<String> winhandles = driver.getWindowHandles();
		for (String handle: winhandles) {
			if(!handle.equals(window)) {
				driver.switchTo().window(handle);
				Thread.sleep(10000);
			}
		}
		String getUrl = driver.getCurrentUrl();
		System.out.println("Share Twitter Url : " + getUrl);
		WebElement id = driver.findElement(By.cssSelector("textarea[name='status']"));
		id.sendKeys(" 8e72c5ad ", Keys.TAB);
		WebElement username = driver.findElement(By.xpath("//input[@type='text'][@name='session[username_or_email]']"));
		username.clear();
		username.sendKeys("KoDikako", Keys.TAB);
		WebElement password = driver.findElement(By.xpath("//input[@type='password'][@name='session[password]']"));
		password.clear();
		password.sendKeys("04Nov1998**", Keys.ENTER);
		WebElement twet = driver.findElement(By.xpath("//input[@type='submit'][@value='Tweet']"));
		twet.click();
		driver.switchTo().window(window);
		System.out.println("Handle Windows : " + driver.getCurrentUrl());
		driver.get("https://twitter.com/KoDikako");
		String valid = "8e72c5ad";
		WebElement cekid = driver.findElement(By.xpath("//span[text()='8e72c5ad']"));
		assert cekid.getText().contains(valid);
		System.out.println("Kode Content : " + valid);
	}
}
