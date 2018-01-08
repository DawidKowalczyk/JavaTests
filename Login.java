package com.javafortesters.junit;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    
    @Test
    public void LogVendors(){
        //System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.compendiumdev.co.uk/selenium/find_by_playground.php");

    }

}
