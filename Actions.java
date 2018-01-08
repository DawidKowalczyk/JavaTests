package com.javafortesters.junit;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.javafortesters.junit.JUnitTest.driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;

public class Actions {

    @Before
    public void SetUp() {
        driver = new ChromeDriver();
        driver.get("https://compendiumdev.co.uk/selenium/gui_user_interactions.html");
    }

    @Test
    public void draggable1() {
        org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(driver);
        WebElement draggable1 = driver.findElement(By.cssSelector("div[id='draggable1']"));
        WebElement droppable1 = driver.findElement(By.cssSelector("div[id='droppable1']"));
        actions.dragAndDrop(draggable1, droppable1);
        actions.perform();
        WebElement dropped = driver.findElement(By.cssSelector("div[id='droppable1']>p"));
        assertEquals("Dropped!", dropped.getText());
    }

    @Test
    public void draggable2(){
        org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(driver);
        WebElement draggable2 = driver.findElement(By.cssSelector("div[id='draggable2']"));
        WebElement droppable1 = driver.findElement(By.cssSelector("div[id='droppable1']"));
        actions.dragAndDrop(draggable2, droppable1);
        actions.perform();
        assertEquals("Get Off Me!", driver.findElement(By.cssSelector("div[id='droppable1']>p")).getText());
    }

    @Test
    public void ControlB() throws InterruptedException {
        org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(driver);
        WebElement paragraf = driver.findElement(By.xpath(".//*[@id='draggable1']/p"));
        assertTrue(paragraf.getText().contains("Drag me"));
        actions.keyDown(Keys.CONTROL).sendKeys("b").perform();
        assertTrue(paragraf.getText().contains("Bwa! Ha! Ha!"));


    }

    @Test
    public void ControlC() throws InterruptedException {
        org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(driver);
        WebElement droppable1 = driver.findElement(By.cssSelector("div[id='droppable1']"));
        WebElement droppable2 = driver.findElement(By.cssSelector("div[id='droppable2']"));
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys(Keys.SPACE).perform();
        assertEquals("Let GO!!!", droppable1.getText());
        assertEquals("Let GO!!!", droppable2.getText());

    }

    @Test
     public void Optional() {
         org.openqa.selenium.interactions.Actions actions = new org.openqa.selenium.interactions.Actions(driver);
         WebElement canvas = (driver.findElement(By.id("canvas")));
         //int eventCount = eventList.find

         actions.clickAndHold(canvas)
                 .moveByOffset(10,10)
                 .release()
                 .perform();
    //assertTrue("we should have some draw events");
    //canvas.getText());

    }

    @After
    public void close(){
        driver.close();
    }

}








