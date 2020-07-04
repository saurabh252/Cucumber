Feature: Application sign up
  @Regression
  Scenario: Check user sign up
    Given User is in sign up page
    When User sign up with following details
      | name    | last name| email             | city     | state       |
      | saurabh | kumar | saurabh123@yahoo.com | Durgapur | West Bengal |
    Then User able to navigate to home page