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
	public void Cek_Login() throws InterruptedException {
		login page = new login(driver);
		driver.get("https://rctiplus.com/login");
		page.ceklogin();
	}
	
	@Test(priority = 2)
	public void Cek_Login_Gagal() throws InterruptedException {
		login_gagal page = new login_gagal(driver);
		driver.get("https://rctiplus.com/login");
		page.cek_login_gagal();
	}
	
	@Test(priority = 3)
	public void Cekformvalidation_login() throws InterruptedException {
		form_login_validation page = new form_login_validation(driver);
		driver.get("https://rctiplus.com/login");
		page.form_validation_login();
	}
	
	@Test(priority = 4)
	public void Cek_Edit_Profile() throws InterruptedException {
		edit_profile page = new edit_profile(driver);
		driver.get("https://rctiplus.com/login");
		page.cek_edit_profile();
	}
		
	@Test(priority = 5)
	public void cekLive() throws InterruptedException {
		live page = new live(driver);
		driver.get("https://rctiplus.com/");
		page.ceklive();
	}

	//Masih error
	@Test(priority = 9)
	public void LiveChat() throws InterruptedException {
		livechat page = new livechat(driver);
		page.liveChat();
	}

////	@Test(priority = 10)
////	public void TestAds() throws InterruptedException {
////		cek_ads_banner page = new cek_ads_banner(driver);
////		driver.get("https://rctiplus.com/");
////		page.Cek_Ads_Banner();
////	}
//	
////////	@Test(priority = 11)
////////	public void TestLink() throws InterruptedException, MalformedURLException, IOException {
////////		brokenlink page = new brokenlink(driver);
////////		driver.get("https://rctiplus.com/");
////////		page.testBrokenlink();
////////	}
////////	
////////	@Test(priority = 12)
////////	public void TestLinkExclusive() throws InterruptedException, MalformedURLException, IOException {
////////		brokenlink page = new brokenlink(driver);
////////		driver.get("https://rctiplus.com/exclusive");
////////		page.testBrokenlink();
////////	}
////////	
////////	@Test(priority = 13)
////////	public void TestLinkDaily() throws InterruptedException, MalformedURLException, IOException {
////////		brokenlink page = new brokenlink(driver);
////////		driver.get("https://rctiplus.com/daily");
////////		page.testBrokenlink();
////////	}
////	
	@Test(priority = 11)
	public void MyList() throws InterruptedException {
		mylist page = new mylist(driver);
		page.Verifmylist();
	}
	
	@Test(priority = 12)
	public void CekExclusive() throws InterruptedException {
		exclusive page = new exclusive(driver);
		driver.get("https://rctiplus.com");
		page.cekexclusive();
	}
	
	@Test(priority = 13)
	public void CekShare_fb() throws InterruptedException {
		share_fb page = new share_fb(driver);
		page.cekshare_fb();
	}
	
	//belum ditst
	@Test(priority = 14)
	public void CekShare_twitter() throws InterruptedException {
		share_twitter page = new share_twitter(driver);
		page.cekshare_twitter();
	}
//	
////////	@Test(priority = 14)
////////	public void CekShare_wa() throws InterruptedException {
////////		share_wa page = new share_wa(driver);
////////		page.cekshare_wa();
////////	}
////////	
////////	@Test(priority = 15)
////////	public void CekShare_email() throws InterruptedException {
////////		share_email page = new share_email(driver);
////////		page.cekshare_email();
////////	}
////////	
////////	@Test (priority = 16)
////////	public void CekShare_line() throws InterruptedException {
////////		share_line page = new share_line(driver);
////////		page.cekshare_line();
////////	}
//////	
////////	@Test(priority = 17)
////////	public void CekShare_copylink() throws InterruptedException {
////////		share_copylink page = new share_copylink(driver);
////////		page.cekshare_copylink();
////////	}
////	
	
	@Test(priority = 15)
	public void CekTrending() throws InterruptedException {
		trending page = new trending(driver);
		driver.get("https://rctiplus.com");
		page.cektrending();
	}
	
////////	@Test(priority = 16)
////////	public void Cek_Duplicated() throws InterruptedException {
////////		duplicated page = new duplicated(driver);
////////		driver.get("https://rctiplus.com");
////////		page.cek_duplicated();
////////	}
////////	
////	
	
	@Test(priority = 17)
	public void Cek_Lupa_Password() throws InterruptedException {
		lupa_password page = new lupa_password(driver);
		page.cek_lupa_password();
	}
	
	//belum ditest
	@Test(priority = 18)
	public void Cek_Explore() throws InterruptedException {
		explore page = new explore(driver);
		driver.get("https://rctiplus.com/");
		page.cek_explore();
	}

	@Test(priority = 23)
	public void Cek_Program() throws InterruptedException {
		program page = new program(driver);
		driver.get("https://rctiplus.com/");
		page.cek_program();
	}
	
	@Test(priority = 24) 
	public void Cek_Vod_Homepage() throws InterruptedException {
		vod_homepage page = new vod_homepage(driver);
		driver.get("https://rctiplus.com/");
		page.cek_vod_homepage();
	}
	
	@Test(priority = 25)
	public void Cek_History() throws InterruptedException {
		history page = new history(driver);
		page.cek_history();
	}
	
////	@Test(priority = 0)
////	public void testcapat() throws InterruptedException {
////		testcapat page = new testcapat(driver);
////		page.testtttt();
////	}
////	
////	@Test(priority = 0)
////	public void testLogin() throws InterruptedException {
////		SP_LoginNew page = new SP_LoginNew(driver);
////		page.testLogin();
////	}
////	
////	@Test(priority = 1)
////	public void testLogin1() throws InterruptedException {
////		SN_LoginNew page = new SN_LoginNew(driver);
////		page.TestLogin1();
////		driver.close();
////	}
////	
////	@Test(priority = 2)
////	public void testLogin2() throws InterruptedException {
////		SN_LoginNew page = new SN_LoginNew(driver);
////		page.TestLogin2();
////		driver.close();
////	}
////	
////	@Test(priority = 3)
////	public void testLogin3() throws InterruptedException {
////		SN_LoginNew page = new SN_LoginNew(driver);
////		page.TestLogin3();
////		driver.close();
////	}
////	
////	@Test(priority = 4)
////	public void testLogin4() throws InterruptedException {
////		SN_LoginNew page = new SN_LoginNew(driver);
////		page.TestLogin4();
////		driver.close();
////	}
////	
////	@Test(priority = 5)
////	public void testLogin5() throws InterruptedException {
////		SN_LoginNew page = new SN_LoginNew(driver);
////		page.TestLogin5();
////		driver.close();
////	}
////	
////	@Test(priority = 6)
////	public void testLogin6() throws InterruptedException {
////		SN_LoginNew page = new SN_LoginNew(driver);
////		page.TestLogin6();
////		driver.close();
////	}
////	
////	@Test(priority = 7)
////	public void testLogin7() throws InterruptedException {
////		SN_LoginNew page = new SN_LoginNew(driver);
////		page.TestLogin7();
////		driver.close();
////	}
}