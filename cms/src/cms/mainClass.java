package cms;

import org.testng.annotations.Test;

@Test
public class mainClass extends baseClass {
//	@Test(priority = 0)
//	public void Title() throws InterruptedException {
//		cekTitle page = new cekTitle(driver);
//		driver.get("https://rc-cms.mncplus.com/");
//		page.title();
//	}
//	@Test(priority = 1)
//	public void Login() throws InterruptedException {
//		cekLogin page = new cekLogin(driver);
//		driver.get("https://rc-cms.mncplus.com/");
//		page.login();
//	}
//	@Test(priority = 2)
//	public void Content() throws InterruptedException {
//		menuContent page = new menuContent(driver);
//		driver.get("https://rc-cms.mncplus.com/");
//		page.content();
//	}
//	@Test(priority = 3)
//	public void Homepage() throws InterruptedException {
//		homepages page = new homepages(driver);
//		driver.get("https://rc-cms.mncplus.com/");
//		page.homepage();
//	}
	@Test(priority = 0)
	public void testvid() throws InterruptedException {
		video page = new video(driver);
		driver.get("https://rctiplus.com/tv/mnctv/41848/mahabharata?date=2019-10-17");
		page.videotest();
	}
}
