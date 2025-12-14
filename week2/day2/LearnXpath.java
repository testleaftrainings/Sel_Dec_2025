package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize
		driver.manage().window().maximize();
		//enter username
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("democsr2");
		//enter password
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		//click crmsfalink
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		//click leads
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
	}

}
