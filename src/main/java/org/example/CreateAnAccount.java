package org.example;

import org.openqa.selenium.By;

import java.sql.Timestamp;

public class CreateAnAccount extends Utils{

    //locators
    private By _email = By.cssSelector("input#mat-input-2");
    private By _yourName = By.cssSelector("input#mat-input-3");
    private By _password = By.cssSelector("input#mat-input-4");
    private By _confirmPassword = By.cssSelector("input#mat-input-5");
    private By _signUp = By.xpath("//button[contains(@class,'mat-focus-indicator thick-button')]");

  //object of LoadProperty
    LoadProperty loadProperty = new LoadProperty();


    public void enter_AccountDetails(){

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        // type email address
        enterText(_email,loadProperty.getProperty("Email")+timestamp.getTime()+"@gmail.com");
        //type your name
        enterText(_yourName,loadProperty.getProperty("YourName"));
        //type password
        enterText(_password,loadProperty.getProperty("Password"));
        //confirm password
        enterText(_confirmPassword,loadProperty.getProperty("ConfirmPassword"));
    }

    public void _clickSignUp(){

        //Click on Signup button
        clickOnElement(_signUp);
    }
}
