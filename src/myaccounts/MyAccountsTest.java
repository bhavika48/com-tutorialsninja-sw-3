package myaccounts;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class MyAccountsTest extends Utility {
    String baseUrl = "http://tutorialsninja.com/demo/index.php?";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
//1.1 Click on My Account Link.
        clickOnElement(By.xpath("//span[normalize-space()='My Account']"));

//1.2 Call the method “selectMyAccountOptions” method and pass the parameter
//“Register”
        selectMyAccountOptions("Register");
//1.3 Verify the text “Register Account”.
        String expectedMessage = "Register Account";
        String actualMessage = getTextFromElement(By.xpath("//h1[normalize-space()='Register Account']"));
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
//2.1 Click on My Account Link.
        clickOnElement(By.xpath("//span[normalize-space()='My Account']"));

//2.2 Call the method “selectMyAccountOptions” method and pass the parameter
//“Login”
        selectMyAccountOptions("Login");
//2.3 Verify the text “Returning Customer”.
        String expectedMessage = "Returning Customer";
        String actualMessage = getTextFromElement(By.xpath("//h2[normalize-space()='Returning Customer']"));
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
//3.1 Clickr on My Account Link.
        clickOnElement(By.xpath("//span[normalize-space()='My Account']"));

//3.2 Call the method “selectMyAccountOptions” method and pass the parameter
//“Register”
        selectMyAccountOptions("Register");
//3.3 Enter First Name
        sendKeysToElement(By.xpath("//input[@id='input-firstname']"), "Jann");
//3.4 Enter Last Name
        sendKeysToElement(By.xpath("//input[@id='input-lastname']"), "olins");
//3.5 Enter Email
        sendKeysToElement(By.xpath("//input[@id='input-email']"), "jann123@gmail.com");
//3.6 Enter Telephone
        sendKeysToElement(By.xpath("//input[@id='input-telephone']"), "06783452345");

//3.7 Enter Password
        sendKeysToElement(By.xpath("//input[@id='input-password']"), "jann123");
//3.8 Enter Password Confirm
        sendKeysToElement(By.xpath("//input[@id='input-password']"), "jann123");

//3.9 Select Subscribe Yes radio button
        clickOnElement(By.xpath("(//input[@name='newsletter'])[1]"));
//3.10 Click on Privacy Policy check box
        clickOnElement(By.xpath("//input[@name='agree']"));
//3.11 Click on Continue button
        clickOnElement(By.xpath("//input[@value='Continue']"));
//3.12 Verify the message “Your Account Has Been Created!”
        String expectedMessage = "Your Account Has Been Created!";
        String actualMessage = getTextFromElement(By.xpath("//h1[normalize-space()='Your Account Has Been Created!']"));
        Assert.assertEquals(expectedMessage, actualMessage);


//3.13 Click on Continue button
        clickOnElement(By.xpath("//a[normalize-space()='Continue']"));
//3.14 Clickr on My Account Link.
        clickOnElement(By.xpath("//span[normalize-space()='My Account']"));

//3.15 Call the method “selectMyAccountOptions” method and pass the parameter
//“Logout”
        selectMyAccountOptions("Logout");
//3.16 Verify the text “Account Logout”
        String expectedMessage1 = "Account Logout";
        String actualMessage1 = getTextFromElement(By.xpath("//h1[normalize-space()='Account Logout']"));
        Assert.assertEquals(expectedMessage1, actualMessage1);

//3.17 Click on Continue button
        clickOnElement(By.xpath("//a[normalize-space()='Continue']"));

    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
//4.1 Clickr on My Account Link.
        clickOnElement(By.xpath("//span[normalize-space()='My Account']"));
//4.2 Call the method “selectMyAccountOptions” method and pass the parameter
//“Login”
        selectMyAccountOptions("Login");
//4.3 Enter Email address
        sendKeysToElement(By.xpath("//input[@id='input-email']"), "jann123@gmail.com");
//4.4 Enter Last Name

//4.5 Enter Password
        sendKeysToElement(By.xpath("//input[@id='input-password']"), "jann123");
//4.6 Click on Login button
        clickOnElement(By.xpath("//input[@value='Login']"));
//4.7 Verify text “My Account”

        String expectedMessage1 = "My Account";
        String actualMessage1 = getTextFromElement(By.xpath("//h2[normalize-space()='My Account']"));
        Assert.assertEquals(expectedMessage1, actualMessage1);

//4.8 Click on My Account Link.
        clickOnElement(By.xpath("//a[@class='list-group-item'][normalize-space()='My Account']"));
//4.9 Call the method “selectMyAccountOptions” method and pass the parameter
//“Logout”
        selectMyAccountOptions("Logout");
//4.10 Verify the text “Account Logout”
        String expectedMessage2 = "Account Logout";
        String actualMessage2 = getTextFromElement(By.xpath("//h1[normalize-space()='Account Logout']"));
        Assert.assertEquals(expectedMessage2, actualMessage2);
//4.11 Click on Continue button
        clickOnElement(By.xpath("//a[normalize-space()='Continue']"));
    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}
