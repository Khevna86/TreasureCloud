package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {


    LogInPage logInPage = new LogInPage();
    CreateAnAccount createAnAccount = new CreateAnAccount();
    VerificationPage verificationPage = new VerificationPage();
    TermsAndConditions termsAndConditions = new TermsAndConditions();
    TreasureWindow treasureWindow = new TreasureWindow();

    @Given("^User open browser for Treasure Login validation$")
    public void given_User_open_browser_for_Treasure_Login_validation()  {
        logInPage.verifyCurrentUrl();

    }

    @When("^User click on Accept All Cookies$")
    public void user_click_on_Accept_All_Cookies()  {
        logInPage.accept_Cookies();

    }

    @When("^Click on create an account$")
    public void click_on_create_an_account() {
      logInPage.create_An_Account();
    }

    @When("^Type Email, Your name, Password and Confirm password$")
    public void enter_Email_Your_name_Password_and_Confirm_password()  {
   createAnAccount.enter_AccountDetails();
    }

    @When("^Click on Sign up$")
    public void click_on_Sign_up() {
    createAnAccount._clickSignUp();
    }

    @When("^Type verification code$")
    public void enter_verification_code()  {
     verificationPage.enterVerificationCode();


    }

    @When("^Click on Terms and conditions and click on Continue$")
    public void click_on_Terms_and_conditions_and_click_on_Continue()  {
        termsAndConditions.clickOnTermsAndConditions();

    }

    @When("^click on Start using treasure$")
    public void click_on_Start_using_treasure()  {
        treasureWindow.startTreasure();


    }

    @Then("^User should be able to Sign out successfully$")
    public void user_should_be_able_to_Sign_out_successfully() {
    treasureWindow.logOut();
    }



}