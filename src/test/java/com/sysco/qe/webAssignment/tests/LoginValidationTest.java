package com.sysco.qe.webAssignment.tests;

import com.sysco.qe.webAssignment.common.Data;
import com.sysco.qe.webAssignment.functions.Home;
import com.sysco.qe.webAssignment.functions.Login;
import com.sysco.qe.webAssignment.functions.LoginValidation;
import com.sysco.qe.webAssignment.utils.TestBase;
import org.testng.ITestContext;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class LoginValidationTest extends TestBase {

    @BeforeClass
    public void loadUrl(){
        Login.login();
        Home.navigateToMyAccount();
    }

    @AfterClass
    public void quiteDriver(){
        Login.quiteDriver();
    }


    @Test(description = "BDG-001", alwaysRun = true, priority = 2)
    public void verifyValidEmailAndPassword() throws Exception {
        LoginValidation.enterValidEmailAndValidPassword(Data.validEmail,Data.validPassword);
        LoginValidation.clickLogin();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(LoginValidation.isAccountNameDisplayed(),"User should be navigate to the Dashboard");
        softAssert.assertAll();


    }

    @Test(description = "BDG-002", alwaysRun = true, priority = 1)
    public static void verifyInvalidEmailAndValidPassword() throws Exception{
        LoginValidation.enterInvalidEmailAndValidPassword(Data.invalidEmail,Data.validPassword);
        LoginValidation.clickLogin();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(LoginValidation.isInvalidLoginOrPasswordDisplayed(),"System gives an invalid login error massage");
        softAssert.assertAll();

}


}
