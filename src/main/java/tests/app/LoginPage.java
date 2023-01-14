package tests.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import tests.commons.PageCommons;

public class LoginPage extends PageCommons {

    @FindBy (name="username")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(name="login")
    WebElement login;

    public LoginPage(){
        PageFactory.initElements(browser,this);
    }

    public void login(String user, String pass){

        wait.until(ExpectedConditions.elementToBeClickable(username));

        wait.until(ExpectedConditions.elementToBeClickable(username)).sendKeys(user);

        wait.until(ExpectedConditions.elementToBeClickable(password)).sendKeys(pass);

        wait.until(ExpectedConditions.elementToBeClickable(login)).click();

        wait.until(ExpectedConditions.visibilityOf(browser.findElement(By.id("do1"))));

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(browser.findElement(By.id("do1")))) != null, "The login is successful");

    }

}
