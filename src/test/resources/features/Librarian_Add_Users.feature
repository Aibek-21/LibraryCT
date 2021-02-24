Feature: Librarian add users

  Scenario Outline:add users with all valid info
    Given the librarian is on the users page
    When  user  click add user
    And user enter Full Name "<fullName>"
    And user enter password "<password>"
    And user enter User Group "<userGroup>"
    And user enter Start Date "<startDate>"
    And user enter Email "<email>"
    And user enter Status "<status>"
    And user enter End Date "<endDate>"
    Then  And check user should be displayed by "<fullName>"

    Examples:
      | fullName  | password | userGroup | startDate  | email                 | status   | endDate    |
      | John Doe  | pass123  | Librarian | 2021-02-21 | email1234@hotmail.com | ACTIVE   | 2021-03-21 |
      | Alex User | abc456   | Students  | 2021-02-21 | alex1235@hotmail.com  | INACTIVE | 2021-03-21 |
