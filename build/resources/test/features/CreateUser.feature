#language: en

Feature: User creation

  Scenario Outline: Create a new user
    Given that Fredy wants to access the page
    When enter the form
      | name   | lastName   | day   | month   | year   |
      | <name> | <lastName> | <day> | <month> | <year> |
    And look for my location
    And Diligence characteristics of my PC
    And I fill out my password

    Then I validate the user creation
    Examples:
      | name  | lastName | day | month    | year |
      | fredy | asprilla | 1   | February | 1994 |