@Create_Post
Feature: KUDOS Create_Post Feature

Scenario: KUDOS Create_Post Scenario

Given user is already on Login Page
When title of login page is Login
Then user enters "Arjun" and "Arjun123"
Then user clicks on login button
Then user is on Create post page
Then only create a new post
