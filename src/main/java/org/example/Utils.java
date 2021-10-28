package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;


public class Utils extends BasePage{


    // Click on element
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //method for enterText
    public static void enterText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }


    //verification method
    public static void assertCurrentUrl(String url){
        Assert.assertTrue(driver.getCurrentUrl().equals(url));
    }

}
