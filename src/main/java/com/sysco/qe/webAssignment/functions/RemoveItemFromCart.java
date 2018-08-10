package com.sysco.qe.webAssignment.functions;

import com.sysco.qe.webAssignment.pages.CartPage;

public class RemoveItemFromCart {
    public static CartPage cartPage = new CartPage();

    public static void clickOnCart(){
        cartPage.clickOnCart();
    }

    public static void clickOnRemove(){
        cartPage.clickOnRemove();
    }
}
