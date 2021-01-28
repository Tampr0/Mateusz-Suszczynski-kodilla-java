package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverConfig {

    public final static String SAFARI = "SAFARI_DRIVER";
    public final static String CHROME = "CHROME_DRIVER";

    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
        System.setProperty("webdriver.chrome.driver", "/Users/mateusz/Desktop/chromedriver");

        if (driver.equals(SAFARI)) {
            return new SafariDriver();
        } else if (driver.equals(CHROME)) {
            return new ChromeDriver();
        } else {
            return null;
        }

    }
}
