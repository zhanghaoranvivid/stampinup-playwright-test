package com.haoranzhang.playwright.webapp_test.locators;



import com.haoranzhang.playwright.webapp_test.pages.BasePage;
import com.microsoft.playwright.Page;

public class CheckOutLocators {
	public static final String PRODUCT_CART_QTY = "[data-testid='cart-qty']";
	public static final String CHECK_BTN_SUB = "[data-testid='btn-order-submit']";
	public static final String CHECK_EDIT_ADDRESS = "[data-testid='edit-btn']";
	public static final String CHECK_ADD_ADDRESS = "text=ADD A NEW ADDRESS";
	public static final String CHECK_FIRSTNAME = "input[name='firstName']";
	public static final String CHECK_LASTNAME = "input[name='lastName']";
	public static final String CHECK_ADDRESS_1 = "[data-recurly='addressLine1']";
	public static final String CHECK_ADDRESS_2 = "[data-recurly='addressLine2']";
	public static final String CHECK_ADDRESS_CITY = "[data-recurly='city']";
	public static final String CHECK_ADDRESS_STATE = "[data-testid='address-field-region-container']";
	public static final String CHECK_ADDRESS_STATE_SELECT= "text=Arkansas";
	public static final String CHECK_ADDRESS_ZIP = "[data-recurly='postalCode']";
	public static final String CHECK_PHONE = "[data-recurly='phone']";
	public static final String CHECK_CONTINUE = "[data-testid='address-save']";
	public static final String PAYMENT_STEP = "h4.subheading:has-text('Payment Method')";
}
