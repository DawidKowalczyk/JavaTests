package com.javafortesters.junit;

import com.sun.jna.Structure;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.javafortesters.junit.JUnitTest.driver;
import static org.junit.Assert.assertEquals;


public class Cookies {

    @Before
    public void setup(){
        driver = new FirefoxDriver();
        driver.get("https://compendiumdev.co.uk/selenium/search.php");
    }


    @Test
    public void cookies1(){
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
        driver.manage().deleteAllCookies();
        WebElement search = driver.findElement(By.name("btnG"));
        search.click();
        Cookie aCookie = driver.manage().getCookieNamed("seleniumSimplifiedSearchNumVisits");
        assertEquals("Ilosc wejsc",aCookie.getValue(),"1");
        System.out.println(aCookie.getValue());
    }

    @Test
    public void cookie(){
        Cookie aCookie = driver.manage().getCookieNamed("seleniumSimplifiedSearchNumVisits");
        Cookie nextCookie = new Cookie.Builder(aCookie.getName(),
        String.valueOf(42)).build();
        assertEquals("42", nextCookie.getValue(), "42");
        System.out.println(nextCookie.getValue());

        Cookie aNewCookie = new Cookie(aCookie.getName(),
                String.valueOf(43));
                aCookie.getPath();
                aCookie.getDomain();
                aCookie.isSecure();
                aCookie.getPath();
                aCookie.getExpiry();
        driver.manage().deleteCookie(aCookie);
        driver.manage().addCookie(aNewCookie);

        WebElement search = driver.findElement(By.name("btnG"));
        WebElement field = driver.findElement(By.name("q"));
        field.clear();
        field.sendKeys("Cookie Test");
        search.click();

        aCookie = driver.manage().getCookieNamed("seleniumSimplifiedSearchNumVisits");
        assertEquals("43", 43, Integer.parseInt(aCookie.getValue()));
    }


    @After
            public void close() {
        driver.close();
    }
}
