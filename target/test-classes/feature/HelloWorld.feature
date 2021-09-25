Feature: Validate "Hello World" word is printing
  Scenario: Write Hello World
    Given The user is having a new project
    When The user writes Hello World test
    Then The user should be able to run it and see printed String