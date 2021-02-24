Feature: As a user, I should be able to  see several modules once I login.


  Scenario: Students should have access to 2 modules
    Given the student on the home page
    Then the user should see following modules
      | Books           |
      | Borrowing Books |
