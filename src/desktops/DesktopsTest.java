package desktops;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class DesktopsTest extends Utility {
    String baseUrl = "http://tutorialsninja.com/demo/index.php?";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        // 1.1 Mouse hover on Desktops Tab.and click
        mouseHooverToElement(By.xpath("//a[normalize-space()='Desktops']"));
        clickOnElement(By.xpath("//a[normalize-space()='Desktops']"));
        //1.2 Click on “Show All Desktops”
        clickOnElement(By.xpath("//a[normalize-space()='Show AllDesktops']"));
        //  1.3 Select Sort By position "Name: Z to A"
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (Z - A)");


        // 1.4 Verify the Product will arrange in Descending order.
        String expectedProduct1 = "Sony VAIO";
        String actualProduct1 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[1]"));
        Assert.assertEquals(expectedProduct1, actualProduct1);

        String expectedProduct2 = "Samsung SyncMaster 941BW";
        String actualProduct2 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[2]"));
        Assert.assertEquals(expectedProduct2, actualProduct2);

        String expectedProduct3 = "Product 8";
        String actualProduct3 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[3]"));
        Assert.assertEquals(expectedProduct3, actualProduct3);

        String expectedProduct4 = "Palm Treo Pro";
        String actualProduct4 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[4]"));
        Assert.assertEquals(expectedProduct4, actualProduct4);

        String expectedProduct5 = "MacBook Air";
        String actualProduct5 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[5]"));
        Assert.assertEquals(expectedProduct5, actualProduct5);

        String expectedProduct6 = "MacBook";
        String actualProduct6 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[6]"));
        Assert.assertEquals(expectedProduct6, actualProduct6);

        String expectedProduct7 = "iPod Classic";
        String actualProduct7 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[7]"));
        Assert.assertEquals(expectedProduct7, actualProduct7);

        String expectedProduct8 = "iPhone";
        String actualProduct8 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[8]"));
        Assert.assertEquals(expectedProduct8, actualProduct8);

        String expectedProduct9 = "HTC Touch HD";
        String actualProduct9 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[9]"));
        Assert.assertEquals(expectedProduct9, actualProduct9);

        String expectedProduct10 = "HP LP3065";
        String actualProduct10 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[10]"));
        Assert.assertEquals(expectedProduct10, actualProduct10);

        String expectedProduct11 = "Canon EOS 5D";
        String actualProduct11 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[11]"));
        Assert.assertEquals(expectedProduct11, actualProduct11);

        String expectedProduct12 = "Apple Cinema 30\"";
        String actualProduct12 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[12]"));
        Assert.assertEquals(expectedProduct12, actualProduct12);

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        // 2.1 Mouse hover on Desktops Tab. and click
        mouseHooverToElement(By.xpath("//a[normalize-space()='Desktops']"));
        clickOnElement(By.xpath("//a[normalize-space()='Desktops']"));
        // 2.2 Click on “Show All Desktops”
        clickOnElement(By.xpath("//a[normalize-space()='Show AllDesktops']"));

        //  2.3 Select Sort By position "Name: A to Z"
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (A - Z)");

        String expectedProduct1 = "Apple Cinema 30\"";
        String actualProduct1 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[1]"));
        Assert.assertEquals(expectedProduct1, actualProduct1);

        String expectedProduct2 = "Canon EOS 5D";
        String actualProduct2 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[2]"));
        Assert.assertEquals(expectedProduct2, actualProduct2);

        String expectedProduct3 = "HP LP3065";
        String actualProduct3 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[3]"));
        Assert.assertEquals(expectedProduct3, actualProduct3);

        String expectedProduct4 = "HTC Touch HD";
        String actualProduct4 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[4]"));
        Assert.assertEquals(expectedProduct4, actualProduct4);

        String expectedProduct5 = "iPhone";
        String actualProduct5 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[5]"));
        Assert.assertEquals(expectedProduct5, actualProduct5);

        String expectedProduct6 = "iPod Classic";
        String actualProduct6 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[6]"));
        Assert.assertEquals(expectedProduct6, actualProduct6);

        String expectedProduct7 = "MacBook";
        String actualProduct7 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[7]"));
        Assert.assertEquals(expectedProduct7, actualProduct7);

        String expectedProduct8 = "MacBook Air";
        String actualProduct8 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[8]"));
        Assert.assertEquals(expectedProduct8, actualProduct8);

        String expectedProduct9 = "Palm Treo Pro";
        String actualProduct9 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[9]"));
        Assert.assertEquals(expectedProduct9, actualProduct9);

        String expectedProduct10 = "Product 8";
        String actualProduct10 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[10]"));
        Assert.assertEquals(expectedProduct10, actualProduct10);

        String expectedProduct11 = "Samsung SyncMaster 941BW";
        String actualProduct11 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[11]"));
        Assert.assertEquals(expectedProduct11, actualProduct11);

        String expectedProduct12 = "Sony VAIO";
        String actualProduct12 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[12]"));
        Assert.assertEquals(expectedProduct12, actualProduct12);

        // 2.4 Select product “HP LP3065”
        clickOnElement(By.xpath("//i[@class='fa fa-caret-down']"));
        clickOnElement(By.xpath("//button[normalize-space()='£Pound Sterling']"));
        clickOnElement(By.xpath("//a[normalize-space()='HP LP3065']"));//select HP LP3065
        verifyText("HP LP3065", By.xpath("//h1[contains(text(),'HP LP3065')]"), "Incorrect product");//2.5 verify text HP LP3065

        String year = "2022";//2.6 Select Delivery Date 2022-11-30
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//i[@class='fa fa-calendar']"));
        while (true) {
            String monthYear = driver.findElement(By.xpath("//th[@class='picker-switch']")).getText();

            String arr[] = monthYear.split(" ");
            String mon = arr[0];
            String yr = arr[1];
            //select expected year
            if (mon.equalsIgnoreCase(month) && yr.equals(year))
                break;
            else
                clickOnElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[3]"));
        }
        //select date
        List<WebElement> allDates = driver.findElements(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[3]"));
        for (WebElement dt : allDates) {
            if (dt.getText().equalsIgnoreCase(date)) {
                dt.click();
                break;
            }
        }

        driver.findElement(By.xpath("//input[@id='input-quantity']")).clear();//2.7 Enter quantity
        sendKeysToElement(By.xpath("//input[@id='input-quantity']"), "1");
        Thread.sleep(2000);
        clickOnElement(By.xpath("//button[@id='button-cart']"));//2.8 Add to cart button
        verifyText("Success: You have added HP LP3065 to your shopping cart!\n" + "×", By.xpath("//div[text()='Success: You have added ']"), "Product not added to basket");// 2.90 verift product added to cart successfully
        Thread.sleep(2000);
        clickOnElement(By.xpath("//a[contains(text(),'shopping cart')]"));//click on shopping cart
        Thread.sleep(2000);
        verifyText("HP LP3065", By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]"), "Text not matched");//2.12 Verify the Product name "HP LP3065"
        Thread.sleep(2000);
        verifyText("Delivery Date:2022-11-30", By.xpath("//small[contains(text(),'Delivery Date:2022-11-30')]"), "correct date not displayed");//2.13 Verify the Delivery Date "2022-11-30"
        Thread.sleep(2000);
        verifyText("Product 21", By.xpath("//td[contains(text(),'Product 21')]"), "Text not matched");//2.14 Verify the Model "Product21"
        Thread.sleep(2000);
        verifyText("£74.73", By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]"), "£74.73");

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}