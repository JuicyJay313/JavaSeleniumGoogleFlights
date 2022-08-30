import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class InitialTest {
    private static WebDriver driver;


    @BeforeAll
    public static void createDriver() {

        driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.google.com/travel/flights");
    }

    @Test
    public void firstWin() {

        Assertions.assertEquals("Google Flights", driver.getTitle());
    }


    @AfterAll
    public static void closeDriver() {

        driver.quit();
    }
}
