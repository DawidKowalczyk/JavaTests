package com.javafortesters.junit;

import jdk.nashorn.internal.objects.annotations.Function;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FluentWait {
    private static WebDriver driver;
    WebElement countdown;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://compendiumdev.co.uk/selenium/javascript_countdown.html");
    }
    @Test
    public void fluent(){



    }


}
