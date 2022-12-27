package testCases;

import Base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pagesObject.Detection;
import pagesObject.ProductPage;

public class productPageTest extends BaseClass {
    ProductPage prductPage;
    Detection detection;

    @BeforeMethod
    public void setup(){
        launchApp();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void WatchDemoBtnTest() throws Throwable{
        prductPage = new ProductPage();
        prductPage.clickOnWatchDemoBtn();
    }

}
