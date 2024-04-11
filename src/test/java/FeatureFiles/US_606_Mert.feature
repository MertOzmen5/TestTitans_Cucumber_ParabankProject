Feature: Transfer Funds Functionality

  Background:
    Given Navigate to Parabank website
    When Enter username and password and click on login button
    Then User should login successfully

  Scenario: Money transfer between different accounts
    When Click on the element in LeftNav
      | transferFundsButton |

    And Click on the Element in Dialog
      | selectAccountButton |
      | transferAccount     |

    And User must enter the amount of money
      | transferAmount |

    And Click on the Element in Dialog
      | transferButton |

    And Money transfer must be successfull

    And Click on the element in LeftNav
      | accountsOverview |

    And Click on the Element in Dialog
      | confirmTransfer |
      | moneyValue      |

    And Money transfer was successful