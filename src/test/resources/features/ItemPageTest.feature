Feature: Verify that elements on Item Page are working as expected
  Background:
    Given User navigates to Home Page

    Scenario: Verify that on Mens Outerwear Item elements works properly
      And User clicks on Shop now button bellow Mens Outerwear section
      And User clicks on first shown item
      And User selects first available size
      And User selects quantity of two
      Then Item name is shown on Item page
      Then Item price is shown on Item page
      Then Chose size is shown
      Then Quantity of two is shown