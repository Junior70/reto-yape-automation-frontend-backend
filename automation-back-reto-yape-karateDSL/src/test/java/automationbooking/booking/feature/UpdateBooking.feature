@regression-all
@updateBooking-regression
Feature: Update Booking

  Background:

    Given url apiUrlBooking
    #Obetenos el IdBooging
    * def newBookingResponse = call read('classpath:automationbooking/booking/feature/CreateBooking.feature')
    * def idBooking = newBookingResponse.response.bookingid

    #Obtenemos el Token
    * def tokenResponse = call read('classpath:automationbooking/auth/feature/Auth.feature')
    * def token = tokenResponse.token
    #Obtenemos el Request y Schema
    * def requestJson = read('classpath:automationbooking/booking/request/requestCreateUpdateBooking.json')
    * def responseSchema = read('classpath:automationbooking/booking/schema/responseGetUpdateBooking.json')

    * def dataGenerator = Java.type('automationbooking.util.DataGenerator')
    * set requestJson.firstname = dataGenerator.getRandomFirstName()
    * set requestJson.lastname = dataGenerator.getRandomLastName()

  @updateBooking-test-01
  Scenario: Update a booking with PUT request
    * print idBooking
    Given url 'https://restful-booker.herokuapp.com/booking/' + idBooking
    And header Content-Type = 'application/json'
    And header Accept = 'application/json'
    And header Cookie = 'token=' + token
    And request requestJson
    When method put
    Then status 200
    And match response == responseSchema
    * print token