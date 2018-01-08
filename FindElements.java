package com.javafortesters.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import static com.javafortesters.junit.JUnitTest.driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FindElements {

    @BeforeClass
    public static void testLocators() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.compendiumdev.co.uk/selenium/find_by_playground.php");
    }

    @Test
    public void divTest() {
        List<WebElement> dupa;
        dupa = driver.findElements(By.tagName("div"));
        assertEquals(19, dupa.size());
    }

    @Test
    public void paraTest() {
        List<WebElement> dom;
        dom = driver.findElements(By.partialLinkText("jump to para"));
        assertEquals(25, dom.size());
    }

    @Test
    public void pName() {
        List<WebElement> nest;
        nest = driver.findElements(By.tagName("p"));
        assertEquals(41, nest.size());
    }
    @Test
    public void nested(){
        List<WebElement> dok;
        dok = driver.findElements(By.name("nestedDiv"));
        assertEquals(16, dok.size());
    }

    @AfterClass
    public static void koniec(){
        driver.close();
    }

}




