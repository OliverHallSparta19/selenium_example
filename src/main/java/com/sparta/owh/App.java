package com.sparta.owh;

import com.sparta.owh.BBCSite.BBCPages.BBCHomePage;
import com.sparta.owh.BBCSite.BBCSite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TECH-W112\\Documents\\chromedriver_win32\\chromedriver.exe");

        ChromeDriver chromeDriver = new ChromeDriver();
        BBCSite bbcSite = new BBCSite(chromeDriver);

        bbcSite.bbcSignInPage().goToSignInPage();
      //  bbcSite.bbcSignInPage().assertCurrentURLIsSignInPage();
        bbcSite.bbcSignInPage().inputUserName("test");
        bbcSite.bbcSignInPage().inputPassword("test");
        bbcSite.bbcSignInPage().clickSubmitButton();

        bbcSite.quit();

        //BBCSite.bbcHomePage().clickSignInLink();


//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TECH-W112\\Documents\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("https://www.bbc.co.uk/");
//        driver.findElement(By.id("idcta-link")).click();
//        driver.findElement(By.id("user-identifier-input")).sendKeys("oliverwilliamhall@gmail.com");
//        driver.findElement(By.id("password-input")).sendKeys("");
//        driver.findElement(By.id("submit-button")).click();
//        driver.findElement(By.class("orb-nav-iplayer"));

        //((ChromeDriver) driver).setLocation();

       // driver.quit();
    }
}
