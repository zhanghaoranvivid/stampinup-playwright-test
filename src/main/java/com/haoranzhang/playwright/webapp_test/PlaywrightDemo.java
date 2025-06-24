package com.haoranzhang.playwright.webapp_test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightDemo {
	 public static void main(String[] args) {
		    try (Playwright playwright = Playwright.create()) {
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		      Page page = browser.newPage();
		      page.navigate("https://stampinup.com");
		      System.out.println("Page title: " + page.title());
		      browser.close();
		    }
		  }

}
