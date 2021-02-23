package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOut {

    LoginPage loginPage = new LoginPage();

    @Given("User on the homepage")
    public void user_on_the_homepage() {
        String uN = ConfigurationReader.getProperty("librarianUsername");
        String pwd = ConfigurationReader.getProperty("librarianPassword");
        loginPage.doLogin(uN, pwd);
    }

    @When("User log out from application")
    public void user_log_out_from_application() {
        loginPage.logOut();
    }

    @Then("User verify title is {string}")
    public void userVerifyTitleIs(String arg0) {
        BrowserUtils.titleVerification(arg0);
    }
}
