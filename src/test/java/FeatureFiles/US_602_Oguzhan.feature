Feature: Login Functionality

  Scenario: Login with valid username and password

    Given Navigate to Parabank
    When Enter wrong username "<username>" and password "<password>" and click login button
    Then User should be not login successfully

    When Enter username "<username>" and password "<password>" and click login button
    Then User should login successfully
