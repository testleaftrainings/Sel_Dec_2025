package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrames {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//outer frame(parent)
		WebElement nestFrame = driver.findElement(By.xpath("//h5[contains (text(),'Click Me (Inside Nested frame)')]/following-sibling::iframe"));
		driver.switchTo().frame(nestFrame);
		//inner frame
		driver.switchTo().frame("frame2");
		//click
		driver.findElement(By.id("Click")).click();
	}

}
