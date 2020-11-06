Feature: Search Yelp funtionality

  Scenario Outline: Check Yelp funtionality
    Given Browser is opened
    And User is on Yelp page website
    When User look up for Restaurants
    And User clicks on the search button
    When Add <filter>
    Then Results must be displayed

    Examples: 
      | filter |
      |      1 |
      |      2 |
      |      3 |
