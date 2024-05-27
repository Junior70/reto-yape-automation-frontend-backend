# reto-yape-automation-frontend-backend
Reto de Automatización Yape

# Consideraciones para la ejecución Postman: 
**Para los Método "GetBookingIds Filter Name" y "GetBooking" se debe de ejecutar el Método "CreateBooking" porque ahí hay variables que se están enviando al entorno de Env**

**Nota: se puede hacer con Newman pero para ello se necesita tener instalada las librerías del mismo**

# Consideraciones para la ejecución Karate DSL: 
**Para la ejecución de regesión ejecuta con este tag "@regression-all" ya todo esta configurado

**Nota: ya esta con la integración continua

# Consideraciones para la ejecución APP: 

**cambiar la ruta del appium.app:**
Se debe direccionar el apk según la ruta del proyecto

**Comando de ejecución:**
mvn verify -Dcucumber.options:"--tags @ReservaBooking"