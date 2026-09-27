package OpenBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {

    protected WebDriver driver;

    public void setup() {
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        driver.get(
            "https://testautomationpractice.blogspot.com/"
        );
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}