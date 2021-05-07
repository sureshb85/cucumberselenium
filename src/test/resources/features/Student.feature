@all_tests
Feature: Students information
  Multiple datasets

  @student
  Scenario: Student Details
    Given The Student details as below
      | name | rollNo |
      | John |      4 |
      | Mark |      3 |
    Then Student details are printed

    
    # cucumber Keywords [Given, When, Then, And, But]
    # Tags
    # Hooks
    # Datatables [as List<List>, List<Map>]
    # Scenario
    # Scenario Outline
    # cucumber paralle execution
    
    
    # cucumber maven
    # How do you make profiles without using testng.xml to run only smoke, regression
    # Cucumber with Docker [setting up containers to run the testcases in parallel, cross-browser]
    