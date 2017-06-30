@tag
Feature: Schwab Search Feature
  			 Verify the branch search feature on the schwab website

  @demo1
  Scenario: Test Seach a Branch Feature on Schwab Website
    Given I will launch the schwab website
    And I will check the Find a Branch Link on the page
    When I click on Find a Branch Link
    Then I will verify Branch Locator page
    When I will enter a zip code in the locate textbox
    And I click on locate button
    Then I will check the branch results near me