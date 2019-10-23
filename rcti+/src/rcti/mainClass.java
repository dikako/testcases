package rcti;

import org.testng.annotations.Test;

@Test
public class mainClass extends baseClass {
//	@Test(priority = 0)
//	public void cekTitle() throws InterruptedException {
//		title page = new title(driver);
//		driver.get("https://www.rctiplus.com/");
//		page.cektitle();
//	}
//	
//	@Test(priority = 1)
//	public void cekHomepage() throws InterruptedException {
//		home page = new home(driver);
//		driver.get("https://www.rctiplus.com/");
//		page.cekhomepage();
//	}
//	
//	@Test(priority = 2)
//	public void cekLiveRcti() throws InterruptedException {
//		live page = new live(driver);
//		driver.get("https://rctiplus.com/tv/rcti");
//		page.ceklive();
//	}
//	
//	@Test(priority = 3)
//	public void cekLiveMnc() throws InterruptedException {
//		live page = new live(driver);
//		driver.get("https://rctiplus.com/tv/mnctv");
//		page.ceklive();
//	}
//	
//	@Test(priority = 4)
//	public void cekLiveGtv() throws InterruptedException {
//		live page = new live(driver);
//		driver.get("https://rctiplus.com/tv/gtv");
//		page.ceklive();
//	}
	
	@Test(priority = 5)
	public void cekLiveInews() throws InterruptedException {
		live page = new live(driver);
		driver.get("https://rctiplus.com/tv/inews");
		page.ceklive();
	}
	
//	@Test(priority = 6)
//	public void LiveChat() throws InterruptedException {
//		livechat page = new livechat(driver);
//		Thread.sleep(2000);
//		page.liveChat();
//	}
}
