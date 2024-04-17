
Feature: Loan Functionality


  Scenario Outline: Loan Applicaiton

    Given Navigate to ParaBank
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the Element in Dialog
      | requestLoan |

    And User send keys in Dialog

      | loanAmount  | <loanamount> |
      | downPayment | <downpayment> |

    And Click on the Element in Dialog
      | applyNowButton |


    Then User should see loan approved message

    And Click on the Element in Dialog
      | newAccountID |



    Then User Should see no transaction message



    Examples:
      | loanamount | downpayment |
      | 2000   | 400   |

