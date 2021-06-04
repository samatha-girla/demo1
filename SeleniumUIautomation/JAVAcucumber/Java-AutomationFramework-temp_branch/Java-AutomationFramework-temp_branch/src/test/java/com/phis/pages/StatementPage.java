package com.phis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StatementPage extends BasePage {

    WebDriver driver;

    @FindBy(tagName = "input")
    public WebElement date;



}
