Feature: LibraryCT

  @wip
  Scenario: verify the default record number is 10
    Given user is on landing page
    Then user should see the dashboard
    And user clicks to the Books module
    Then user should see the the default number is "10"
  @wip1
  Scenario: Show records for <count> options
    Given user is on landing page
    Then user should see the dashboard
    And user clicks to the Books module
    Then user should click on records
    Then user should see numbers in dropdown list
      | 5     |
      | 10    |
      | 15    |
      | 50    |
      | 100   |
      | 200   |
      | 500   |


#This is Manshuk's Test case: 5