package org.example;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

public class ProductPage extends BaseTest {

    @Step("Random click")
    public void selectRandomElement() {
        List<MobileElement> elements = appiumDriver.findElements(By.xpath("//*[@resource-id=\"com.ozdilek.ozdilekteyim:id/imageView\"]\n"));
        Random random = new Random();
        int randomInt = random.nextInt(elements.size());
        elements.get(randomInt).click();
        MyLogger.logger.info("Random ürün secildi.");


    }

    @Step("Random sizeClick")
    public void selectRandomSize() {
        List<MobileElement> elements = appiumDriver.findElements(By.xpath("//*[@resource-id=\"com.ozdilek.ozdilekteyim:id/tvInSizeItem\"]\n"));
        Random random = new Random();
        int randomInt = random.nextInt(elements.size());
        elements.get(randomInt).click();
    if (elements.isEmpty()) {
            scrollDown();
        }
    MyLogger.logger.info("Random beden secildi.");
    }

    @Step("Scroll Down")
    public void scrollDown() {
        int startx = 354, starty = 1054, endx = 363, endy = 258;
        TouchAction touchAction = new TouchAction(appiumDriver);
        touchAction.longPress(PointOption.point(startx, starty)).moveTo(PointOption.point(endx, endy)).release().perform();
        MyLogger.logger.info("Sayfa asagi indirildi!");
    }
}
