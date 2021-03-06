package com.cybertek.step_definitions;

import com.cybertek.pages.HomePage;
import com.cybertek.pages.LoginPage;
import com.cybertek.pages.UsersPage;
import com.cybertek.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class AddUsers_StepDefinitions {
    UsersPage usersPage = new UsersPage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("the librarian is on the users page")
    public void theLibrarianIsOnTheUsersPage() {
        loginPage.doLogin("librarian18@library", "rKG2sP88");
        homePage.usersModuleLink.click();
    }

    @When("user  click add user")
    public void user_click_add_user() {
        usersPage.addUser.click();
    }

    @When("user enter Full Name {string}")
    public void user_enter_full_name(String fullName) {
        usersPage.fullName.sendKeys(fullName);
    }

    @When("user enter password {string}")
    public void user_enter_password(String password) {
        usersPage.password.sendKeys(password);
    }

    @When("user enter User Group {string}")
    public void user_enter_user_group(String userGroup) {
        Select userGroups = new Select(usersPage.userGroup);
        userGroups.selectByVisibleText(userGroup);
    }

    @When("user enter Start Date {string}")
    public void user_enter_start_date(String startDate) {
        usersPage.startDate.clear();
        usersPage.startDate.sendKeys(startDate);
    }

    @When("user enter Email {string}")
    public void user_enter_email(String email) {
        usersPage.email.sendKeys(email);
    }

    @When("user enter Status {string}")
    public void user_enter_status(String status) {
        Select select = new Select(usersPage.status);
        select.selectByVisibleText(status);
    }

    @When("user enter End Date {string}")
    public void user_enter_end_date(String endDate) {
        usersPage.endDate.clear();
        usersPage.endDate.sendKeys(endDate);
    }

    @Then("user click save changes")
    public void user_click_save_changes() {
        usersPage.saveChanges.click();

    }

    @Then("And check user should be displayed by {string}")
    public void andCheckUserShouldBeDisplayedBy(String firstName) {
        BrowserUtils.sleep(3);
        Assert.assertTrue(usersPage.isDisplayed(firstName));
    }
}
