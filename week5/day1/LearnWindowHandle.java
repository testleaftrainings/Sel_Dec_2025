package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//get the address of the current window
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);//E2E23F350FC3955592C33001B5B221AC,47E56C553F3CED3BB5D310BDC87DA002
		System.out.println(driver.getTitle());
		//open
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//address of the child window
		Set<String> childWindow = driver.getWindowHandles();
		//convert set into list
		List<String> listWindow=new ArrayList<String>(childWindow);
		//navigate to child window
		driver.switchTo().window(listWindow.get(1));
		//address of the child window
		String chWindow = driver.getWindowHandle();
		System.out.println(chWindow);
		System.out.println(driver.getTitle());
		
		driver.close();//close the current window
		//driver.switchTo().window(listWindow.get(1));
		driver.quit();//close all the windows which is in open
		
		
		

	}

}
