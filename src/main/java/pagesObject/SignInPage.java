package pagesObject;

import ActionDriver.Action;
import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BaseClass {
    Action action = new Action();

    public SignInPage(){
        PageFactory.initElements(driver, this);
        driver.get(prop.getProperty("signIn"));
        driver.manage().window().maximize();
    }

    public String getCurrURL() {
        return driver.getCurrentUrl();
    }

    @FindBy(xpath = "//*[@id='input1056']")
    WebElement txtWorkEmail;

    @FindBy(xpath = "//button[@class ='btn btn-blue btn-lwide']")
    WebElement loginBtn;

    public void siginVicarius(String user){
       action.type(txtWorkEmail, user);
       action.click(driver, loginBtn);

    }
}
