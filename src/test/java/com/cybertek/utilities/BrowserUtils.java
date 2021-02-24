package com.cybertek.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {


    public static List<String> getElementsText(List<WebElement> webElementList) {

        //Placeholder empty list of web elements
        List<String> webElementsAsString = new ArrayList<>();
        //looping through list of web elements and storing text into placeholder list
        for (WebElement each : webElementList) {
            webElementsAsString.add(each.getText());
        }
        //returning final List<String>
        return webElementsAsString;
    }
    //Method to assert title

    public static void titleVerification(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));

    }

    //create method name: wait
    //converting milliseconds to seconds
    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("something happened in sleep method");

        }
    }

    public static void clickToElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();

    }


}
