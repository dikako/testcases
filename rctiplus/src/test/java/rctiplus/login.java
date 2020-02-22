package rctiplus;

import org.openqa.selenium.WebDriver;
import rctiplus.loginobject;
import rctiplus.logoutobject;

public class login {
	WebDriver driver;

	public login(WebDriver driver) {
		this.driver = driver;
	}

	public void ceklogin() throws InterruptedException {
		loginobject page_login = new loginobject(driver);
		page_login.login_object();

		logoutobject page_logout = new logoutobject(driver);
		page_logout.logout_object();

	}
}
