$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "line": 2,
  "name": "As a user I would like to sign in and logout",
  "description": "",
  "id": "as-a-user-i-would-like-to-sign-in-and-logout",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.before({
  "duration": 15051644600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to sign in and logout successfully",
  "description": "",
  "id": "as-a-user-i-would-like-to-sign-in-and-logout;user-should-be-able-to-sign-in-and-logout-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User open browser for Treasure Login validation",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click on Accept All Cookies",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click on create an account",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Type Email, Your name, Password and Confirm password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on Sign up",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Type verification code",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on Terms and conditions and click on Continue",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on Start using treasure",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User should be able to Sign out successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.given_User_open_browser_for_Treasure_Login_validation()"
});
formatter.result({
  "duration": 357099900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_Accept_All_Cookies()"
});
formatter.result({
  "duration": 422657100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.click_on_create_an_account()"
});
formatter.result({
  "duration": 879642100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.enter_Email_Your_name_Password_and_Confirm_password()"
});
formatter.result({
  "duration": 1277135500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.click_on_Sign_up()"
});
formatter.result({
  "duration": 170958500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.enter_verification_code()"
});
formatter.result({
  "duration": 1479232900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.click_on_Terms_and_conditions_and_click_on_Continue()"
});
formatter.result({
  "duration": 13823972100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.click_on_Start_using_treasure()"
});
formatter.result({
  "duration": 571513000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_should_be_able_to_Sign_out_successfully()"
});
formatter.result({
  "duration": 245737700,
  "status": "passed"
});
formatter.after({
  "duration": 2621419300,
  "status": "passed"
});
});