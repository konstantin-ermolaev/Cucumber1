Feature: Validate Registration Form For Multiple Users

  Scenario: Registration Form Entry Validation

    Given User open the browser
    And User enters the url
    And User navigates to the Registration page
    When User enters the multiple students details
      | firstName | lastName  | email             | gender  | phone       | subject        |
      | Ahan      | A         | Ahan.a@gmail.com  | Male    | 9861478950  | Maths          |
      | John      | S         | John.s@gmail.com  | Male    | 5487698621  | Computer Since |
      | Snita     | C         | Smita.c@gmail.com | Female  | 9861778950  | Maths          |
    Then Browser should get closed