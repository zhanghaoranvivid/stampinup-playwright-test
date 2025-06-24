package com.haoranzhang.playwright.webapp_test.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;

public class BasePage {
	 protected Page page;
	    public BasePage(Page page) {
	        this.page = page;
	    }
	    
	    public Page getPage() {
	        return this.page;
	    }
	    
	    protected void waitForVisible(String selector) {
	        page.locator(selector).waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
	    }
	  
	    protected void click(String selector) {
	        page.click(selector);
	    }
	    
	    protected void clickFirstWhenVisible(String selector) {
	    	Locator element = page.locator(selector).first();
	        element.waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
	        element.click();
	    }

	    protected void type(String selector, String text) {
	        page.fill(selector, text);
	    }

	    protected String getText(String selector) {
	        return page.textContent(selector);
	    }
	    
}
