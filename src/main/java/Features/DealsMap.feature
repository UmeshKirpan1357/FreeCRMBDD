Feature: Verify the DataTable with Map

Scenario: Verify the parameterization by using map with datatable

Given User is on Login Page
When Title of page is Free CRM
Then Enter username and password
|	username	|	password	|
|	umeshqa2019@gmail.com	|	Umesh@488	|
Then Click on Login button
Then User is on home page
Then user moved to create deals page
Then user enters deals details
|	Title	|	Description	|	Amount	|	Commission	|
| Test Deal1 | I am Deal Page1 | 1000 | 50 |
| Test Deal2 | I am Deal Page2 | 2000 | 60 |
| Test Deal3 | I am Deal Page3 | 3000 | 70 |
| Test Deal4 | I am Deal Page4 | 4000 | 80 |
Then click on save button
Then close the browser