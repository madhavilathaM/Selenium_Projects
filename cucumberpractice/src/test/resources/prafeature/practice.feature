Feature: Test Guru99
1)valid case
2)Invalid case
Scenario Outline: Testing login functionality valid and invalid data
Background:
Given I should go to login page
@PositiveTesting
Scenario: Checking the login functionality with valid data
Given I should be in the login page
And Enter username "<user>"
And  Enter password "<pass>"
Then  click on the submitbutton
Examples:
|user|pass|
|user|user|
|madhu|madhu123|
@NegativeTesting
Scenario:Checking the login functionality with invalid data
Given I should be in the login page
And Enter username "<user>"
And  Enter password "<password>"
Then click on the submitbutton
Examples:
|user|password|
|user12|user34|
|madhu56|madhu78!|