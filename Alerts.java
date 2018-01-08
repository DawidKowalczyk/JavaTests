package com.javafortesters.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.javafortesters.junit.JUnitTest.driver;
import static org.junit.Assert.assertEquals;

public class Alerts {

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.get("http://compendiumdev.co.uk/selenium/alerts.html");
    }


    @Test
    public void alert(){
        WebElement alert1 = driver.findElement(By.id("alertexamples"));
        alert1.click();
        String mes1 = "I am an alert box!";
        driver.switchTo().alert();
        assertEquals(mes1, driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
    }


    @Test
    public void alert2(){
        WebElement alert2;
        alert2 = driver.findElement(By.id("confirmexample"));
        alert2.click();
        String mes2 = "I am a confirm alert";
        driver.switchTo().alert();
        driver.switchTo().alert().accept();
        assertEquals(mes2, "I am a confirm alert" );
        assertEquals(driver.findElement(By.id("confirmreturn")).getText(),"true");
        alert2.click();
        driver.switchTo().alert();
        driver.switchTo().alert().dismiss();
        assertEquals(driver.findElement(By.id("confirmreturn")).getText(),"false");
    }


    @Test
    public void alert3(){
        WebElement alert3 = driver.findElement(By.id("promptexample"));
        alert3.click();
        String me3 = "I prompt you";
        driver.switchTo().alert();
        assertEquals(me3, "I prompt you" );
        driver.switchTo().alert().sendKeys("dupa");
        driver.switchTo().alert().accept();
        assertEquals(driver.findElement(By.id("promptreturn")).getText(),"dupa");
    }



    @After
    public void quit(){
        driver.close();

    }

}



