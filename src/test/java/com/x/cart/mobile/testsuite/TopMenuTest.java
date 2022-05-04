package com.x.cart.mobile.testsuite;

import com.x.cart.mobile.pages.TopMenuTestPage;
import com.x.cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    TopMenuTestPage topMenuTestPage = new TopMenuTestPage();

        @Test
        public void verifyUserShouldNavigate() throws InterruptedException {
//            1.1 Click on the “Shipping” link
            topMenuTestPage.clickOnShipping();
            //            1.2 Verify the text “Shipping”
            String expectedText = "Shipping";
            String actualText = topMenuTestPage.verifyTextShipping();
            Assert.assertEquals(expectedText,actualText);
            Thread.sleep(2000);
//            2.1 Click on the “New!” link
            topMenuTestPage.clickOnNew();
            //            2.2 Verify the text “New arrivals”
            String expectedText1 = "New arrivals";
            String actualText1 = topMenuTestPage.veriTextNew();
            Assert.assertEquals(expectedText1,actualText1);
            Thread.sleep(2000);
//            3.1 Click on the “Coming soon” link
            topMenuTestPage.clickOnComingSoon();
//            3.2 Verify the text “Coming soon”
            String expectedText2 = "Coming soon";
            String actualText2 = topMenuTestPage.verifyTextComingSoon();
            Thread.sleep(2000);
            //            4.1 Click on the “Contact us” link
            topMenuTestPage.clickOnContactUs();
            //            4.2 Verify the text “Contact us”
            String expectedText3 = "Contact us";
            String actualText3 = topMenuTestPage.verifyTextContactUs();
            Assert.assertEquals(expectedText3,actualText3);
            Thread.sleep(3000);



    }
}
