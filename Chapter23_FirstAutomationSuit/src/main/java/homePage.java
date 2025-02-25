import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class homePage {

    WebDriver driver;

    public homePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo ']")
    public WebElement homePageLogo;

    public void verifyHomePage(WebDriver driver){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean status=driver.findElement((By) homePageLogo).isDisplayed();
        if(status==true){
            System.out.println("Welcome to the page, we have successfully landed on the Myntra page");
        }else{
            System.out.println("Not on the Myntra Page");
        }

    }

}
