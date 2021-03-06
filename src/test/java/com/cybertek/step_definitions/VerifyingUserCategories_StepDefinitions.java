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
import java.util.List;

public class VerifyingUserCategories_StepDefinitions {

    HomePage homePage = new HomePage();
    UsersPage usersPage = new UsersPage();
    LoginPage loginPage = new LoginPage();

    @Given("User \\(librarian) on the home page")
    public void userLibrarianOnTheHomePage() {

        loginPage.doLogin("librarian18@library", "rKG2sP88");

//2nd way
//        loginPage.emailAddressBox.sendKeys("librarian18@library");
//        loginPage.passwordBox.sendKeys("rKG2sP88");
//        loginPage.signButton.click();

    }

    @When("User click users module")
    public void user_click_users_module() {
        homePage.usersModuleLink.click();
    }

    @When("User click users group dropdown")
    public void user_click_users_group_dropdown() {
        usersPage.usersDropdown.click();

    }

    @Then("User should see following options")
    public void user_should_see_following_options(List<String> expectedList) {
        Select select = new Select(usersPage.usersDropdown);
        List<String> listOfUsers = BrowserUtils.getElementsText(select.getOptions());
        Assert.assertEquals(expectedList,(listOfUsers));
        System.out.println(expectedList);
        System.out.println(listOfUsers);
    }





}
