# Stampin' Up Automated UI Test (Playwright + Java)

This is a sample end-to-end UI automation project built using Playwright with Java and Maven.

## 🌐 Tested Site
https://www.stampinup.com/

## ✅ Test Coverage

- Navigate to the homepage  
- Login simulation  
- Select a product  
- Add product to cart  
- Proceed to checkout  
- Fill in shipping information  
- Confirm successful transition to the Payment page

## 🛠 Tech Stack

- Java 
- Maven  
- Playwright (Java)  
- JUnit & TestNG (mixed usage)  

## 📂 Project Structure

- src/
	- main/java
	 	- com.haoranzhang.playwright.webapp_test/
   			- pages/ # Page Object Models
      			- locators/ # Centralized selectors
         		- utils/ #userinfo        
	- test/java
 		- com.haoranzhang.playwright.webapp_test/
   			- FullFlowTest.java / # Test cases

## ▶️ How to Run

Make sure you have:
- Java
- Maven installed

📌 Notes
This project was created as a demo submission for a QA Engineer position.
If you'd like me to extend this test, or switch to a different target site, feel free to let me know.

Made by Haoran Zhang
