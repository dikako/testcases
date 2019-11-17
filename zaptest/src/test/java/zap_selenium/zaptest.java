package zap_selenium;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.zaproxy.clientapi.core.Alert;

import net.continuumsecurity.proxy.ScanningProxy;
import net.continuumsecurity.proxy.Spider;
import net.continuumsecurity.proxy.ZAProxyScanner;
import zap_seleniumbrowser.browserdriver;
public class zaptest {

	
	/*
	 * Provide details about ZAP Proxy
	 */
	static Logger log = Logger.getLogger(zaptest.class.getName());
	private static final String ZAP_PROXYHOST = "localhost";
	private static final int ZAP_PROXYPORT = 8098;
	private static final String ZAP_APIKEY = null;
	// Provide Chrome driver path
	private static final String BROWSER_DRIVER_PATH = "C:\\chromedriver.exe";
	private final static String MEDIUM = "MEDIUM";
	    private final static String HIGH = "HIGH";
	    private ScanningProxy zapScanner;
	    private Spider zapSpider;
	    private WebDriver driver;
	private webnav siteNavigation;
	// Provide scan policy names
	private final static String[] policyNames = 
	    {"directory-browsing","cross-site-scripting",
	     "sql-injection","path-traversal","remote-file-inclusion",
	     "server-side-include","script-active-scan-rules",
	     "server-side-code-injection","external-redirect",
	     "crlf-injection"};
	    int currentScanID;
	    // Create ZAP proxy by specifying proxy host and proxy port
	    private static Proxy createZapProxyConfiguration() {
	        Proxy proxy = new Proxy();
	        proxy.setHttpProxy(ZAP_PROXYHOST + ":" + ZAP_PROXYPORT);
	        proxy.setSslProxy(ZAP_PROXYHOST + ":" + ZAP_PROXYPORT);
	        return proxy;
	    }
	    /*
	     * Method to configure ZAP scanner, API client and perform User Registration
	     */
	    @Before
	    public void setUp()
	    {
	    // Configure ZAP Scanner
	    zapScanner = new ZAProxyScanner(ZAP_PROXYHOST, ZAP_PROXYPORT, ZAP_APIKEY);
	    // Start new session
	    zapScanner.clear();
	    log.info("Started a new session: Scanner");
	    // Create ZAP API client
	    zapSpider=(Spider) zapScanner;
	    log.info("Created client to ZAP API");
	    // Create driver object
	    driver = browserdriver.createChromeDriver(createZapProxyConfiguration(), BROWSER_DRIVER_PATH);
	    siteNavigation = new webnav(driver);
	    // First test the "Register a new user"
	    siteNavigation.registerNewUser();
	    }
	    /*
	     * Method to close the driver connection
	     */
	    @After
	    public void tearDown()
	    {
	    driver.quit();
	    }
	// ZAP Operations -- filterAlerts, setAlert_AttackStrength, activateZapPolicy, spiderwithZAP, scanWithZAP
	// ---------------------------------------------------------------------------------------------------------
	   /*
	    * Method to filter the generated alerts based on Risk and Confidence
	    */
	    private List<Alert> filterAlerts(List<Alert> alerts)
	    {
	    List<Alert> filteredAlerts = new ArrayList<Alert>();
	        for (Alert alert : alerts)
	        {
	        // Filtering based on Risk: High and Confidence: Not Low
	            if (alert.getRisk().equals(Alert.Risk.High) && alert.getConfidence() != Alert.Confidence.Low)
	            filteredAlerts.add(alert);
	        }
	        return filteredAlerts;
	    }
	    /*
	     * Method to specify the strength for the ZAP Scanner as High, Medium, or Low
	     */
	    public void setAlert_AttackStrength()
	    {
	    for (String ZapPolicyName : policyNames)
	    {
	            String ids = activateZapPolicy(ZapPolicyName);
	            for (String id : ids.split(",")) {
	                zapScanner.setScannerAlertThreshold(id,MEDIUM);
	                zapScanner.setScannerAttackStrength(id,HIGH);
	            }
	        }
	    }
	    /*
	     * Method to configure the ZAP Scanner for specified security policies and enable the scanner
	     */
	    private String activateZapPolicy(String policyName)
	    {
	    String scannerIds = null;
	    // Compare the security policies and specify scannerIds (these scannerIds are standard)
	        switch (policyName.toLowerCase()) {
	            case "directory-browsing":
	                scannerIds = "0";
	                break;
	            case "cross-site-scripting":
	                scannerIds = "40012,40014,40016,40017";
	                break;
	            case "sql-injection":
	                scannerIds = "40018";
	                break;
	            case "path-traversal":
	                scannerIds = "6";
	                break;
	            case "remote-file-inclusion":
	                scannerIds = "7";
	                break;
	            case "server-side-include":
	                scannerIds = "40009";
	                break;
	            case "script-active-scan-rules":
	                scannerIds = "50000";
	                break;
	            case "server-side-code-injection":
	                scannerIds = "90019";
	                break;
	            case "remote-os-command-injection":
	                scannerIds = "90020";
	                break;
	            case "external-redirect":
	                scannerIds = "20019";
	                break;
	            case "crlf-injection":
	                scannerIds = "40003";
	                break;
	            case "source-code-disclosure":
	                scannerIds = "42,10045,20017";
	                break;
	            case "shell-shock":
	                scannerIds = "10048";
	                break;
	            case "remote-code-execution":
	                scannerIds = "20018";
	                break;
	            case "ldap-injection":
	                scannerIds = "40015";
	                break;
	            case "xpath-injection":
	                scannerIds = "90021";
	                break;
	            case "xml-external-entity":
	                scannerIds = "90023";
	                break;
	            case "padding-oracle":
	                scannerIds = "90024";
	                break;
	            case "el-injection":
	                scannerIds = "90025";
	                break;
	            case "insecure-http-methods":
	                scannerIds = "90028";
	                break;
	            case "parameter-pollution":
	                scannerIds = "20014";
	                break;
	            default : throw new RuntimeException("No policy found for: "+policyName);
	        }
	        zapScanner.setEnableScanners(scannerIds, true);
	        return scannerIds;
	    }
	    /*
	     * Method to configure spider settings, execute ZAP spider, log the progress and found URLs
	     */
	    public void spiderWithZap()
	    {
	    log.info("Spidering started");
	    // Configure spider settings
	    zapSpider.excludeFromSpider(webnav.LOGOUT_URL);
	    zapSpider.setThreadCount(5);
	    zapSpider.setMaxDepth(5);
	    zapSpider.setPostForms(false);
	    // Execute the ZAP spider
	    zapSpider.spider(webnav.BASE_URL);
	    int currentSpiderID = zapSpider.getLastSpiderScanId();
	    int progressPercent  = 0;
	        while (progressPercent < 100) {
	        progressPercent = zapSpider.getSpiderProgress(currentSpiderID);
	        log.info("Spider is " + progressPercent + "% complete.");
	        try
	        {
	                Thread.sleep(1000);
	            }
	        catch (InterruptedException e)
	        {
	                e.printStackTrace();
	            }
	        }
	        // Log the found URLs after spider
	        for (String url : zapSpider.getSpiderResults(currentSpiderID)) {
	            log.info("Found URL after spider: "+url);
	        }
	        log.info("Spidering ended");
	    }
	    /*
	     * Method to execute scan and log the progress
	     */
	    public void scanWithZap()
	    {
	    log.info("Scanning started");
	    // Execute the ZAP scanner
	    zapScanner.scan(webnav.BASE_URL);
	    int currentScanId = zapScanner.getLastScannerScanId();
	    int progressPercent  = 0;
	        while (progressPercent < 100) {
	        progressPercent = zapScanner.getScanProgress(currentScanId);
	        log.info("Scan is " + progressPercent + "% complete.");
	        try
	        {
	                Thread.sleep(1000);
	            }
	        catch (InterruptedException e)
	        {
	                e.printStackTrace();
	            }
	        }
	        log.info("Scanning ended");
	    }
	// Test methods -- testVulnerabilitiesBeforeLogin, testVulnerabilitiesAfterLogin    
	// ---------------------------------------------------------------------------------------------------------
	    /*
	     * Test method containing test steps like navigateBeforeLogin, spiderWithZAP, 
	     * setAlert_AttackStrength, scanWithZAP, filterAlerts, and 
	     * log the found alerts and assert the count of alerts
	     */
	    @Test
	    public void testVulnerabilitiesBeforeLogin()
	    {
	    siteNavigation.navigateBeforeLogin();
	    // Using ZAP Spider
	    log.info("Started spidering");
	    spiderWithZap();
	    log.info("Ended spidering");
	    // Setting alert and attack
	    setAlert_AttackStrength();
	    zapScanner.setEnablePassiveScan(true);
	    // Using ZAP Scanner
	    log.info("Started scanning");
	    scanWithZap();
	    log.info("Ended scanning");
	    List<Alert> generatedAlerts = filterAlerts(zapScanner.getAlerts());
	    for (Alert alert : generatedAlerts)
	    {
	            log.info("Alert: "+alert.getAlert()+" at URL: "+alert.getUrl()+" Parameter: "+alert.getParam()+" CWE ID: "+alert.getCweId());
	        }
	        assertThat(generatedAlerts.size(), equalTo(0));
	    }
	    /*
	     * Test method containing test steps like loginAsUser, navigateAfterLogin, 
	     * spiderWithZAP, setAlert_AttackStrength, scanWithZAP, filterAlerts, and 
	     * log the found alerts and assert the count of alerts
	     */
	    @Test
	    public void testVulnerabilitiesAfterLogin()
	    {
	    siteNavigation.loginAsUser();
	    siteNavigation.navigateAfterLogin();
	    // Using ZAP Spider
	    log.info("Started spidering");
	    spiderWithZap();
	    log.info("Ended spidering");
	    // Setting alert and attack
	    setAlert_AttackStrength();
	    zapScanner.setEnablePassiveScan(true);
	    // Using ZAP Scanner
	    log.info("Started scanning");
	    scanWithZap();
	    log.info("Ended scanning");
	    List<Alert> generatedAlerts = filterAlerts(zapScanner.getAlerts());
	    for (Alert alert : generatedAlerts)
	    {
	            log.info("Alert: "+alert.getAlert()+" at URL: "+alert.getUrl()+" Parameter: "+alert.getParam()+" CWE ID: "+alert.getCweId());
	        }
	        assertThat(generatedAlerts.size(), equalTo(0));
	    }
}
