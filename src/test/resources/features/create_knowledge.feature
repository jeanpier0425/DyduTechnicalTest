Feature: Create knowledge
  I as user
  I want to create a knowledge
  To create a bot

  Scenario Outline: Create knowledge successfully
    Given The user opens the website
    When The user logs in with user <user> and with password <password>
    And  It creates bot with name <nameBot> and language <language>
    And  It creates new knowledge with the request <request> and answer <answer>


    Examples:
      | user         | password      | nameBot        | language | request                           | answer                           |
      | qa@dydu-c.ai | 52)4}2QMsP+np | JhamAlzate_001 | English  | I dgdfgdgdgdfg | What dgfd would you like?? |