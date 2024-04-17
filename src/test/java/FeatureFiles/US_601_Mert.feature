Feature: Register Functionality

  Background:
    Given Navigate to Parabank

  @SmokeTest @Regression @Accounts
  Scenario Outline: Register Funcitonality
    When Click on the element in LeftNav
      | registerButton |

    Then Fill in Registration information as a user and click the register button
      | firstNameInput       | <fName>           |
      | lastNameInput        | <lName>           |
      | addressInput         | <address>         |
      | cityInput            | <city>            |
      | stateInput           | <state>           |
      | zipCodeInput         | <zipCode>         |
      | phoneNumberInput     | <phoneNumber>     |
      | ssnNumberInput       | <ssnNumber>       |
      | userNameInput        | <userName>        |
      | passwordInput        | <password>        |
      | confirmPasswordInput | <confirmPassword> |

    And Click on the Element in Dialog
      | confirmRegisterBtn |

    And  User should be register successfullied


    Examples:
      | fName | lName   | address | city     | state   | zipCode | phoneNumber | ssnNumber | userName   | password | confirmPassword |
      | David | Mahoney | Beyoglu | Istanbul | Turkiye | 234     | 456         | 345       | testTitans7 | 9517536  | 9517536         |

