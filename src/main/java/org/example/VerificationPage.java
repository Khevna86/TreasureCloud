package org.example;

import org.openqa.selenium.By;

public class VerificationPage extends Utils{
    //object of LoadProperty
    LoadProperty loadProperty = new LoadProperty();

    //Locators
    private By _verificationCode1 = By.xpath("//input[@formcontrolname='d1']");
    private By _verificationCode2 = By.xpath("//input[@formcontrolname='d2']");
    private By _verificationCode3 = By.xpath("//input[@formcontrolname='d3']");
    private By _verificationCode4 = By.xpath("//input[@formcontrolname='d4']");
    private By _verificationCode5 = By.xpath("//input[@formcontrolname='d5']");
    private By _verificationCode6 = By.xpath("//input[@formcontrolname='d6']");

    public void enterVerificationCode(){
        //Type Verification Code
        enterText(_verificationCode1,loadProperty.getProperty("VerificationCode1"));
        enterText(_verificationCode2,loadProperty.getProperty("VerificationCode2"));
        enterText(_verificationCode3,loadProperty.getProperty("VerificationCode3"));
        enterText(_verificationCode4,loadProperty.getProperty("VerificationCode4"));
        enterText(_verificationCode5,loadProperty.getProperty("VerificationCode5"));
        enterText(_verificationCode6,loadProperty.getProperty("VerificationCode6"));

    }
}
