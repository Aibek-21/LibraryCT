package com.cybertek.step_definitions;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @After()
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()){
            byte [] img = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(img, "img/png", scenario.getName());
        }
        Driver.getDriver().close();
    }


    @Before
    public void seTupScenario() {
        Driver.getDriver().get(ConfigurationReader.getProperty("libraryUrl"));
    }



}