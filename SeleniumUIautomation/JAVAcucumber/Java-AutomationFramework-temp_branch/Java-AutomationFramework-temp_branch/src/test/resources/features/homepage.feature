@regression
Feature: Home page
 
Background: 
Given user on the login page

  @test
  Scenario Outline:login as user
    When the user clicks "google_search" radio button on "<Page>"
   
#    And the user select "<User>" from the Login as Dropdown
#    And the user select "Export Applicant" from the role Dropdown
#    And the user clicks on "9060"
#    And the user clicks the createapplication link
#    And the user must see "My Establishments"
    Examples:
      |User      |   Page |
      |Abney, Pamela| loginpage.properties|


#  @member
#  Scenario: login as team member
#    When user logs in as a team member
#    Then homepage should be displayed
#
#  @teacher
#  Scenario: login as teacher
#    When user logs in as a teacher
#    Then homepage should be displayed
#
#  Scenario Outline: login as different members
#    When user logs in as a <type>
#    Then homepage should be displayed
#
#    Examples:
#      | type        |
#      | team member |
#      | team lead   |
#      | teacher     |
#      
 