package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


 WebDriver driver;

public LoginPage (WebDriver driver) {

this.driver=driver;

}

By SendEmail=By.xpath("//input[@id='email']");
By Password=By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']");

By CliskSubmit=By.xpath("//fieldset[@class='fieldset login']//span[contains (text(), 'Sign In')]");

public void SendEmail() {

driver.findElement (SendEmail).sendKeys("Harshit3@gmail.com");
}

public void SendPassword() {

driver.findElement (Password).sendKeys("Harshit@2001");
}

public void ClickSubmit() {

driver.findElement (CliskSubmit).click();
}}