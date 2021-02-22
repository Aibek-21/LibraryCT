package com.cybertek.step_definitions;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {


    @After()
    public void tearDown() {
        BrowserUtils.sleep(3);
        Driver.getDriver().close();
    }


    @BeforeStep
    public void runBeforeSteps() {
        BrowserUtils.sleep(3);

    }



}