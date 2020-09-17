package BaseConfig;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class BaseTest {
public WebDriver driver;

  @Before
    public void setup(){

      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      driver.manage().window().maximize();

      driver.get("https://allegro.pl/");
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  @After
    public void tearDown(){
      driver.quit();
    }


}
