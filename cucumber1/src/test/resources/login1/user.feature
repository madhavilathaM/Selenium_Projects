Feature: Test SkillRay
Scenario: To Test Login Functionality
Given I should go to the login page
And Enter the username "user"
And Enter the password "user"
And Click on the login button
Then I should see the username as "harry harry"