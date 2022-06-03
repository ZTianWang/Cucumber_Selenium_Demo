@Test
Feature: Add numbers
  Scenario Template: Add two numbers
    Given I have opened the Add page
    When I entry the first num <num1>
    And I entry the second num <num2>
    And I click the add button
    Then The result <result> shows

    Examples:
      | num1 | num2 | result |
      | 1    | 1    | 2      |
      | 5    | 3    | 8      |
      | 0    | 0    | 0      |