package com.javafortesters.junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

import static com.javafortesters.junit.JUnitTest.driver;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class Frames {

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://compendiumdev.co.uk/selenium/frames");
    }
    @Test
    public void test1(){
        driver.switchTo().frame("content");
        WebElement green = driver.findElement(By.cssSelector("a[href='green.html']"));
        green.click();
        WebElement back = driver.findElement(By.cssSelector("a[href='content.html']"));
        back.click();
        assertEquals("Content", driver.findElement( By.tagName("h1")).getText());



    }



}
