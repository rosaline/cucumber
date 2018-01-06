@base_flow
Feature: This is a simple test using Cucumber.

  Scenario:
    Given I enter my blog address "https://yaowenjie.github.io" and go to Home page
    # Search Button Feature:
    When I click the search button
    And I enter "PowerShell" in the input field
    And I click the first result of search
    Then I go to the article page with title containing "PowerShell"