Feature: Login Validation

  @Smoke
  Scenario: Login functionality with valid credentials
    Given User open the browser
    And User enters the url
    And User clicks on Login button
    When User enters name "LGUser1"
    And User enters password "Password@1"
    And User clicks on Sign In button
    Then User should get successfully logged in
    And Browser should get closed


