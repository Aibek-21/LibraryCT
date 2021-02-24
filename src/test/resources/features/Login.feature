Feature: As a user, I should be able to login to the library app
          verify both Students and librarians  login

  Background: User is already in login page
    Given user is on the login page

  @student
  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should see dashboard

  @librarian
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see dashboard


