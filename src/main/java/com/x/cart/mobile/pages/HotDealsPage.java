package com.x.cart.mobile.pages;

import com.x.cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HotDealsPage extends Utility {
    By hotDealsLink = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]");
    By saleLink = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]");
    By verifyTextSale = By.id("page-title");
    By sortBy = By.xpath("//span[contains(text(),'Sort by:')]");
    By aToZ = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]");
    By lowToHigh = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
    By rates = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[7]/a[1]");
    By bestsellerLink = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[2]/a[1]/span[1]");
    By verifyTextBestseller = By.id("page-title");
    By zToA = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]");
    By highToLow = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]");


    public void hotDeals(){
        mouseHoverToElement(hotDealsLink);
    }
    public void sale(){
        mouseHoverToElementAndClick(saleLink);
    }
    public String verifySale(){
        return getTextFromElement(verifyTextSale);
    }
    public void hoverOnSortBy(){
        mouseHoverToElement(sortBy);
    }
    public void hoverAndClickAToZ(){
        mouseHoverToElementAndClick(aToZ);
    }
    public void hoverAndClicklowToHigh(){
        mouseHoverToElementAndClick(lowToHigh);
    }
    public void hoverAndClickRates(){
        mouseHoverToElementAndClick(rates);
    }
    public void bestseller(){
        mouseHoverToElementAndClick(bestsellerLink);
    }
    public String verifyBestseller(){
        return getTextFromElement(verifyTextBestseller);
    }
    public void hoverAndClickZToA(){
        mouseHoverToElementAndClick(zToA);
    }
    public void hoverAndClickHighTolow(){
        mouseHoverToElementAndClick(highToLow);
    }


}

