Feature: Test Google search functionality

  Scenario: As user I enter a search criteria in Google
    Given I am on the Google search page
    When I enter a search criteria
    And Clic on the search button
    Then The results match the criteria
