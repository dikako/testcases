package mobile.ssr;

import org.testng.annotations.Test;
import mobile.ssr.baseClass;

@Test
public class mainClass extends baseClass {
	@Test(priority = 0)
	public void Cekurl_Redirect() throws InterruptedException {
		url_redirect page = new url_redirect(driver);
		page.cekurl_redirect();
	}	
}
