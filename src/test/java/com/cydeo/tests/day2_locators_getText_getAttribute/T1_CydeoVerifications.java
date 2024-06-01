package com.cydeo.tests.day2_locators_getText_getAttribute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {
        //TC #1: Cydeo practice tool verifications
        // 1. Open Chrome browser


        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        // 2. Go to https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");

        // 3. Verify URL contain
        // Expected: cydeo

        String expectedInURP ="cydeo";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedInURP)){
            System.out.println("URL verification PASSED!!!");
        }else{
            System.out.println("URL verification FAILED");
        }
        // 4. Verify title:
        //Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();//-->return practice

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASSED");
        }else{
            System.out.println("Title verification is FAILED");
        }

    }


}
