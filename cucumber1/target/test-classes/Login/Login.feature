Feature: Test OrangeHRM
1)Valid Data
2)Invalid Data
Background:
Given I should go to the login page
@PositiveTesting
Scenario: To Test login functionality with valid data
And Enter the username "Admin"
And Enter the password "admin123"
And Click on the login button
Then I should see the username as "Jane Collings"
@NegativeTesting
Scenario: To Test login functionality with invalid data
And Enter the username "admin"
And Enter the password "admin123"
And Click on the login button
Then I should see the username as "Jane Collings"