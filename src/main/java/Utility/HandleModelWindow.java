//package Utility;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class HandleModelWindow {
//
//    private static ChromeDriver driver;
//
//
//
//    public static void main(String [] args) {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://allegro.pl/");
//        driver.findElement(By.xpath("//button[contains(text(),'dalej')]")).click();   //clik on agree
//        Alert alert = driver.switchTo().alert();
//        alert.getText(alert.getText())
//
//            }
//}
