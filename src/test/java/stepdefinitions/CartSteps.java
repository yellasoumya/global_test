package stepdefinitions;

import pageobjects.DressesPage;
import pageobjects.SummaryPage;
import com.google.common.util.concurrent.Uninterruptibles;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import utilities.TestContext;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CartSteps {

    TestContext testContext;
    HomePage homePage;
    pageobjects.TshirtsPage tshirtsPage;
    SummaryPage summaryPage;
    DressesPage dressesPage;

    public CartSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
        tshirtsPage = testContext.getPageObjectManager().getTshirtsPage();
        dressesPage = testContext.getPageObjectManager().getDressesPage();
        dressesPage = testContext.getPageObjectManager().getDressesPage();
        summaryPage = testContext.getPageObjectManager().getSummaryPage();
    }

    @Given("the customer added the Faded Short Sleeve T Shirt, size medium, colour blue to the cart")
    public void theCustomerAddedTheFadedShortSleeveTShirtSizeMediumColourBlueToTheCart() {
        homePage.navigateToTshirtsPage();
        tshirtsPage.addFadedShortSleeveTshirtToCart();
    }

    @And("the customer added the Evening Dress, size small, colour beige to the cart")
    public void theCustomerAddedTheEveningDressSizeSmallColourBeigeToTheCart() {
        homePage.navigateToDressesPage();
        dressesPage.addPrintedEveningDressToCart();
    }

    @And("the customer added the Printed Summer Dress, size medium, colour orange to the cart")
    public void theCustomerAddedThePrintedSummerDressSizeMediumColourOrangeToTheCart() {
        homePage.navigateToDressesPage();
        dressesPage.addPrintedSummerDressToCart();
    }

    @When("the customer navigated the checkout")
    public void theCustomerNavigatedTheCheckout() {
        dressesPage.proceedToCheckout();
    }

    @And("the customer removed the Evening Dress from the cart")
    public void theCustomerRemovedTheEveningDressFromTheCart() {
        summaryPage.removeTheEveningDress();
    }

    @And("the customer added a second Faded Short Sleeve T Shirt of the same size and colour")
    public void theCustomerAddedASecondFadedShortSleeveTShirtOfTheSameSizeAndColour() {
        summaryPage.addFadedShortSleeveTshirt();
    }

    @Then("correct values should be displayed at checkout")
    public void correctValuesShouldBeDisplayedAtCheckout() {
        Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
        assertThat(summaryPage.getTotalValueOfFadedShortSleeve(), is(equalTo("$33.02")));
        assertThat(summaryPage.getTotalValueOfPrintedSummerDress(), is(equalTo("$28.98")));
        assertThat(summaryPage.getTotalValueOfCart(), is(equalTo("$64.00")));

    }
}
