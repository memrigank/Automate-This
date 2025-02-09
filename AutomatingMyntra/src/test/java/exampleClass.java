import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleClass {

    public static void main(String[] args) throws InterruptedException { //Thread.sleep expects you to have throws Exception
//        WebDriverManager.chromedriver().setup(); //setting up the driver
//        WebDriver driver = new ChromeDriver();   //creating driver object
        WebDriver driver= baseClass.getInstance();

        driver.get("https://www.google.com"); //going to the URL google.com
        System.out.println("Title: " + driver.getTitle()); //getting the Title

        Thread.sleep(3000); // sleep, so that the automation process is visible

        driver.navigate().to("https://www.myntra.com"); //navigating to myntra
        driver.navigate().refresh(); //refreshing the myntra  page
        driver.navigate().back(); //navigating back to google
        Thread.sleep(3000); // sleep, so that the automation process is visible
        driver.navigate().forward(); // navigating back to myntra

        Thread.sleep(3000); // sleep, so that the automation process is visible

        driver.quit(); //Closing the browser
    }
}
