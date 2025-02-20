import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {

    private static WebDriver driver;

    private baseClass(){
    }

    public static WebDriver getInstance(){
        if(driver==null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
    return driver;
    }

    public void verifyHomePage(){

    }
}
