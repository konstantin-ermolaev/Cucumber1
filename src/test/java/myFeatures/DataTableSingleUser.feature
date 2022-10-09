Feature: Validate Registration Form For A Single User

  Scenario: Registration Form Entry Validation

    Given User open the browser
    And User enters the url
    And User navigates to the Registration page
    When User enters the single student details
    | Ahan | A | Ahan.a@gmail.com | Male | 9861478950 | Maths |
    Then Browser should get closed