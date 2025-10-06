Feature: Validating the Practice Page
  @reg
  Scenario: Automation Practice Webpage
    Given Goto automation practice webpage
    When Radio button clicked
    Then Validate radio button clicked
#
#  @smoke
#  Scenario: Valid login
#    Given I open the login page
#    When I enter valid credentials
#    Then I should see the dashboard