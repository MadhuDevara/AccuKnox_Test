import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrontEndBackendInegration {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://localhost:8081/");
            WebElement messageElement = driver.findElement(By.xpath("//h1[.='Hello from the Backend!']"));
            String displayedMessage = messageElement.getText();

            String expectedMessage = "Hello from the Backend!";

            Assert.assertEquals("The greeting message is incorrect.", expectedMessage, displayedMessage);

            System.out.println("Test executed Succesfully");
        } 
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Could not verify the text from backend");
        } 
        finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
