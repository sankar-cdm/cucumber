Feature: Check to application
Scenario: verify the application is loggedin
Given User launch the application
When User enter the email in the subscription text box
Then User should see the verification message

Scenario Outline: verify tabs in homepage

When User click the "<tab>"
Then User should see the pages

Examples:
|tab|
|Dresses|





