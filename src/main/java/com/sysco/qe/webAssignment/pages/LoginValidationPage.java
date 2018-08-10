package com.sysco.qe.webAssignment.pages;

import com.sysco.qe.webAssignment.utils.PageBase;
import org.openqa.selenium.By;

public class LoginValidationPage extends PageBase {
    private By email = By.xpath("//*[@id=\"email\"]");
    private By password = By.xpath("//*[@id=\"pass\"]");
    private By loginButton = By.xpath("//*[@id=\"send2\"]/span[1]/span[1]");
    private static By accountName = By.xpath("//*[@id=\"mobile-menu-content\"]/ul[1]/li[1]/strong[1]");
    private static By invalidLoginOrPassword = By.xpath("//*[@id=\"login-form\"]/div[1]/div[1]/div[1]/p[1]");

    public void enterEmail(String validEmail){
        syscoLabUIOgm.sleepInMiliSeconds(200);
        syscoLabUIOgm.click(email);
        syscoLabUIOgm.sleepInMiliSeconds(200);
        syscoLabUIOgm.sendKeys(email,validEmail);

    }
    public void enterPassword(String validPassword){
        syscoLabUIOgm.sleepInMiliSeconds(200);
        syscoLabUIOgm.click(password);
        syscoLabUIOgm.sleepInMiliSeconds(200);
        syscoLabUIOgm.sendKeys(password,validPassword);
    }

    public static Boolean isAccountNameDisplayed(){
        return syscoLabUIOgm.isDisplayed(accountName);
    }

    public static Boolean isInvalidLoginOrPasswordDisplayed(){
        return syscoLabUIOgm.isDisplayed(invalidLoginOrPassword);
    }

    public void clickLogin(){
        syscoLabUIOgm.sleepInMiliSeconds(200);
        syscoLabUIOgm.movePointerTo();
        syscoLabUIOgm.click(loginButton);
    }

}
