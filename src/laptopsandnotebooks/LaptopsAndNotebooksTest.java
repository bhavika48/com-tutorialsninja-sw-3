package laptopsandnotebooks;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LaptopsAndNotebooksTest extends Utility {
    String baseUrl = "https://tutorialsninja.com/demo/index.php?";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        // 1.1 Mouse hover on Laptops & Notebooks Tab.and click
        mouseHooverToElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
        clickOnElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));

        //1.2 Click on “Show All Laptops & Notebooks”
        clickOnElement(By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']"));
        // 1.3 Select Sort By "Price (High > Low)"
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='input-sort']"), "Price (High > Low)");
        // 1.4 Verify the Product price will arrange in High to Low order.
        String expectedProduct1 = "MacBook Pro";
        String actualProduct1 = getTextFromElement(By.xpath("(//div[@class='product-thumb']//h4//a)[1]"));
        Assert.assertEquals(expectedProduct1, actualProduct1);

        assertProduct("Sony VAIO", 2);
        assertProduct("MacBook Air", 3);
        assertProduct("MacBook", 4);
        assertProduct("HP LP3065", 5);


    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() {
        // 2.1 Mouse hover on Laptops & Notebooks Tab and click
        mouseHooverToElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
        clickOnElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
        //  2.2 Click on “Show All Laptops & Notebooks”
        clickOnElement(By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']"));


        // 2.3 Select Sort By "Price (High > Low)"
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='input-sort']"), "Price (High > Low)");

        // 2.4 Select Product “MacBook”
        clickOnElement(By.xpath("//a[normalize-space()='MacBook']"));


        //  2.5 Verify the text “MacBook”
        String expectedMessage = "MacBook";
        String actualMessage = getTextFromElement(By.xpath("//h1[normalize-space()='MacBook']"));
        Assert.assertEquals(expectedMessage, actualMessage);

        //  2.6 Click on ‘Add To Cart’ button
        clickOnElement(By.xpath("//button[@id='button-cart']"));
        // 2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        String expectedMessage1 = "Success: You have added MacBook to your shopping cart!\n×";
        String actualMessage1 = getTextFromElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertEquals(expectedMessage1, actualMessage1);
        // 2.8 Click on link “shopping cart” display into success message
        clickOnElement(By.xpath("//a[normalize-space()='shopping cart']"));
        //  2.9 Verify the text "Shopping Cart"
        String expectedMessage2 = "Shopping Cart";
        String actualMessage2 = getTextFromElement(By.xpath("//h1[contains(text(),'Shopping Cart')]"));
        Assert.assertTrue(actualMessage2.contains(expectedMessage2));

        // 2.10 Verify the Product name "MacBook"
        String expectedMessage3 = "MacBook";
        String actualMessage3 = getTextFromElement(By.xpath("(//a[contains(text(),'MacBook')])[2]"));
        Assert.assertEquals(expectedMessage3, actualMessage3);

        //  2.11 Change Quantity "2"
        sendKeysToElement(By.xpath("//input[@name='quantity']"), "2");

        //  2.12 Click on “Update”Tab
        clickOnElement(By.xpath("//i[@class='fa fa-refresh']"));

//        2.13 Verify the message “Success: You have modified your shopping cart!”
        String expectedMessage4 = "Success: You have modified your shopping cart!\n" +
                "    ";
        String actualMessage4 = getTextFromElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertEquals(expectedMessage4, actualMessage4);
//        2.14 Verify the Total £737.45
        expectedMessage = "$1,204.00";
        actualMessage = getTextFromElement(By.xpath("(//td[contains(text(),'$1,204.00')])[4]"));
        Assert.assertEquals(expectedMessage, actualMessage);

//        2.15 Click on “Checkout” button
        clickOnElement(By.xpath("//a[@class='btn btn-primary']"));
//        2.16 Verify the text “Checkout”
        String expectedMessage5 = "Checkout";
        String actualMessage5 = getTextFromElement(By.xpath("//h1[normalize-space()='Checkout']"));
        Assert.assertEquals(expectedMessage5, actualMessage5);
//        2.17 Verify the Text “New Customer”
        String expectedMessage6 = "New Customer";
        String actualMessage6 = getTextFromElement(By.xpath("//h2[normalize-space()='New Customer']"));
        Assert.assertEquals(expectedMessage6, actualMessage6);
//        2.18 Click on “Guest Checkout” radio button
        clickOnElement(By.xpath("//input[@value='guest']"));
//        2.19 Click on “Continue” tab
        clickOnElement(By.xpath("//input[@id='button-account']"));
//        2.20 Fill the mandatory fields
        sendKeysToElement(By.xpath("//input[@id='input-payment-firstname']"), "Tom");
        sendKeysToElement(By.xpath("//input[@id='input-payment-lastname']"), "Martin");
        sendKeysToElement(By.xpath("//input[@id='input-payment-email']"), "tom123@gmail.com");
        sendKeysToElement(By.xpath("//input[@id='input-payment-telephone']"), "03452344567");
        sendKeysToElement(By.xpath("//input[@id='input-payment-address-1']"), "22 cecil road");
        sendKeysToElement(By.xpath("//input[@id='input-payment-city']"), "London");
        sendKeysToElement(By.xpath("//input[@id='input-payment-postcode']"), "TW2 3PT");
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='input-payment-country']"), "United Kingdom");
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='input-payment-zone']"), "Cornwall");

//        2.21 Click on “Continue” Button
        clickOnElement(By.xpath("//input[@id='button-guest']"));
//        2.22 Add Comments About your order into text area
        sendKeysToElement(By.xpath("//textarea[@name='comment']"), "comments");
//        2.23 Check the Terms & Conditions check box
        clickOnElement(By.xpath("//input[@name='agree']"));

//        2.24 Click on “Continue” button
        clickOnElement(By.xpath("//input[@id='button-payment-method']"));

//        2.25 Verify the message “Warning: Payment method required!”
        String expectedMessage7 = "Warning: Payment method required!";
        String actualMessage7 = getTextFromElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
        Assert.assertEquals(expectedMessage7, actualMessage7);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }


}
