Feature: Login Functionality

  Background:
    Given Navigate to Parabank

    @Accounts @Smoke @Reggresion
  Scenario Outline: Login with valid username and password
    When Enter wrong username "<username>" and password "<password>" and click login button
    Then User should be not login successfully

    Examples:
      | username | password |
      | null     | null     |

  @Accounts @Smoke @Reggresion
  Scenario Outline: Login with valid username and password
    When Enter username "<username1>" and password "<password1>" and click login button
    Then User should be login successfully

    Examples:
      | username1   | password1 |
      | testTitans7 | 9517536   |
