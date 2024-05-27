package definitions;

import base.BaseTest;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;
import steps.BuscarDatosReservaSteps;

import java.util.List;

public class BookingDefinitions extends BaseTest {

    @Steps
    BuscarDatosReservaSteps BuscarDatosReserva;

    @Dado("^Abrimos el app de Booking$")
    public void abrimosElAppDeBooking() {
        BuscarDatosReserva.abrimosElAppDeBooking();
    }

    @Cuando("^Ingresar el destino de la reserva (.*)$")
    public void ingresarElDestinoDeLaReservaDestino(String destino) {
        BuscarDatosReserva.ingresarElDestinoDeLaReservaDestino(destino);
    }

    @Y("^Seleccionar el destino de la lista de resultado de busqueda (.*)$")
    public void seleccionarElDestinoDeLaListaDeResultadoDeBusquedaSeleccionarDestino(String seleccionarDestino) {
        BuscarDatosReserva.seleccionarElDestinoDeLaListaDeResultadoDeBusquedaSeleccionarDestino(seleccionarDestino);
    }

    @Y("^Selecionamos el rango de fecha de la reserva (.*) y (.*)$")
    public void selecionamosElRangoDeFechaDeLaReservaFechaIncialYFechaFinal(String fechaIncial, String fechaFinal) {
        BuscarDatosReserva.selecionamosElRangoDeFechaDeLaReservaFechaIncialYFechaFinal(fechaIncial, fechaFinal);
    }

    @Y("^Seleccionamos la cantidad de habitaciones (.*)$")
    public void seleccionamosLaCantidadDeHabitacionesCantHabitacion(String cantHabitacion) {
        BuscarDatosReserva.seleccionamosLaCantidadDeHabitacionesCantHabitacion(cantHabitacion);
    }

    @Y("^Seleccionamos la cantidad de adultos (.*)$")
    public void seleccionamosLaCantidadDeAdultosCantAdultos(String cantAdultos) {
        BuscarDatosReserva.seleccionamosLaCantidadDeAdultosCantAdultos(cantAdultos);
    }

    @Y("^Seleccionamos la cantidad e ingresamos las edades de los niños (.*)$")
    public void seleccionamosLaCantidadEIngresamosLasEdadesDeLosNiños(String edadesNinos) {
        BuscarDatosReserva.seleccionamosLaCantidadEIngresamosLasEdadesDeLosNiños(edadesNinos);
    }

    @Y("^Click en buscar datos de la reserva$")
    public void clickEnBuscarDatosDeLaReserva() {
        BuscarDatosReserva.clickEnBuscarDatosDeLaReserva();
    }

    @Entonces("^Se debe de mostrar el costo de la reserva$")
    public void seDebeDeMostrarElCostoDeLaReserva() {
        BuscarDatosReserva.seDebeDeMostrarElCostoDeLaReserva();
    }

    @Y("^Click en la reserva$")
    public void clickEnLaReserva() {
        BuscarDatosReserva.clickEnLaReserva();
    }

    @Y("^Ingresamos los datos del cliente (.*), (.*), (.*),(.*) y (.*)$")
    public void ingresamosLosDatosDelClienteNombreApellidoEmailPaisYTelefono(String nombre, String apellido, String email, String pais, String telefono) {
        BuscarDatosReserva.ingresamosLosDatosDelClienteNombreApellidoEmail(nombre, apellido, email, pais, telefono);
    }

    @Y("^Ingresar el motivo del viaje (.*) y continuamos con la reserva$")
    public void ingresarElMotivoDelViajeMotivoYContinuamosConLaReserva(String motivo) {
        BuscarDatosReserva.ingresarElMotivoDelViajeMotivoYContinuamosConLaReserva(motivo);
    }

    @Y("^Ingresamos los datos de la Tarjeta (.*), (.*) y (.*)$")
    public void ingresamosLosDatosDeLaTarjetaNumeroTarjetaNombreTitularYFechaExpiracion(String numeroTarjeta, String fechaExpiracion, String codigoCVC) {
        BuscarDatosReserva.ingresamosLosDatosDeLaTarjetaNumeroTarjetaNombreTitularYFechaExpiracion(numeroTarjeta, fechaExpiracion, codigoCVC);
    }

    @Entonces("^validamos que el costo de la reserva debe ser igual al monto inicial$")
    public void validamosQueElCostoDeLaReservaDebeSerIgualAlMontoInicial() {
        BuscarDatosReserva.validamosQueElCostoDeLaReservaDebeSerIgualAlMontoInicial();
    }

    @Y("^Click en reservar ahora$")
    public void clickEnReservarAhora() {
        BuscarDatosReserva.clickEnReservarAhora();
    }

   /* @Y("^Ingresamos los datos del cliente (.*), (.*), (.*)$")
    public void ingresamosLosDatosDelClienteNombreApellidoEmail(String nombre,String apellido, String email) {
        BuscarDatosReserva.ingresamosLosDatosDelClienteNombreApellidoEmail(nombre,apellido,email);
    }*/
}
