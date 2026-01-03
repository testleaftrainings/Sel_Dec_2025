package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//locate the table
		WebElement table = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody"));
		//to get the rowCount
		List<WebElement> row = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr"));
		int size = row.size();
		System.out.println(size);
		//to get the columncount
		List<WebElement> colSize = driver.findElements(By.xpath("(//table[@role='grid'])[2]/thead/tr/th"));
		System.out.println(colSize.size());
		
		//particular data
		String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr[3]/td[2]")).getText();
		System.out.println(text);//UK,Japan
		
		//entire row
		List<WebElement> singleRow = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr[3]"));
		for (WebElement rowIter : singleRow) {
			System.out.println(rowIter.getText());
		}
		//alldatas
		
		List<WebElement> allDatas = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr/td"));
		for (WebElement iter : allDatas) {
			System.out.println(iter.getText());
		}
		
		//dynamicdatas
		for (int i = 1; i < row.size(); i++) {
			driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td"));
			System.out.println("-------------------------------");
			for (int j = 1; j <colSize.size() ; j++) {
				WebElement dynamicDatas = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println(dynamicDatas.getText());
			}
		}
	}

}
