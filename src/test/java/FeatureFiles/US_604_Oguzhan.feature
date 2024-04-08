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

    And Create Account Successfully
      | accountSuccessfully |
      | newAccountNumber |
      | accountPage |
      | logo |

    And Click On The Open New Account Again
      | openNewAccount|

    And Select The Account Type Again
      | savings |
      | accountIdSelect |

    And Create Account Successfully Again
      | accountSuccessfully |
      | newAccountNumber |
      | accountPage |




