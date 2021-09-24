Feature: To verify the free CRM

Scenario: Verify the deals page

Given User is on Login Page
When Title of page is Free CRM
Then Enter username and password
|	umeshqa2019@gmail.com	|	Umesh@488	|
Then Click on Login button
Then User is on home page
Then user moved to create deals page
Then user enters deals details
| Test Deal | I am Deal Page | 1000 | 200 |
Then click on save button
Then close the browser