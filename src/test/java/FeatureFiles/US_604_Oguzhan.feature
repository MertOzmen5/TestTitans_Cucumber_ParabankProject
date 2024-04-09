Feature: New Account Functionality

  Background:
    Given Navigate to Parabank
    When Enter username "<username>" and password "<password>" and click login button
    Then User should login successfully

  Scenario: Create New Account
    And Click On The Open New Account
      | openNewAccount |

    And Select The Account Type
      | minimumDepositedAssert |
      | checking |
      | accountIdSelect |
      | openNewAccountButton |

    And Success Message Should Be Displayed

    And Account Successfully
      | newAccountNumber |
      | accountPage |
      | logo |
      | openNewAccount|

    And Select The Account Type Again
      | savings |
      | accountIdSelect |

    And Success Message Should Be Displayed

    And Create Account Successfully Again
      | newAccountNumber |

    And Success Account Page Control Should Be Displayed





