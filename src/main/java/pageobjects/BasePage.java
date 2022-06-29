package pageobjects;


import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class BasePage {
    private static final long MAX_TIME_OUT_IN_SECONDS = 30;
    public WebDriverWait wait;
    protected WebDriver driver;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, MAX_TIME_OUT_IN_SECONDS);
        PageFactory.initElements(driver, this);
    }

    protected void waitUntilTheElementIsVisible(WebElement element){
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        }catch (NoSuchElementException e){

        }
    }

    public void waitUntilTheElementIsClickable(WebElement element) {
        try {
            wait = new WebDriverWait(driver, MAX_TIME_OUT_IN_SECONDS);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            throw new WebDriverException("The element " + element.toString() + " is not clickable");
        }
    }

    public void click(WebElement element) {
        waitUntilTheElementIsClickable(element);
        try {
        waitUntilTheElementIsVisible(element);
            element.click();
        } catch (Exception e) {
            throw new WebDriverException("The element " + element.toString() + " is not clickable");
        }

    }

    public void selectByVisibleText(WebElement element, String value) {
        try {
            Select select = new Select(element);
            select.selectByVisibleText(value);
        } catch (Exception e) {
            System.out.println("Error selecting value " + value + " from element " + element.toString());
        }
    }





}
