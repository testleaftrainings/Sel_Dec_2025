package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement mouHover = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		//instantiate the actions
		Actions act=new Actions(driver);
		//use the object and cal the req methods
		act.moveToElement(mouHover);//perform is a mandotory method

	}

}
