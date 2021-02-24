package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Page {

    LoginPage login = new LoginPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
       // Driver.getDriver().get(ConfigurationReader.getProperty("libraryUrl"));
    }


    @When("user enters student username")
    public void user_enters_student_username() {

        String userName = ConfigurationReader.getProperty("studentUsername");
        login.emailAddressBox.sendKeys(userName);

    }

    @When("user enters student password")
    public void user_enters_student_password() {

        String password = ConfigurationReader.getProperty("studentPassword");
        login.passwordBox.sendKeys(password);


    }

    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        login.signButton.click();


    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        String userName = ConfigurationReader.getProperty("librarianUsername");
        login.emailAddressBox.sendKeys(userName);


    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        String password = ConfigurationReader.getProperty("librarianPassword");
        login.passwordBox.sendKeys(password);


    }

}
