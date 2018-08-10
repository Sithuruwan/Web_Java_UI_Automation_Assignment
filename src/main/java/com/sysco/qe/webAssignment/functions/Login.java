package com.sysco.qe.webAssignment.functions;

import com.sysco.qe.webAssignment.common.Constants;
import com.sysco.qe.webAssignment.pages.LoginPage;
import com.sysco.qe.webAssignment.utils.DriverSetUpUtil;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Rifad on 5/21/18.
 */
public class Login  {

    public static LoginPage ogmLoginPage = new LoginPage();


    public static void loadLoginPage() {

        if (Constants.RUN_LOCALLY) {
            DriverSetUpUtil.setToRunLocally();
            DesiredCapabilities capabilities = null;
            ogmLoginPage.loadLoginPage(capabilities, Constants.APP_URL);
        } else {
            ogmLoginPage.loadLoginPage(DriverSetUpUtil.setToRunRemotely(Constants.APP_OS), Constants.APP_URL);
        }
    }


    public static void quiteDriver() {
        ogmLoginPage.quitDriver();
    }

    public static void setDate() {
        ogmLoginPage.clickDate();
        ogmLoginPage.setDate();
    }

    public static void setMonth() {
        ogmLoginPage.clickMonth();
        ogmLoginPage.setMonth();
    }

    public static void setValidYear() {
        ogmLoginPage.clickYear();
        ogmLoginPage.setValidYear();
    }

    public static void setInvalidYear() {
        ogmLoginPage.clickYear();
        ogmLoginPage.setInvalidYear();
    }

    public static void setCountry() {
        ogmLoginPage.clickCountry();
        ogmLoginPage.setCounttry();
    }

    public  static void clickbtnEnter(){ogmLoginPage.clickbtnEnter();}


    public static void login(){
        Login.loadLoginPage();
        Login.setDate();
        Login.setMonth();
        Login.setValidYear();
        Login.clickbtnEnter();
    }


}
