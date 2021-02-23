package com.cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    @FindBy(xpath = "//a[@id='navbarDropdown']")
    public WebElement dropdown;
    @FindBy(xpath = "//a[@class='dropdown-item']")
    public WebElement logOut;


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

    public void logOut(){
        BrowserUtils.clickToElement(dropdown);
        BrowserUtils.clickToElement(logOut);
    }



}