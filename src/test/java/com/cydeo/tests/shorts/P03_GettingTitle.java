package com.cydeo.tests.shorts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_GettingTitle {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https ://www.my.cydeo.com");

        if(driver.getTitle().equals("Cydeo")){
            System.out.println("Title verifikation is pass");
        }else{
            System.out.println("Title verifikation is fail");
        }
        driver.close();










    }
}
