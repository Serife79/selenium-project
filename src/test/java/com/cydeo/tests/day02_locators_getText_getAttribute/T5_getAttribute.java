package com.cydeo.tests.day02_locators_getText_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getAttribute {
    public static void main(String[] args) {
        //TC #5: getText() and getAttribute() method practice
        //        1- Open a chrome browser
                  WebDriver driver = new ChromeDriver();
                  driver.manage().window().maximize();

        //        2- Go to: https://practice.cydeo.com/registration_form
                  driver.get("https://practice.cydeo.com/registration_form");


        //        3- Verify header text is as expected:
        //        Expected: Registration form
                  driver.findElement(By.tagName("h2"));

        //        4- Locate “First name” input box
        //        5- Verify placeholder attribute’s value is as expected:
        //        Expected: first name
    }
}
