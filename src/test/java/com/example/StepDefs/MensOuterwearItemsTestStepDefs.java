package com.example.StepDefs;

import factory.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.MensOuterwearPage;

public class MensOuterwearItemsTestStepDefs {
    MensOuterwearPage mensOuterwear = new MensOuterwearPage();

    @And("User clicks on first shown item")
    public void user_clicks_on_first_shown_item() throws InterruptedException {
        mensOuterwear.clickOnFirstElement();
    }

    @Then("Total number of available items is shown")
    public void total_number_of_available_items_is_shown() throws InterruptedException {
        Assert.assertTrue(this.mensOuterwear.getTotalNumberOfItemsElement().isDisplayed());
        Assert.assertEquals(this.mensOuterwear.getTotalNumberOfItems(), "(16 items)");
    }
    @Then("Items prices are shown")
    public void item_price_is_shown() {
        Assert.assertTrue(this.mensOuterwear.getFirstProductPriceElement().isDisplayed());
    }
    @Then("Items names are shown")
    public void items_names_are_shown() {
        Assert.assertTrue(this.mensOuterwear.getFirstProductNameElement().isDisplayed());
    }

}
