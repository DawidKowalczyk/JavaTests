package com.javafortesters.junit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertTrue;


public class NavigationTest {

    @Test
    public void Test1(){
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
            driver.navigate().to("http://eurosport.onet.pl/pilka-nozna/ekstraklasa/lotto-ekstraklasa-hit-dla-legii-czerwona-kartka-pazdana/ccnt53");
            //assertTrue(driver.getTitle().startsWith("Onet.pl"));
            driver.navigate().forward();
            driver.navigate().back();
            driver.navigate().refresh();

            driver.close();
        }

    @Test
   public void  Test2(){

    }


}




