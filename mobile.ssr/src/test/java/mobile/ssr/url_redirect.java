package mobile.ssr;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class url_redirect {
	WebDriver driver;
	public url_redirect(WebDriver driver) {
		this.driver = driver;
	}
	
	public void cekurl_redirect() {
		System.out.println("Orang Baru Kaya");
		driver.get("https://rc-m-ssr.rctiplus.com/programs/484/orang-baru-kaya");
		driver.findElement(By.xpath("//a[text()='Episodes']")).click();
		driver.findElement(By.xpath("//img[@src=' https://static.rctiplus.id/media/620/files/fta_rcti/Landscape/obk/e1.jpg ']")).click();
		String url_eps = driver.getCurrentUrl();
		String valid_eps = "https://m.rctiplus.com/programs/484/orang-baru-kaya/episode/4342/orang-baru-kaya-ep-1";
		Assert.assertEquals(url_eps, valid_eps);
		System.out.println("Redirect : " + valid_eps);
		
		driver.get("https://rc-m-ssr.rctiplus.com/programs/484/orang-baru-kaya");
		driver.findElement(By.xpath("//a[text()='Extras']")).click();
		driver.findElement(By.xpath("//img[@src=' https://static.rctiplus.id/media/620/files/fta_rcti/Landscape/outfit_of_the_day/ootd_26.jpg ']")).click();
		String url_ext = driver.getCurrentUrl();
		String valid_ext = "https://m.rctiplus.com/programs/484/orang-baru-kaya/extra/791/penampilan-biru-dan-merah-ala-randa-septian";
		Assert.assertEquals(url_ext, valid_ext);
		System.out.println("Redirect : " + valid_ext);
		
		driver.get("https://rc-m-ssr.rctiplus.com/programs/484/orang-baru-kaya");
		driver.findElement(By.xpath("//a[text()='Clips']")).click();
		driver.findElement(By.xpath("//img[@src='https://static.rctiplus.id/media/620/files/fta_rcti/Landscape/obk_clip/12082019_1.jpg']")).click();
		String url_clip = driver.getCurrentUrl();
		String valid_clip = "https://m.rctiplus.com/programs/484/orang-baru-kaya/clip/444/boim-mergokin-ibu-dan-welas-sedang-ini";
		Assert.assertEquals(url_clip, valid_clip);
		System.out.println("Redirect : " + valid_clip);
		
		driver.get("https://rc-m-ssr.rctiplus.com/programs/484/orang-baru-kaya");
		driver.findElement(By.xpath("//a[text()='Photos']")).click();
		driver.findElement(By.xpath("//img[@src='https://static.rctiplus.id/media/620/files/fta_rcti/Portrait/cast_orang_baru_kaya/elisugigi_potrait.jpg']")).click();
		String url_photo = driver.getCurrentUrl();
		String valid_photo = "https://m.rctiplus.com/programs/484/orang-baru-kaya/photo/40/cast-orang-baru-kaya/0/list";
		Assert.assertEquals(url_photo, valid_photo);
		System.out.println("Redirect : " + valid_photo);
	}
}
