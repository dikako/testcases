package rctiplus;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.Test;

import rctiplus.baseClass;
import rctiplus.live;

@Test
public class mainClass extends baseClass {
	@Test(priority = 0)
	public void cekTitle() throws InterruptedException {
		title page = new title(driver);
		driver.get("https://www.rctiplus.com/");
		page.cektitle();
	}
		
	@Test(priority = 1)
	public void cekLiveRcti() throws InterruptedException {
		live page = new live(driver);
		driver.get("https://rctiplus.com/tv/rcti");
		page.ceklive();
	}
	
	@Test(priority = 2)
	public void cekLiveMnc() throws InterruptedException {
		live page = new live(driver);
		driver.get("https://rctiplus.com/tv/mnctv");
		page.ceklive();
	}
	
	@Test(priority = 3)
	public void cekLiveGtv() throws InterruptedException {
		live page = new live(driver);
		driver.get("https://rctiplus.com/tv/gtv");
		page.ceklive();
	}
	
	@Test(priority = 4)
	public void cekLiveInews() throws InterruptedException {
		live page = new live(driver);
		driver.get("https://rctiplus.com/tv/inews");
		page.ceklive();
	}
	
	@Test(priority = 5)
	public void LiveChat() throws InterruptedException {
		livechat page = new livechat(driver);
		Thread.sleep(5000);
		page.liveChat();
	}
	
	@Test(priority = 6)
	public void TestAds() throws InterruptedException {
		ads page = new ads(driver);
		driver.get("https://rctiplus.com/tv/rcti");
		Thread.sleep(5000);
		page.testAds();
	}
	
	@Test(priority = 7)
	public void TestLink() throws InterruptedException, MalformedURLException, IOException {
		brokenlink page = new brokenlink(driver);
		driver.get("https://rctiplus.com/");
		page.testBrokenlink();
	}
	
	@Test(priority = 8)
	public void TestLinkExclusive() throws InterruptedException, MalformedURLException, IOException {
		brokenlink page = new brokenlink(driver);
		driver.get("https://rctiplus.com/exclusive");
		page.testBrokenlink();
	}
	
	@Test(priority = 9)
	public void TestLinkDaily() throws InterruptedException, MalformedURLException, IOException {
		brokenlink page = new brokenlink(driver);
		driver.get("https://rctiplus.com/daily");
		page.testBrokenlink();
	}
}
