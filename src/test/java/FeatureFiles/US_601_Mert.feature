Feature: Register Functionality

  Scenario: Register on Parabank website

    Given Navigate to Parabank
    When Click the register button

  Scenario Outline: Register Funcitonality
    Then Fill in Registration information as a user and click the register button
      | firstNameInput       | <fName>           |
      | lastNameInput        | <lName>           |
      | addressInput         | <address>         |
      | cityInput            | <city>            |
      | stateInput           | <state>           |
      | zipCodeInput         | <zipCode>         |
      | ssnNumberInput       | <ssnNumber>       |
      | userNameInput        | <userName>        |
      | passwordInput        | <password>        |
      | confirmPasswordInput | <confirmPassword> |

    Examples:
      | fName | lName   | address | city     | state   | zipCode | ssnNumber | userName   | password | confirmPassword |
      | David | Mahoney | Beyoglu | Istanbul | Turkiye | 234     | 456       | testTitans | 9517536  | 9517536         |


    And  User should be register successfullied
