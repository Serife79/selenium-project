package com.cydeo.tests.shorts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P04_FullScreenMode {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://etsy.com");
        driver.manage().window().fullscreen();
    }
}
