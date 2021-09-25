@FunctionalTest
Feature: verify the tagging functionality of the Cucumber

@SmokeTest @RegressionTest @End2End
Scenario: Login with valid credentials
Given This is valid login test

@SmokeTest @RegressionTest
Scenario: Login with invalid credentials
Given This is valid login test

@SmokeTest @RegressionTest
Scenario: Verify the Home page functionality
Given This is Home page test

@SmokeTest
Scenario: Verify the contact page functionality
Given This is contact page test

@SmokeTest
Scenario: Verify the deals page functionality
Given This is deals page test

@RegressionTest
Scenario: Verify the task page functionality
Given This is task page test

@SmokeTest
Scenario: Verify the notes page functionality
Given This is notes page test

@SmokeTest@RegressionTest
Scenario: Verify the calendar page functionality
Given This is calendar page test

@SmokeTest
Scenario: Verify search functionality
Given This is search functionality test

@SmokeTest @RegressionTest
Scenario: Verify profile functionality
Given This is profile functionality test

@SmokeTest @RegressionTest @End2End
Scenario: Verify logout functionality
Given This is logout functionality test