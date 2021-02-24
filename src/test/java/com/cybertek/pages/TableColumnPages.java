package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class TableColumnPages {

    public TableColumnPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//th")
    public List<WebElement> tablesColumnNames;

    public List<String> tableColNames() {

        List<String> tableNames = new ArrayList<>();
        for (WebElement each : tablesColumnNames) {
            tableNames.add(each.getText());
        }
        return tableNames;
    }
}
