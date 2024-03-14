package pages;

import factory.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ItemPage {
    WebDriver driver;
    public ItemPage(){
        driver = WebDriverFactory.getWebDriver();
        PageFactory.initElements(driver, this);
    }
    public void selectFirstOption() throws InterruptedException {
        Thread.sleep(500);
        this.getSizeBoxFirstOption().click();
    }
    public void selectQuantityToTwo() throws InterruptedException {
        Thread.sleep(500);
        this.getQuantityBoxSecondOption().click();
    }
    public void clickOnAddToCartButton() throws InterruptedException {
        Thread.sleep(500);
        this.getAddToCartButtonElement().click();
        Thread.sleep(500);
    }
    public void clickOnXButtonOnAddToCartPopup() throws InterruptedException {
        Thread.sleep(500);
        this.getXButtonOnAddToCartPopup().click();
        Thread.sleep(500);
    }
    public void clickOnViewCartButtonOnAddToCartPopup() throws InterruptedException {
        Thread.sleep(500);
        this.getViewCartButtonOnAddToCartPopup().click();
        Thread.sleep(500);
    }
    public void clickOnCheckoutButtonOnAddToCartPopup() throws InterruptedException {
        Thread.sleep(500);
        this.getCheckoutButtonOnAddToCartPopup().click();
        Thread.sleep(500);
    }
    public WebElement getSizeBoxFirstOption(){
        return (WebElement)((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-detail').shadowRoot.querySelector('div').querySelector('div').querySelector('div[class=\\'pickers\\']').querySelectorAll('shop-select')[0].querySelector('select')[0];");
    }
    public WebElement getQuantityBoxSecondOption(){
        return (WebElement)((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-detail').shadowRoot.querySelector('div').querySelector('div').querySelector('div[class=\\'pickers\\']').querySelectorAll('shop-select')[1].querySelector('select')[1];");
    }
    public WebElement getItemNameElement(){
        return (WebElement)((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-detail').shadowRoot.querySelector('div').querySelector('div').querySelector('h1');");
    }
    public WebElement getItemPriceElement(){
        return (WebElement)((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-detail').shadowRoot.querySelector('div').querySelector('div').querySelector('div');");
    }
    public WebElement getAddToCartButtonElement(){
        return (WebElement)((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-detail').shadowRoot.querySelector('div').querySelector('div').querySelector('shop-button').querySelector('button');");
    }
    public WebElement getXButtonOnAddToCartPopup(){
        return (WebElement)((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-cart-modal[class=\\'opened\\']').shadowRoot.querySelector('paper-icon-button');");
    }
    public WebElement getViewCartButtonOnAddToCartPopup(){
        return (WebElement)((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-cart-modal[class=\\'opened\\']').shadowRoot.querySelectorAll('div')[2].querySelectorAll('shop-button')[0].querySelector('a');");
    }
    public WebElement getCheckoutButtonOnAddToCartPopup(){
        return (WebElement)((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-cart-modal[class=\\'opened\\']').shadowRoot.querySelectorAll('div')[2].querySelectorAll('shop-button')[1].querySelector('a');");
    }
    public WebElement addToCartPopupIsDisplayed(){
        return (WebElement)((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-cart-modal[class=\\'opened\\']');");
    }
}
