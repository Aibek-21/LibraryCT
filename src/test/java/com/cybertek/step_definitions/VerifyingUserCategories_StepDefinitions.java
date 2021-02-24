package com.cybertek.step_definitions;

import com.cybertek.pages.HomePage;
import com.cybertek.pages.LoginPage;
import com.cybertek.pages.UsersPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.pool.TypePool;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.DriverManager;
import java.util.List;

public class VerifyingUserCategories_StepDefinitions {

    HomePage homePage = new HomePage();
    UsersPage usersPage = new UsersPage();
    LoginPage loginPage = new LoginPage();

    @Given("User \\(librarian) on the home page")
    public void userLibrarianOnTheHomePage() {
        String url = ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);
        loginPage.doLogin("student70@library", "FPEDLRY3");

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
        Assert.assertTrue(expectedList.equals(listOfUsers));
    }





}
