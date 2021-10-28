package org.example;

import org.openqa.selenium.By;

public class LogInPage extends Utils{



   private By _click_On_Cookies = By.xpath("//button[contains(@class,'mat-focus-indicator primary-action')]");
   private By _click_On_Create_Account = By.xpath("//a[contains(@class,'accent-link inner-span')]");


    public void verifyCurrentUrl(){
        //expected url
        String url = "https://app.tcloud.dev.anqlave.io/auth/signin";
        //verify url
        assertCurrentUrl(url);
    }

   public void accept_Cookies(){
       //Click on Accept all cookies
       clickOnElement(_click_On_Cookies);

   }
   public void create_An_Account(){
        //Click on create account
       clickOnElement(_click_On_Create_Account);




}
}
