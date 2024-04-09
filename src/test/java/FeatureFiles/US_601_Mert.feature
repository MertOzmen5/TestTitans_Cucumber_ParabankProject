Feature: Register Functionality

  Scenario: Register on Parabank website

    Given Navigate to Parabank
    When Click the register button
    Then Fill in Registration information as a user and click the register button
    And  User should be login successfullied
