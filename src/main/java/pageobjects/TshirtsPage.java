package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TshirtsPage extends pageobjects.BasePage {

    public TshirtsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='product-container']//img[@title='Faded Short Sleeve T-shirts']")
    private WebElement fadedShortSleeveTshirt;

    @FindBy(xpath = "//*[@id='group_1']")
    private WebElement sizeDropdown;

    @FindBy(xpath = "//*[@name='Submit']")
    private WebElement addCartButton;

    @FindBy(xpath = "//*[@title='Blue']")
    private WebElement blueColor;

    @FindBy(xpath = "//*[@title='Continue shopping']")
    private WebElement continueShoppingButton;


    public void addFadedShortSleeveTshirtToCart() {
        click(fadedShortSleeveTshirt);
        selectByVisibleText(sizeDropdown, "M");
        click(blueColor);
        click(addCartButton);
        click(continueShoppingButton);


    }


}
