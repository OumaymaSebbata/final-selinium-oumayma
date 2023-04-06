package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

     WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //closeCookiePopup()
    By listAndAccountButtonBy = By.cssSelector("#nav-link-accountList");

    By signInButtonBy = By.cssSelector(".nav-action-button");
    public void  cookieButtonPopUp()
    {
        WebElement cookieButton = driver.findElement(By.cssSelector("input#sp-cc-accept"));
        cookieButton.click();
    }
}
