package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class RegistrationPage {
	
	WebDriver driver;
	

	public RegistrationPage (WebDriver driver) {

	this.driver=driver;
	}

	By Name=By.xpath("//input[@id='firstname']");


	 By LastName=By.xpath("//input[@id='lastname']");

	By Email=By.xpath("//input[@id='email_address']");

	By Password=By.xpath("//input[@id='password']");

	By CnfPassword=By.xpath("//input[@id='password-confirmation']");

	By submit=By.xpath("//button[@title='Create an Account']//span[contains (text(), 'Create an Account')]");
	
	public void SendName() {

	driver.findElement(Name).sendKeys("harshit");
	
	}

	public void SendLast() {

	driver.findElement(LastName).sendKeys("MOHASE");
	}
	public void SendEmail() {

	driver.findElement (Email).sendKeys("Harshit3@gmail.com");
	}
	public void SendPass() {

		driver.findElement (Password).sendKeys("Harshit@2001");

	    }
	
	public void SendCnfPass() {

	driver.findElement (CnfPassword).sendKeys("Harshit@2001");

    }

	public void ClickSubmit() {

		
	driver.findElement(submit).click();

	}

}

