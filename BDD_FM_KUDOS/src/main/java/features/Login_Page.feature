@Login_Page_All_Scenarios
Feature: KUDOS Login_Page_All_Scenarios Feature

@Login_Without_Data_Driven
Scenario: KUDOS login test scenario without data driven

Given user is already on Login Page
When title of login page is Login
Then user enters username and password
Then user clicks on login button
Then validate user is on Create post page
Then logout from the application
Then close the browser

@Login_With_Data_Driven
Scenario Outline: KUDOS login test scenario with data driven

Given user is already on Login Page
When title of login page is Login
Then user enters "<username>" and "<Arjun123>"
Then user clicks on login button
Then validate user is on Create post page
Then logout from the application
Then close the browser


Examples:
	| username | password |
	| Arjun    | Arjun@123|
	
	

@Login_With_Data_Driven_Navative_Scenatio
Scenario Outline: KUDOS login test negative scenario with data driven

Given user is already on Login Page
When title of login page is Login
Then user enters "<username>" and "<password3>" as null values
Then user clicks on login button
Then validate user is not logged in due to missing login creadentilas
Then close the browser

Examples:
	| username  | password  |
	| 		    |   		|