package com.javafortesters.junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static junit.framework.TestCase.assertTrue;


public class JUnitTest {

    public static WebDriver driver;

    @BeforeClass
    public static void createDriver() {
        driver = new FirefoxDriver();

    }

    @Test
    public void navigateWithNavigateTo() {
        driver.navigate().to
                ("http://onet.pl");
        assertTrue(driver.getTitle().
                startsWith("Onet.pl"));

    }

    @AfterClass
    public static void quitDriver() {
        //driver.quit();
    }

}