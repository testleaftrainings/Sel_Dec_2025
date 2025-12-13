package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		/**
		 * Launch the browser:
		 * 1)instantiate the browser driver
		 * shortcut for execution:ctrl+fn+f11
		 */
		ChromeDriver driver=new ChromeDriver();
		FirefoxDriver driver1=new FirefoxDriver();
		//load the url
		driver.get("https://www.facebook.com/");
		//maximize
		driver.manage().window().maximize();
		//get the title
		/*
		 * String title = driver.getTitle(); System.out.println(title);
		 */
		System.out.println(driver.getTitle());
		
		

	}

}
