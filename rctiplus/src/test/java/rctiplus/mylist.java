package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class mylist {
	WebDriver driver;
	public mylist(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Verifmylist() {
		driver.get("https://rctiplus.com/login");
		driver.findElement(By.cssSelector("input[type=text][name='emailphone']")).sendKeys("dikakoko04@gmail.com", Keys.TAB);
		driver.findElement(By.cssSelector("input[type=password][name='password']")).sendKeys("dikakoko");
		driver.findElement(By.cssSelector("button[class='btn btn-sign']")).click();
		
		driver.get("https://rctiplus.com/programs/532/indonesian-idol-x");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[3]/li[1]/a[1]")).click();
		
		driver.get("https://rctiplus.com/users");
		driver.findElement(By.xpath("//text()[.='My List']/ancestor::a[1]")).click();
		
		assert driver.findElement(By.xpath("//h7[text()='Indonesian Idol X']")).getText().contains("Indonesian Idol X");
		
		driver.get("https://rctiplus.com/programs/532/indonesian-idol-x");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[3]/li[1]/a[1]")).click();
	}
}
