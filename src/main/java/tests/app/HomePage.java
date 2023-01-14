package tests.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import tests.commons.PageCommons;

public class HomePage extends PageCommons {

    @FindBy(id="do1")
    WebElement logo;

    @FindBy(id="formToColorize")
    WebElement form;

    @FindBy(id="btnSetBgColor")
    WebElement btnColor;

    @FindBy(id="bgColor")
    WebElement txtColor;

    public HomePage(){
        PageFactory.initElements(browser,this);
    }
    public void logout(){
        Assert.assertTrue(logo.isDisplayed());
    }

    public void disabledButton(String buttonEnabled){

        WebElement button = browser.findElement(By.id(buttonEnabled));

        if(button.isEnabled())
            wait.until(ExpectedConditions.visibilityOf(browser.findElement(By.id(buttonEnabled)))).click();

        Assert.assertFalse(button.isEnabled());
    }

    public void backGroundColor(String color){
        wait.until(ExpectedConditions.visibilityOf(txtColor)).sendKeys(color);

        wait.until(ExpectedConditions.visibilityOf(btnColor)).click();

        String style = form.getAttribute("style");

        Assert.assertTrue(style.indexOf("red") != -1);
    }
}
