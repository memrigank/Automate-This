import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {

    private static WebDriver driver=null;

    private baseClass(){
    }

    public static WebDriver getInstance(){
        if(driver==null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
    return driver;
    }

    public static void closeBrowser() {
        if (driver != null) {  // Check if browser is open
            driver.quit();  // Close browser
            driver = null;  // Reset WebDriver instance
        }
    }
}
