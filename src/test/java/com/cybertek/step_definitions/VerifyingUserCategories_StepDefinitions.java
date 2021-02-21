package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.pool.TypePool;

public class VerifyingUserCategories_StepDefinitions {


    @Given("User \\(librarian) on the home page")
    public void user_librarian_on_the_home_page() {
        Driver.getDriver().get("libraryUrl");

    }

    @When("User click users module")
    public void user_click_users_module() {

    }

    @When("User click users group dropdown")
    public void user_click_users_group_dropdown() {

    }

    @Then("User should see following options")
    public void user_should_see_following_options(io.cucumber.datatable.DataTable dataTable) {

    }

}
