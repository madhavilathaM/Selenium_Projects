Feature: Test guru99
1)valid data
2)invalid data
Scenario Outline: Test with Valid and Invalid Data
Background:
Given I should go to the Login Page
@PositiveTesting
Scenario: Test with Valid Data
When Enter the username "<user>"
And Enter the password "<password>"
And Click onthe Login Button
Then I should see the title name as "<title>"
Examples:
|user|password|title|
|user|user|Login: Mercury Tours|
|madhu|madhu123|Login: Mercury Tours|
@NegativeTesting
Scenario: Test with InValid Data
When Enter the username "<user>"
And Enter the password "<password>"
And Click onthe Login Button
Examples:
|user|password|
|user1|user1|
|madhu34|madhu163|

