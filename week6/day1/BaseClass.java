package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	public RemoteWebDriver driver;

	/*
	 * @BeforeSuite public void startReports() {
	 * System.out.println("reports started"); }
	 * 
	 * @BeforeClass public void testCaseDetails() {
	 * System.out.println("testcase details are assigned"); }
	 * 
	 * @BeforeTest public void testLevelInfo() {
	 * System.out.println("all test setups are done"); }
	 */
	@Parameters({"browser","url","username","password"})
	@BeforeMethod
	public void preCondns(String browser,String url,String uName,String pWord) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		 
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pWord);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	/*
	 * @AfterSuite public void stopReports() {
	 * System.out.println("reports stopped"); }
	 */
	@AfterMethod
	public void postCondns() {
		driver.close();
	}

}
