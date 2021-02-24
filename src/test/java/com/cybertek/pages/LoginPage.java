package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.rmi.runtime.Log;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement emailAddressBox;

    @FindBy(id = "inputPassword")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signButton;

    public void loginToLibraryCT() {
        String userName = ConfigurationReader.getProperty("librarianUsername");
        String password = ConfigurationReader.getProperty("librarianPassword");
        emailAddressBox.sendKeys(userName);
        passwordBox.sendKeys(password);
        signButton.click();

    }
    public HomePage doLogin(String username,String password){
        emailAddressBox.sendKeys(username);
        passwordBox.sendKeys(password);
        signButton.click();

        return new HomePage();
    }

    public void loginPageAsStudent(){
        emailAddressBox.sendKeys("student70@library");
        passwordBox.sendKeys("FPEDLRY3");
        signButton.click();
    }

    public void loginLibrary(){
        emailAddressBox.sendKeys("librarian44@library");
        passwordBox.sendKeys("4Lzovksn");

        signButton.click();
    }

}