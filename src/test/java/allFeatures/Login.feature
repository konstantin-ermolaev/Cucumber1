Feature: Login Validation

  Background:
    Given User open the browser
    And User enters the url "www.gmail.com"


  @Smoke
  Scenario: Login functionality with valid credentials
    When User enters name "Hemant"
    And User enters password "123"
    And User clicks on Sign In button
    Then User should gt successfully logged in
    And Browser should get closed


  @Smoke
  Scenario Outline: Login functionality with multiple data values
    When User enters name <userName>
    And User enters password <password>
    And User clicks on Sign In button
    Then User should gt successfully logged in
    And Browser should get closed

  Examples:
    | userName | password |
    | hemant   | admin123 |
    | user 1   | pass1    |
    | user 2   | pass2    |
    | user 3   | pass3    |


  @Regression
  Scenario: Check email content
    When User logins to app
    Then User checks his signature line:
    """
    Hemant Rathod
    99998888
    """