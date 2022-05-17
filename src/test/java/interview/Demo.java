package interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo {
    static WebDriver driver;
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "");
        driver =  new ChromeDriver();
        driver.get("https://www.phptravels.net/api/admin");
        WebElement signInForm = driver.findElement(By.xpath(".//*[contains(@class, 'form-signin')]"));

        WebElement emailElement = getElement(signInForm, By.name("email"));
        clearAndType(emailElement, "test@gmail.com");


        WebElement passwordElement = getElement(signInForm, By.name("password"));
        clearAndType(passwordElement, "password");

        getElement(signInForm, By.xpath(".//span[contains(text(), 'Login')]/..")).click();

        String errorMessage = getElement(signInForm, By.cssSelector(".resultlogin")).getText();

        Assert.assertEquals(errorMessage, "");

    }

    public static WebElement getElement(WebElement parent, By locator){
        return parent.findElement(locator);
    }

    public static void clearAndType(WebElement element, String value){
        element.clear();
        element.sendKeys(value);
    }


}
