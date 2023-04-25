package homepage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = " http://tutorialsninja.com/demo/index.php?";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        // 1.1 Mouse hover on “Desktops” Tab and click
        mouseHooverToElement(By.xpath("//a[normalize-space()='Desktops']"));
        clickOnElement(By.xpath("//a[normalize-space()='Desktops']"));

        // 1.2 call selectMenu method and pass the menu = “Show All Desktops”
        selectMenu("Show AllDesktops");
        // 1.3 Verify the text ‘Desktops’
        String expectedMessage = "Desktops";
        String actualMessage = getTextFromElement(By.xpath("//h2[normalize-space()='Desktops']"));
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        // Mouse hover on “Laptops & Notebooks” Tab and click
        mouseHooverToElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
        clickOnElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
        // 2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        selectMenu("Show AllLaptops & Notebooks");
        //.3 Verify the text ‘Laptops & Notebooks’
        String expectedMessage = "Laptops & Notebooks";
        String actualMessage = getTextFromElement(By.xpath("//h2[normalize-space()='Laptops & Notebooks']"));
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        //  3.1 Mouse hover on “Components” Tab and click
        mouseHooverToElement(By.xpath("//a[normalize-space()='Components']"));
        clickOnElement(By.xpath("//a[normalize-space()='Components']"));

        // 3.2 call selectMenu method and pass the menu = “Show All Components”
        selectMenu("Show AllComponents");
        //  3.3 Verify the text ‘Components’
        String expectedMessage = "Components";
        String actualMessage = getTextFromElement(By.xpath("//h2[normalize-space()='Components']"));
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}

