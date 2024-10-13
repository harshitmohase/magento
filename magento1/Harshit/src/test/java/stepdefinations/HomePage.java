package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


WebDriver driver;

public HomePage (WebDriver driver) {

this.driver=driver;
}
By CreatAccountBtn=By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']");

By signInBtn=By.xpath( "//div[@class='panel header']//a[contains (text(), 'Sign In')]");

By userDropdown=By.xpath("//div[@class='panel header']//button[@type='button']");

By Signout=By.xpath("//div[@aria-hidden='false']//a[normalize-space()='Sign Out']");

public void ClickCreateAccount () {

driver.findElement (CreatAccountBtn).click();
}
public void ClickSignin() {

driver.findElement(signInBtn).click();

}

public void ClickDropDown() throws InterruptedException { driver.findElement (userDropdown).click(); Thread.sleep(2000);

}

public void ClickSignOut() { driver.findElement (Signout).click();

}
}