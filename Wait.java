package com.javafortesters.junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.javafortesters.junit.JUnitTest.driver;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Wait {
    WebDriverWait waigt;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://compendiumdev.co.uk/selenium/basic_html_form.html");
        waigt = new WebDriverWait(driver,10);
    }

    @Test
    public void expectedConditions(){
        new WebDriverWait(driver,10).until(titleIs("HTML Form Elements"));
    }

    @Test
    public void nextConditon(){
        new WebDriverWait(driver,10,20).until(titleIs("HTML Form Elements"));
    }

    @Test
    public void lastCondition(){
        waigt.until(titleIs("HTML Form Elements"));

    }

}
