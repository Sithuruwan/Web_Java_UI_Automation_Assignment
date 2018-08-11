package com.sysco.qe.webAssignment.functions;

import com.sysco.qe.webAssignment.pages.LoginValidationPage;

public class LoginValidation {
    public static LoginValidationPage ogmloginValidation = new LoginValidationPage();

    public static void enterValidEmailAndValidPassword(String validEmail,String validPassword){
       ogmloginValidation.enterEmail(validEmail);
       ogmloginValidation.enterPassword(validPassword);
    }

    public static void enterInvalidEmailAndValidPassword(String invalidEmail, String validPassword){
        ogmloginValidation.enterEmail(invalidEmail);
        ogmloginValidation.enterPassword(validPassword);
    }

    public static Boolean isAccountNameDisplayed(){
        return LoginValidationPage.isAccountNameDisplayed();
    }

    public static Boolean isInvalidLoginOrPasswordDisplayed(){
        return LoginValidationPage.isInvalidLoginOrPasswordDisplayed();
    }

    public static void clickLogin(){
        ogmloginValidation.clickLogin();
    }

    public static void loginToAccount(String validEmail,String validPassword){
        LoginValidation.enterValidEmailAndValidPassword(validEmail,validPassword);
        LoginValidation.clickLogin();

    }
}
