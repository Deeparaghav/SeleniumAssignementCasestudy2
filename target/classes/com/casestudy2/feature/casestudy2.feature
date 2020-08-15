Feature: to register and send mail after successful validation of profile

  @registration
  Scenario: to register a user
    Given the website is loaded
    When user enters mandatory details
    And Clicking on the Register button
    Then display the valid message if registered successfully

  @profilevalidation
  Scenario: to validate name and email
    Given user registered successfully
    When clicked on profile dropdown at top right corner
    Then display profile details such as name and email
    And validate name and email of the user

  @email
  Scenario: to check user is able to send email
    Given user wants to send a message to other user
    When subject is entered
    Then message should be entered
    And mail should be sent
   