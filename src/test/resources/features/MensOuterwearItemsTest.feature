Feature: Items list scenarios for Mens Outerwear Page
  Background:
    Given User navigates to Home Page

    Scenario: Verifying Items list on Mens Outerwear Page
      And User clicks on Shop now button bellow Mens Outerwear section
      Then Total number of available items is shown
      Then Items prices are shown
      Then Items names are shown