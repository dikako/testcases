package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import rctiplus.liveobject;
public class vod_homepage {
	WebDriver driver;
	public vod_homepage (WebDriver driver) {
		this.driver = driver;
	}

	public void cek_vod_homepage() throws InterruptedException {
		WebElement click_vod = driver.findElement(By.cssSelector("img[class='ico-play-2 ']"));
		click_vod.click();
		liveobject page = new liveobject(driver);
		page.live_object();
		
		//Klik Download
//		WebElement download = driver.findElement(By.xpath("//img[@src='https://rc-static.rctiplus.id/assets/image/elements/svg/download.svg']"));
//		download.click();
//		String xpath_title = "//div[contains(@class, 'title')]/h2";
//		WebElement title_content = driver.findElement(By.xpath(xpath_title));
//		String title_text = title_content.getText();
//		Assert.assertEquals(title_text, title_text);
//		System.out.println("Alert : " + title_text);
//		WebElement close = driver.findElement(By.xpath("//a[text()='Close']"));
//		close.click();
//		String url_vod = driver.getCurrentUrl();
//		WebElement add_list = driver.findElement(By.xpath("//span[text()='Add to My List']"));
//		add_list.click();
//		
//		//Login
//		loginobject page_login = new loginobject(driver);
//		page_login.login_object();
//		driver.get(url_vod);
//		WebElement add_lists = driver.findElement(By.xpath("//span[text()='Add to My List']"));
//		add_lists.click();
//		WebElement validate = driver.findElement(By.xpath("//span[text()='My List']"));
//		validate.getText();
//		Assert.assertEquals(validate, validate);
//		
//		//semula
//		WebElement semula = driver.findElement(By.xpath("//span[text()='My List']"));
//		semula.click();
//		WebElement semula_validate = driver.findElement(By.xpath("//span[text()='Add to My List']"));
//		semula_validate.getText();
//		Assert.assertEquals(semula_validate, semula_validate);
	}
}
