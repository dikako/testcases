package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SN_LoginNew {
	WebDriver driver;

	public SN_LoginNew(WebDriver driver) {
		this.driver = driver;
	}

	public void TestLogin1() throws InterruptedException {
		driver.get("http://149.129.235.143/login");
		Thread.sleep(4000);
		WebElement un = driver.findElement(By.xpath("//input[@type='text'][@name='username']"));
		un.sendKeys("");
		Thread.sleep(4000);
		WebElement pw = driver.findElement(By.xpath("//input[@type='password'][@name='password']"));
		pw.sendKeys("");
		Thread.sleep(4000);
		WebElement bt = driver.findElement(By.xpath("//button[text()='Log In']"));
		Assert.assertFalse(bt.isEnabled());
	}

	public void TestLogin2() throws InterruptedException {
		driver.get("http://149.129.235.143/login");
		Thread.sleep(4000);
		WebElement un = driver.findElement(By.xpath("//input[@type='text'][@name='username']"));
		un.sendKeys("");
		Thread.sleep(4000);
		WebElement pw = driver.findElement(By.xpath("//input[@type='password'][@name='password']"));
		pw.sendKeys("dikakoko");
		Thread.sleep(4000);
		WebElement bt = driver.findElement(By.xpath("//button[text()='Log In']"));
		Assert.assertFalse(bt.isEnabled());
	}

	public void TestLogin3() throws InterruptedException {
		driver.get("http://149.129.235.143/login");
		Thread.sleep(4000);
		WebElement un = driver.findElement(By.xpath("//input[@type='text'][@name='username']"));
		un.sendKeys("dikakoko04@gmail.com");
		Thread.sleep(4000);
		WebElement pw = driver.findElement(By.xpath("//input[@type='password'][@name='password']"));
		pw.sendKeys("");
		Thread.sleep(4000);
		WebElement bt = driver.findElement(By.xpath("//button[text()='Log In']"));
		Assert.assertFalse(bt.isEnabled());
	}

	public void TestLogin4() throws InterruptedException {
		driver.get("http://149.129.235.143/login");
		Thread.sleep(4000);
		WebElement un = driver.findElement(By.xpath("//input[@type='text'][@name='username']"));
		un.sendKeys("dikakoko04.com");
		Thread.sleep(4000);
		WebElement pw = driver.findElement(By.xpath("//input[@type='password'][@name='password']"));
		pw.sendKeys("salahpassword");
		Thread.sleep(4000);
		WebElement bt = driver.findElement(By.xpath("//button[text()='Log In']"));
		Assert.assertTrue(bt.isEnabled());
		bt.click();

		WebElement valid = driver.findElement(By.cssSelector("*[class='text-danger']"));
		assert valid.getText().contains("Please try again, email is incorrect");
	}

	public void TestLogin5() throws InterruptedException {
		driver.get("http://149.129.235.143/login");
		Thread.sleep(4000);
		WebElement un = driver.findElement(By.xpath("//input[@type='text'][@name='username']"));
		un.sendKeys("dikakoko04@gmail.com");
		Thread.sleep(4000);
		WebElement pw = driver.findElement(By.xpath("//input[@type='password'][@name='password']"));
		pw.sendKeys("salahpassword");
		Thread.sleep(4000);
		WebElement bt = driver.findElement(By.xpath("//button[text()='Log In']"));
		Assert.assertTrue(bt.isEnabled());
		bt.click();

		WebElement valid = driver.findElement(By.cssSelector("*[class='text-danger']"));
		assert valid.getText().contains("Please Try Again Password Is Incorrect");
	}

	public void TestLogin6() throws InterruptedException {
		driver.get("http://149.129.235.143/login");
		Thread.sleep(4000);
		WebElement un = driver.findElement(By.xpath("//input[@type='text'][@name='username']"));
		un.sendKeys("dikakoko04gfghghf@gmail.com");
		Thread.sleep(4000);
		WebElement pw = driver.findElement(By.xpath("//input[@type='password'][@name='password']"));
		pw.sendKeys("salahpassword");
		Thread.sleep(4000);
		WebElement bt = driver.findElement(By.xpath("//button[text()='Log In']"));
		Assert.assertTrue(bt.isEnabled());
		bt.click();
		
		WebElement valid = driver.findElement(By.xpath("//div[text()='Invalid, User Has Not Been Registered']"));
		valid.getText().contains("Invalid, User Has Not Been Registered");
	}
	
	public void TestLogin7() throws InterruptedException {
		driver.get("http://149.129.235.143/login");
		Thread.sleep(4000);
		WebElement un = driver.findElement(By.xpath("//input[@type='text'][@name='username']"));
		un.sendKeys("dikakoko04@gmail.com");
		Thread.sleep(4000);
		WebElement pw = driver.findElement(By.xpath("//input[@type='password'][@name='password']"));
		pw.sendKeys("salahpassword");
		Thread.sleep(4000);
		WebElement bt = driver.findElement(By.xpath("//button[text()='Log In']"));
		Assert.assertTrue(bt.isEnabled());
		bt.click();

		WebElement valid = driver.findElement(By.cssSelector("*[class='text-danger']"));
		assert valid.getText().contains("Password must at least be 8 character");
	}

}
