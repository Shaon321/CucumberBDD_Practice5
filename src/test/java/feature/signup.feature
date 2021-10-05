Feature: Sign up
  Scenario: Student should be able to register with valid info
    Given I am at TalentTEK Homepage
    And I click Create New Account Button in Login Page
    And I enter a Student information
    When I click on Create my new account button
    Then I should see Thank you for sign up message