package com.javafortesters.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static com.javafortesters.junit.JUnitTest.driver;
import static javax.swing.text.html.CSS.getAttribute;
import static org.junit.Assert.assertEquals;

public class CssSelectors {

    @BeforeClass
    public static void testLocators() {
        driver = new ChromeDriver();
        driver.get("https://www.compendiumdev.co.uk/selenium/find_by_playground.php");
    }

    @Test
    public void byId() {
        //WebElement element = driver.findElement(By.id("p31"));
        WebElement element = driver.findElement(By.cssSelector("#p31"));
        assertEquals("pName31", element.getAttribute("name"));
    }

    @Test
    public void byName() {
        WebElement element1 = driver.findElement(By.name("ulName1"));
        //WebElement element1 = driver.findElement(By.cssSelector("[name=ulName1]"));
        assertEquals("ul1", element1.getAttribute("id"));
    }

    @Test
    public void byClassName() {
        //WebElement element2 = driver.findElement(By.className("specialDiv"));
        WebElement element2 = driver.findElement(By.cssSelector("div[class='specialDiv']"));
        assertEquals("div1", element2.getAttribute("id"));
    }

    @Test
    public void byTagName() {
        //WebElement element3 = driver.findElement(By.tagName("li"));
        WebElement element3 = driver.findElement(By.cssSelector("[name=liName1]"));
        assertEquals("liName1", element3.getAttribute("name"));
    }

    @AfterClass
    public static void close(){
        driver.quit();

    }
}




