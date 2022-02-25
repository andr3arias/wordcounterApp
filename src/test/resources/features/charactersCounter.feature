Feature: Characters Counter
  Me as a user of the WordCounter app
  I want to type a paragraph
  To check the number of characters typed

  @CountCharactersWithoutSpaces
  Scenario Outline: Count characters in a paragraph
    Given the user is in the application
    When the user writes the sentence <paragraph>
    Then the user verifies that the number of characters were <countedCharacters>
    Examples:
      | paragraph                                                                                                                                                      | countedCharacters |
      | If you could see what I see when I look at you, You'd definitely love you, too. You would hold your head up high, For you possess beauty that no one can deny. | 158               |
      | I have two daughters Alana and Emma. Alana loves to sing, Emma prefers to dance.                                                                               | 80                |

  @CountCharactersWithNewlineSpaces
  Scenario Outline: Count characters in a paragraph
    Given the user is in the application
    When the user writes the sentence
  ```
  If you could see what I see when I look at you,
  You'd definitely love you, too.
  You would hold your head up high,
  For you possess beauty that no one can deny.
  ```
    Then the user verifies that the number of characters were <countedCharacters>
    Examples:
      | countedCharacters |
      | 155               |
