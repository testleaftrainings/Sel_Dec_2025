package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicLocators {

	public static void main(String[] args) {
		/**
		 * steps to interact with the webelement:
		 * 1)locate the element(find the elemnt froom the dom)
		 * Sendkeys--->passing the i/p
		 * click-->clickable actions
		 */
		
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize
		driver.manage().window().maximize();
		//enter username
		driver.findElement(By.id("username")).sendKeys("democsr2");
		//enter password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crmsfalink
		driver.findElement(By.partialLinkText("CRM")).click();

	}

}
