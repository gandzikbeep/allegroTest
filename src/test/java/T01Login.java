import BaseConfig.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.WelcomePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class T01Login extends BaseTest {

    @Test
    public void loginValidData() {
        String email = "gandzikbeep@gmail.com";
        String pass = "Czarek2d";

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        WelcomePage welcomePage = new WelcomePage(driver);

        homePage.setAgreeOnPopup();
        homePage.setLoginBtn();
        loginPage.getLogin(email, pass);

        Assert.assertTrue(welcomePage.getWelcomeTxt().contains("Anna"));
    }

    @Test
    public void loginIncorrectData() {

        String email = "hahah@l.pl";
        String pass = "hahahha";

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.setAgreeOnPopup();
        homePage.setLoginBtn();
        loginPage.getLogin(email,pass);

        Assert.assertTrue(loginPage.getTextError().contains("Login, e-mail lub hasło są nieprawidłowe"));
    }
}
