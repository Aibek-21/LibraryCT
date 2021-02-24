package com.cybertek.step_definitions;

import com.cybertek.pages.BorrowingBooksPages;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class BorrowingBookStepDefinition {

        BorrowingBooksPages borrowingBooksPages = new BorrowingBooksPages();
        LoginPage loginPage = new LoginPage();


        @Given("User should be locked in as a student")
        public void user_should_be_locked_in_as_a_student() {
            loginPage.doLogin("student70@library", "FPEDLRY3");
        }

        @Given("the user on the homepage")
        public void the_user_on_the_homepage() {
            System.out.println("Title " + Driver.getDriver().getTitle());

        }

        @And("the User click Borrowing Books module")
        public void the_user_click_borrowing_books_module() {
            BrowserUtils.sleep(2);
            borrowingBooksPages.clickBrowsingBooks();

        }

        @Then("the user shouldsee the following column names:")
        public void the_user_shouldsee_the_following_column_names(List<String> columnNames) {
            System.out.println(borrowingBooksPages.allActualColumnsName());
            System.out.println(columnNames);
            Assert.assertTrue(columnNames.equals(borrowingBooksPages.allActualColumnsName()));
        }

    }

