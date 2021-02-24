package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class BorrowingBooksPages {
    public BorrowingBooksPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id=\"menu_item\"]/li[2]/a")
    public WebElement browsingBooksButton;

    @FindBy(xpath = "//th")
    public List<WebElement> tableColumnsNameWebElement;


    public void clickBrowsingBooks() {
        browsingBooksButton.click();
    }

    public List<String> allActualColumnsName() {

        List<String> StringName = new ArrayList<>();
        for (WebElement each : tableColumnsNameWebElement) {
            StringName.add(each.getText());
        }
        return StringName;
    }


}


