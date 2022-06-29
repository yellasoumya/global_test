package utilities;

import managers.AllDriverManager;
import managers.PageObjectManager;

public class TestContext {

    private final AllDriverManager driverManager;
    private final PageObjectManager pageObjectManager;
    public utilities.ScenarioContext scenarioContext;

    public TestContext() {
        driverManager = new AllDriverManager();
        pageObjectManager = new PageObjectManager(driverManager.getDriver());
        scenarioContext = new utilities.ScenarioContext();
    }

    public AllDriverManager getDriverManager() {
        return driverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    public utilities.ScenarioContext getScenarioContext() {
        return scenarioContext;
    }
}
