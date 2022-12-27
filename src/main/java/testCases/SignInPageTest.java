package testCases;

import Base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pagesObject.SignInPage;

public class SignInPageTest extends BaseClass {
    SignInPage singnIn;
    @BeforeMethod
    public void setup(){
        launchApp();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testSignin() {
        singnIn = new SignInPage();
        singnIn.siginVicarius("maramal@ac.sce.ac.il");
    }
}
