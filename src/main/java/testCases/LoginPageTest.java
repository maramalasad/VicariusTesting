package testCases;

import Base.BaseClass;
import pagesObject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pagesObject.SignInPage;


public class LoginPageTest extends BaseClass {
    LoginPage loginPage;
    SignInPage signInPage;

    @BeforeMethod
    public void setup(){
        launchApp();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void loginTest() throws Throwable{
        loginPage = new LoginPage();
        signInPage = loginPage.clickOnLoginButton();
        String actualURL = signInPage.getCurrURL();
        String expectedURL = "https://www.vicarius.io/sign/in";
        Assert.assertEquals(actualURL, expectedURL);
    }
}
