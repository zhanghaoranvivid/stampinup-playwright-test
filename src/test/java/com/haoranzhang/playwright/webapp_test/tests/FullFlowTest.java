package com.haoranzhang.playwright.webapp_test.tests;

import static org.testng.AssertJUnit.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import com.haoranzhang.playwright.webapp_test.pages.CheckoutPage;
import com.haoranzhang.playwright.webapp_test.pages.ProductPage;
import com.haoranzhang.playwright.webapp_test.pages.RegisterPage;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.WaitForSelectorState;
import static com.haoranzhang.playwright.webapp_test.locators.CheckOutLocators.*;

import com.microsoft.playwright.Page;
import static com.haoranzhang.playwright.webapp_test.utils.TestCredentials.*;
import static com.haoranzhang.playwright.webapp_test.utils.TestData.*;
public class FullFlowTest {
	static Playwright playwright;
    static Browser browser;
    BrowserContext context;
    Page page;

    @BeforeAll
    static void setupAll() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    }

    @BeforeEach
    void setup() {
        context = browser.newContext();
        page = context.newPage();
    }
    
    @Test
    void testFullUserFlow() {
        RegisterPage registerPage = new RegisterPage(page);
        ProductPage productPage = new ProductPage(page);
        CheckoutPage checkoutPage = new CheckoutPage(page);
        registerPage.navigateToLogin();
        registerPage.register(EMAIL, PASSWORD);
        
        //Assertion: Login success - greeting message appears
        Assert.assertTrue(registerPage.getResultText("Hello"));
        productPage.searchProduct();
        checkoutPage.proceedToCheckout(FIRST_NAME,
        	    LAST_NAME,
        	    ADDRESS1,
        	    ADDRESS2,
        	    CITY,
        	    POSTAL_CODE,
        	    PHONE); 
        
        //Assertion: Payment step reached
        Assert.assertTrue(checkoutPage.getResultText("Payment Method"));    
    }

    @AfterEach
    void teardown() {
        context.close();
    }

    @AfterAll
    static void teardownAll() {
        browser.close();
        playwright.close();
    }
}
