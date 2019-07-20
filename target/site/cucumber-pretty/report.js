$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("mobile-menu.feature");
formatter.feature({
  "line": 2,
  "name": "Menu feature",
  "description": "",
  "id": "menu-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@mobile"
    },
    {
      "line": 1,
      "name": "@mobile-regression"
    },
    {
      "line": 1,
      "name": "@menu"
    }
  ]
});
formatter.scenario({
  "line": 22,
  "name": "Verify user should be able to view default main menu bar items",
  "description": "",
  "id": "menu-feature;verify-user-should-be-able-to-view-default-main-menu-bar-items",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@menu-3"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I clickOn Skip Button",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I click on hamburger menu",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I verify default main menu bar fields",
  "keyword": "Then "
});
formatter.match({
  "location": "MobileMenuSD.clickOnSkipButtonn()"
});
formatter.result({
  "duration": 21366179691,
  "status": "passed"
});
formatter.match({
  "location": "MobileMenuSD.clickOnHamburgerMenu()"
});
formatter.result({
  "duration": 3281872099,
  "status": "passed"
});
formatter.match({
  "location": "MobileMenuSD.verifyDefaultMainMenuBarFields()"
});
formatter.result({
  "duration": 30265741052,
  "status": "passed"
});
});