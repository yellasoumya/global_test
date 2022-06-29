package managers;

import pageobjects.DressesPage;
import pageobjects.SummaryPage;
import pageobjects.HomePage;
import org.openqa.selenium.WebDriver;
import pageobjects.TshirtsPage;

public class PageObjectManager {

    private final WebDriver driver;
    private HomePage homePage;
    private pageobjects.TshirtsPage tshirtsPage;
    private DressesPage dressesPage;
    private SummaryPage summaryPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public pageobjects.TshirtsPage getTshirtsPage() {
        return (tshirtsPage == null) ? tshirtsPage = new TshirtsPage(driver) : tshirtsPage;
    }

    public DressesPage getDressesPage() {
        return (dressesPage == null) ? dressesPage = new DressesPage(driver) : dressesPage;
    }

    public SummaryPage getSummaryPage() {
        return (summaryPage == null) ? summaryPage = new SummaryPage(driver) : summaryPage;
    }


}
