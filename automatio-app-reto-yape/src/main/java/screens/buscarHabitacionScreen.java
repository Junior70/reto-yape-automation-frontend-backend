package screens;

import base.ScreenBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class buscarHabitacionScreen extends ScreenBase {

    @AndroidFindBy(id = "com.booking:id/facet_search_box_accommodation_occupancy")
    private WebElement datos_hab_per_btn;
    @AndroidFindBy(id = "com.booking:id/bui_input_stepper_value")
    private List<WebElement> cantidad_lbl;
    @AndroidFindBy(id = "com.booking:id/bui_input_stepper_add_button")
    private List<WebElement> agregar_btn;
    @AndroidFindBy(id = "android:id/button1")
    private WebElement ok_edad_btn;
    @AndroidFindBy(id = "com.booking:id/age_picker_view")
    private WebElement vistaSelectorEdad;
    By byNumSelector = By.id("android:id/numberpicker_input");

    @AndroidFindBy(id = "com.booking:id/group_config_apply_button")
    private WebElement aplicar_btn;
    @AndroidFindBy(id = "com.booking:id/facet_search_box_cta")
    private WebElement buscarBooking_btn;

    public void clickEnDatosHabitacionPersona() {
        datos_hab_per_btn.click();
    }

    public void selecionarCantidadHabitacion(String cantidaHabitacion) {
        selecionarCantidadHabPers(cantidad_lbl, agregar_btn, 0, cantidaHabitacion);
    }

    public void selecionarCantidadAdultos(String cantidaAdultos) {
        selecionarCantidadHabPers(cantidad_lbl, agregar_btn, 1, cantidaAdultos);
    }

    public void selecionarCantidadNinos(String cantidaNinos) {
        CantidadNinos(cantidaNinos, agregar_btn, 2, vistaSelectorEdad, byNumSelector, ok_edad_btn);
        aplicar_btn.click();
    }

    public void clickEBuscarReserva() {
        buscarBooking_btn.click();
    }


}
