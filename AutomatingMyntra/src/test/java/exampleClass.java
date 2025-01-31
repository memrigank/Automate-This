import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleClass {

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup(); //setting up the driver
        WebDriver driver = new ChromeDriver();   //creating driver object
        driver.get("https://www.google.com"); //going to the URL google.com
        System.out.println("Title: " + driver.getTitle()); //getting the Title
        driver.quit(); //Closing the browser
    }
}
