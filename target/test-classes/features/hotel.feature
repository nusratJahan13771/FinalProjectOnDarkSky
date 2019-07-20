@web @regression @login @darksky @hotel
Feature: Hotel feature
  Background:
    Given I am on default locations search result screen

  @hotel-1
  Scenario Outline: Verify user can only view the result by selected property class
    Then I select property class <stars>

    Then I verify system displays only <stars> hotels on search result

    Examples:
      | stars   |
      | 5 stars |
      | 4 stars |
      | 3 stars |


    @hotel-2
     Scenario:List of all of hotel within 10 miles radius of airport or downtown
      When I hoverover to distance in search result screen
      Then I click on city centre
      Then I verify system displays all hotels within 10 miles radius of airport
      And I verify Hilton Hotel is displayed
