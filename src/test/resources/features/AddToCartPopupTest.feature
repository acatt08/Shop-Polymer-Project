Feature: Add to cart button functionality test on Mens Outerwear Item
  Background:
    Given User navigates to Home Page
    And User clicks on Shop now button bellow Mens Outerwear section
    And User clicks on first shown item
    And User selects first available size
    And User selects quantity of two
    And User clicks on Add to cart button

  Scenario: Verify that Add to cart popup is shown
    Then Add to cart popup is shown

  Scenario: Clicks on X button to close popup
    And User clicks on X button on Add to Cart popup
    Then Add to cart popup is not displayed

  Scenario: Clicks on View Cart button
    And User clicks on View Cart button on Add to Cart popup
    Then User is redirected on Cart page
    Then One product is shown on Cart Page
    Then First product has quantity as expected
    Then Item size is displayed on Cart Page

  Scenario: Clicks on Checkout button
    And User clicks on Checkout button on Add to Cart popup
    Then User is redirected on Checkout Page