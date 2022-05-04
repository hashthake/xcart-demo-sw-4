package com.x.cart.mobile.pages;

import com.x.cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuTestPage extends Utility {
    By shippingLink = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]/a[1]/span[1]");
    By verifyShipping = By.id("page-title");
    By newLink = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[4]/a[1]/span[1]");
    By verifyNew = By.id("page-title");
    By comingSoonLink =By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]/a[1]/span[1]") ;
    By verifyComingSoon = By.id("page-title");
    By contactUsLink = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[6]/a[1]/span[1]");
    By verifyContactUs = By.id("page-title");



    public void clickOnShipping(){
        clickOnElement(shippingLink);
    }
    public String verifyTextShipping(){
        return getTextFromElement(verifyShipping);
    }
    public void clickOnNew(){
        clickOnElement(newLink);
    }
    public String veriTextNew(){
        return getTextFromElement(verifyNew);
    }
    public void clickOnComingSoon(){
        clickOnElement(comingSoonLink);
    }
    public String verifyTextComingSoon(){
        return getTextFromElement(verifyComingSoon);
    }
    public void clickOnContactUs(){
        clickOnElement(contactUsLink);
    }
    public String verifyTextContactUs(){
        return getTextFromElement(verifyContactUs);
    }

}




