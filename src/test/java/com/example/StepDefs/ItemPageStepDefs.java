package com.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.ItemPage;

public class ItemPageStepDefs {
    ItemPage item = new ItemPage();

    @And("User selects first available size")
    public void user_selects_first_available_size() throws InterruptedException {
        item.selectFirstOption();
    }
    @And("User selects quantity of two")
    public void user_selects_quatity_of_two() throws InterruptedException {
        item.selectQuantityToTwo();
    }
    @And("User clicks on Add to cart button")
    public void user_clicks_on_add_to_cart_button() throws InterruptedException {
        this.item.clickOnAddToCartButton();
    }
    @And("User clicks on X button on Add to Cart popup")
    public void user_clicks_on_x_button_on_add_to_cart_popup() throws InterruptedException {
        this.item.clickOnXButtonOnAddToCartPopup();
    }
    @And("User clicks on View Cart button on Add to Cart popup")
    public void user_clicks_on_view_cart_button_on_add_to_cart_popup() throws InterruptedException {
        this.item.clickOnViewCartButtonOnAddToCartPopup();
    }
    @And("User clicks on Checkout button on Add to Cart popup")
    public void user_clicks_on_checkout_button_on_add_to_cart_popup() throws InterruptedException {
        this.item.clickOnCheckoutButtonOnAddToCartPopup();
    }
    @Then("Item name is shown on Item page")
    public void item_name_is_shown_on_item_page(){
        Assert.assertTrue(item.getItemNameElement().isDisplayed());
    }
    @Then("Item price is shown on Item page")
    public void item_price_is_shown_on_item_page(){
        Assert.assertTrue(item.getItemPriceElement().isDisplayed());
    }
    @Then("Chose size is shown")
    public void chose_size_is_shown(){
        Assert.assertTrue(item.getSizeBoxFirstOption().isDisplayed());
    }
    @Then("Quantity of two is shown")
    public void quantity_of_two_is_shown(){
        Assert.assertTrue(item.getQuantityBoxSecondOption().isDisplayed());
    }
    @Then("Add to cart popup is shown")
    public void add_to_cart_popup_is_shown(){
        Assert.assertTrue(item.addToCartPopupIsDisplayed().isDisplayed());
    }
    @Then("Add to cart popup is not displayed")
    public void add_to_cart_popup_is_not_displayed(){
        Assert.assertNull(item.addToCartPopupIsDisplayed());
    }

}
