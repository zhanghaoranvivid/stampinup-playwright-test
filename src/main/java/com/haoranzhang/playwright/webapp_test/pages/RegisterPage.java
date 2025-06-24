package com.haoranzhang.playwright.webapp_test.pages;
import static com.haoranzhang.playwright.webapp_test.locators.CheckOutLocators.PAYMENT_STEP;
import static com.haoranzhang.playwright.webapp_test.locators.RegisterLocators.*;
import static com.haoranzhang.playwright.webapp_test.locators.RegisterLocators.*;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;

public class RegisterPage {
	private final BasePage base;

    public RegisterPage(Page page) {
        this.base = new BasePage(page);
    }
    
    public void navigateToLogin() {
        base.getPage().navigate("https://www.stampinup.com/");
    }

    public void register(String email, String password) {
        base.click(SIGN_IN_BUTTON);
        base.waitForVisible(SIGN_IN_USERNAME);
        base.type(SIGN_IN_USERNAME, email);
        base.type(SIGN_IN_USERPASSWORD, password);
        base.click(SIGN_IN_SUBMIT);
        
        base.getPage().waitForSelector(SIGN_IN_NORMAL);
        base.getPage().waitForSelector(SIGN_IN_FRAME, 
              new Page.WaitForSelectorOptions().setState(WaitForSelectorState.HIDDEN));
    }
  
    public Boolean getResultText(String text) {
        return base.getText(SIGN_IN_RESULT).contains(text);
    }
}
