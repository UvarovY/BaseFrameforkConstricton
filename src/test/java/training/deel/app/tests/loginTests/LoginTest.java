package training.deel.app.tests.loginTests;

import org.testng.annotations.Test;
import training.deel.app.base.BaseTest;
import training.deel.app.pages.WelcomePageObject;

public class LoginTest extends BaseTest {

@Test
    public void logInTest(){

    WelcomePageObject welcomePageObject = new WelcomePageObject();
    welcomePageObject.openLoginPage();
 }
}
