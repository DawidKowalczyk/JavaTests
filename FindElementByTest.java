package com.javafortesters.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.javafortesters.junit.JUnitTest.driver;
import static org.junit.Assert.assertEquals;


public class FindElementByTest {

    @BeforeClass
    public static void testLocators(){
       System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.get("https://www.compendiumdev.co.uk/selenium/find_by_playground.php");
    }


    @Test
    public void ById(){
        WebElement cParagraph  = driver.findElement(By.id("p3"));
        assertEquals("This is c paragraph text", cParagraph.getText());
    }
    @Test
    public void ByLinkText(){
        WebElement par2 = driver.findElement(By.linkText("jump to para 0"));
        assertEquals("a26", par2.getAttribute("id"));

    }
    @Test
    public void ByName() {
        WebElement par3 = driver.findElement(By.name("pName1"));
        assertEquals("This is a paragraph text", par3.getText());

    }
    @AfterClass
    public static void closeBrowser(){
        driver.close();
    }
}















