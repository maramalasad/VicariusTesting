package pagesObject;

import ActionDriver.Action;
import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BaseClass {
    Action action = new Action();

    public SignUpPage(){
        PageFactory.initElements(driver, this);
        driver.get(prop.getProperty("signUp"));
        driver.manage().window().maximize();
    }

    @FindBy(xpath = "//*[@id='input26']")
    WebElement firstName;

    @FindBy(xpath = "//*[@id='input28']")
    WebElement lastName;

    @FindBy(xpath = "//*[@id='input30']")
    WebElement email;

    @FindBy(xpath = "//*[@id='input32']")
    WebElement companyName;

    @FindBy(xpath = "//*[@id='input34']")
    WebElement passWord;

    @FindBy(xpath = "//*[@id='input36']")
    WebElement confirmPassword;

    @FindBy(xpath = "//span[text() = 'Get Started!']")
    WebElement getStartBtn;

    public void createAccount(String fname, String lsname, String mail,
                              String company, String pass, String confirm){
        action.type(firstName, fname);
        action.type(lastName, lsname);
        action.type(email, mail);
        action.type(companyName, company);
        action.type(passWord, pass);
        action.type(confirmPassword, confirm);
        action.click(driver, getStartBtn);
    }

}
