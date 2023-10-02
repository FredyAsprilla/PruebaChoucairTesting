#language: en

Feature: User creation

  Scenario Outline: Create a new user
    Given that Fredy wants to access the page
    When enter the form
      | name   | lastName   | email   | day   | month   | year   |
      | <name> | <lastName> | <email> | <day> | <month> | <year> |
    And look for my location
      | city   | zip   | country   |
      | <city> | <zip> | <country> |
    And Diligence characteristics of my PC
      | computer   | version   | language   | mobile   | model   | os   |
      | <computer> | <version> | <language> | <mobile> | <model> | <os> |
    And I fill out my password
      | password   |
      | <password> |
    Then I validate the user creation
    Examples:
      | name  | lastName | email                          | day | month    | year | password        | city   | zip   | country | computer | version | language | mobile  | model   | os          |
      | fredy | asprilla | FredyAsprilla87877@hotmail.com | 1   | February | 1994 | TestPrueba12345 | Madrid | 28053 | Spain   | Windows  | Windows 10 Education      | Spanish  | Alcatel | Crystal | Android 1.5 |