Feature: Keyword Density
  Me as a user of the WordCounter app
  I want to type a paragraph
  To check the keyword density typed

  @keywordDensity
  Scenario Outline: Count repeat words in a paragraph
    Given the user is in the application
    When the user writes the sentence <paragraph>
    Then the user verifies the word with density x1 <wordX1>
    And the user verifies the density x1 <densityX1>
    And the user verifies the word with density x2 <wordX2>
    And the user verifies the density x2 <densityX2>
    And the user verifies the word with density x3<wordX3>
    And the user verifies the density x3 <densityX3>

    Examples:
      | paragraph                                                                                                                                                                              | wordX1 | densityX1 | wordX2 | densityX2 | wordX3 | densityX3 |
      | Vio una mujer vestida de oro en el cogote de un elefante. Vio un dromedario triste. Vio un oso vestido de holandesa que marcaba el compás de la música con un cucharón y una cacerola. | de     | 4 (12%)   | un     | 4 (12%)   | Vio    | 3 (9%)    |
      | I have two daughters, Alana and Emma. the oldest is Alana she loves to sing more than Emma. Alana says that her sister prefers to dance.                                               | Alana  | 3 (9%)    | Emma.  | 2 (6%)    | to     | 2 (6%)    |
      | green green green green blue blue blue white white                                                                                                                                     | green  | 4 (44%)   | blue   | 3 (33%)   | white  | 2 (22%)   |
      | alana alana alana alana emma emma emma jhoel jhoel                                                                                                                                     | alana  | 4 (44%)   | emma   | 3 (33%)   | jhoel  | 2 (22%)   |
