package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.sql.Driver;

public class NaukriUpdate {

    public static  String NaukriURL = "https://www.naukri.com/nlogin/login?utm_source=google&utm_medium=cpc&utm_campaign=Brandcom&gclsrc=aw.ds&gad_source=1&gad_campaignid=292348446&gclid=EAIaIQobChMIxKHTzbKmjgMVDGwPAh0_OjJqEAAYASAAEgKzrvD_BwE";
        @Test(priority = 0)
        public static void Logintoaukri() throws InterruptedException {

        WebDriver driver = new FirefoxDriver();

        // Open the URL
        driver.navigate().to(NaukriURL);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        // Login  Naukar Page
        driver.findElement(By.id("usernameField")).sendKeys("sameerbagwan701@gmail.com");
        driver.findElement(By.id("passwordField")).sendKeys("Mygame@123");
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div/div[2]/div/form/div[2]/div[3]/div/button[1]")).click();
        Thread.sleep(2000);
        // Go to Homepage and select profile section
            driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[4]/div[1]/div[1]/div[3]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/a[1]")).click();
            Thread.sleep(3000);

            // Update Profile
            driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/em[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("name")).clear();
            driver.findElement(By.id("name")).sendKeys("Sameer Bagwan");

            Actions down = new Actions(driver);
            down.scrollByAmount(0, 1000).perform();

            driver.findElement(By.id("saveBasicDetailsBtn")).click();

            //Close curernt window
            driver.close();















    }

}
