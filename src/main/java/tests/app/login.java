package tests.app;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import tests.TestBase;

@Test(groups = {"prueba"})
//@Parameters("browser")
public class login extends TestBase {
    public void LoginPractis() throws Exception {
        LoginPage loginPage = new LoginPage();

        loginPage.login("admin", "admin");
    }
}