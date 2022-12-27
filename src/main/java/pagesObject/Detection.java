package pagesObject;

import ActionDriver.Action;
import Base.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class Detection extends BaseClass {
    Action action = new Action();

    public Detection(){
        PageFactory.initElements(driver, this);
        driver.get(prop.getProperty("detection"));
        driver.manage().window().maximize();
    }

    public String getCurrURL() {
        return driver.getCurrentUrl();
    }
}
