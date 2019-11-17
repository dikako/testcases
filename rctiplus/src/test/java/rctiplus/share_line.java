package rctiplus;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class share_line {
	WebDriver driver;
	public share_line (WebDriver driver) {
		this.driver = driver;
	}
	
	public void cekshare_line() throws InterruptedException {
		//share line
		driver.get("https://rctiplus.com/exclusive");
		WebElement popup = driver.findElement(By.cssSelector("img[class='user-simple-share-icons share ']"));
		popup.click();
		
		String window = driver.getWindowHandle();
		System.out.println("Handle Windows : " + window);
		WebElement newWindow = driver.findElement(By.cssSelector("img[src='https://rc-static.rctiplus.id/assets/image/elements/line.png']"));
		newWindow.click();
		Set<String> winhandles = driver.getWindowHandles();
		for (String handle: winhandles) {
			if(!handle.equals(window)) {
				driver.switchTo().window(handle);
				Thread.sleep(10000);
			}
		}
		
		String getUrl = driver.getCurrentUrl();
		System.out.println("Share Line Url : " + getUrl);
		WebElement username = driver.findElement(By.xpath("//input[@type='text'][@name='tid']"));
		username.clear();
		username.sendKeys("dikakoko04@gmail.com", Keys.TAB);
		WebElement password = driver.findElement(By.xpath("//input[@type='password'][@name='tpasswd']"));
		password.clear();
		password.sendKeys("04Nov1998**", Keys.TAB);
		WebElement twet = driver.findElement(By.xpath("//button[text()='Log in']"));
		twet.click();
		WebElement txt = driver.findElement(By.xpath("//textarea[@placeholder='Enter your comment.']"));
		txt.sendKeys(" 8e72c5ad ");
		WebElement btn = driver.findElement(By.xpath("//button[text()='Timeline']"));
		btn.click();
		WebElement shr = driver.findElement(By.xpath("//span[text()='Public']"));
		shr.click();
		WebElement btn_share = driver.findElement(By.xpath("//button[text()='Send']"));
		btn_share.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
//		driver.switchTo().window(window);
//		System.out.println("Handle Windows : " + driver.getCurrentUrl());
//		
//		driver.get("https://twitter.com/KoDikako");
//		String valid = "8e72c5ad";
//		WebElement cekid = driver.findElement(By.xpath("//span[text()='8e72c5ad']"));
//		assert cekid.getText().contains(valid);
//		System.out.println("Kode Content : " + valid);
	}
}
