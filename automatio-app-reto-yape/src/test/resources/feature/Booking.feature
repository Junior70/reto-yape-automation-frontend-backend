#language:es
@ReservaBooking-Regression
Característica: Como cliente deseo realizar una reserva

  @ReservaBooking
  Esquema del escenario: Realizar una reserva
    Dado Abrimos el app de Booking
    Cuando Ingresar el destino de la reserva <destino>
    Y Seleccionar el destino de la lista de resultado de busqueda <seleccionarDestino>
    Y Selecionamos el rango de fecha de la reserva <fechaIncial> y <fechaFinal>
    Y Seleccionamos la cantidad de habitaciones <cantHabitacion>
    Y Seleccionamos la cantidad de adultos <cantAdultos>
    Y Seleccionamos la cantidad e ingresamos las edades de los niños <edadesNinos>
    Y Click en buscar datos de la reserva
    Entonces Se debe de mostrar el costo de la reserva
    Y Click en la reserva
    Y Ingresamos los datos del cliente <nombre>, <apellido>, <email>, <pais> y <telefono>
    Y Ingresar el motivo del viaje <motivo> y continuamos con la reserva
    Y Ingresamos los datos de la Tarjeta <numeroTarjeta>, <fechaExpiracion> y <codigoCVC>
    Entonces validamos que el costo de la reserva debe ser igual al monto inicial
    Y Click en reservar ahora

    Ejemplos:
      | destino | seleccionarDestino | fechaIncial   | fechaFinal    | cantHabitacion | cantAdultos | edadesNinos | nombre  | apellido   | email               | pais     | telefono  | motivo   | numeroTarjeta    | fechaExpiracion | codigoCVC |
      | CUSCO   | Región en Peru     | 07 junio 2024 | 27 junio 2024 | 1              | 2           | 5 años      | Pruebas | Pruebas QA | jserna470@gmail.com | Colombia | 915951555 | Negocios | 4555788765443333 | 02/25           | 123       |