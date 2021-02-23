Feature: User management table feature
  As a user, when I login as librarian and I go to Users page, then table should have following columns:

  @management
  Scenario: user management table columns names

    Given the user(librarian) on the homepage
    When the user click users module
    Then the user should see the following column names:
      | Actions         |
      | User ID         |
      | Full Name       |
      | Email           |
      | Group           |
      | Status          |



  #To enable screen reader support, press ⌘+Option+Z To learn about keyboard shortcuts, press ⌘slash

