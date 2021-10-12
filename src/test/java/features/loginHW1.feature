Feature: Login feature test
  Scenario: Login with invalid email and valid password
    Given I am at TalentTEK homepage
    And I enter a invalid email
    And I enter a valid password
    When I click login button
    Then i should not be able to successfully login