package testCases;


import Base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pagesObject.SignUpPage;

public class SingUpPageTest extends BaseClass {
    SignUpPage singUpPage;

    @BeforeMethod
    public void setup(){
        launchApp();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void createAccountTest()throws Throwable{
        singUpPage = new SignUpPage();
        singUpPage.createAccount("Maram", "Alasad","maramala@post.bgu.ac.il","Ben Gurion","Masd109mrmnshghs]@", "Masd109mrmnshghs]@");
    }
}
