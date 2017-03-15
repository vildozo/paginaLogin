@LoginPage
Feature: Does Login Page has inputs for login and submit button

Scenario: Checking fields in the Login Page
	Given I am in the Login Page
	When  I enter usuario 'Ruben ' 
	Then I have a user field
	And I have a password field
	And I have a logearse