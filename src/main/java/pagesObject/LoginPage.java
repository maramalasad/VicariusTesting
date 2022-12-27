package pagesObject;

import ActionDriver.Action;
import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
     Action action = new Action();

     public LoginPage(){
         PageFactory.initElements(driver, this);
         driver.get(prop.getProperty("url"));
         driver.manage().window().maximize();
     }
    @FindBy(xpath = "//a[@class = 'link-button hidden-lg-down']")
    WebElement LoginButton;


     public SignInPage clickOnLoginButton()throws Throwable{
         action.click(driver, LoginButton);
         return new SignInPage();

     }
}
