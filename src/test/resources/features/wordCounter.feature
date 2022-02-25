Feature: Word Counter
  Me as a user of the WordCounter app
  I want to type a sentence
  To check the number of words typed

  @SentencesWithoutNumbers
  Scenario Outline: Count words in a sentence without numbers
    Given the user is in the application
    When the user writes the sentence <sentence>
    Then the user verifies that the number of words were <countedWords>
    Examples:
      | sentence                   | countedWords |
      | This phrase has five words | 5            |

  @SentencesWithoutNumbers
  Scenario Outline: Count words in a sentence with numbers
    Given the user is in the application
    When the user writes the sentence <sentence>
    Then the user verifies that the number of words were <countedWords>
    Examples:
      | sentence                | countedWords |
      | This phrase has 5 words | 4            |