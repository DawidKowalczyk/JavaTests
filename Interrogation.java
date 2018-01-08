package com.javafortesters.junit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static com.javafortesters.junit.JUnitTest.driver;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class Interrogation {

    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://wp.pl");
        assertEquals(driver.getTitle(), "Wirtualna Polska - Wszystko co ważne - www.wp.pl");
        assertEquals(driver.getCurrentUrl(), "https://www.wp.pl/");
        String PageSource = driver.getPageSource();
        assertTrue(PageSource.contains("Polska"));
        System.out.println(PageSource);
        driver.close();

    }
}


