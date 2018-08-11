package com.sysco.qe.webAssignment.tests;


import com.sysco.qe.webAssignment.data.LoginData;
import com.sysco.qe.webAssignment.functions.Home;
import com.sysco.qe.webAssignment.functions.Login;
import com.sysco.qe.webAssignment.utils.ExcelUtil;
import com.sysco.qe.webAssignment.utils.TestBase;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {

    @BeforeClass
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Login - ValidLogin");
    }

    @AfterClass
    public void afterClass(){
        Login.quiteDriver();
    }

    @Test (description = "BDG-001", alwaysRun = true)
    public void testLogin() throws Exception {
        Login.loadLoginPage();
        Login.setDate();
        Login.setMonth();
        Login.setValidYear();
        Login.clickbtnEnter();
        Home.navigateToMyAccount();

    }
}