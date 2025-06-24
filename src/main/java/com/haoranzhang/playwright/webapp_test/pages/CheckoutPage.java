package com.haoranzhang.playwright.webapp_test.pages;
import static com.haoranzhang.playwright.webapp_test.locators.CheckOutLocators.*;
import static com.haoranzhang.playwright.webapp_test.locators.RegisterLocators.SIGN_IN_RESULT;

import com.microsoft.playwright.Page;

public class CheckoutPage {
	private final BasePage base;

    public CheckoutPage(Page page) {
        this.base = new BasePage(page);
    }
    

    public void proceedToCheckout(String firstName, String lastName,String address1, String address2, String city, String zip, String phone) {
        base.click(PRODUCT_CART_QTY);
        base.waitForVisible(CHECK_BTN_SUB);
        base.click(CHECK_BTN_SUB);
        
        //add new address
        base.clickFirstWhenVisible(CHECK_EDIT_ADDRESS);
        base.click(CHECK_ADD_ADDRESS);
        base.waitForVisible(CHECK_FIRSTNAME);
        base.type(CHECK_FIRSTNAME, firstName);
        base.type(CHECK_LASTNAME, lastName);
        base.type(CHECK_ADDRESS_1, address1);
        base.type(CHECK_ADDRESS_2, address2);
        base.type(CHECK_ADDRESS_CITY, city);
        base.click(CHECK_ADDRESS_STATE);
        base.click(CHECK_ADDRESS_STATE_SELECT);
        base.type(CHECK_ADDRESS_ZIP, zip);
        base.type(CHECK_PHONE, phone);
        base.click(CHECK_CONTINUE);
        
    }
    public Boolean getResultText(String text) {
        return base.getText(PAYMENT_STEP).contains(text);
    }
}
