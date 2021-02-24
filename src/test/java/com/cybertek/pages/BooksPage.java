package com.cybertek.pages;


import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class BooksPage {

    public BooksPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "book_categories")
    public WebElement bookCategories;

    public List<WebElement> categoriesList(){

        Select select = new Select(bookCategories);
        List<WebElement> categoriesList = select.getOptions();
        return categoriesList;
    }

    public WebElement categoryNames(){
        Select select = new Select(bookCategories);
        WebElement categoriesNames = select.getWrappedElement();
        return categoriesNames;

    }

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
