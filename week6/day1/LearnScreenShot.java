package testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenShot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//takescreenshoot
		File source = driver.getScreenshotAs(OutputType.FILE);
		//path
		File destination=new File("./snap/homepage.png");
		//connect source and destination
		FileUtils.copyFile(source, destination);
		
		//particular textfield
		WebElement textField = driver.findElement(By.id("username"));
		File source1 = textField.getScreenshotAs(OutputType.FILE);
		File destination1=new File("./snap/uname field.png");
		FileUtils.copyFile(source1, destination1);
		

	}

}
