  @web @regression @login @darksky
  Feature: Darksky feature
    Background:
   Given I am on Darksky Home Page

  @darksky-1
  Scenario: Verify invalid signup error message
  When I click on Dark Sky API button
  And I click on SiGN UP button
  And I click on Register button
  Then I verify that "I am still on register page"

  @darksky-2
  Scenario: Verify Current Temperature should not be greater or less than the Temperature from Daily Timeline
    Then I verify current temp is not greater or less then temps from daily timeline

  @darksky-3
  Scenario: Verify individual day temp timeline
    When I expand todays timeline
    Then I click on expandbutton on darkskypage
    Then I verify lowest and heighest temp is displayed correctly

   @darksky-4
   Scenario: Verify timline is displayed in correct format
   Then I verify timeline is displayed with two hours incremented
