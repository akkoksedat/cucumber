Feature: Add Record Test

  Scenario: Add a new record and verify it
    When I navigate to the Web Tables page
    And I click the Add button
    And I enter first name "John"
    And I submit the form
    Then I should see the first name "John" in the table
