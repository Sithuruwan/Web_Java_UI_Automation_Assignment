package com.sysco.qe.webAssignment.functions;

import com.sysco.qe.webAssignment.pages.HomePage;

public class Home {
    public static HomePage homePage = new HomePage();

    public  static void navigateToMyAccount() {
        homePage.navigateToMyAccount();
    }

    public static void navigateToWishList() {
       homePage.navigateToCart();
    }

    public static void navigateToCart() {
       homePage.navigateToCart();
    }


}
