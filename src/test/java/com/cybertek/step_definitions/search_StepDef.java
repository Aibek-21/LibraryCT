package com.cybertek.step_definitions;

import com.cybertek.pages.BooksPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class search_StepDef {

    LoginPage loginPage = new LoginPage();
    BooksPage booksPage = new BooksPage();

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {

        loginPage.emailAddressBox.sendKeys(ConfigurationReader.getProperty("userSt"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("passSt"));
        loginPage.signButton.click();

    }

    @Then("user sees all categories")
    public void user_sees_categories(List<String> categories) {

        Assert.assertEquals(categories.size(), booksPage.categoriesList().size());


    }



}
