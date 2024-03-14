Feature: Testing Home Page scenarios
  Background:
    Given User navigates to Home Page

  Scenario: User is redirected on Mens Outerwear Page by clicking on 'Shop now' button
    And User clicks on Shop now button bellow Mens Outerwear section
    Then User is on Men Outerwear page
    Then Title on Mens Outerwear page is as expected
    Then Page Title on Mens Outerwear page is as expected

  Scenario: User is redirected on Ladies Outerwear Page by clicking on 'Shop now' button
    And User clicks on Shop now button bellow Ladies Outerwear section
    Then User is on Ladies Outerwear page
    Then Page Title on Ladies Outerwear page is as expected

  Scenario: User is redirected on Mens T-Shirts Page by clicking on 'Shop now' button
    And User clicks on Shop now button bellow Mens T-Shirts section
    Then User is on Mens T-Shirts page
    Then Page Title on Mens T-Shirts page is as expected

  Scenario: User is redirected on Ladies T-Shirts Page by clicking on 'Shop now' button
    And User clicks on Shop now button bellow Ladies T-Shirts section
    Then User is on Ladies T-Shirts page
    Then Page Title on Ladies T-Shirts page is as expected

  Scenario: User is redirected on Men's Outerwear Page by clicking on 'Mens Outerwear' link
    And User clicks on Mens Outerwear link in navigation menu
    Then User is on Men Outerwear page
    Then Title on Mens Outerwear page is as expected
    Then Page Title on Mens Outerwear page is as expected

  Scenario: User is redirected on Ladies Outerwear Page by clicking on 'Ladies Outerwear' link
    And User clicks on Ladies Outerwear link in navigation menu
    Then User is on Ladies Outerwear page
    Then Page Title on Ladies Outerwear page is as expected

  Scenario: User is redirected on Mens T-Shirts Page by clicking on 'Mens T-Shirts' link
    And User clicks on Mens T-Shirts link in navigation menu
    Then User is on Mens T-Shirts page
    Then Page Title on Mens T-Shirts page is as expected

  Scenario: User is redirected on Ladies T-Shirts Page by clicking on 'Ladies T-Shirts' link
    And User clicks on Ladies T-Shirts link in navigation menu
    Then User is on Ladies T-Shirts page
    Then Page Title on Ladies T-Shirts page is as expected
