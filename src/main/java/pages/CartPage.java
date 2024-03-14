package pages;

import factory.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    WebDriver driver;

    public CartPage(){
        driver = WebDriverFactory.getWebDriver();
        PageFactory.initElements(driver, this);
    }
    public void deleteFirstItemFromCartPage() throws InterruptedException {
        Thread.sleep(700);
        this.getXButtonForFirstItemCartPage().click();
        Thread.sleep(700);
    }
    public void clickOnCheckoutButton() throws InterruptedException {
        Thread.sleep(700);
        this.getCheckoutButton().click();
        Thread.sleep(700);
    }
    public int getNumberOfElementsInTheCart(){
        return Integer.parseInt(((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-cart').shadowRoot.querySelector('div').querySelector('div[visible]').querySelector('div[class=\"list\"]').querySelectorAll('shop-cart-item').length").toString());
    }
    public int getQuantityOfFirstItemInTheCart(){
        return (Integer.parseInt(((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelectorAll('shop-cart')[0].shadowRoot.querySelector('div').querySelector('div[visible]').querySelector('div[class=\\'list\\']').querySelector('shop-cart-item').shadowRoot.querySelector('div').querySelector('div[class=\\'detail\\']').querySelector('div[class=\\'quantity\\']').querySelector('shop-select').querySelector('select').selectedIndex;").toString())) + 1;
    }
    public WebElement getSizeWebElementOfFirstElementInTheCart(){
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-cart').shadowRoot.querySelector('div').querySelector('div[visible]').querySelector('div[class=\"list\"]').querySelector('shop-cart-item').shadowRoot.querySelector('div').querySelector('div[class=\\'detail\\']').querySelector('div[class=\\'size\\']').querySelector('span');");
    }
    public WebElement getXButtonForFirstItemCartPage(){
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-cart').shadowRoot.querySelector('div').querySelector('div[visible]').querySelector('div[class=\"list\"]').querySelector('shop-cart-item').shadowRoot.querySelector('div').querySelector('div[class=\\'detail\\']').querySelector('paper-icon-button')");
    }
    public WebElement getCheckoutButton(){
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-cart').shadowRoot.querySelector('div[visible]').querySelector('div[class=\\'checkout-box\\']').querySelector('a')");
    }
}
