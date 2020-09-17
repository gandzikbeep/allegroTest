package BaseConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    public int timeOut = 10;
   // public WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        //wait = new WebDriverWait(driver, timeOut);
        PageFactory.initElements(driver, this);
    }

    protected void waitForElementToBeVisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(this.driver, timeOut);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
}
