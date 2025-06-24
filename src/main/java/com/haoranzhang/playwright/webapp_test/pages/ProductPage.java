package com.haoranzhang.playwright.webapp_test.pages;
import static com.haoranzhang.playwright.webapp_test.locators.ProductLocators.*;

import com.microsoft.playwright.Page;

public class ProductPage {
	private final BasePage base;

    public ProductPage(Page page) {
        this.base = new BasePage(page);
    }
    

    public void searchProduct() {
        base.click(PRODUCT_MENUE);
        base.click(PRODUCT_INK);
        //base.click(PRODUCT__STAMPS_ALL);
        base.clickFirstWhenVisible(PRODUCT_SELECT_FIRST_PRODUCT);
        base.click(PRODUCT_ADD_CART);
    }
}
