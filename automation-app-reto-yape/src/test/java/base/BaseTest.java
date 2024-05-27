package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.Before;
import util.AppiumServer;

public class BaseTest {

    @Managed(driver = "appium")
    public AndroidDriver<AndroidElement> driver;

    @Before
    public static void setUp() {
        AppiumServer.start();
    }

    @After
    public static void tearDown() {
        AppiumServer.stop();
    }
}
