import org.openqa.selenium.WebDriver;

public class homePageTC {

    public static void main(String[] args) {
        WebDriver driver = baseClass.getInstance();
        driver.get("https://www.myntra.com/");
        homePage homePage = new homePage(driver);


    }
}
