package com.javafortesters.junit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static com.javafortesters.junit.JUnitTest.driver;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class ManipulationTest {

    @Before
    public void setup() {
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.get("https://compendiumdev.co.uk/selenium/basic_html_form.html");
    }

    @Test
    public void firstTest() {
        //WebElement  multipleElement = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
       // Select multiple = new Select(multipleElement);
        //assertTrue(multiple.isMultiple());

        WebElement element = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
        element.submit();
        assertTrue(driver.getTitle().startsWith("Processed Form Details"));
    }

    @Test
    public void secondTest() {
        WebElement comment = driver.findElement(By.name("comments"));
        comment.clear();
        comment.sendKeys("dupa");
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
        assertTrue(driver.getPageSource().contains("dupa"));
    }

    @Test
    public void thirthTest() {
        assertEquals(driver.getTitle(), "HTML Form Elements");
        WebElement radio2 = driver.findElement(By.cssSelector("input[value=rd2]"));
        if (radio2.isSelected());{
            radio2.click();
        }
        WebElement submit = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
        assertTrue(driver.getPageSource().contains("rd2"));
        driver.navigate().back();
    }

    @Test
    public void fourthTest(){
        WebElement cb1 = driver.findElement(By.cssSelector("input[value=cb1]"));
        if (cb1.isSelected());{
            cb1.click();
        }
        clickSubmitButton();

       //driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
       assertTrue(driver.getPageSource().contains("cb1"));
   }

    @Test
    public void fifthTest() throws InterruptedException {
        driver.findElement(By.cssSelector(" ")).click();
        driver.findElement(By.cssSelector("option[value=dd5]")).click();
        Thread.sleep(5000);
        clickSubmitButton();
        assertTrue(driver.getPageSource().contains("dd5"));
   }

    @Test
    public void sixthTest() throws InterruptedException {
    WebElement multiSelect;
    multiSelect = driver.findElement(By.cssSelector("select[multiple='multiple']"));
        List<WebElement> multiOptions = multiSelect.findElements(By.tagName("option"));

        multiOptions.get(0).click();
        multiOptions.get(1).click();
        multiOptions.get(2).click();
        multiOptions.get(3).click();

        clickSubmitButton();
        Thread.sleep(5000);
        assertTrue(driver.getPageSource().contains("ms1"));
        assertTrue(driver.getPageSource().contains("ms2"));
        assertTrue(driver.getPageSource().contains("ms3"));

    }

    @Test
    public void seventhTest(){
        driver.findElement(By.cssSelector("input[type=\"file\"]")).sendKeys("C:\\Users\\dkw\\Pictures\\pdf.pdf");
        WebElement submit = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
        submit.click();
        assertTrue(driver.getPageSource().contains("pdf"));

    }


    @After
    public void close() {
        driver.close();
   }


    private void clickSubmitButton(){
        //submit button
        WebElement submitButton;
        submitButton = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
        submitButton.click();
    }


}

