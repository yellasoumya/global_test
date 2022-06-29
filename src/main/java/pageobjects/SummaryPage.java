package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummaryPage extends pageobjects.BasePage {

    public SummaryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//table[@id='cart_summary']/tbody/tr[2]//a[@title='Delete']")
    private WebElement removePrintedDress;

    @FindBy(xpath = "//table[@id='cart_summary']/tbody/tr[1]//a[@title='Add']")
    private WebElement addFadedShortSleeveTshirt;

    @FindBy(xpath = "//table[@id='cart_summary']/tbody/tr[1]//*[contains(@id,'total_product_price')]")
    private WebElement fadedShortSleeveTotal;

    @FindBy(xpath = "//table[@id='cart_summary']/tbody/tr[2]//*[contains(@id,'total_product_price')]")
    private WebElement printedSummerDressTotal;

    @FindBy(xpath = "//*[@id='total_price']")
    private WebElement cartTotal;

    public void removeTheEveningDress() {
        click(removePrintedDress);
    }

    public void addFadedShortSleeveTshirt() {
        click(addFadedShortSleeveTshirt);
    }

    public String getTotalValueOfFadedShortSleeve() {
        return fadedShortSleeveTotal.getText();
    }

    public String getTotalValueOfPrintedSummerDress() {
        return printedSummerDressTotal.getText();
    }

    public String getTotalValueOfCart() {
        return cartTotal.getText();
    }


}
