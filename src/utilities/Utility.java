package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Utility extends BaseTest {
    public void selectMenu(String menu) {
        clickOnElement(By.linkText(menu));
    }

    public void clickOnElement(By by) {
        // This method will click on element
        driver.findElement(by).click();
    }

    // for selcet option
    public void selectMyAccountOptions(String option) {
        driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='" + option + "']"));

    }

    // This method will get text from element
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    // This method will get WebElement from element
    public WebElement getWebElement(By by) {
        return driver.findElement(by);
    }

    // select class for dropdown list
    public void selectByVisibleTextFromDropDown(By by, String visibleText) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(visibleText);


    }

    public void verifyText(String expectedMessage, By by, String message) {
        WebElement actualTextMessageElement = driver.findElement(by);
        String actualMessage = actualTextMessageElement.getText();
        Assert.assertEquals(message, expectedMessage, actualMessage);
    }

    public List<WebElement> listOfItems(By by) {
        List<WebElement> products = driver.findElements(by);
        return products;
    }

    // mouseHooverToElement
    public void mouseHooverToElement(By by) {
        Actions actions = new Actions(driver);
        WebElement webElement = driver.findElement(by);
        actions.moveToElement(webElement).perform();
    }


    // This method to help entering text in text box
    public void sendKeysToElement(By by, String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);

    }

    public String getAttributeValueFromElement(By by) {
        return driver.findElement(by).getAttribute("value");
    }

    public void dismissAlert() {
        Alert alert = driver.switchTo().alert(); // Creating alert Object reference and Switch to Alert
        System.out.println(alert.getText()); // Getting the text from alert
        // alert.accept(); // Accepting the alert
        alert.dismiss();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void assertProduct(String expectedProduct, int index) {
        String expectedProduct1 = expectedProduct;
        String actualProduct1 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[" + index + "]"));
        Assert.assertEquals(expectedProduct1, actualProduct1);
    }


}
