package pageobjects;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class DressesPage extends pageobjects.BasePage {

    public DressesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@title='Browse our different dresses to choose the perfect dress for an unforgettable evening!']")
    private WebElement eveningDresses;

    @FindBy(xpath = "//*[@title='Short dress, long dress, silk dress, printed dress, you will find the perfect dress for summer.']")
    private WebElement summerDresses;

    @FindBy(xpath = "//img[@title='Printed Dress']")
    private WebElement printedDress;


    @FindBy(xpath = "(//img[@title='Printed Summer Dress'])[1]")
    private WebElement printedSummerDress;

    @FindBy(xpath = "//*[@id='group_1']")
    private WebElement sizeDropdown;

    @FindBy(xpath = "//*[@name='Submit']")
    private WebElement addCartButton;

    @FindBy(xpath = "//*[@title='Beige']")
    private WebElement beigeColor;

    @FindBy(xpath = "//*[@title='Orange']")
    private WebElement orangeColor;

    @FindBy(xpath = "//*[@title='Continue shopping']")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "//*[@title='Proceed to checkout']")
    private WebElement proceedToCheckoutButton;

    public void addPrintedEveningDressToCart() {
        click(eveningDresses);
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        click(printedDress);
        selectByVisibleText(sizeDropdown, "S");
        click(beigeColor);
        click(addCartButton);
        click(continueShoppingButton);
    }

    public void addPrintedSummerDressToCart() {
        click(summerDresses);
        click(printedSummerDress);
        selectByVisibleText(sizeDropdown, "M");
        click(orangeColor);
        click(addCartButton);
    }

    public void proceedToCheckout() {
        click(proceedToCheckoutButton);
    }


}
