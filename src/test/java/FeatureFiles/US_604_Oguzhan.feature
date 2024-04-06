Feature: New Account Functionality

  Background:
    Given Navigate to Parabank
    When Enter username "<username>" and password "<password>" and click login button
    Then User should login successfully

    Scenario: Create New Account
      And Click On The Open New Account

      And Select The Account Type

      And Create Account Successfully

      

