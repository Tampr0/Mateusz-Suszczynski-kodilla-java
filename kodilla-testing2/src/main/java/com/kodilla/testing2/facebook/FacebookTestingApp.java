package com.kodilla.testing2.facebook;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_ACCEPT_COOKIE = "//div[@class=\"_9fiw\"]/button[2]";
    public static final String XPATH_CREATE_NEW_ACCOUNT = "//div[@class=\"_6ltg\"]/a[1]";
    public static final String XPATH_DAY = "//span[@class=\"_5k_4\"]/span/select[1]";
    public static final String XPATH_MONTH = "//span[@class=\"_5k_4\"]/span/select[2]";
    public static final String XPATH_YEAR = "//span[@class=\"_5k_4\"]/span/select[3]";



    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com");

        WebElement acceptCookieButton = driver.findElement(By.xpath(XPATH_ACCEPT_COOKIE));
        acceptCookieButton.click();

        WebElement createNewAccountButton = driver.findElement(By.xpath(XPATH_CREATE_NEW_ACCOUNT));
        createNewAccountButton.click();

        Thread.sleep(1000);

        WebElement selectDayCombo = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(selectDayCombo);
        selectDay.selectByValue("30");

        WebElement selectMonthCombo = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(selectMonthCombo);
        selectMonth.selectByVisibleText("kwi");

        WebElement selectYearCombo = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(selectYearCombo);
        selectYear.selectByValue("1986");


    }
}
