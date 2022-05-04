package com.x.cart.mobile.pages;

import com.x.cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    By secureCheckOutText = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]");
    By firstNameField = By.id("shippingaddress-firstname");
    By lastNameField = By.id("shippingaddress-lastname");
    By addressField = By.id("shippingaddress-street");
    By cityNameField = By.id("shippingaddress-city");
    By stateField = By.id("shippingaddress-custom-state");
    By zipCodeField = By.id("shippingaddress-zipcode");
    By selectCheckBoxBtn = By.id("create_profile");
    By passwordField = By.id("password");
    By deliveryMethodField = By.id("method128");
    By paymentMethodField = By.id("pmethod6");
    By totalAmtField = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]");
    By placeOrderField = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]");
    By thankYouOrderField = By.id("page-title");

    public String secureCheckoutMessage() {
        return getTextFromElement(secureCheckOutText);
    }

    public void firstName(String value) {
        sendTextToElement(firstNameField, value);
    }

    public void lastName(String value) {
        sendTextToElement(lastNameField, value);
    }

    public void address(String value) {
        sendTextToElement(addressField, value);
    }

    public void cityName(String value) {
        clearValue(cityNameField);
        sendTextToElement(cityNameField, value);
    }

    public void state(String value) {
        sendTextToElement(stateField, value);
    }

    public void zipCode(String value) {
        clearValue(zipCodeField);
        sendTextToElement(zipCodeField, value);
    }

    public void selectCheckBox() {
        clickOnElement(selectCheckBoxBtn);
    }

    public void password(String value) {
        sendTextToElement(passwordField, value);
    }
    public void deliveryMethod(){
        clickOnElement(deliveryMethodField);
    }
    public void paymentMethod(){
        clickOnElement(paymentMethodField);
    }
    public String totalAmount(){
        return getTextFromElement(totalAmtField);
    }
    public void placeOrder(){
        mouseHoverToElementAndClick(placeOrderField);
    }
    public String thankYouOrderText(){
        return getTextFromElement(thankYouOrderField);
    }
}