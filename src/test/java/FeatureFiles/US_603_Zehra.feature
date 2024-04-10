Feature: Paying Bills Functionality

  Background:
    Given Navigate to Parabank
    When Enter username and password and click login
    Then User should be login successfully


  Scenario Outline: Bill Pay
    When Click on the Bill Pay
      | billPay |
    Then Enter payee information
      | payeeName     | <namePayee>      |
      | address       | <addressPayee>   |
      | city          | <cityPayee>      |
      | state         | <statePayee>     |
      | zipCode       | <zipcodePayee>   |
      | phoneNumber   | <pNoPayee>       |
      | accountNo     | <accountNoPayee> |
      | verifyAccount | <vrfyAccount>    |
      | amount        | <amountPayee>    |
    And Click on the Send Payment Button
      | sendPayment |


    Examples:
      | namePayee | addressPayee     | cityPayee | statePayee | zipcodePayee | pNoPayee    | accountNoPayee | vrfyAccount | amountPayee |
      | EnerjiSa  | Üzüm Sokak No:26 | Sarıyer   | İstanbul   | 34096        | 05425638796 | 1122           | 1122        | 85          |


