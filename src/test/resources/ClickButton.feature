Feature: Click Button Test

  Scenario: Click "Click Me" button and verify the message
    When I navigate to the Buttons page
    And I click the Click Me button
    Then I should see the message "You have done a double click"
