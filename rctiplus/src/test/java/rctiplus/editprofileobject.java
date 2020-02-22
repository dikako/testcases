package rctiplus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class editprofileobject {
	WebDriver driver;
	public editprofileobject(WebDriver driver) {
		this.driver = driver;
	}
	public void fulname() {
		String fullname_edit = "Dika Koko";
		String fullname_fix = "Dika Koko's";
		String save_sukses = "Profile berhasil diubah.";
		WebElement fullname = driver.findElement(By.xpath("//input[@type='text'][@name='name']"));
		fullname.clear();
		fullname.sendKeys(fullname_edit);
		WebElement but_save = driver.findElement(By.xpath("//button[text()='Save']"));
		but_save.click();
		WebElement alert_save_sukses = driver.findElement(By.xpath("//div[contains(text(),'Profile berhasil diubah.')]"));
		assert alert_save_sukses.getText().contains(save_sukses);
		
		//fix username
		WebElement fix_name = driver.findElement(By.xpath("//input[@type='text'][@name='name']"));
		fix_name.clear();
		fix_name.sendKeys(fullname_fix);
		WebElement fix_save = driver.findElement(By.xpath("//button[text()='Save']"));
		fix_save.click();
		WebElement alert_save_sukses1 = driver.findElement(By.xpath("//div[contains(text(),'Profile berhasil diubah.')]"));
		assert alert_save_sukses1.getText().contains(save_sukses);
		}
	
	public void ttl() {
		String ttl_edit = "04041999";
		String ttl_fix = "04111998";
		String save_sukses = "Profile berhasil diubah.";
		//Edit Profile ttl
		WebElement ttl = driver.findElement(By.xpath("//input[@type='date'][@name='dob']"));
		ttl.sendKeys(ttl_edit);
		WebElement but_save1 = driver.findElement(By.xpath("//button[text()='Save']"));
		but_save1.click();
		WebElement alert_save_sukses2 = driver.findElement(By.xpath("//div[contains(text(),'Profile berhasil diubah.')]"));
		assert alert_save_sukses2.getText().contains(save_sukses);
		
		//fix ttl
		WebElement fix_ttl = driver.findElement(By.xpath("//input[@type='date'][@name='dob']"));
		fix_ttl.sendKeys(ttl_fix);
		WebElement fix_save1 = driver.findElement(By.xpath("//button[text()='Save']"));
		fix_save1.click();
		WebElement alert_save_sukses3 = driver.findElement(By.xpath("//div[contains(text(),'Profile berhasil diubah.')]"));
		assert alert_save_sukses3.getText().contains(save_sukses);
		}
	
	public void jk() throws InterruptedException {
		String jk_edit = "Female";
		String jk_fix = "Male";
		String save_sukses = "Profile berhasil diubah.";
		//Edit Profile jk
		Select jk = new Select (driver.findElement(By.xpath("//select[@name='gender']")));
		jk.selectByVisibleText(jk_edit);
		WebElement but_save2 = driver.findElement(By.xpath("//button[text()='Save']"));
		but_save2.click();
		WebElement alert_save_sukses4 = driver.findElement(By.xpath("//div[contains(text(),'Profile berhasil diubah.')]"));
		assert alert_save_sukses4.getText().contains(save_sukses);
		
		//fix jk
		WebElement fix_jk = driver.findElement(By.xpath("//input[@type='date'][@name='dob']"));
		fix_jk.sendKeys(jk_fix);
		Thread.sleep(5000);
		WebElement fix_save2 = driver.findElement(By.xpath("//button[text()='Save']"));
		fix_save2.click();
		WebElement alert_save_sukses5 = driver.findElement(By.xpath("//div[contains(text(),'Profile berhasil diubah.')]"));
		assert alert_save_sukses5.getText().contains(save_sukses);		
		}
	
	public void lokasi() throws InterruptedException {
		String lokasi_edit = "Banda Aceh";
		String lokasi_fix = "Bandar Lampung";
		String save_sukses = "Profile berhasil diubah.";
		//Edit Profile lokasi
		Select lokasi = new Select (driver.findElement(By.xpath("//select[@name='location']")));
		lokasi.selectByVisibleText(lokasi_edit);
		WebElement but_save3 = driver.findElement(By.xpath("//button[text()='Save']"));
		but_save3.click();
		Thread.sleep(5000);
		WebElement alert_save_sukses6 = driver.findElement(By.xpath("//div[contains(text(),'Profile berhasil diubah.')]"));
		assert alert_save_sukses6.getText().contains(save_sukses);
		
		//fix lokasi
		Select fix_lokasi = new Select (driver.findElement(By.xpath("//select[@name='location']")));
		fix_lokasi.selectByVisibleText(lokasi_fix);
		WebElement fix_save4 = driver.findElement(By.xpath("//button[text()='Save']"));
		fix_save4.click();
		WebElement alert_save_sukses7 = driver.findElement(By.xpath("//div[contains(text(),'Profile berhasil diubah.')]"));
		assert alert_save_sukses7.getText().contains(save_sukses);
		}
}
