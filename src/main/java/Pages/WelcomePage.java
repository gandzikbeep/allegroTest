package Pages;

import BaseConfig.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage {

//    @FindBy(xpath = "/html/body/div[3]/div[2]/header/div/nav/div[4]/button/span[1]")
//    WebElement accountDrop;
//    @FindBy(xpath = "//*[contains(text(),'moje konto')]")
//    WebElement myAccountElement;

//    @FindBy(xpath = "//*[contains(text(),'Cześć')]")
//    WebElement welcomeTxt;

    @FindBy(xpath = "//*[contains(text(),'Anna')]")
    WebElement username;

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

//    public void openMenuAccount() {
//        accountDrop.click();
//    }

//    public boolean isVisibleMyAccountInMenu() {
//        return myAccountElement.isDisplayed();
//    }
//
//    public void getMyAccount(){
//        openMenuAccount();
//        isVisibleMyAccountInMenu();
//    }
    public String  getWelcomeTxt(){
       return username.getText();
    }
}
