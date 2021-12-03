package training.deel.app.pages;

import static training.deel.app.utils.PropertyReader.getUrl;

public class WelcomePageObject extends BasePage {


    public WelcomePageObject() {
        super();
    }

     public  void openLoginPage(){
         driver.navigate().to(getUrl());
         try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

     }

}
