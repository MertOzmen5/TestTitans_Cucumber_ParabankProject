Feature: New Account Functionality

  Background:
    Given Navigate to Parabank
    When Enter username "<username1>" and password "<password1>" and click login button
    Then User should be login successfully



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
      | openNewAccount|

    And Select The Account Type Again
      | savings |
      | accountIdSelect |
      | openNewAccountButton |

    And Success Message Should Be Displayed

    And Create Account Successfully Again
      | newAccountNumber |

    And Success Account Page Control Should Be Displayed





