@mobile @mobile-regression @menu
Feature: Menu feature

  @menu-1
  Scenario: Verify sidebar validation
    And I tap on menu button
    Then I verify sidebar menu is displayed

  @menu-2
  Scenario: Verify login validation
    When I tap on skip button
    And I tap on menu button
    And I click on login button
    And I set username and password
    And I click on login again
    And I click on menu button
    And I click on log out
    And I click on menu button again
    Then I verify login button is present

  @menu-3
  Scenario: Verify user should be able to view default main menu bar items
    When I clickOn Skip Button
    And I click on hamburger menu
    Then I verify default main menu bar fields


  @menu-4
  Scenario: User should be able filter options
    When I click on filter button
    And I disable "Angular" option
    And I click on All Reset Filer button
    Then I verify all options are enabled

  @menu-5
  Scenario: Verify user should be able to slide right on tutorial pages
    When I swipe right 3 times on tutorials slides
    Then I verify Continue button is displayed



