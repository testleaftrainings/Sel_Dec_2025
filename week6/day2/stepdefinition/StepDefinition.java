package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition {
	public ChromeDriver driver;
	
	@Given("Launch the browser and load the url")
	public void launch_the_browser_and_load_the_url() {
		 driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	    
	}

	@Given("Enter the username")
	public void enter_the_username() {
		driver.findElement(By.id("username")).sendKeys("democsr2");
	    
	}

	@Given("Enter the password")
	public void enter_the_password() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	    
	}

	@Given("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	    
	}

	@Then("Homepage is displayed")
	public void homepage_is_displayed() {
		String title = driver.getTitle();
		if (title.contains("Leaftaps")) {
			System.out.println("text matched");
		} else {
			System.out.println("text not matched");
		}
	    
	}


}
