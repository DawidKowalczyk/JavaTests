package com.javafortesters.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.javafortesters.junit.JUnitTest.driver;
import static org.junit.Assert.assertEquals;

public class FindByXpath {

    @BeforeClass
    public static void testLocators() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.compendiumdev.co.uk/selenium/find_by_playground.php");
    }
    @Test
    public void byID(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"p31\"]"));
        assertEquals("pName31", element.getAttribute("name"));
    }
    @Test
    public void byName() {
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ul1\"]"));
        assertEquals("ul1", element1.getAttribute("id"));
    }

    @Test
    public void byClassName() {
        //WebElement element2 = driver.findElement(By.className("specialDiv"));
        WebElement element2 = driver.findElement(By.cssSelector("div[class='specialDiv']"));
        assertEquals("div1", element2.getAttribute("id"));
    }
    @AfterClass
    public static void close(){
        driver.quit();

    }


}



