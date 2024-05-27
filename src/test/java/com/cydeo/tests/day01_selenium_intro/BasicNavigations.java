package com.cydeo.tests.day01_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //Setup browser driver
        //WebDriverManager.chromedriver().setup();

        //Create instance of Chrome browser
        WebDriver driver = new ChromeDriver();

        //for windows
        driver.manage().window().maximize();

        //for mac
        driver.manage().window().fullscreen();

        //Go to tesla.com
        driver.get("https:www.tesla.com");

        System.out.println("driver.getCurrentUrl() =" +driver.getCurrentUrl());
        //System.out.println("driver.getTitle() = "+driver.getTitle());
        String current = driver.getTitle();
        System.out.println("currentTitle :" +current);

        //Use navigate back() to go back
        driver.navigate().back();

        //user navigate forward() to go forward
        driver.navigate().forward();

        //stop execution for 3 second
        Thread.sleep(1000);

        //user refreshes the page using navigate.refresh();
        driver.navigate().refresh();

        //stop execution for 3 second
        Thread.sleep(1000);

        //navigate to google.com to method
        driver.navigate().to("https://www.google.com");

        //get title
        //System.out.println("driver.getTitle() = "+driver.getTitle());
        current = driver.getTitle();
        System.out.println("currentTitle :" +current);
        System.out.println("driver.getCurrentUrl() =" +driver.getCurrentUrl());

        //closes only currently focused window/tab
        driver.close();
        //closes all-of-the opened browser
        driver.quit();



    }
}
