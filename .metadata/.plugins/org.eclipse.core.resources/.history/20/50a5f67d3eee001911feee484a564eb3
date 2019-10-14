package cms;

import org.testng.annotations.Test;

@Test
public class mainClass extends baseClass {
	@Test(priority = 0)
	public void Title() throws InterruptedException {
		cekTitle page = new cekTitle(driver);
		driver.get("https://rc-cms.mncplus.com/");
		page.title();
	}
	@Test(priority = 1)
	public void Login() throws InterruptedException {
		cekLogin page = new cekLogin(driver);
		driver.get("https://rc-cms.mncplus.com/");
		page.login();
	}
	@Test(priority = 2)
	public void Content() throws InterruptedException {
		menuContent page = new menuContent(driver);
		driver.get("https://rc-cms.mncplus.com/");
		page.content();
	}
}
