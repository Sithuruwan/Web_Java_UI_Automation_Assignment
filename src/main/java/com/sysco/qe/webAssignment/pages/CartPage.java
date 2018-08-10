package com.sysco.qe.webAssignment.pages;

import com.sysco.qe.webAssignment.utils.PageBase;
import org.openqa.selenium.By;

public class CartPage extends PageBase {
    private By cartBtn = By.xpath("//*[@id=\"cartHeader\"]");
    private By removeBtn = By.xpath("//*[@id=\"cartheader-item-314169\"]");

    public void clickOnCart(){
        syscoLabUIOgm.sleepInMiliSeconds(200);
        syscoLabUIOgm.click(cartBtn);
    }

   public void clickOnRemove(){
        syscoLabUIOgm.sleepInMiliSeconds(200);
        syscoLabUIOgm.click(removeBtn);
   }

}
