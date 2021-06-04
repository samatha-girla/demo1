package com.phis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    //WebDriver driver;


//
//    public HuntPage(){
//        PageFactory.initElements(Driver.getDriver(), this);
//    }


    @FindBy(tagName = "input")
    public WebElement date;

    @FindBy(xpath = ("//*[@id='ctl00_ContentPlaceHolder1_rbShowAll']"))
    public WebElement showall;

    @FindBy(xpath = ("//*[@id='ctl00_ContentPlaceHolder1_lstSystemUsers']"))
    public WebElement logindropdown;

    @FindBy(xpath = ("//*[@id='ctl00_ctl00_UserRoleDropDownList']"))
    public WebElement roledropdown;

    @FindBy(linkText = "My Inspections and Samples")
    public WebElement myinspectionstab;

    @FindBy(xpath = "//*[@id='ctl00_ctl00_ContentPlaceHolder1_AppMenuBar']/descendant::span[text()='060']")
    public WebElement menu;

    @FindBy(linkText = "Create Application")
    public WebElement createapplication;

    @FindBy(xpath = "//*[@id= 'MyEstablishmentTab']/span/span/span")
    public WebElement textname;

}