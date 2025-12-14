package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDD {

	public static void main(String[] args) {
		/**
		 * Select class:
		 * 1)check the DD element is inside the <select>.
		 * 2)locate the element and store in a local variable
		 * 3)instantiate the Select class and pass the webelement as an argument
		 * 4)with the object created make use of any helper methods and locate the dropdown element.
		 */
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize
		driver.manage().window().maximize();
		//enter username
		//driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("democsr");
		//enter password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crmsfalink
		driver.findElement(By.partialLinkText("CRM")).click();
		//click leads
		driver.findElement(By.linkText("Leads")).click();
		//click createlead
		driver.findElement(By.linkText("Create Lead")).click();
		//company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		//last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		//lOCATE THE source field
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//instantiate the select class
		Select sel=new Select(sourceDD);
		sel.selectByIndex(4);
		//locate industry dd
		WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
	
		Select sel1=new Select(industryDD);
		//sel1.selectByValue("IND_INSURANCE");
		sel1.selectByVisibleText("Insurance");



	}

}
