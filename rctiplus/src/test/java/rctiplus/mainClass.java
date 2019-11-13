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
	
	@Test(priority = 10)
	public void MyList() throws InterruptedException {
		mylist page = new mylist(driver);
		page.Verifmylist();
	}
	
	@Test(priority = 11)
	public void CekExclusive() throws InterruptedException {
		exclusive page = new exclusive(driver);
		driver.get("https://rctiplus.com");
		page.cekexclusive();
	}
	
	@Test(priority = 12)
	public void CekShare_fb() throws InterruptedException {
		share_fb page = new share_fb(driver);
		page.cekshare_fb();
	}
	
	@Test(priority = 13)
	public void CekShare_twitter() throws InterruptedException {
		share_twitter page = new share_twitter(driver);
		page.cekshare_twitter();
	}
	
//	@Test(priority = 14)
//	public void CekShare_wa() throws InterruptedException {
//		share_wa page = new share_wa(driver);
//		page.cekshare_wa();
//	}
//	
//	@Test(priority = 15)
//	public void CekShare_email() throws InterruptedException {
//		share_email page = new share_email(driver);
//		page.cekshare_email();
//	}
//	
//	@Test (priority = 16)
//	public void CekShare_line() throws InterruptedException {
//		share_line page = new share_line(driver);
//		page.cekshare_line();
//	}
	
	@Test(priority = 17)
	public void CekShare_copylink() throws InterruptedException {
		share_copylink page = new share_copylink(driver);
		page.cekshare_copylink();
	}
}