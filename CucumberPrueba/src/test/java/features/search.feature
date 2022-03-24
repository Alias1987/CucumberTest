
Feature: Search
 

  Scenario: Search dresses
    Given The user is in the index page
    When the user enters dresses in the search bar
    And the user clicks on the search button
    Then dresses page appears
