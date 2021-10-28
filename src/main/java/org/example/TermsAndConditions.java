package org.example;

import org.openqa.selenium.By;

public class TermsAndConditions extends Utils{

    //Locators
    private By _clickTermsAndCondition = By.xpath("(//div[@class='mat-checkbox-inner-container'])[1]");
    private By _clickOnContinue = By.xpath("//button[contains(@class,'mat-focus-indicator primary-action')]//span[1]");

    public void clickOnTermsAndConditions (){

        //Click on Terms and conditions
        clickOnElement(_clickTermsAndCondition);
        //Click on Continue button
        clickOnElement(_clickOnContinue);




    }
}
