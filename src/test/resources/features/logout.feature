Feature: LogOut

  @wip
  Scenario: Verify successfully logged out
    Given User on the homepage
    When User log out from application
    Then User verify title is "Login - Library"