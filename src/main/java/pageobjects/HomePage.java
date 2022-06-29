package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends pageobjects.BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@title='My Store']")
    private WebElement companyLogoLink;

    @FindBy(xpath = "(//a[@title='T-shirts'])[2]")
    private WebElement tShirtsLink;

    @FindBy(xpath = "(//a[@title='Dresses'])[2]")
    private WebElement dressesLink;


    public void navigateToTshirtsPage() {
        click(tShirtsLink);

    }

    public void navigateToDressesPage() {
        click(dressesLink);

    }

}
