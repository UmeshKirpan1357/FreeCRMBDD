Feature: Verify the create contacts functionality

#With Examples Keyword
Scenario Outline: Create Contacts Functionality

Given User is on Login Page
When Title of page is Free CRM
Then Enter "<username>" and "<password>"
Then Click on Login button
Then User is on home page
Then user moved to create contact page
Then user enters "<firstname>" and "<lastname>" and "<description>"
Then click on save button
Then close the browser

Examples:
|username				|password	|firstname	|lastname	|description	|
|umeshqa2019@gmail.com	|Umesh@488	|David		|Dsouza		|Director		|
|umeshqa2019@gmail.com	|Umesh@488	|Tom		|Peter		|Manager		|