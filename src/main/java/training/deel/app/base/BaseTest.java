package training.deel.app.base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import training.deel.app.pages.BasePage;
import training.deel.app.pages.WelcomePageObject;
import training.deel.app.utils.DriverFactory;

import static training.deel.app.utils.PropertyReader.getBrowser;
import static training.deel.app.utils.PropertyReader.getUrl;
//import static training.deel.app.utils.PropertyReader.getUrl;
//import static training.deel.app.pages.BasePage.initPage;

public abstract class BaseTest {

    private static WebDriver driver;

    public static WebDriver getDriver() {
       return driver;
    }

    @Parameters({"browser"})
    @BeforeClass
    public WebDriver setUp() {
       // driver = DriverFactory.getDriver(getBrowser());
        driver = DriverFactory.getDriver(getBrowser());
       // driver.navigate().to(getUrl());
        return driver;
    }

    @AfterMethod
    public void goBack() {
        //driver.navigate().goBack();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @DataProvider(name = "dataProvider")
    public Object[][] dataProviderMethod() {
        return new Object[][]{{"selenium"},/*{"selenium javascript"}*/};
    }
}



