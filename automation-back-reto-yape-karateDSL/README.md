# Execution of Scenarios

must have maven and Java installed

# Getting Started

Execute the command as all scenarios have the same label

- [@regression-all]() se ejecuta todos los test
- mvn test "-Dkarate.options=--tags @regression-all"

# Considerations

- run the Generate Token   [@auth-test-01]()
- run Create New Booking [@createBooking-test-01]() 
- run Update Id Booking  [@updateBooking-test-01]()
- run Get Ig Booking  [@getBooking-test-01]()

- after that run it from the same maven or console with the command mvn test "-Dkarate.options=--tags @TestJRK".
