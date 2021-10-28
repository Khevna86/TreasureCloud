@Login
Feature: As a user I would like to sign in and logout

Scenario: User should be able to sign in and logout successfully

  Given User open browser for Treasure Login validation
  When User click on Accept All Cookies
  And Click on create an account
  And Type Email, Your name, Password and Confirm password
  And Click on Sign up
  And Type verification code
  And Click on Terms and conditions and click on Continue
  And click on Start using treasure
  Then User should be able to Sign out successfully

