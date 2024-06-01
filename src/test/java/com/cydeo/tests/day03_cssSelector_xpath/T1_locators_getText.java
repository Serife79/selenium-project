package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {
    public static void main(String[] args) {

        //TC #1: NextBaseCRM, locators and getText() practice 1- Open a chrome browser
        //2- Go to: https://login1.nextbasecrm.com/
        //3- Enter incorrect username: “incorrect”
        //4- Enter incorrect password: “incorrect”
        //5- Click to login button.
        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password

        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com");

        //3
        WebElement inputUserName = driver.findElement(By.className("login-inp"));
        inputUserName.sendKeys("incorrect");

        //4
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");

        //5
        WebElement loginButtom = driver.findElement(By.className("login-btn"));
        loginButtom.click();

        //
        String expectedErrorText ="Incorrect login or password";
        String actualErrorText = driver.findElement(By.className("errortext")).getText();

        if(actualErrorText.equals(expectedErrorText)){
            System.out.println("Error verification is PASSED!");

        }else{
            System.out.println("Error verification is FAILED!!!");
        }



    }
}
