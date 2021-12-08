package org.example;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class BasePage extends BaseTest {


    @Step("<time> saniye bekle")
    public void wait(int time) throws InterruptedException {
        Thread.sleep(time * 1000);
        MyLogger.logger.info(time + " saniye beklendi");


    }


    @Step("<key> id'li elemente tıkla")
    public void elementeTıkla(String key) {
        appiumDriver.findElement(By.id(key)).click();
        MyLogger.logger.info(key + " elementine tiklandi");


    }

    @Step("<key> xpath'li elemente tıkla")
    public void xpathTıkla(String key) {
        appiumDriver.findElement(By.xpath(key)).click();
        MyLogger.logger.info(key + " elementine tiklandi");


    }

    @Step("<id> Sayfa Dogrulama")
    public void Assert(String key){
        Assert.assertTrue("Cikmasi istenilen mesaj", appiumDriver.findElement(By.id(key)).isDisplayed());
        MyLogger.logger.info(key + " Sayfa dogrulandi");

    }

}






