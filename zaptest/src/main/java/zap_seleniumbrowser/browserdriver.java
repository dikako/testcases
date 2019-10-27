package zap_seleniumbrowser;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class browserdriver {
	// Make reference variable for WebDriver
	static WebDriver driver;
	public static WebDriver createChromeDriver(Proxy proxy, String path) {
	// Set proxy in the chrome browser
	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	        capabilities.setCapability("proxy", proxy);
	        // Set system property for chrome driver with the path
	        System.setProperty("webdriver.chrome.driver", path);
	        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	        ChromeOptions options = new ChromeOptions();
	        options.merge(capabilities);
	        return new ChromeDriver(options);    
	}
}
