Feature: Update Contact information

  Background:
    Given Navigate to Parabank website
    When Enter username and password and click on login button
    Then User should login successfully
    And Navigate to Update Contact Info page
      | updateContactInfo |

  Scenario Outline:

    Given Enter new information in the relevant fields and click on update button
      | firstNameInput | <firstName>   |
      | lastNameInput  | <lastName>    |
      | addressInput   | <address>     |
      | cityInput      | <city>        |
      | stateInput     | <state>       |
      | zipCodeInput   | <zipCode>     |
      | phoneInput     | <phoneNumber> |

    When User should successfully update the contact information
      | updateProfileBtn     |
      | updateProfileSuccess |

    Examples:
      | firstName | lastName | address | city    | state    | zipCode | phoneNumber |
      | Michael   | Scofield | Canal   | Chicago | Illinois | 10018   | 1388221     |

  Scenario:
    Given Delete at least three options from the contact information

    When User should successfully confirm the warning message
      | updateProfileBtn  |
      | updateProfileFail |




