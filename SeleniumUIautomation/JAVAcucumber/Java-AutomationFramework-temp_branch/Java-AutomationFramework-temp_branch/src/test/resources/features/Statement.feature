# new feature
# Tags: optional

Feature: Statement Page
  As a Statement user , I want to navigate statement page and create new statement

  Background:
    Given user on the login page

    @Statement

  Scenario Outline: login as Statement Administrator
      When the user click show all radio button
      And the user select "<User>" from the Login as Dropdown
      And the user select "Statement Administrator" from the role Dropdown
      And the user clicks on "menu"
      And the user clicks the createapplication link
      And the user must see "My Establishments"
      Examples:
        |User      |
        |Riden, Mary|