@View_Post
Feature: KUDOS View_Post Feature


Scenario: KUDOS View_Post Scenario

Given user is already on Login Page
When title of login page is Login
Then user enters "Arjun" and "Arjun123"
Then user clicks on login button
Then validate user is on Create post page
Then only view a post