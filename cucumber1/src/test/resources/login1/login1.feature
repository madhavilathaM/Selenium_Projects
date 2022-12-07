Feature: Test SkillRay
1)Valid Data
2)Invalid Data
Background:
Given I should go to the login page
@PositiveTesting
Scenario: To Test Login Functionality with valid data
And Enter the username "<user>"
And Enter the password "<password>"
And Click on the login button
Then I should see the username as "<username>"
Examples:
|user|password|username|
|admin|admin|SkillRary Admin|
|user|user|harry harry|
@NegativeTesting
Scenario: To Test Login Functionality with invalid data
And Enter the username "<user>"
And Enter the password "<password>"
And Click on the login button
Examples:
|user|password|
|admin123|admin|
|user12|user|