package tests.app;

import org.testng.annotations.Test;
import tests.TestBase;

@Test(groups = {"prueba"})

public class buttonDo1 extends TestBase {
    public void LoginPractis() throws Exception {
        LoginPage loginPage = new LoginPage();

        loginPage.login("admin", "admin");

        HomePage homePage = new HomePage();

        homePage.disabledButton("do1");
    }
}