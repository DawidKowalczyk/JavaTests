package com.javafortesters.junit;

import com.gargoylesoftware.htmlunit.Page;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class Synhronisation {

    @Test
    public void exercise() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://compendiumdev.co.uk/selenium/basic_ajax.html");
        new WebDriverWait(driver,10).until(ExpectedConditions.titleIs("Basic Ajax"));


        WebElement combo1 = driver.findElement(By.id("combo1"));
        combo1.click();

        WebElement server = driver.findElement(By.xpath("//*[@id=\"combo1\"]/option[3]"));
        if (server.isSelected()) ;
        {
            server.click();
        }
        server.click();


        WebElement combo2 = driver.findElement(By.cssSelector("[name='language_id']"));
        combo2.click();
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[name='language_id']")));

        Thread.sleep(5000);

        WebElement java = driver.findElement(By.cssSelector("option[value='23']"));
        java.click();
        java.click();

        WebElement submit1;
        submit1 = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
        submit1.click();
        assertTrue(driver.getPageSource().contains("23"));

        WebElement valuelanguage = driver.findElement(By.id("_valuelanguage_id"));
        assertEquals("Expected Java Code", "23", valuelanguage.getText() );
    }


    }




