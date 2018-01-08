package com.javafortesters.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.javafortesters.junit.JUnitTest.driver;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;



public class ChainElements{

@BeforeClass
public static void testLocators(){
        System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.compendiumdev.co.uk/selenium/find_by_playground.php");
        }

@Test
public void Chain(){
        WebElement element = driver.findElement(By.id("div1")).
        findElement(By.name("pName3")).
        findElement(By.tagName("a"));
        assertEquals("id", "id");

}
// by idOrName Chaining findElement and By support classes


@AfterClass
public static void close(){
        driver.quit();

}

        }
