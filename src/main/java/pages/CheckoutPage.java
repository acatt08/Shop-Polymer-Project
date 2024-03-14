package pages;

import factory.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {
    WebDriver driver;
    WebDriverWait wait;

    public CheckoutPage(){
        this.driver = WebDriverFactory.getWebDriver();
        this.wait = new WebDriverWait(driver, Duration.ofMillis(10000));
        PageFactory.initElements(driver, this);
    }

    public String getThankYouMessage(){
        WebElement wb = (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('iron-pages').querySelector('shop-checkout').shadowRoot.querySelector('header[state=\\'success\\']').querySelector('h1');");
        this.wait.until(ExpectedConditions.visibilityOf(wb));
        return wb.getText();
    }
    public WebElement getEmailField(){
        return (WebElement)((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('iron-pages').querySelector('shop-checkout').shadowRoot.querySelector('div').querySelector('iron-pages').querySelector('div').querySelector('iron-form').querySelector('form').querySelector('div[class=\\'subsection grid\\']').querySelectorAll('section')[0].querySelectorAll('div[class=\\'row input-row\\']')[0].querySelector('shop-input').querySelector('input[type=\\'email\\']');");
    }
    public WebElement getPhoneNumberField(){
        return (WebElement)((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('iron-pages').querySelector('shop-checkout').shadowRoot.querySelector('div').querySelector('iron-pages').querySelector('div').querySelector('iron-form').querySelector('form').querySelector('div[class=\\'subsection grid\\']').querySelectorAll('section')[0].querySelectorAll('div[class=\\'row input-row\\']')[1].querySelector('shop-input').querySelector('input[type=\\'tel\\']');");
    }
    public WebElement getAddressField(){
        return (WebElement)((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('iron-pages').querySelector('shop-checkout').shadowRoot.querySelector('div').querySelector('iron-pages').querySelector('div').querySelector('iron-form').querySelector('form').querySelector('div[class=\\'subsection grid\\']').querySelectorAll('section')[0].querySelectorAll('div[class=\\'row input-row\\']')[2].querySelector('input[id=\\'shipAddress\\']');");
    }
    public WebElement getCityField(){
        return (WebElement)((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('iron-pages').querySelector('shop-checkout').shadowRoot.querySelector('div').querySelector('input[id=\\'shipCity\\']');");
    }
    public WebElement getStateField(){
        return (WebElement)((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('iron-pages').querySelector('shop-checkout').shadowRoot.querySelector('div').querySelector('input[id=\\'shipState\\']');");
    }
    public WebElement getPostalCodeField(){
        return (WebElement)((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('iron-pages').querySelector('shop-checkout').shadowRoot.querySelector('div').querySelector('input[id=\\'shipZip\\']');");
    }
    public WebElement getCountryDropdown() {
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('iron-pages').querySelector('shop-checkout').shadowRoot.querySelector('select[id=\\'shipCountry\\']');");
    }
    public WebElement getCardHolderNameField() {
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('iron-pages').querySelector('shop-checkout').shadowRoot.querySelector('input[id=\\'ccName\\']');");
    }
    public WebElement getCardNumberField() {
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('iron-pages').querySelector('shop-checkout').shadowRoot.querySelector('input[id=\\'ccNumber\\']');");
    }
    public WebElement getExpireMonthDropdown() {
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('iron-pages').querySelector('shop-checkout').shadowRoot.querySelector('select[id=\\'ccExpMonth\\']');");
    }
    public WebElement getExpireYearDropdown() {
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('iron-pages').querySelector('shop-checkout').shadowRoot.querySelector('select[id=\\'ccExpYear\\']');");
    }
    public WebElement getCVVNumberField() {
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('iron-pages').querySelector('shop-checkout').shadowRoot.querySelector('input[id=\\'ccCVV\\']');");
    }
    public WebElement getPlaceOrderButton() {
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('iron-pages').querySelector('shop-checkout').shadowRoot.querySelector('input[value=\\'Place Order\\']');");
    }
    public WebElement getUseDifferentBillingAddressCheckbox() {
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('iron-pages').querySelector('shop-checkout').shadowRoot.querySelector('input[type=\\'checkbox\\']');");
    }
    public WebElement getBillingAddressName() {
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('iron-pages').querySelector('shop-checkout').shadowRoot.querySelector('input[id=\\'billAddress\\']');");
    }
    public WebElement getBillingAddressCity() {
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('iron-pages').querySelector('shop-checkout').shadowRoot.querySelector('input[id=\\'billCity\\']');");
    }
    public WebElement getBillingAddressState() {
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('iron-pages').querySelector('shop-checkout').shadowRoot.querySelector('input[id=\\'billState\\']');");
    }
    public WebElement getBillingAddressZip() {
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('iron-pages').querySelector('shop-checkout').shadowRoot.querySelector('input[id=\\'billZip\\']');");
    }
    public WebElement getBillingAddressCountryDropdown() {
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('iron-pages').querySelector('shop-checkout').shadowRoot.querySelector('select[id=\\'billCountry\\']');");
    }
    public void enterEmailAddress(String email){
        this.wait.until(ExpectedConditions.visibilityOf(this.getEmailField())).sendKeys(email);
    }
    public void enterPhoneNumber(String phone){
        this.getPhoneNumberField().sendKeys(phone);
    }
    public void enterAddress(String address){
        this.getAddressField().sendKeys(address);
    }
    public void enterCity(String city){
        this.getCityField().sendKeys(city);
    }
    public void enterStateProvince(String state){
        this.getStateField().sendKeys(state);
    }
    public void enterZipPostalCode(String zip){
        this.getPostalCodeField().sendKeys(zip);
    }
    public void chooseCountry(String country){
        Select selectCountry = new Select(this.getCountryDropdown());
        selectCountry.selectByVisibleText(country);
    }
    public void enterCardHolderName(String name){
        this.getCardHolderNameField().sendKeys(name);
    }
    public void enterCardNumber(String number){
        this.getCardNumberField().sendKeys(number);
    }
    public void chooseExpireMonthOfCard(String month){
        Select selectCountry = new Select(this.getExpireMonthDropdown());
        selectCountry.selectByVisibleText(month);
    }
    public void chooseExpireYearOfCard(String year){
        Select selectCountry = new Select(this.getExpireYearDropdown());
        selectCountry.selectByVisibleText(year);
    }
    public void enterCVVNumber(String number){
        this.getCVVNumberField().sendKeys(number);
    }
    public void enterBillingAddress(String address){
        this.wait.until(ExpectedConditions.visibilityOf(this.getBillingAddressName())).sendKeys(address);
    }
    public void enterBillingCity(String city){
        this.getBillingAddressCity().sendKeys(city);
    }
    public void enterBillingState(String state){
        this.getBillingAddressState().sendKeys(state);
    }
    public void enterBillingZip(String zip){
        this.getBillingAddressZip().sendKeys(zip);
    }
    public void choseBillingCountry(String country){
        Select selectCountry = new Select(this.getBillingAddressCountryDropdown());
        selectCountry.selectByVisibleText(country);
    }
    public void clickOnPlaceOrderButton(){
        this.getPlaceOrderButton().click();
    }
    public void clickOnUseDifferentBillingAddressCheckbox(){
        this.getUseDifferentBillingAddressCheckbox().click();
    }

}
