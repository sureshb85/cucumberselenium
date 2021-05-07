@all_tests
Feature: Youtube search functionality
  Multiple datasets

  @regression @outline
  Scenario Outline: Youtube: search <search_text> using browser <browserType>
    Given open <browserType> brower and launch the url
    When enter the search keyword <search_text>
    And click on search button
    Then should see the search keyword <search_text> in the title

    Examples: 
      | browserType | search_text |
      | chrome      | Bahubali    |
      | firefox     | RRR         |
