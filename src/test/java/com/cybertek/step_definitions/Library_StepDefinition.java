package com.cybertek.step_definitions;

import com.cybertek.pages.LibraryMainPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Library_StepDefinition {


    LibraryMainPage libraryMainPage = new LibraryMainPage();


    @Given("the student on the home page")
    public void the_student_on_the_home_page() {
        libraryMainPage.loginLibrary();

    }

    @Then("the user should see following modules")
    public void the_user_should_see_following_modules(List<String> expectedModules) {

        System.out.println("ExpectedModulesList: " + expectedModules);

        for (WebElement eachLink : libraryMainPage.moduleLinks) {
            System.out.println("eachLink = " + eachLink.getText());
        }
    }

}
