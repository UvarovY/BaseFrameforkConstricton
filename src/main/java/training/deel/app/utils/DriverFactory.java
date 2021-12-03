package training.deel.app.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;

public class DriverFactory {
    private static WebDriver driver;
    private static final String DRIVER_PATH = "src/test/resources/browsers/";

    public static WebDriver getDriver(Browser browser) {
        File file;
        switch (browser) {
            case CHROME:
                file = new File(DRIVER_PATH + "chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                driver = new ChromeDriver();
                System.out.println("Test in Chrome browser is opened ");
                break;
            case EDGE:
                file = new File(DRIVER_PATH + "msedgedriver.exe");
                System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
                driver = new EdgeDriver();
                System.out.println("Test in EdgeDriver() browser is opened");
                break;
            case FIREFOX:
                file = new File(DRIVER_PATH + "geckodriver.exe");
                System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
                driver = new FirefoxDriver();
                break;
            default:
                file = new File(DRIVER_PATH + "chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                driver = new ChromeDriver();
                System.out.println("Test in Chrome browser is opened by default ");
                break;
        }
        driver.manage().window().maximize();
        return driver;
    }
}

