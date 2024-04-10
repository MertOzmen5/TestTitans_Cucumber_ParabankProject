Feature: Paying Bills Functionality

  Background:
    Given Navigate to Parabank
    When Enter username and password and click login
    Then User should be login successfully


  Scenario: Paying Funcitonality
    When Click on the element in LeftNav
      | billPay |


