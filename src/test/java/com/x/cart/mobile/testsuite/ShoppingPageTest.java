package com.x.cart.mobile.testsuite;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.google.common.base.Verify;
import com.x.cart.mobile.pages.CheckOutPage;
import com.x.cart.mobile.pages.HotDealsPage;
import com.x.cart.mobile.pages.ShoppingPage;
import com.x.cart.mobile.testbase.TestBase;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingPageTest extends TestBase {

    ShoppingPage shoppingPage = new ShoppingPage();
    HotDealsPage hotDealsPage = new HotDealsPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyUserShouldOrderSuccessfully() throws InterruptedException {
        //            1.1 Mouse hover on the “Hot deals” link
        hotDealsPage.hotDeals();
//            1.2 Mouse hover on the “Bestsellers”  link and click
        hotDealsPage.bestseller();
//            1.3 Verify the text “Bestsellers”
        String expectedText = "Bestsellers";
        String actualText = hotDealsPage.verifyBestseller();
        Assert.assertEquals(expectedText, actualText);
        Thread.sleep(2000);
//            1.4 Mouse hover on “Sort By” and select “Name A-Z”
        hotDealsPage.hoverOnSortBy();
        shoppingPage.aToZArrange();
        Thread.sleep(2000);
        //            1.5 Click on “Add to cart” button of the product “Avengers Toy"
        shoppingPage.product();
        shoppingPage.addToCart();
        Thread.sleep(2000);
        //            1.6 Verify the message “Product has been added to your cart” display in  green bar
        String expectedText1 = "Product has been added to your cart";
        String actualText1 = shoppingPage.addToCartText();
        Assert.assertEquals(expectedText1,actualText1);
        Thread.sleep(3000);
        //            1.7 Click on X sign to close the message
        shoppingPage.closeMessageBar();
        Thread.sleep(3000);
        //            1.8 Click on “Your cart” icon and Click on “View cart” button
        shoppingPage.yourCart();
        shoppingPage.viewCart();
        Thread.sleep(2000);
        //            1.9 Verify the text “Your shopping cart - 1 item”
        String expectedText2 = "Your shopping cart - 1 item";
        String actualText2 = shoppingPage.shoppingCartMessage();
        Assert.assertEquals(expectedText2,actualText2);
        Thread.sleep(3000);
        //            1.10 Verify the Subtotal
        String expectedText3 = "Subtotal: $14.99";
        String actualText3 = shoppingPage.subTotal();
        Assert.assertEquals(expectedText3,actualText3);
        Thread.sleep(3000);
        //            1.11 Verify the total
        String expectedText4 = "$20.75";
        String actualText4 = shoppingPage.total();
        Assert.assertEquals(expectedText4,actualText4);
        Thread.sleep(3000);
        //            1.12 Click on “Go to checkout” button
        shoppingPage.checkOut();
        Thread.sleep(1000);
        //   1.13 Verify the text “Log in to your account”
        String expectedText5 = "Log in to your account";
        String actualText5 = shoppingPage.loginAccountMessage();
        Assert.assertEquals(expectedText5,actualText5);
        Thread.sleep(3000);
        //            1.14 Enter Email address
        shoppingPage.enterEmail("abc@gmail.com");
        Thread.sleep(1000);
        //            1.15 Click on “Continue” Button
        shoppingPage.clickContinueBtn();
        Thread.sleep(1000);
        //            1.16 Verify the text “Secure Checkout”
        String expectedText6 = "Secure Checkout";
        String actualText6 = checkOutPage.secureCheckoutMessage();
        Assert.assertEquals(expectedText6,actualText6);
        Thread.sleep(3000);
        checkOutPage.firstName("Carl");
        Thread.sleep(1000);
        checkOutPage.lastName("Barby");
        Thread.sleep(1000);
        checkOutPage.address("20 Carl Street");
        Thread.sleep(1000);
        checkOutPage.cityName("London");
        checkOutPage.state("Middlesex");
        checkOutPage.zipCode("CV11VC");
        Thread.sleep(2000);
//        shoppingPage.selectCheckBox();
//        shoppingPage.password("ABC1234");
//        Thread.sleep(3000);
        checkOutPage.deliveryMethod();
        Thread.sleep(2000);
        checkOutPage.paymentMethod();
        Thread.sleep(2000);
        String expectedText7 = "$21.77";
        String actualText7 = checkOutPage.totalAmount();
        Assert.assertEquals(expectedText7,actualText7);
        Thread.sleep(3000);
        checkOutPage.placeOrder();
        String expectedText8 = "Thank you for your order";
        String actualText8 = checkOutPage.thankYouOrderText();
        Thread.sleep(3000);
    }
    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        hotDealsPage.hotDeals();
//            1.2 Mouse hover on the “Bestsellers”  link and click
        hotDealsPage.bestseller();
//            1.3 Verify the text “Bestsellers”
        String expectedText = "Bestsellers";
        String actualText = hotDealsPage.verifyBestseller();
        Assert.assertEquals(expectedText, actualText);
        Thread.sleep(2000);
//            1.4 Mouse hover on “Sort By” and select “Name A-Z”
        hotDealsPage.hoverOnSortBy();
        shoppingPage.aToZArrange();
        Thread.sleep(3000);
        shoppingPage.productAstro();
        Thread.sleep(3000);
        shoppingPage.addToCartBtnOne();
        Thread.sleep(3000);
        // Verify Message
        String expectedText1 = "Product has been added to your cart";
        String actualText1 = shoppingPage.addToCartText();
        Assert.assertEquals(expectedText1,actualText1);
        Thread.sleep(3000);
        //            1.7 Click on X sign to close the message
        shoppingPage.closeMessageBar();
        Thread.sleep(3000);
        //            1.8 Click on “Your cart” icon and Click on “View cart” button
        shoppingPage.yourCart();
        shoppingPage.viewCart();
        Thread.sleep(2000);
        //            1.9 Verify the text “Your shopping cart - 1 item”
        String expectedText2 = "Your shopping cart - 1 item";
        String actualText2 = shoppingPage.shoppingCartMessage();
        Assert.assertEquals(expectedText2,actualText2);
        Thread.sleep(3000);
        shoppingPage.clearItem();

        //         Verify the text “Are you sure you want to clear your cart?” on alert

        Alert alert = driver.switchTo().alert();
        String expectedMessage4 ="Are you sure you want to clear your cart?";
        String actualMessage4 = alert.getText();
        org.junit.Assert.assertEquals(actualMessage4,expectedMessage4);

        //     Click “Ok” on alert
        acceptAlert();
        Thread.sleep(1000);

        String expectedText3 = "Item(s) deleted from your cart";
        String actualText3 = shoppingPage.itemDeletedText();
        Assert.assertEquals(expectedText3,actualText3);
        Thread.sleep(3000);

        String expectedText4 = "Your cart is empty";
        String actualText4 = shoppingPage.cartEmptyText();
        Assert.assertEquals(expectedText4,actualText4);
        Thread.sleep(2000);

    }
}
