Feature: Account creation and login

 Scenario: user creates an account and logs in 
 Given the user is on the homepage
 When the user clicks on "create an account"
 And the user enters name, last name, email, password, and confirm password
 And submits the registration form
 Then the account should be created
 When the user logs out
 And clicks on "Sign In"
 And enters the email and password
 And submits the login form
 Then the user should be successfuly logged in
