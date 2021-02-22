Feature: Users category feature


@wip
  Scenario: Verify Users categories
    Given User (librarian) on the home page
    When User click users module
    And User click users group dropdown
    Then User should see following options
      | ALL       |
      | Librarian |
      | Students  |