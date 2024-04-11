Feature: New Account Functionality

  Background:
    Given Navigate to Parabank

  Scenario Outline:
    When Enter username "<username1>" and password "<password1>" and click login button

    Examples:
      | username1 | password1 |
      | testTitans7 | 9517536   |

  Scenario: Create New Account
    Given Click On The Open New Account
      | openNewAccount |

    When Select The Account Type
      | minimumDepositedAssert |
      | checking |
      | accountIdSelect |
      | openNewAccountButton |

    Then Success Message Should Be Displayed

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








