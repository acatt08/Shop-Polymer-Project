Feature: Test Items actions on Cart Page
  Background:
    Given User navigates to Home Page
    And User clicks on Shop now button bellow Mens Outerwear section
    And User clicks on first shown item
    And User clicks on Add to cart button
    And User clicks on X button on Add to Cart popup
    And User selects first available size
    And User clicks on Add to cart button
    And User clicks on View Cart button on Add to Cart popup

  Scenario: Two products are shown on Cart Page
    Then Two products are shown on Cart Page

  Scenario: Delete first Item form Cart page
    And Delete first Item from Cart Page
    Then One product is shown on Cart Page