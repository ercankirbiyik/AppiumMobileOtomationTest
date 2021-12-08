package org.example;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    @Step("<id> id'li elemete <text> text değerini yaz")
    public void sendKeysbyid(String id, String text) {
        appiumDriver.findElement(By.id(id)).sendKeys(text);
        MyLogger.logger.info("Giris yapılıyor.");
    }

}


