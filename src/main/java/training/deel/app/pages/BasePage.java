package training.deel.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import training.deel.app.utils.TestUtils;

import static training.deel.app.base.BaseTest.getDriver;

//import static training.deel.app.base.BaseTest.getDriver;

public abstract class BasePage extends TestUtils {

   // public static WebDriver driver;
    WebDriver driver;

      public BasePage() {
          this.driver = getDriver();
            PageFactory.initElements(driver, this);
       }

       /*
    public static <T extends BasePage> T initPage(Class<T> pageClass) {
        return PageFactory.initElements(driver, pageClass);
    }
*/

    }

