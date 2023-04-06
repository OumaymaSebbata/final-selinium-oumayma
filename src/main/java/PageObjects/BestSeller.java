package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BestSeller {
   WebDriver driver;

    public BestSeller(WebDriver driver){ this.driver = driver;}

    By bestsellerbutton = By.cssSelector("[data-csa-c-content-id=\"nav_cs_bestsellers\"]");

    public void bestsellercase()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(bestsellerbutton).click();
    }
}
