package rctiplus;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class preroll_object {
	WebDriver driver;
	public preroll_object (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Preroll_Object() throws InterruptedException {
		
		WebElement preroll = driver.findElement(By.xpath("//span[text()='Loading ad']"));
		assert preroll.getText().contains("Loading ad");
		System.out.println("Prerol ?" + preroll);
		
	}
}
