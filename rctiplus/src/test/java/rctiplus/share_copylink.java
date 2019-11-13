package rctiplus;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class share_copylink {
	WebDriver driver;
	public share_copylink (WebDriver driver) {
		this.driver = driver;
	}

	public void cekshare_copylink() {
		driver.get("https://rctiplus.com/exclusive");
		WebElement copy = driver.findElement(By.xpath("//button[text()='Copy']"));
		copy.click();
		String hasil = copy.getText();
		System.out.println("Copy Link : " + hasil);
	}
}
