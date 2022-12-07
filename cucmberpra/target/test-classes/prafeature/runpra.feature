Feature: Test OrangeHRM
1)valid data
2)invalid data
Scenario Outline: Testing Login Functionality with valid and Invalid data
Background: 
Given Goto login Page
@PositiveTesting
Scenario: Testing Login Functionality with valid data
Given Go to login page
Then Enter Username "Admin"
And Enter Password "admin123"
And Click Login Button
And User Name Should be "Paul Collings"
Then Click Logout
@NegativeTesting
Scenario: Testing Login Functionality with  Invalid data
Given Go to login page
Then Enter Username "Admin"
And Enter Password "admin123"
And Click Login Button
And User Name Should be "paul Collings1"
Then Click Logout