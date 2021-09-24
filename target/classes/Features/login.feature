Feature: Free CRM Login feature

Scenario: Verify Free CRM Login Functionality

#Given User is on Login Page
#When Title of page is Free CRM
#Then Enter username and password
#Then Click on Login button
#And User is on home page


#Without Example Keyword
#Scenario: Verify Free CRM Login Functionality
#Given User is on Login Page
#When Title of page is Free CRM
#Then Enter "umeshqa2019@gmail.com" and "Umesh@488"
#Then Click on Login button
#And User is on home page

#With Examples Keyword
Scenario Outline: Verify Free CRM Login Functionality
Given User is on Login Page
When Title of page is Free CRM
Then Enter "<username>" and "<password>"
Then Click on Login button
And User is on home page

Examples:
|username|password|
|umeshqa2019@gmail.com|Umesh@488|
|wronguser|12345|