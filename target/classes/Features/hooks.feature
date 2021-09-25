Feature: Verify the hooks

Scenario: Deals Page

Given Enter URL
Given User is on Deals page
Then Enter deals details
Then Deals get created
Then Logout

Scenario: Contact Page

Given Enter URL
Given User is on Contact page
Then Enter Contact details
Then Contact get created
Then Logout