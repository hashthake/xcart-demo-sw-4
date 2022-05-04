package com.x.cart.mobile.testsuite;

import com.x.cart.mobile.pages.HotDealsPage;
import com.x.cart.mobile.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HotDealsTest extends TestBase {
    HotDealsPage hotDealsPage = new HotDealsPage();

    @Test
    public void verifyProductsInHotDeals() throws InterruptedException {
        //            1.1 Mouse hover on the “Hot deals” link
        hotDealsPage.hotDeals();
        //            1.2 Mouse hover on the “Sale”  link and click
        hotDealsPage.sale();
        Thread.sleep(2000);
        //            1.3 Verify the text “Sale”
        String expectedText = "Sale";
        String actualText = hotDealsPage.verifySale();
        Assert.assertEquals(expectedText,actualText);
        Thread.sleep(2000);
        //            1.4 Mouse hover on “Sort By” and select “Name A-Z”
        hotDealsPage.hoverOnSortBy();
        hotDealsPage.hoverAndClickAToZ();

        ArrayList<String> list = new ArrayList<>();
        List<WebElement> elementsList = driver.findElements(By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/ul[1]"));
        for (WebElement we : elementsList) {
            list.add(we.getText());
            System.out.println(we);
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : list) {
            sortedList.add(s);
            System.out.println(s);
        }
    }
    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        //            1.1 Mouse hover on the “Hot deals” link
        hotDealsPage.hotDeals();
        //            1.2 Mouse hover on the “Sale”  link and click
        hotDealsPage.sale();
        Thread.sleep(2000);
        //            1.3 Verify the text “Sale”
        String expectedText = "Sale";
        String actualText = hotDealsPage.verifySale();
        Assert.assertEquals(expectedText, actualText);
        Thread.sleep(3000);
        hotDealsPage.hoverOnSortBy();
        //            2.4 Mouse hover on “Sort By” and select “Price Low-High”
        hotDealsPage.hoverAndClicklowToHigh();
    }

        @Test
                public void verifyproductsArrangedByRates() throws InterruptedException {
            //            1.1 Mouse hover on the “Hot deals” link
            hotDealsPage.hotDeals();
            //            1.2 Mouse hover on the “Sale”  link and click
            hotDealsPage.sale();
            Thread.sleep(2000);
            //            1.3 Verify the text “Sale”
            String expectedText1 = "Sale";
            String actualText1 = hotDealsPage.verifySale();
            Assert.assertEquals(expectedText1,actualText1);
            Thread.sleep(3000);
            hotDealsPage.hoverOnSortBy();
            hotDealsPage.hoverAndClickRates();

        }
        @Test
    public void verifyBestSellerProductsArrangedByZToA() throws InterruptedException {
            hotDealsPage.hotDeals();
            hotDealsPage.bestseller();
            Thread.sleep(3000);
            String expectedText = "Bestsellers";
            String actualText = hotDealsPage.verifyBestseller();
            Assert.assertEquals(expectedText,actualText);
            Thread.sleep(2000);
            hotDealsPage.hoverOnSortBy();
            hotDealsPage.hoverAndClickZToA();
        }
        @Test
    public void verifyBestSellerProductsPriceArrangedHighToLow() throws InterruptedException {
            hotDealsPage.hotDeals();
            hotDealsPage.bestseller();
            Thread.sleep(3000);
            String expectedText = "Bestsellers";
            String actualText = hotDealsPage.verifyBestseller();
            Assert.assertEquals(expectedText,actualText);
            Thread.sleep(2000);
            hotDealsPage.hoverOnSortBy();
            hotDealsPage.hoverAndClickHighTolow();
        }
        @Test
    public void verifyBestSellerProductsByRates() throws InterruptedException {
            hotDealsPage.hotDeals();
            hotDealsPage.bestseller();
            Thread.sleep(3000);
            String expectedText = "Bestsellers";
            String actualText = hotDealsPage.verifyBestseller();
            Assert.assertEquals(expectedText,actualText);
            Thread.sleep(2000);
            hotDealsPage.hoverOnSortBy();
            hotDealsPage.hoverAndClickRates();
        }

    }



