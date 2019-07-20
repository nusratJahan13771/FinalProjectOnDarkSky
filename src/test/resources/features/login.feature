@web @regression @login
Feature: Login feature

  Background:
    Given I am on home page

  @login-1
  Scenario: Verify Invalid Login
    When I enter mohammad@technosoftacademy.io into username text fields on home screen
    And I enter test1234 into password text fields on home screen
    And I click on login button on home screen
    Then I verify that i am on invalid login page

  @login-2
  Scenario: Verify Invalid Login two
    When I enter chris@technosoftacademy.io into username text fields on home screen
    And I enter abc1234 into password text fields on home screen
    And I click on login button on home screen
    Then I verify that i am an invalid login page
    And I see number 12 in text field

  @login-3
  Scenario Outline: Verify Invalid Login for multiple users
    When I enter <username> into username text fields on home screen
    And I enter <password> into password text fields on home screen
    And I click on login button on home screen
    Then I verify that i am an invalid login page

    Examples:
      | username                      | password |
      | mohammad@technosoftacademy.io | test1234 |
      | chris@technosoftacademy.io    | abc123   |
      | smith@technosoftacademy.io    | test     |
      | tjytyt                        | gdd      |

   @login-4
   Scenario: Verify signup btton
     When I enter Mohammad into firstname text fields on home screen
     And I enter Muntakim into lastname text fields on home screen
     Then I verify that signup button is disable at homepage

@login-5
  Scenario Outline: Signup form should not accept any invalid email address
    When I enter Test into firstname text fields on home screen
    And I enter Test into lastname text fields on home screen
    And I enter <email> into mobile number text fields on home screen
    And I click on password text field on home screen
    And I click on email text field on home screen
    Then I verify Error Message for invalid email on homepage
    Examples:
      | email                         |
      | plainaddress                  |
      | #@%^%#$@#$@#.com              |
      |@example.com                   |
      | Joe Smith <email@example.com> |
      | email.example.com             |
      | email@example@example.com     |
      | .email@example.com            |
      | email.@example.com            |
      | email..email@example.com      |
      | あいうえお@example.com          |
      | email@example.com (Joe Smith) |
      | email@example                 |
      | email@-example.com            |
      | email@example.web             |
      | email@111.222.333.44444       |
      | email@example..com            |
      | Abc..123@example.com          |




