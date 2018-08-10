package com.sysco.qe.webAssignment.pages;

import com.sysco.qe.webAssignment.utils.PageBase;
import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;

public class LoginPage extends PageBase {

    private By drpDate = By.id("age_select_day");
    private By drpMonth = By.id("age_select_month");
    private By drpYear = By.id("age_select_year");
    private By drdCountry = By.id("age_select_country");

    private By btnEnter = By.id("age_confirm_btn");
    private By cbRememberMe = By.id("age_remember_label");
    private By lnkConditionsOfUse = By.id("//*[@id=\"age_content\"]/form/div[16]/span/a");

    private By lblSiteLogo = By.xpath("//*[@id=\"age_missing_message\"]/span[1]");
    private By lblEnterBirthDay = By.xpath("//*[@id=\"age_missing_message\"]/span[1]");
    private By lblrequestId = By.xpath("//*[@id=\"age_missing_message\"]/span[1]");
    private By lblAgeMissingMessage = By.id ("age_missing_message");

    private By btnCustomDate = By.xpath("/html/body/div[1]/div[2]/form/div[8]/div[3]/div/select[1]/option[5]");
    private By btnCustomMonth = By.xpath("/html/body/div[1]/div[2]/form/div[8]/div[3]/div/select[2]/option[2]");
    private By btnCustomvaliedYear = By.xpath("/html/body/div[1]/div[2]/form/div[8]/div[3]/div/select[3]/option[15]");
    private By btnCustominvalidYear = By.xpath("/html/body/div[1]/div[2]/form/div[8]/div[3]/div/select[3]/option[2]");
    private By btnCustomCountry = By.xpath("/html/body/div[1]/div[2]/form/div[15]/ul/li[1]/select/option[1]");



   public void quitDriver() {
        if (syscoLabUIOgm != null) {
           syscoLabUIOgm.quit();
        }
   }

    public void clickDate(){
        syscoLabUIOgm.waitTillElementLoaded(drpDate);
        syscoLabUIOgm.click(drpDate);
    }

    public void clickMonth(){
        syscoLabUIOgm.waitTillElementLoaded(drpMonth);
        syscoLabUIOgm.click(drpMonth);
    }

    public void clickYear(){
        syscoLabUIOgm.waitTillElementLoaded(drpYear);
        syscoLabUIOgm.click(drpYear);
    }

    public void clickCountry(){
        syscoLabUIOgm.waitTillElementLoaded(drdCountry);
        syscoLabUIOgm.click(drdCountry);
    }

    public void clickbtnEnter(){
        syscoLabUIOgm.sleepInMiliSeconds(200);
        syscoLabUIOgm.click(btnEnter);
    }

    public void clickcbRememberMe(){syscoLabUIOgm.click(cbRememberMe);}

    public void clicklnkConditionOfUse(){syscoLabUIOgm.click(lnkConditionsOfUse);}


    public void setDate(){
        syscoLabUIOgm.sleepInMiliSeconds(200);
        syscoLabUIOgm.click(btnCustomDate);
    }

    public void setMonth() {
        syscoLabUIOgm.sleepInMiliSeconds(200);
        syscoLabUIOgm.click(btnCustomMonth);
    }

    public void setValidYear() {
        syscoLabUIOgm.sleepInMiliSeconds(200);
        syscoLabUIOgm.click(btnCustomvaliedYear);
    }

    public void setInvalidYear(){
        syscoLabUIOgm.click(btnCustominvalidYear);
    }

    public void setCounttry() {
        syscoLabUIOgm.click(btnCustomCountry);
    }




    }


