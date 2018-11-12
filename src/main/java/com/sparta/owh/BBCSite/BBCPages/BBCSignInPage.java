package com.sparta.owh.BBCSite.BBCPages;

//import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.junit.Assert;

public class BBCSignInPage {

    private WebDriver driver;
    private String signInUrl = "https://account.bbc.com/signin/";


    private By usernameFieldID = By.id("user-identifier-input");
    private By passwordFieldID =By.id("password-input");
    private By submitButtonID = By.id("submit-button");
    private By incorrectPasswordErrorID = By.id("form-message-password");

    public BBCSignInPage(WebDriver driver){
        this.driver = driver;
    }

    public void goToSignInPage(){
        driver.navigate().to(signInUrl);
    }

    public void inputUserName(String name){
        driver.findElement(usernameFieldID).sendKeys(name);
    }

    public void inputPassword(String password){
        driver.findElement(passwordFieldID).sendKeys(password);
    }

    public void clickSubmitButton(){
        driver.findElement(submitButtonID).click();
    }

    public String getPasswordErrorText(){
        return driver.findElement(incorrectPasswordErrorID).getText();
    }


//    public void assertCurrentURLIsSignInPage(){
//
//        Assert.assertEquals(driver.getCurrentUrl(), signInUrl);
//        Assert.assertEquals(driver.getCurrentUrl(), signInUrl);
//    }


}
