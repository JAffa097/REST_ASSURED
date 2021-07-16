Feature: My first Scenario

  @asdf
  Scenario: fiest outline
    Given I navigate 11

  @asdf1
  Scenario Outline: fiest outline
    Given I navigate for <TestCaseID>

    Examples: 
      | TestcaseID |
      | testdata1  |
      | testdata2  |
