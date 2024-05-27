package steps;


import net.thucydides.core.annotations.Step;
import screens.buscarHabitacionScreen;
import screens.buscarFechasScreen;
import screens.buscarDestinoScreen;
import screens.alojaminetoScreen;
import screens.datosClienteScreen;
import screens.datosTarjetaScreen;

public class BuscarDatosReservaSteps {
    buscarDestinoScreen buscarDestino;
    buscarFechasScreen buscarFechas;
    buscarHabitacionScreen buscarHabitacion;
    alojaminetoScreen alojamineto;
    datosClienteScreen datosCliente;

    datosTarjetaScreen datosTarjeta;

    @Step("Abrimos el app de Booking")
    public void abrimosElAppDeBooking() {
        buscarDestino.abrirApp();
    }

    @Step("Ingresar el destino de la reserva")
    public void ingresarElDestinoDeLaReservaDestino(String destino) {
        buscarDestino.clickEnX();
        buscarDestino.clickenBuscar();
        buscarDestino.ingresarElDestinoABuscar(destino);
    }

    @Step("^Seleccionar el destino de la lista de resultado de busqueda")
    public void seleccionarElDestinoDeLaListaDeResultadoDeBusquedaSeleccionarDestino(String seleccionarDestino) {
        buscarDestino.SeleccionarElDestino(seleccionarDestino);
    }

    @Step("selecionamos el rango de fecha de la reserva")
    public void selecionamosElRangoDeFechaDeLaReservaFechaIncialYFechaFinal(String fechaIncial, String fechaFinal) {
        buscarFechas.seleccionarFechaInicial(fechaIncial);
        buscarFechas.seleccionarFechaFinal(fechaFinal);
        buscarFechas.clickEnSeleccionarFecha();
    }

    @Step("Seleccionamos la cantidad de habitaciones")
    public void seleccionamosLaCantidadDeHabitacionesCantHabitacion(String cantHabitacion) {
        buscarHabitacion.clickEnDatosHabitacionPersona();
        buscarHabitacion.selecionarCantidadHabitacion(cantHabitacion);
    }

    @Step("seleccionamos la cantidad de adultos")
    public void seleccionamosLaCantidadDeAdultosCantAdultos(String cantAdultos) {
        buscarHabitacion.selecionarCantidadAdultos(cantAdultos);
    }

    @Step("Seleccionamos la cantidad e ingresamos las edades de los niños")
    public void seleccionamosLaCantidadEIngresamosLasEdadesDeLosNiños(String edadesNinos) {
        buscarHabitacion.selecionarCantidadNinos(edadesNinos);
    }

    @Step("Click en buscar datos de la reserva")
    public void clickEnBuscarDatosDeLaReserva() {
        buscarHabitacion.clickEBuscarReserva();
        alojamineto.seleccionarAlojamiento();
        alojamineto.clikConsultaOpciones();
    }

    @Step("Se debe de mostrar el costo de la reserva")
    public void seDebeDeMostrarElCostoDeLaReserva() {
        alojamineto.visualizaCosto();
    }

    @Step("Click en la reserva")
    public void clickEnLaReserva() {
        alojamineto.clikSeleccionarHabitacion();
        alojamineto.clikReservarAhora();
    }

    @Step("Ingresamos los datos del cliente")
    public void ingresamosLosDatosDelClienteNombreApellidoEmail(String nombre, String apellido, String email, String pais, String telefono) {
        datosCliente.ingresarNombre(nombre);
        datosCliente.ingresarApellido(apellido);
        datosCliente.ingresarEmail(email);
        datosCliente.ingresarPaisRegion(pais);
        datosCliente.ingresarNumeroTelefono(telefono);
    }

    @Step("Ingresar el motivo del viaje y continuamos con la reserva")
    public void ingresarElMotivoDelViajeMotivoYContinuamosConLaReserva(String motivo) {
        datosCliente.seleccionarMotivoViaje(motivo);
    }

    @Step("Ingresamos los datos de la Tarjeta")
    public void ingresamosLosDatosDeLaTarjetaNumeroTarjetaNombreTitularYFechaExpiracion(String numeroTarjeta, String fechaExpiracion, String codigoCVC) {
        datosTarjeta.ingresarNumeroTarjeta(numeroTarjeta);
        datosTarjeta.ingresarFechaCaducidad(fechaExpiracion);
        datosTarjeta.ingresarCVC(codigoCVC);
    }

    @Step("validamos que el costo de la reserva debe ser igual al monto inicial")
    public void validamosQueElCostoDeLaReservaDebeSerIgualAlMontoInicial() {
        datosTarjeta.validarCostoReserva();
    }

    @Step("Click en reservar ahora")
    public void clickEnReservarAhora() {
        datosTarjeta.clickEnReservarAhora();
    }

}
