package rctiplus;

import java.util.Set;
//import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class share_fb {
	WebDriver driver;
	public share_fb(WebDriver driver) {
		this.driver = driver;
	}
	
	public void cekshare_fb() throws InterruptedException {
		//share fb
		driver.get("https://rctiplus.com/exclusive");
		WebElement popup = driver.findElement(By.cssSelector("img[class='user-simple-share-icons share ']"));
		popup.click();
		
		String window = driver.getWindowHandle();
		System.out.println("Handle Windows : " + window);
		WebElement newWindow = driver.findElement(By.cssSelector("img[src='https://rc-static.rctiplus.id/assets/image/elements/fb.png']"));
		newWindow.click();
		Set<String> winhandles = driver.getWindowHandles();
		for (String handle: winhandles) {
			if(!handle.equals(window)) {
				driver.switchTo().window(handle);
				Thread.sleep(10000);
			}
		}
		
		String getUrl = driver.getCurrentUrl();
		System.out.println("Share Facebook Url : " + getUrl);
		driver.findElement(By.xpath("//input[@type='text'][@name='email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][@name='email']")).sendKeys("dikakoko04@gmail.com");
		driver.findElement(By.xpath("//input[@type='password'][@name='pass']")).clear();
		driver.findElement(By.xpath("//input[@type='password'][@name='pass']")).sendKeys("Dikakoko04***");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		
		//Rundom Input
//		String arr[] = UUID.randomUUID().toString().split("-");
//		System.out.println("Content Id : " + arr[0]);
		WebElement id = driver.findElement(By.xpath("//textarea[@name='xhpc_message_text']"));
		id.sendKeys("8e72c5ad");
		driver.findElement(By.xpath("//span[text()='Kirim ke Facebook']")).click();
		
		driver.switchTo().window(window);
		System.out.println("Handle Windows : " + driver.getCurrentUrl());
		
		
		//Validate share work
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.xpath("//input[@type='email'][@name='email']")).clear();
//		driver.findElement(By.xpath("//input[@type='email'][@name='email']")).sendKeys("dikakoko04@gmail.com");
//		driver.findElement(By.xpath("//input[@type='password'][@name='pass']")).sendKeys("Dikakoko04***");
//		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		//driver.findElement(By.xpath("//span[text()='Fransiskus']")).click();
		driver.get("https://www.facebook.com/profile.php?id=100010085881759");
		String valid = "8e72c5ad";
		WebElement cekid = driver.findElement(By.xpath("//p[text()='8e72c5ad']"));
		assert cekid.getText().contains(valid);
		System.out.println("Kode Content : " + valid);
//		driver.findElement(By.xpath("//a[@id='u_0_3f']")).click();
//		driver.findElement(By.xpath("//span[text()='Hapus']")).click();
//		driver.findElement(By.xpath("//button[text()='Hapus']")).click();
	}
}
