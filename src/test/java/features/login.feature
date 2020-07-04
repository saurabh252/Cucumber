Feature: Application login
  Scenario: Check user login to home page
    Given User is onto login page
    When User entered the id "wright id" and password "write password"
    Then User able to navigate to home page


  Scenario: Check user not login with wrong credentials
    Given User is onto login page
    When User entered the id "saurabh" and password "1234"
    Then User not able to navigate to home page