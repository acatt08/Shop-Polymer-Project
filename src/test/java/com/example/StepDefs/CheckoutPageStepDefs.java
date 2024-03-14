package com.example.StepDefs;

import factory.WebDriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.testng.Assert;
import pages.CheckoutPage;

public class CheckoutPageStepDefs {
    CheckoutPage checkout = new CheckoutPage();

    @And("^User enters email address on Checkout page (.+)$")
    public void user_enters_email_address(String email){
        this.checkout.enterEmailAddress(email);
    }
    @And("^User enters phone number on Checkout page (.+)$")
    public void user_enters_phone_number(String phone){
        this.checkout.enterPhoneNumber(phone);
    }
    @And("^User enters address on Checkout page (.+)$")
    public void user_enters_address(String address){
        this.checkout.enterAddress(address);
    }
    @And("^User enters city on Checkout page (.+)$")
    public void user_enters_city(String city){
        this.checkout.enterCity(city);
    }
    @And("^User enters State Province on Checkout page (.+)$")
    public void user_enters_state_province(String state){
        this.checkout.enterStateProvince(state);
    }
    @And("^User enters Zip Postal code on Checkout page (.+)$")
    public void user_enters_zip_postal_code(String zip){
        this.checkout.enterZipPostalCode(zip);
    }
    @And("^User choose country on Checkout page (.+)$")
    public void user_choose_country(String country){
        this.checkout.chooseCountry(country);
    }
    @And("^User enters Card holder name on Checkout page (.+)$")
    public void user_enters_card_holder_name(String cardHolderName){
        this.checkout.enterCardHolderName(cardHolderName);
    }
    @And("^User enters Card number on Checkout page (.+)$")
    public void user_enters_card_number(String card){
        this.checkout.enterCardNumber(card);
    }
    @And("^User choose Card Expire Month on Checkout page (.+)$")
    public void user_choose_card_expire_month(String month){
        this.checkout.chooseExpireMonthOfCard(month);
    }
    @And("^User choose Card Expire Year on Checkout page (.+)$")
    public void user_choose_card_expire_year(String year){
        this.checkout.chooseExpireYearOfCard(year);
    }
    @And("^User enters CVV Number on Checkout page (.+)$")
    public void user_enters_cvv_number(String cvv){
        this.checkout.enterCVVNumber(cvv);
    }
    @And("User clicks on Place Order button")
    public void user_clicks_on_place_order_button(){
        this.checkout.clickOnPlaceOrderButton();
    }
    @And("User checks Use different billing address checkbox")
    public void user_checks_use_different_billing_address_checkbox(){
        this.checkout.clickOnUseDifferentBillingAddressCheckbox();
    }
    @And("^User enters Address name for Billing address (.+)$")
    public void user_enters_address_name_for_billing_address(String address){
        this.checkout.enterBillingAddress(address);
    }
    @And("^User enters City for Billing address (.+)$")
    public void user_enters_coty_for_billing_address(String city){
        this.checkout.enterBillingCity(city);
    }
    @And("^User enters State Province for Billing address (.+)$")
    public void user_enters_state_province_for_billing_address(String state){
        this.checkout.enterBillingState(state);
    }
    @And("^User enters Zip code for Billing address (.+)$")
    public void user_enters_zip_code_for_billing_address(String zip){
        this.checkout.enterBillingZip(zip);
    }
    @And("^User choose country for Billing address (.+)$")
    public void user_choose_country_for_billing_address(String country){
        this.checkout.choseBillingCountry(country);
    }
    @Then("User is redirected on Checkout Page")
    public void user_is_redirected_on_checkout_page(){
        Assert.assertEquals(WebDriverFactory.getWebDriver().getCurrentUrl(), "https://shop.polymer-project.org/checkout");
    }
    @Then("Thank you for your order message is displayed")
    public void thank_you_for_your_order_message_is_displayed(){
        Assert.assertEquals(this.checkout.getThankYouMessage(),"Thank you");
    }
}
