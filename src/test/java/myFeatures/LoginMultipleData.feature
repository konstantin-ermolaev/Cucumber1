Feature: Multiple Login Validation

  @Smoke
  Scenario Outline: Login functionality with multiple data values
    Given User open the browser
    And User enters the url
    And User clicks on Login button
    When User enters name from datatable "<userName>"
    And User enters password from datatable "<password>"
    And User clicks on Sign In button
    Then User should get successfully logged in
    And Browser should get closed

    Examples:
    | userName  | password    |
    | LGUser1   | Password@1  |
    | LGUser1   | Password@1  |
    | LGUser2   | Password@2  |
    | LGUser2   | Password@2  |