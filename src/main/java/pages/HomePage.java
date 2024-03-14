package pages;

import factory.WebDriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//title")
    WebElement title;

    public HomePage(){
        driver = WebDriverFactory.getWebDriver();
        driver.get("https://shop.polymer-project.org/");
        wait = new WebDriverWait(driver, Duration.ofMillis(10000));
        PageFactory.initElements(driver,this);
    }
    private WebElement getMensOutwearShopNowButton(){
        WebElement shadowHost = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("shop-app")));
        SearchContext shadowRoot = (SearchContext) ((JavascriptExecutor) driver)
                .executeScript("return arguments[0].shadowRoot;", shadowHost);
        return wait.until(ExpectedConditions.visibilityOf(shadowRoot.findElement(By.cssSelector("a[href='/list/mens_outerwear']"))));
    }
    private WebElement getLadiesOutwearShopNowButton(){
        WebElement shadowHost = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("shop-app")));
        SearchContext shadowRoot = (SearchContext) ((JavascriptExecutor) driver)
                .executeScript("return arguments[0].shadowRoot;", shadowHost);
        return wait.until(ExpectedConditions.visibilityOf(shadowRoot.findElement(By.cssSelector("a[href='/list/ladies_outerwear']"))));
    }
    private WebElement getMensTShirtsShopNowButton(){
        WebElement shadowHost = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("shop-app")));
        SearchContext shadowRoot = (SearchContext) ((JavascriptExecutor) driver)
                .executeScript("return arguments[0].shadowRoot;", shadowHost);
        return wait.until(ExpectedConditions.visibilityOf(shadowRoot.findElement(By.cssSelector("a[href='/list/mens_tshirts']"))));
    }
    private WebElement getLadiesTShirtsShopNowButton(){
        WebElement shadowHost = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("shop-app")));
        SearchContext shadowRoot = (SearchContext) ((JavascriptExecutor) driver)
                .executeScript("return arguments[0].shadowRoot;", shadowHost);

        return wait.until(ExpectedConditions.visibilityOf(shadowRoot.findElement(By.cssSelector("a[href='/list/ladies_tshirts']"))));
    }
    private WebElement getMensOutwearLinkInNavMenu(){
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-home').shadowRoot.querySelectorAll('div')[0].querySelector('shop-button').querySelector('a');");
    }
    private WebElement getLadiesOutwearLinkInNavMenu(){
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-home').shadowRoot.querySelectorAll('div')[1].querySelector('shop-button').querySelector('a');");
    }
    private WebElement getManTShirtLinkInNavMenu(){
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-home').shadowRoot.querySelectorAll('div')[2].querySelector('shop-button').querySelector('a');");
    }
    private WebElement getLadiesTShirtLinkInNavMenu(){
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-home').shadowRoot.querySelectorAll('div')[3].querySelector('shop-button').querySelector('a');");
    }
    private WebElement getMensOuterwearTitleElement(){
        return (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return document.querySelector('shop-app').shadowRoot.querySelector('shop-list').shadowRoot.querySelector('header').querySelector('h1');");
    }

    public void clickOnMenOutwearShopNowButton() throws InterruptedException {
        this.wait.until(ExpectedConditions.visibilityOf(this.getMensOutwearShopNowButton())).click();
        //Thread.sleep(500);
        //this.getMensOutwearShopNowButton().click();
        //Thread.sleep(500);
    }
    public void clickOnLadiesOutwearShopNowButton() throws InterruptedException {
        this.wait.until(ExpectedConditions.visibilityOf(this.getLadiesOutwearShopNowButton())).click();
        //Thread.sleep(500);
        //this.getLadiesOutwearShopNowButton().click();
        //Thread.sleep(500);
    }
    public void clickOnMenTShirtsShopNowButton() throws InterruptedException {
        this.wait.until(ExpectedConditions.visibilityOf(this.getMensTShirtsShopNowButton())).click();
        //Thread.sleep(500);
        //this.getMensTShirtsShopNowButton().click();
        //Thread.sleep(500);

    }
    public void clickOnLadiesTShirtsShopNowButton() throws InterruptedException {
        this.wait.until(ExpectedConditions.visibilityOf(this.getLadiesTShirtsShopNowButton())).click();
        //Thread.sleep(500);
        //this.getLadiesTShirtsShopNowButton().click();
        //Thread.sleep(500);
    }
    public void clickOnMensOutwearLinkInNavMenu() throws InterruptedException {
        this.wait.until(ExpectedConditions.visibilityOf(this.getMensOutwearLinkInNavMenu())).click();
        //Thread.sleep(500);
        //this.getMensOutwearLinkInNavMenu().click();
        //Thread.sleep(500);
    }
    public void clickOnLadiesOutwearLinkInNavMenu() throws InterruptedException {
        this.wait.until(ExpectedConditions.visibilityOf(this.getLadiesOutwearLinkInNavMenu())).click();

        //Thread.sleep(500);
        //this.getLadiesOutwearLinkInNavMenu().click();
        //Thread.sleep(500);
    }
    public void clickOnManTShirtLinkInNavMenu() throws InterruptedException {
        this.wait.until(ExpectedConditions.visibilityOf(this.getManTShirtLinkInNavMenu())).click();

        //Thread.sleep(500);
        //this.getManTShirtLinkInNavMenu().click();
        //Thread.sleep(500);
    }
    public void clickOnLadiesTShirtLinkInNavMenu() throws InterruptedException {
        this.wait.until(ExpectedConditions.visibilityOf(this.getLadiesTShirtLinkInNavMenu())).click();

        //Thread.sleep(1000);
        //this.getLadiesTShirtLinkInNavMenu().click();
        //Thread.sleep(1000);
    }
    public WebDriver getDriver(){
        return WebDriverFactory.getWebDriver();
    }
    public String getMensOuterwearTitle() throws InterruptedException {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("title")));
        Thread.sleep(1000);
        return this.getMensOuterwearTitleElement().getText();
    }
}
