Feature: New Account Functionality

  Background:
    Given Navigate to Parabank

  Scenario Outline: Create New Account
    Given Enter username "<username1>" and password "<password1>" and click login button
    When Click On The Open New Account
      | openNewAccount |

    Then Select The Account Type
      | checking             |
      | accountIdSelect      |
      | openNewAccountButton |

    Then Success Message Should Be Displayed
    And Account Successfully
      | newAccountNumber |

    And Select The Account Type Again
      | savings              |
      | accountIdSelect      |
      | openNewAccountButton |

    And Success Message Should Be Displayed

    And Create Account Successfully Again
      | newAccountNumber |
      | accountPage      |

    And Success Account Page Control Should Be Displayed

    Examples:
      | username1   | password1 |
      | testTitans7 | 9517536   |








