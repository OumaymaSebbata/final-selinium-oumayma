package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

     WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //closeCookiePopup()
    By listAndAccountButtonBy = By.cssSelector("#nav-link-accountList");
    By bestsellerbutton = By.cssSelector("[data-csa-c-content-id=\"nav_cs_bestsellers\"]");

    By signInButtonBy = By.cssSelector(".nav-action-button");
    public void  cookieButtonPopUp() {
        WebElement cookieButton = driver.findElement(By.cssSelector("input#sp-cc-accept"));
        cookieButton.click();
    }

        public void bestsellercase()
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            driver.findElement(bestsellerbutton).click();
        }
    }

