package com.x.cart.mobile.pages;

import com.x.cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingPage extends Utility {

    By hotDealsLink = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]");
    By aToZlink = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");
    By productLink = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[3]/div[1]/div[1]/a[1]/img[1]");
    By addToCartLink = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[3]/div[1]/div[2]/div[4]/div[1]/button[1]/span[1]");
    By addToCartMessage = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By closeMessage = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/a[1]");
    By yourCartLink = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[5]/div[4]");
    By viewCartLink = By.xpath("//span[contains(text(),'View cart')]");
    By shoppingCartText = By.id("page-title");
    By subtotalLink = By.xpath("//ul[@class='sums']//li[@class='subtotal']");
    By totalLink  = By.xpath("//li[@class='total']");
    By checkOutLink = By.xpath("//span[contains(text(),'Go to checkout')]");
    By loginAccountText = By.xpath("//h3[contains(text(),'Log in to your account')]");
    By emailField = By.id("email");
    By continueBtn = By.xpath("//span[contains(text(),'Continue')]");
    By productAstroField = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[1]/div[1]/div[1]/a[1]");
    By clearItemField = By.xpath("//a[contains(text(),'Empty your cart')]");
    By verifyItemDeletedMessage = By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]");
    By cartEmptyMessage = By.xpath("//h1[@id='page-title']");
    By addToCartOne = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[2]/div[1]/div[2]/div[4]/div[1]/button[1]/span[1]");


    public void hotDeals(){
        mouseHoverToElement(hotDealsLink);
    }
    public void aToZArrange(){
        clickOnElement(aToZlink);
    }
    public void product(){
        mouseHoverToElement(productLink);
    }
    public void addToCart(){
        clickOnElement(addToCartLink);
    }
    public String addToCartText(){
        return getTextFromElement(addToCartMessage);
    }
    public void closeMessageBar(){
        clickOnElement(closeMessage);
    }
    public void yourCart(){
        mouseHoverToElementAndClick(yourCartLink);
    }
    public void viewCart(){
        clickOnElement(viewCartLink);
    }
    public String shoppingCartMessage(){
        return getTextFromElement(shoppingCartText);
    }
    public String subTotal(){
        return getTextFromElement(subtotalLink);
    }
    public String total(){
        return getTextFromElement(totalLink);
    }
    public void checkOut(){
        clickOnElement(checkOutLink);
    }
    public String loginAccountMessage(){
        return getTextFromElement(loginAccountText);
    }
    public void enterEmail(String value){
        sendTextToElement(emailField,value);
    }
    public void clickContinueBtn(){
        clickOnElement(continueBtn);
    }
    public void productAstro(){
        mouseHoverToElement(productAstroField);
    }
    public void clearItem(){
        clickOnElement(clearItemField);
    }
    public String itemDeletedText(){
        return getTextFromElement(verifyItemDeletedMessage);
    }
    public String cartEmptyText(){
        return getTextFromElement(cartEmptyMessage);
    }
    public void addToCartBtnOne(){
        clickOnElement(addToCartOne);
    }


}







//            1.10 Click on “Empty your cart” link
//            1.11 Verify the text “Are you sure you want to clear your cart?” on alert
//            1.12 Click “Ok” on alert
//            1.13 Verify the message “Item(s) deleted from your cart”
//            1.15 Verify the text “Your cart is empty”