package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebElement;

public class AppiumServer {
  public static AppiumDriverLocalService service;

    public static void start() {
        service.start();
    }

    public static void stop() {
        service.stop();
    }
}
