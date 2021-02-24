package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class BooksPage extends HomePage  {
    @FindBy(xpath = "//select[@class='form-control input-sm input-xsmall input-inline']/option[text()='10']")
    public WebElement recordNumber;

    @FindBy(xpath ="//select[@class='form-control input-sm input-xsmall input-inline']" )
    public WebElement dropDownCount;


    @FindBy(xpath = "//select[@name='tbl_books_length']/option")
    public List<WebElement> dropdownNumbers;

    List<WebElement>expectedList = new ArrayList<>();


}
