Feature: Testing positive TCs on Checkout page
  Background:
    Given User navigates to Home Page
    And User clicks on Shop now button bellow Mens Outerwear section
    And User clicks on first shown item
    And User clicks on Add to cart button
    And User clicks on View Cart button on Add to Cart popup
    And User clicks on Checkout button on Cart page

  Scenario Outline: User places an order with same billing address
    And User enters email address on Checkout page <email>
    And User enters phone number on Checkout page <phone>
    And User enters address on Checkout page <address>
    And User enters city on Checkout page <city>
    And User enters State Province on Checkout page <state>
    And User enters Zip Postal code on Checkout page <zip>
    And User choose country on Checkout page <country>
    And User enters Card holder name on Checkout page <cardholderName>
    And User enters Card number on Checkout page <card>
    And User choose Card Expire Month on Checkout page <month>
    And User choose Card Expire Year on Checkout page <year>
    And User enters CVV Number on Checkout page <cvv>
    And User clicks on Place Order button
    Then Thank you for your order message is displayed
    Examples:
      | email          | phone        | address       | city    | state   | zip     | country | cardholderName | card             | month | year | cvv |
      | altr@gmail.com | 41634554290 | 614 Tycos Dr  | Toronto | Ontario | M5T 1T4 | Canada  | Bob Smith      | 1234567891011123 | May   | 2025 | 123 |

  Scenario Outline: User places an order with different billing address
    And User enters email address on Checkout page <email>
    And User enters phone number on Checkout page <phone>
    And User enters address on Checkout page <address>
    And User enters city on Checkout page <city>
    And User enters State Province on Checkout page <state>
    And User enters Zip Postal code on Checkout page <zip>
    And User choose country on Checkout page <country>
    And User enters Card holder name on Checkout page <cardholderName>
    And User enters Card number on Checkout page <card>
    And User choose Card Expire Month on Checkout page <month>
    And User choose Card Expire Year on Checkout page <year>
    And User enters CVV Number on Checkout page <cvv>
    And User checks Use different billing address checkbox
    And User enters Address name for Billing address <billingAddress>
    And User enters City for Billing address <billingCity>
    And User enters State Province for Billing address <billingState>
    And User enters Zip code for Billing address <billingZip>
    And User choose country for Billing address <billingCountry>
    And User clicks on Place Order button
    Then Thank you for your order message is displayed
    Examples:
      | email          | phone        | address       | city    | state   | zip     | country | cardholderName | card             | month | year | cvv | billingAddress | billingCity | billingState | billingZip | billingCountry |
      | altr@gmail.com | 41634554290 | 614 Tycos Dr  | Toronto | Ontario | M5T 1T4 | Canada  | Bob Smith      | 1234567891011123  | May   | 2025 | 123 | 123 Highway    | Los Angeles | California   | 123456     | United States  |

