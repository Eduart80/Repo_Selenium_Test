package Pages;

import WebDriver.Web;
import org.openqa.selenium.By;


public class BasePage {
    public void clickThis(By locator) {
        Web.getDriver().findElement(locator).click();
    }
}
