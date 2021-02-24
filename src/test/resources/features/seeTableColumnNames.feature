@TC-6
Feature: As a students, I should be able to see tables with default info

  Background:
    Given User should be locked in as a student name

  Scenario: Table columns names
    Given the user should be able to see the following column names:
      | Actions     |
      | ISBN        |
      | Name        |
      | Author      |
      | Category    |
      | Year        |
      | Borrowed By |