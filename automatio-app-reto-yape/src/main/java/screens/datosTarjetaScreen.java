package screens;

import base.ScreenBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class datosTarjetaScreen extends ScreenBase {
    @AndroidFindBy(id = "com.booking:id/new_credit_card_number_edit")
    private WebElement numero_tarjeta_txt;
    @AndroidFindBy(id = "com.booking:id/new_credit_card_expiry_date_edit")
    private WebElement fecha_caducidad_txt;
    //@AndroidFindBy(xpath = "//*[@text='Código CVC']")
    @AndroidFindBy(id = "com.booking:id/new_credit_card_cvc_edit_text")
    private WebElement codigo_cvc_txt;
    @AndroidFindBy(id = "com.booking:id/title")
    private List<WebElement> monto_pago_txt;
    @AndroidFindBy(id = "com.booking:id/action_button")
    private WebElement reserva_ahora_btn;

    public void ingresarNumeroTarjeta(String numeroTarjeta) {
        waitFor(numero_tarjeta_txt).sendKeys(numeroTarjeta);
    }

    public void ingresarFechaCaducidad(String fechaExpiracion) {
        waitFor(fecha_caducidad_txt).sendKeys(fechaExpiracion);
        waitForSeconds(5);
        //System.out.println(driver().getPageSource());
    }

    public void ingresarCVC(String codigoCVC) {
        waitFor(codigo_cvc_txt).sendKeys(codigoCVC);
    }

    public void validarCostoReserva() {
        System.out.println(monto_pago_txt.get(1).getText());
        Assert.assertTrue(monto_pago_txt.get(1).getText().contains(alojaminetoScreen.precio_reserva));
    }

    public void clickEnReservarAhora() {
        reserva_ahora_btn.click();
        waitForSeconds(5);
    }
}
