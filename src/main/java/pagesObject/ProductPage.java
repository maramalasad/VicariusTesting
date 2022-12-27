package pagesObject;


import ActionDriver.Action;
import Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BaseClass {
    Action action = new Action();

    public ProductPage(){
        PageFactory.initElements(driver, this);
        driver.get(prop.getProperty("product"));
        driver.manage().window().maximize();
    }



    @FindBy(xpath = "//button[@class = 'btn btn-blue']")
    WebElement watchDemoBtn;

    @FindBy(xpath = "//a[@class ='btn btn-blue']")
    WebElement learnMoreBtn;

    public String getCurrURL() {
        return driver.getCurrentUrl();
    }

    public void clickOnWatchDemoBtn(){
        action.click(driver, watchDemoBtn);
    }

    public Detection clickOnLearnMoreBtn()throws Throwable{
        action.click(driver, learnMoreBtn);
        return new Detection();
    }

}
