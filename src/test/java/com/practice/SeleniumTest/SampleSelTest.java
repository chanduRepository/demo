package com.practice.SeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleSelTest {

	
    public WebDriver driver;

      String appUrl = "https://accounts.google.com";



@Test

public void gmailLogin() {
	System.setProperty("webdriver.chrome.driver", "E:\\chrome driver\\chromedriver.exe");
	driver = new ChromeDriver();

            // launch the firefox browser and open the application url

             driver.get("https://gmail.com");

             

//maximize the browser window

             driver.manage().window().maximize();

             

//declare and initialize the variable to store the expected title of the webpage.

             //String expectedTitle = " Sign in - Google Accounts ";

             

//fetch the title of the web page and save it into a string variable

             //String actualTitle = driver.getTitle();

            // Assert.assertEquals(expectedTitle,actualTitle);

             

//enter a valid username in the email textbox

             WebElement username = driver.findElement(By.id("identifierId"));

            // username.clear();
             username.sendKeys("prem@gmail.com");
             driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
             
           //  WebElement SignInButton = driver.findElement(By.className("RveJvd snByac"));

            // SignInButton.click();


//enter a valid password in the password textbox

           /*  WebElement password = driver.findElement(By.name("password"));

            // password.clear();

             password.sendKeys("password123");

             

//click on the Sign in button

           //  WebElement SignInButton1 = driver.findElement(By.id("signIn"));

             SignInButton1.click();

             

//close the web browser

             driver.close();*/


}}
