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
import org.junit.Assert;


import java.util.ArrayList;
import java.util.List;

public class UserManagement_StepDefinition {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    UsersPage usersPage = new UsersPage();

    @Given("the user\\(librarian) on the homepage")
    public void the_user_librarian_on_the_homepage() {
        String url = ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);
        loginPage.loginToLibraryCT();
    }


    @When("the user click users module")
    public void the_user_click_users_module() {
        homePage.usersModuleLink.click();
    }



    @Then("the user should see the following column names:")
    public void the_user_should_see_the_following_column_names(List<String> expectedColumnNames) {
        List<String> actualColumnNames = BrowserUtils.getElementsText(usersPage.columns);
        Assert.assertEquals(expectedColumnNames,actualColumnNames);

        /*
        List <String> list = new ArrayList<>();
        for (WebElement each : usersPage.columns) {
            list.add(each.getText());
            Assert.assertEquals(expectedColumnNames,list);
        }
         */
    }





}
