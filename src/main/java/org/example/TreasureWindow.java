package org.example;

import org.openqa.selenium.By;

public class TreasureWindow extends Utils{

    //Locators
    private By _treasure = By.xpath("(//span[@class='mat-button-wrapper'])[8]");
    private By _ClickOnT = By.xpath("//div[@class='ng-star-inserted']");
    private By _logOut = By.xpath("//span[text()='Logout']");


    public void startTreasure(){
        //click on start using treasure button
        clickOnElement(_treasure);
        System.out.println("Log in Successfully");

        //click on T in Right corner of the page
        clickOnElement(_ClickOnT);
    }

    public void logOut(){

        //Click on Logout
        clickOnElement(_logOut);
        System.out.println("Logout Successfully");
    }

}
