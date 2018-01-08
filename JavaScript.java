package com.javafortesters.junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

import static com.javafortesters.junit.JUnitTest.driver;
import static junit.framework.TestCase.assertEquals;

public class JavaScript {

    @Test
    public void jsReturn() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://compendiumdev.co.uk/selenium/canvas_basic.html");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        assertEquals("Javascript calculatro", 4L, //LONG
                js.executeScript(
                        "return (arguments[0]+arguments[1]);",2, 2));
    }
    @Test
    public void re(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://compendiumdev.co.uk/selenium/canvas_basic.html");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        assertEquals("return 10", 10L, js.executeScript("return 10;"));
    }
    @Test
    public void bob(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://compendiumdev.co.uk/selenium/canvas_basic.html");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.title=arguments[0]", "bob");
        assertEquals("bob", driver.getTitle());
    }
}





