package Pages;

import BaseConfig.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='username']")
    WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    WebElement password;

    @FindBy(xpath = "//*[@id='login-button']/span")
    WebElement loginBtn;

    @FindBy(xpath = "//*[@id='wrong-password-error-title']")
    WebElement textError;


    public void getLogin(String email, String pass){

        username.sendKeys(email);
        password.sendKeys(pass);
        loginBtn.click();
    }

    public String getTextError(){
           return textError.getText();
    }
}
