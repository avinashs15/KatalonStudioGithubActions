@login
Feature: Login to healthcare App
  Test Login functionality

  @valid
  Scenario: Test Login
    Given I launch healthcare page
    When I navigate to login page
    When I login with user 'John Doe' and password 'ThisIsNotAPassword'
    Then I verify that home page is displayed
    Then I should be able to add appointment
    Then I should log out of the healthcare app
    Then I close the browser
