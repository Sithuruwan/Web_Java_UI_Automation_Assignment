package com.sysco.qe.webAssignment.tests;

import com.sysco.qe.webAssignment.common.Data;
import com.sysco.qe.webAssignment.functions.*;
import com.sysco.qe.webAssignment.utils.TestBase;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CartTest extends TestBase {


    @BeforeClass(alwaysRun = true)
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Bundabergrum_AnuradhaS - Checkout_AnuradhaS");
    }

    @Test(alwaysRun = true, priority = 0)
    public void loadUrl() {
        Login.login();
        Home.navigateToMyAccount();
        LoginValidation.loginToAccount(Data.validEmail, Data.validPassword);
    }

    @Test(alwaysRun = true, priority = 1)
    public void testRemoveCartItem() throws Exception {
        SoftAssert softAssert = new SoftAssert();

        Cart.clickCartIcon();
        Cart.clickRemoveLink();
        //Cart.clearCartItems();
        Cart.clickCartIcon();
        softAssert.assertEquals(Cart.isDisplayedZeroInCart(), "0", "Expected value does not displayed");
        softAssert.assertAll();
    }

    @Test(alwaysRun = true, priority = 2)
    public static void testAddCartItem() {
        SoftAssert softAssert = new SoftAssert();

        Cart.MoveToProductCategory();
        Cart.clickRoyalLiqueur();
        Cart.clickAnItem();
        Cart.clickAddToCartButton();
        softAssert.assertTrue(Cart.isDisplayedPriceInPopUp(), "expected price does not displayed");
        softAssert.assertTrue(Cart.isDisplayedNameInPopUP(), "expected name does not displayed");

        softAssert.assertAll();
    }

    @Test(alwaysRun = true, priority = 3)
    public static void testCheckOutItem() {
        SoftAssert softAssert = new SoftAssert();

        Cart.clickCheckOut();
        softAssert.assertEquals(Cart.isDisplayedOneInShoppingCart(), "1", "Expected value does not displayed");
        softAssert.assertTrue(Cart.isDisplayedPrice(), "expected price does not displayed");
        softAssert.assertTrue(Cart.isDisplayedName(), "expected name does not displayed");

        softAssert.assertAll();
    }

    @Test(alwaysRun = true, priority = 4)
    public static void testCheckOutVerification() {
        SoftAssert softAssert = new SoftAssert();

        Cart.clickProceedToCheckOut();
        softAssert.assertEquals(Cart.isDisplayedFirstName(), "william", "expected name does not displayed");
        softAssert.assertEquals(Cart.isDisplayedLastName(), "jacob", "expected name does not displayed");
        Cart.clearFirstName();
        Cart.clearLastNameName();
        Cart.clearAddress1();
        Cart.clearContactNumberName();
        Cart.clickContinue();
        softAssert.assertEquals(Cart.isDisplayedEmptyErrorFirstName(), "This is a required field.", "expected value does not displayed");
        softAssert.assertEquals(Cart.isDisplayedEmptyErrorLastName(), "This is a required field.", "expected value does not displayed");
        softAssert.assertEquals(Cart.isDisplayedEmptyErrorAddress(), "This is a required field.", "expected value does not displayed");
        softAssert.assertEquals(Cart.isDisplayedEmptyErrorContactNumber(), "This is a required field.", "expected value does not displayed");

        softAssert.assertAll();
    }

    @Test(alwaysRun = true, priority = 5)
    public static void testContinueInProceedToCheckOut() {
        SoftAssert softAssert = new SoftAssert();

        Cart.enterFirstName("william");
        Cart.enterLastName("jacob");
        Cart.enterAddress1("Default Address");
        Cart.enterContactNumber("12345678");
        softAssert.assertEquals(Cart.isDisplayedFirstName(), "william", "expected name does not displayed");
        softAssert.assertEquals(Cart.isDisplayedLastName(), "jacob", "expected name does not displayed");
        softAssert.assertEquals(Cart.isDisplayedAddress(), "Default Address", "expected name does not displayed");
        softAssert.assertEquals(Cart.isDisplayedContactNumber(), "12345678", "expected name does not displayed");
        Cart.removePostCode();
        Cart.enterPostCode("2000");
        Cart.clickContinue();
        softAssert.assertEquals(Cart.isDisplayedDeliveryOptions(), "DELIVERY OPTIONS", "expected name does not displayed");

        softAssert.assertAll();
    }


    @Test(alwaysRun = true, priority = 6)
    public static void testDeliveryOptions() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();

        Cart.clickContinueInDeliveryOptions();
        Cart.selectPayPalOption();
        Cart.selectAgreement();
        Cart.clickPurchase();
        Thread.sleep(1000);
        softAssert.assertEquals(Cart.isDisplayedPayPalAccount(), "PayPal Guest Checkout", "expected name does not displayed");

        softAssert.assertAll();
    }

    @AfterClass
    public void quiteDriver() {
        Login.quiteDriver();
    }

}
