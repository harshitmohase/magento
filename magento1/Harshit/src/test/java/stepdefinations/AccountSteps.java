package stepdefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountSteps {
	WebDriver driver;

	RegistrationPage register;

	LoginPage Login;

	HomePage Home;

	

	
	@Given("the user is on the homepage")
	public void the_user_is_on_the_homepage() {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win32\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://magento.softwaretestingboard.com");
	Home =new HomePage(driver);
	register = new RegistrationPage (driver);
	Login= new LoginPage (driver);
	}

	@When("the user clicks on \"create an account\"")
	public void the_user_clicks_on_create_account(){
	Home.ClickCreateAccount();	
    }
	
	
	@When("the user enters name, last name, email, password, and confirm password")
    public void the_user_enters_registration_details() {
            register.SendName();

			register.SendLast();

			register.SendEmail();

			register.SendPass();

			register.SendCnfPass();

			}

			

			@When("submits the registration form")
			public void submits_the_registration_form() {
			register.ClickSubmit();
			}
			
			
			
			@Then("the account should be created")
			public void the_account_should_be_created() throws InterruptedException {
             Thread.sleep(4000);
			}
			
			
			
			@When("the user logs out")
            public void the_user_logs_out() throws InterruptedException { 
			Home.ClickDropDown();
            Home.ClickSignOut();
            
            }
			
			
			@When("clicks on \"Sign In\"")

			public void Clicks_on_signIn() { 
				Home.ClickSignin();
			}
			
			
			@When("enters the email and password")

			public void enters_email_and_password() {

			Login.SendEmail();

			Login.SendPassword();

			}

			
			
			@When("submits the login form")

			public void submit_the_login_form() { 
				Login.ClickSubmit();

			}
			
			
			@Then("the user should be successfuly logged in")

			public void the_user_should_be_logged_in() throws InterruptedException {
			Thread.sleep(2000);

			}

			
			
			
			
			
			
			}





