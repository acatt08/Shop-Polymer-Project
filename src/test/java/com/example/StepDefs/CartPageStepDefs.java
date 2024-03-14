package com.example.StepDefs;

import factory.WebDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CartPage;

public class CartPageStepDefs {
    CartPage cart = new CartPage();

    @And("Delete first Item from Cart Page")
    public void delete_first_item_from_cart_page() throws InterruptedException {
        cart.deleteFirstItemFromCartPage();
    }
    @And("User clicks on Checkout button on Cart page")
    public void user_clicks_on_checkout_button_on_cart_page() throws InterruptedException {
        this.cart.clickOnCheckoutButton();
    }

    @Then("User is redirected on Cart page")
    public void user_is_redirected_on_cart_page(){
        Assert.assertEquals(WebDriverFactory.getWebDriver().getCurrentUrl(), "https://shop.polymer-project.org/cart");
    }
    @Then("One product is shown on Cart Page")
    public void one_product_is_shown_on_cart_page(){
        Assert.assertEquals(cart.getNumberOfElementsInTheCart(), 1);
    }
    @Then("Two products are shown on Cart Page")
    public void two_products_are_shown_on_cart_page(){
        Assert.assertEquals(cart.getNumberOfElementsInTheCart(), 2);
    }
    @Then("First product has quantity as expected")
    public void first_product_has_quantity_as_expected(){
        Assert.assertEquals(cart.getQuantityOfFirstItemInTheCart(), 2);
    }
    @Then("Item size is displayed on Cart Page")
    public void item_size_is_displayed_on_cart_page(){
        Assert.assertTrue(cart.getSizeWebElementOfFirstElementInTheCart().isDisplayed());
    }
}
