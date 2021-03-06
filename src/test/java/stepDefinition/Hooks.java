package stepDefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import util.DriverFactory;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    public static Scenario _scenario;

    @Before
    public void before(Scenario scenario) throws Exception {
        DriverFactory.getInstance().initializeDriver();
        driver=DriverFactory.getInstance().getDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        _scenario = scenario;
    }

    @After
    public void after() {
        DriverFactory.getInstance().closeDriver();

    }
}
