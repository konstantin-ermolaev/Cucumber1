Feature: Login Validation

  Scenario: Login functionality with valid credentials
    Given User open the browser
    And User enters the url "www.gmail.com"
    And User clicks on Login button
    When User enters name "LGUser1"
    And User enters password "Password@1"
    And User clicks on Sign In button
    Then User should gt successfully logged in
    And Browser should get closed


