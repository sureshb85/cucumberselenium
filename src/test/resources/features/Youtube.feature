@all_tests
Feature: Youtube search functionality
  Multiple datasets

  @smoke @regression
  Scenario: Title of your scenario
    Given User opens chrome brower and launches the url
    When User enters the search keyword RRR
    And User clicks on search button
    Then User should see the search keyword RRR in the title

  @regression @chrome
  Scenario: Title of your scenario
    Given User opens "chrome" brower and launches the url
    When User enters the search keyword "Bahubali"
    And User clicks on search button
    Then User should see the search keyword "Bahubali" in the title

  @regression @firefox
  Scenario: Title of your scenario
    Given User opens "firefox" brower and launches the url
    When User enters the search keyword "Bahubali"
    And User clicks on search button
    Then User should see the search keyword "Bahubali" in the title

  @regression @outline
  Scenario Outline: Title of your scenario
    Given User opens <browserType> brower and launches the url
    When User enters the search keyword <search_text>
    And User clicks on search button
    Then User should see the search keyword <search_text> in the title

    Examples: 
      | browserType | search_text |
      | chrome      | Bahubali    |
      | firefox     | RRR         |
