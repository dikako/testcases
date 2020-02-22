package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SP_LoginNew {
	WebDriver driver;
	public SP_LoginNew(WebDriver driver) {
		this.driver = driver;
	}
	
	public void testLogin() throws InterruptedException {
		String unam = "dikakoko04@gmail.com";
		String pass = "dikakoko";
		driver.get("http://149.129.235.143/login");
		Thread.sleep(4000);
		WebElement un = driver.findElement(By.xpath("//input[@type='text'][@name='username']"));
		un.sendKeys(unam);
		Thread.sleep(4000);
		WebElement pw = driver.findElement(By.xpath("//input[@type='password'][@name='password']"));
		pw.sendKeys(pass);
		Thread.sleep(4000);
		WebElement bt = driver.findElement(By.xpath("//button[text()='Log In']"));
		bt.click();
		Thread.sleep(4000);
		
		driver.get("http://149.129.235.143/users");
		Thread.sleep(4000);
		
		WebElement em = driver.findElement(By.xpath("//li[text()='dikakoko04@gmail.com']"));
		assert em.getText().contains(unam);
		
		WebElement dd_logout = driver.findElement(By.xpath("//a[@id='navbarDropdownMenuLink']"));
		dd_logout.click();
		
		WebElement logout = driver.findElement(By.xpath("//a[text()='Sign Out']"));
		logout.click();
	}
}
