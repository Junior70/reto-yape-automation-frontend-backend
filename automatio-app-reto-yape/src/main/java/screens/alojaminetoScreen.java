package screens;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class alojaminetoScreen extends ScreenBase {

    @Managed(driver = "appium")
    public AppiumDriver<WebElement> driver;
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup")
    private List<WebElement> item_alojamiento_list;
    @AndroidFindBy(id = "com.booking:id/select_room_cta")
    private WebElement seleccionar_opciones_btn;

    @AndroidFindBy(id = "com.booking:id/rooms_item_select_layout")
    private WebElement seleccionar_habitacion_btn;
    @AndroidFindBy(id = "android:id/content")
    private WebElement windowsestancia;
    @AndroidFindBy(id = "com.booking:id/price_view_price")
    private WebElement precio_reserva_lbl;
    @AndroidFindBy(className = "android.widget.Button")
    private WebElement reservar_ahora_btn;
    public static String precio_reserva;

    public void seleccionarAlojamiento() {
        waitForSeconds(2);
        item_alojamiento_list.get(1).click();
    }

    public void clikConsultaOpciones() {
        waitFor(seleccionar_opciones_btn).click();
    }

    public void visualizaCosto() {
        waitForSeconds(5);
        scrollElement(waitFor(windowsestancia));
        /*while (!precio_reserva_lbl.isDisplayed()) {
            scrollElement(windowsestancia);
            precio_reserva_lbl.isDisplayed();
        }*/
        precio_reserva = precio_reserva_lbl.getText();
        System.out.println(precio_reserva_lbl.getText());
        Assert.assertTrue(precio_reserva_lbl.isDisplayed());
    }

    public void clikSeleccionarHabitacion() {
        waitFor(seleccionar_habitacion_btn).click();
    }

    public void clikReservarAhora() {
        waitFor(reservar_ahora_btn).click();
        waitForSeconds(4);
    }

}
