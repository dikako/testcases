package rctiplus;

import java.util.Set;
//import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import rctiplus.login_fb;

public class share_fb {
	WebDriver driver;
	public share_fb(WebDriver driver) {
		this.driver = driver;
	}
	
	public void cekshare_fb() throws InterruptedException {
		driver.get("https://rctiplus.com/");
		WebElement exclusive = driver.findElement(By.cssSelector("a[href='https://rctiplus.com/exclusive']"));
		exclusive.click();
		WebElement popup = driver.findElement(By.cssSelector("img[class='user-simple-share-icons share ']"));
		popup.click();
		String window = driver.getWindowHandle();
		System.out.println("Handle Windows : " + window);
		WebElement newWindow = driver.findElement(By.xpath("//div[@class='modal-overlay active']//li[1]//a[1]//img[1]"));
		newWindow.click();
		Set<String> winhandles = driver.getWindowHandles();
		for (String handle: winhandles) {
			if(!handle.equals(window)) {
				driver.switchTo().window(handle);
				Thread.sleep(10000);
			}
		}
		login_fb page_fb = new login_fb(driver);
		page_fb.Login_Fb();
		Thread.sleep(5000);
		WebElement id = driver.findElement(By.xpath("//textarea[@name='xhpc_message_text']"));
		id.sendKeys("8e72c5ad");
		driver.findElement(By.xpath("//span[text()='Kirim ke Facebook']")).click();
		driver.switchTo().window(window);
		System.out.println("Handle Windows : " + driver.getCurrentUrl());
		driver.get("https://www.facebook.com/profile.php?id=100010085881759");
		String valid = "8e72c5ad";
		WebElement cekid = driver.findElement(By.xpath("//p[text()='8e72c5ad']"));
		assert cekid.getText().contains(valid);
		System.out.println("Kode Content : " + valid);
	}
}
