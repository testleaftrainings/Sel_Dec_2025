package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAerts {
	/**
	 * 1)No alert present exception
	 * 2)Unhandled Alert exception
	 * @param args
	 */

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		//switch the driver to alertbox
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		String text = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text);
		
		//confirmation Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		//Alert alert2 = driver.switchTo().alert();
		alert.dismiss();
		
		//prompt Alerts
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		alert.sendKeys("Testleaf");
		alert.accept();
		
		//sweet Alerts
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		

	}

}
