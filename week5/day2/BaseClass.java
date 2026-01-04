package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public ChromeDriver driver;
	@BeforeSuite
	public void startReports() {
		System.out.println("reports started");
	}
	@BeforeClass
	public void testCaseDetails() {
		System.out.println("testcase details are assigned");
	}
	@BeforeTest
	public void testLevelInfo() {
		System.out.println("all test setups are done");
	}
	@BeforeMethod
	public void preCondns() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@AfterSuite
	public void stopReports() {
		System.out.println("reports stopped");
	}
	@AfterMethod
	public void postCondns() {
		driver.close();
	}

}
