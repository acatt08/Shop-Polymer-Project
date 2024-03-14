package pages;

import factory.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MensOuterwearPage {
    WebDriver driver;

    public MensOuterwearPage(){
        driver = WebDriverFactory.getWebDriver();
        PageFactory.initElements(driver, this);
    }
    public String getTotalNumberOfItems(){
        return this.getTotalNumberOfItemsElement().getText();
    }
    public void clickOnFirstElement() throws InterruptedException {
        Thread.sleep(500);
        this.getFirstProductNameElement().click();
        Thread.sleep(500);
    }
    public WebElement getFirstProductPriceElement(){
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-list').shadowRoot.querySelector('ul').querySelectorAll('li')[0].querySelector('a').querySelector('shop-list-item').shadowRoot.querySelector('span');");
    }

    public WebElement getTotalNumberOfItemsElement(){
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-list').shadowRoot.querySelector('header').querySelector('span');");
    }
    public WebElement getFirstProductNameElement(){
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-list').shadowRoot.querySelector('ul').querySelectorAll('li')[0].querySelector('a').querySelector('shop-list-item').shadowRoot.querySelector('div');");
    }
    public int getFirstProductPrice(){
       return Integer.parseInt(this.getFirstProductPriceElement().getText());
    }


}
