package com.javafortesters.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;

import static com.javafortesters.junit.JUnitTest.driver;
import static org.junit.Assert.assertEquals;

public class FramesWindow {

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://compendiumdev.co.uk/selenium/frames/index.html");
    }

    @Test
    public void e(){
        driver.switchTo().frame("content");
        assertEquals("Content", driver.findElement( By.tagName("h1")).getText());
    }
    @Test
    public void f(){
        String frames = driver.getWindowHandle();
        driver.switchTo().frame("content");
        driver.findElement(By.cssSelector("a[href='http://www.seleniumsimplified.com']")).click();

        String newWeb = frames;
        Iterator <String> ahandle = driver.getWindowHandles().iterator();
        while (newWeb.equals(frames)){
            newWeb = ahandle.next();
        }
    }

    @After
    public void close(){
        driver.close();

    }

}
