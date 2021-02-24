package com.cybertek.step_definitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.pages.TableColumnPages;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class TableColNam_Step_Def {

    TableColumnPages tabColPage = new TableColumnPages();
    LoginPage loginPage = new LoginPage();

    @Given("User should be locked in as a student name")
    public void user_should_be_locked_in_as_a_student_name() {
        String url = ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);
        loginPage.loginPageAsStudent();
    }

    @Then("the user should be able to see the following column names:")
    public void the_user_should_be_able_to_see_the_following_column_names(List<String> tableColumnName) {

        BrowserUtils.sleep(2);
        Assert.assertTrue(tableColumnName.equals(tabColPage.tableColNames()));
        System.out.println(tableColumnName);
    }


}
