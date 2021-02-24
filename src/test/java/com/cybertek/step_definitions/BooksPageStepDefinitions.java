package com.cybertek.step_definitions;

import com.cybertek.pages.BooksPage;
import com.cybertek.pages.HomePage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.StringUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class BooksPageStepDefinitions {

       LoginPage loginPage = new LoginPage();
       HomePage homePage= new HomePage();
        BooksPage booksPage= new BooksPage();



        @Given("user is on landing page")
        public void user_is_on_landing_page() throws InterruptedException {

            loginPage.loginLibrary();
            Thread.sleep(2000);


        }
        @Then("user should see the dashboard")
        public void user_should_see_the_dashboard() {


        }
        @Then("user clicks to the Books module")
        public void user_clicks_to_the_books_module() {

            homePage.BooksModule.click();
        }


        @Then("user should see the the default number is {string}")
        public void userShouldSeeTheTheDefaultNumberIs(String string) {
            String actualNumber = booksPage.recordNumber.getText();
            Assert.assertEquals(string, actualNumber);
        }

        @Then("user should click on records")
        public void userShouldClickOnRecords() {
            booksPage.dropDownCount.click();

        }

        @Then("user should see numbers in dropdown list")
        public void user_should_see_numbers_in_dropdown_list(List<String> count) {
            Assert.assertEquals(count, StringUtils.getStringFromWebelements(booksPage.dropdownNumbers));

        }
}
