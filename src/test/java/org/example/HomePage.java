package org.example;

import com.thoughtworks.gauge.Step;
import org.junit.Test;

public class HomePage extends BaseTest {

    @Step("<com.ozdilek.ozdilekteyi> adresine git")
    public void adreseGit(String Url) {
        appiumDriver.get(Url);
        MyLogger.logger.info(Url + "Anasayfası acildi.");
    }

}


