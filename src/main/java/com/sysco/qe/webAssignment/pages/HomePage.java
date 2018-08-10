package com.sysco.qe.webAssignment.pages;

import com.sysco.qe.webAssignment.utils.PageBase;
import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;

public class HomePage extends PageBase {

    private By lnkMyAccount = By.xpath("//*[@id=\"quick-access-list\"]/li[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]");
    private By lnkWishList = By.xpath("//*[@id=\"quick-access-list\"]/li[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]");
    private By lnkCart = By.id("cartHeader");

    public void navigateToMyAccount() {

       syscoLabUIOgm.movePointerTo();
       syscoLabUIOgm.sleepInMiliSeconds(2000);
       syscoLabUIOgm.click(lnkMyAccount);
    }

    public void navigateToWishList() {
        syscoLabUIOgm.click(lnkWishList);
    }

    public void navigateToCart() {
        syscoLabUIOgm.click(lnkCart);
    }


}
