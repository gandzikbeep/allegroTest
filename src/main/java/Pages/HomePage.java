package Pages;

import BaseConfig.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[contains(text(),'zaloguj się')]")
    WebElement loginBtn;


    @FindBy(xpath = "//*[@class = '_13q9y _8hkto munh_56_m m7er_k4 m7er_56_m']")
    WebElement agreeRodoBtn;


    public void setAgreeOnPopup() {
        agreeRodoBtn.click();
    }


    public void setLoginBtn() {
        loginBtn.click();

    }



}
