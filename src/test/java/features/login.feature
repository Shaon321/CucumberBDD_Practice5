Feature: Login feature test
  Scenario: Login with valid email and password
    Given I am at TalentTEK Homepage
    And I enter a valid email
    And I enter a valid password
    When I click a Login Button
    Then I should be able to successfully login