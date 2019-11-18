package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import rctiplus.editprofileobject;

public class edit_profile {
	WebDriver driver;
	public edit_profile (WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * 
	 */
	public void cek_edit_profile() {
		//variabel user & pass
		String user = "dikakoko04@gmail.com";
		String pass = "dikakoko";
		
		//Skenario Login Success
		WebElement input_user = driver.findElement(By.cssSelector("input[type=text][name='emailphone']"));
		input_user.clear();
		input_user.sendKeys(user, Keys.TAB);
		System.out.println("Input User : " + user);
		WebElement input_pass = driver.findElement(By.cssSelector("input[type=password][name='password']"));
		input_pass.clear();
		input_pass.sendKeys(pass);
		System.out.println("Input Password : " + pass);
		WebElement klik_but = driver.findElement(By.cssSelector("button[class='btn btn-sign']"));
		klik_but.click();
		
		//Assert login Success
		String email_user = "dikakoko04@gmail.com";
		WebElement login_success = driver.findElement(By.xpath("//li[text()='dikakoko04@gmail.com']"));
		login_success.getText().contains(email_user);
		System.out.println("Login Sukses Untuk email : " + email_user);
		
		//Edit Profile
		WebElement dot = driver.findElement(By.xpath("//img[@src='https://rc-static.rctiplus.id/assets/image/elements/dotbtutton.png']"));
		dot.click();
		WebElement edit = driver.findElement(By.xpath("//a[text()='Edit Profile']"));
		edit.click();
		
		//Edit Fullname
		editprofileobject page = new editprofileobject(driver);
		page.fulname();
		
		//Edit ttl
		page.ttl();
		
		//Edit jk
		page.jk();
		
		//Edit Lokasi
		page.lokasi();
		
		//Edit Fullname & Ttl
		page.fulname();
		page.ttl();
		
		//Edit Ttl & Jk
		page.ttl();
		page.jk();
		
		//Edit jk & Lokasi
		page.jk();
		page.lokasi();
		
		//Edit Fullname & jk
		page.fulname();
		page.jk();
		
		//Edit fullname & lokasi
		page.fulname();
		page.lokasi();
		
		//Edit ttl & lokasi
		page.ttl();
		page.lokasi();
		
		//Edit fulname,ttl,jk
		page.fulname();
		page.ttl();
		page.jk();
		
		//Edit semuanya
		page.fulname();
		page.ttl();
		page.jk();
		page.lokasi();
		
	}
	
}
