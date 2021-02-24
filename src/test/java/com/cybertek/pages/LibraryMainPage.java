package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LibraryMainPage {


    public LibraryMainPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id="inputEmail")
    public WebElement inputUsername;

    @FindBy(id="inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signupButton;

    public void loginLibrary() {
        inputUsername.sendKeys("student70@library");
        inputPassword.sendKeys("FPEDLRY3");
        signupButton.click();

    }
    @FindBy(className = "nav-item")
    public List<WebElement> moduleLinks;

}
