Feature: Parametrized application sign up
  @Regression
  Scenario Outline: Check user sign up
    Given User is in sign up page
    When User sign up with <username> and <password>
    Then User able to navigate to home page
    Examples:
      | username  | password |
      | user1     | pass1    |
      | user2     | pass2    |
      | user3     | pass3    |
      | user4     | pass4    |