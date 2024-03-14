package com.example.StepDefs;

import factory.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;

public class HomePageStepDefs {
    HomePage home = new HomePage();

    @Given("User navigates to Home Page")
    public void user_navigates_to_home_page(){
        Assert.assertEquals(home.getDriver().getCurrentUrl(), "https://shop.polymer-project.org/");
    }
    @And("User clicks on Shop now button bellow Mens Outerwear section")
    //@When("User clicks on Shop now button bellow Mens Outerwear section")
    public void user_clicks_on_shop_now_button_bellow_mens_outerwear_section() throws InterruptedException {
        home.clickOnMenOutwearShopNowButton();
        //Thread.sleep(2000);
    }
    @And("User clicks on Shop now button bellow Ladies Outerwear section")
    public void user_clicks_on_shop_now_button_bellow_ladies_outerwear_section() throws InterruptedException {
        home.clickOnLadiesOutwearShopNowButton();
        //Thread.sleep(1000);
    }
    @And("User clicks on Shop now button bellow Mens T-Shirts section")
    public void user_clicks_on_shop_now_button_bellow_mens_t_shirts_section() throws InterruptedException {
        home.clickOnMenTShirtsShopNowButton();
        //Thread.sleep(1000);
    }
    @And("User clicks on Shop now button bellow Ladies T-Shirts section")
    public void user_clicks_on_shop_now_button_bellow_ladies_t_shirts_section() throws InterruptedException {
        home.clickOnLadiesTShirtsShopNowButton();
        //Thread.sleep(1000);
    }
    @And("User clicks on Mens Outerwear link in navigation menu")
    public void user_clicks_on_mens_outerwear_link_in_navigation_menu() throws InterruptedException {
        home.clickOnMensOutwearLinkInNavMenu();
        //Thread.sleep(1000);
    }
    @And("User clicks on Ladies Outerwear link in navigation menu")
    public void user_clicks_on_ladies_outerwear_link_in_navigation_menu() throws InterruptedException {
        home.clickOnLadiesOutwearLinkInNavMenu();
        //Thread.sleep(1000);
    }
    @And("User clicks on Mens T-Shirts link in navigation menu")
    public void user_clicks_on_mens_t_shirts_link_in_navigation_menu() throws InterruptedException {
        home.clickOnManTShirtLinkInNavMenu();
        //Thread.sleep(2000);

    }
    @And("User clicks on Ladies T-Shirts link in navigation menu")
    public void user_clicks_on_ladies_t_shirts_link_in_navigation_menu() throws InterruptedException {
        home.clickOnLadiesTShirtLinkInNavMenu();
        //Thread.sleep(1000)
    }
    @Then("User is on Men Outerwear page")
    public void user_is_on_men_outerwear_page(){
        Assert.assertEquals(home.getDriver().getCurrentUrl(), "https://shop.polymer-project.org/list/mens_outerwear");
    }
    @Then("User is on Ladies Outerwear page")
    public void user_is_on_ladies_outerwear_page(){
        Assert.assertEquals(home.getDriver().getCurrentUrl(), "https://shop.polymer-project.org/list/ladies_outerwear");
    }
    @Then("User is on Mens T-Shirts page")
    public void user_is_on_mens_t_shirts_page(){
        Assert.assertEquals(home.getDriver().getCurrentUrl(), "https://shop.polymer-project.org/list/mens_tshirts");
    }
    @Then("User is on Ladies T-Shirts page")
    public void user_is_on_ladies_t_shirts_page(){
        Assert.assertEquals(home.getDriver().getCurrentUrl(), "https://shop.polymer-project.org/list/ladies_tshirts");
    }
    @Then("Page Title on Mens Outerwear page is as expected")
    public void page_title_on_mens_outerwear_page_is_as_expected() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(WebDriverFactory.getWebDriver().getTitle(), "Men's Outerwear - SHOP");
    }
    @Then("Page Title on Ladies Outerwear page is as expected")
    public void page_title_on_ladies_outerwear_page_is_as_expected() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(WebDriverFactory.getWebDriver().getTitle(), "Ladies Outerwear - SHOP");
    }
    @Then("Page Title on Mens T-Shirts page is as expected")
    public void page_title_on_mens_t_shirts_page_is_as_expected() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(WebDriverFactory.getWebDriver().getTitle(), "Men's T-Shirts - SHOP");
    }
    @Then("Page Title on Ladies T-Shirts page is as expected")
    public void page_title_on_ladies_t_shirts_page_is_as_expected() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(WebDriverFactory.getWebDriver().getTitle(), "Ladies T-Shirts - SHOP");
    }
    @Then("Title on Mens Outerwear page is as expected")
    public void title_on_mens_outerwear_is_as_expected() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(home.getMensOuterwearTitle(), "Men's Outerwear");
    }
    @After
    public static void after_all() throws InterruptedException {
        Thread.sleep(700);
        WebDriverFactory.quitWebDriver();
    }
}
