package browser;

import org.openqa.selenium.WebDriver;

public class Browser {

    WebDriver driver ;

    public Browser(WebDriver driver){
        this.driver=driver;
    }

    public void setUpPage(String link) {
        driver.get(link);
    }
    public void quitDriver() {
        driver.close();
    }
}
