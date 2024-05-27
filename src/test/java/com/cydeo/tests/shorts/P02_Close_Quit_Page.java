package com.cydeo.tests.shorts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_Close_Quit_Page {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.practice.cydeo.com");
        Thread.sleep(5000);
        driver1.close();
        driver1.quit();

    }
}
