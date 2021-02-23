Feature: As a user, I should able to see my borrowing books.

  Background:
  Given User should be locked in as a student

  Scenario: borrowing books table columns names
    Given the user on the homepage
    And the User click Borrowing Books module
    Then the user shouldsee the following column names:
      | Action              |
      | Book Name           |
      | Borrowed Date       |
      | Planned Return Date |
      | Return Date         |
      | Is Returned ?       |
