package com.javafortesters.junit;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.javafortesters.junit.JUnitTest.driver;

public class WindowManage {

    @Test
    public void zadanie() {
        driver = new ChromeDriver();
        driver.get("https://compendiumdev.co.uk/selenium/bounce.html");
        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(500,500));
        driver.manage().window().setPosition(new Point(300,300));


    }
}
