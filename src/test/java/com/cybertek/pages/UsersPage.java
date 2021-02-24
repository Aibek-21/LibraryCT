package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UsersPage {

    public UsersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="user_groups")
    public WebElement usersDropdown;


    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm']")
    public WebElement addUser;
    @FindBy(xpath = "//input[@name='full_name']")
    public WebElement fullName;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    @FindBy(id = "user_group_id")
    public WebElement userGroup;
    @FindBy(xpath = "//input[@name='start_date']")
    public WebElement startDate;
    @FindBy(id = "address")
    public WebElement address;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;
    @FindBy(id = "status")
    public WebElement status;
    @FindBy(xpath = "//input[@name='end_date']")
    public WebElement endDate;
    @FindBy(xpath = "//button[@class='btn default']")
    public WebElement closeButton;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveChanges;

    @FindBy(tagName = "th")
    public List<WebElement> columns;

    public boolean isDisplayed(String name) {
        return Driver.getDriver().findElement(By.xpath("//td[.='"+name+"']")).isDisplayed();

    }

}
