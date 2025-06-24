package com.haoranzhang.playwright.webapp_test.locators;

public class RegisterLocators {
	public static final String SIGN_IN_BUTTON = "text=Sign in";
	public static final String SIGN_IN_USERNAME = "[data-testid='auth-email']";
	public static final String SIGN_IN_USERPASSWORD = "[data-testid='auth-password'] input";
	public static final String SIGN_IN_SUBMIT = "#login-btn";
	public static final String SIGN_IN_NORMAL = "[data-testid='menu-user-firstname']";
	public static final String SIGN_IN_RESULT = "span.active-bolder:has-text('Hello')";
	public static final String SIGN_IN_FRAME = "[data-testid='authentication']";
}
