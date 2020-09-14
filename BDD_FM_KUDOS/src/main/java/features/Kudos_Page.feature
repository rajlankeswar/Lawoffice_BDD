@Kudos_Page_All_Scenarios
Feature: KUDOS Kudos_Page_All_Scenarios Feature

@ViewPost
Scenario: KUDOS View Post Scenario

Given user is already on Login Page
When title of login page is Login
Then user enters "Arjun" and "Arjun123"
Then user clicks on login button
Then validate user is on Create post page
Then view an existing post
Then logout from the application
Then close the browser

@CreatePost
Scenario: KUDOS Create Post Scenario

Given user is already on Login Page
When title of login page is Login
Then user enters "Arjun" and "Arjun123"
Then user clicks on login button
Then validate user is on Create post page
Then create a new post
Then logout from the application
Then close the browser

@LikePost
Scenario: KUDOS Like Post Scenario

Given user is already on Login Page
When title of login page is Login
Then user enters "Arjun" and "Arjun123"
Then user clicks on login button
Then validate user is on Create post page
Then Like a post
Then logout from the application
Then close the browser

@NegativeScenarioTitleNotMatch
Scenario: KUDOS Kudos Page Title Not Match Negative Scenario

Given user is already on Login Page
When title of login page is Login
Then user enters "Arjun" and "Arjun123"
Then user clicks on login button
Then validate user is on Create post page
Then Validate Title not matched intentionally
Then logout from the application
Then close the browser



