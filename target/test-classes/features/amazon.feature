@web @regression @amazon
Feature: Amazon Feature
  Background:
    Given I am on amazon home page
  @amazon-1
  Scenario: Verify highest priced watch added to the cart
    When I Search for all the Women's Fossil Watches by typing "Fossil Watch" in the Search Text box
    And  I clicked the Women's button to filter
    When I Sort the watches by price by using the 'Sort By' dropdown
    And  I Added the highest priced watch to the cart
    Then I Verify the Item was added to the cart