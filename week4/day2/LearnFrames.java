package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	/**
	 * A)No such Element exception:
	 * 1)locators
	 * 2)wait statements
	 * 3)element is present inside a frame
	 * 2)No such frame exception
	 * @param args
	 */

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//switch the frame
		driver.switchTo().frame(0);//index starts  from 0
		//click
		driver.findElement(By.id("Click")).click();

	}

}
