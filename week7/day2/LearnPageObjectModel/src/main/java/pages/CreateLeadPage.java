package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {
	
	public CreateLeadPage enterCname() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
	}
	public CreateLeadPage enterFname() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		return this;
	}
	public CreateLeadPage enterLname() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		return this;
	}
	public ViewLeadsPage clickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage();
	}

}
