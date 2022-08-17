package com.seleniumstarter.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.seleniumstarter.qa.base.TestBase;

/**
 * @author Timothy Mwine
 * @date   15 august 2022
 */
public class ViewEmployeeListPage extends TestBase {

    @FindBy( id = "menu_pim_viewPimModule" )
    WebElement linkPimBtn;

    @FindBy( id = "menu_pim_addEmployee" )
    WebElement linkAddEmployeeBtn;

    public ViewEmployeeListPage() {

        PageFactory.initElements( driver, this );
    }


    public ViewEmployeeListPage clickOnPimBtn() {

        linkPimBtn.click();
        return new ViewEmployeeListPage();
    }


    public AddEmployeePage clickLinkAddEmployeeBtn() {

        linkAddEmployeeBtn.click();
        return new AddEmployeePage();
    }
}
