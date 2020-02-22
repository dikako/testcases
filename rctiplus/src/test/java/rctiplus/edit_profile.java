package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import rctiplus.editprofileobject;
import rctiplus.loginobject;

public class edit_profile {
	WebDriver driver;

	public edit_profile(WebDriver driver) {
		this.driver = driver;
	}

	public void cek_edit_profile() throws InterruptedException {

		// Skenario Login Success
		loginobject page_login = new loginobject(driver);
		page_login.login_object();

		// Edit Profile
		WebElement dot = driver.findElement(By.xpath("//a[@id='navbarDropdownMenuLink']"));
		dot.click();
		WebElement edit = driver.findElement(By.xpath("//a[text()='Edit Profile']"));
		edit.click();

		// Edit Fullname
		editprofileobject page = new editprofileobject(driver);
		page.fulname();

		// Edit ttl
		page.ttl();

		// Edit jk
		page.jk();

		// Edit Lokasi
		page.lokasi();

		// Edit Fullname & Ttl
		page.fulname();
		page.ttl();

		// Edit Ttl & Jk
		page.ttl();
		page.jk();

		// Edit jk & Lokasi
		page.jk();
		page.lokasi();

		// Edit Fullname & jk
		page.fulname();
		page.jk();

		// Edit fullname & lokasi
		page.fulname();
		page.lokasi();

		// Edit ttl & lokasi
		page.ttl();
		page.lokasi();

		// Edit fulname,ttl,jk
		page.fulname();
		page.ttl();
		page.jk();

		// Edit semuanya
		page.fulname();
		page.ttl();
		page.jk();
		page.lokasi();

	}

}
