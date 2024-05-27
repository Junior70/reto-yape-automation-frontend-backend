@regression-all
@createBooking-regression
Feature: Booking API Test

  Background:
    Given url apiUrlBooking
    #Obtenemos el Request y Schema
    * def requestJson = read('classpath:automationbooking/booking/request/requestCreateUpdateBooking.json')
    * def responseSchema = read('classpath:automationbooking/booking/schema/responseCreateBooking.json')

    * def dataGenerator = Java.type('automationbooking.util.DataGenerator')
    * set requestJson.firstname = dataGenerator.getRandomFirstName()
    * set requestJson.lastname = dataGenerator.getRandomLastName()

  @createBooking-test-01
  Scenario: Create a new booking and validate response status
    Given path 'booking'
    Given header Content-Type = 'application/json'
    Given header Accept = 'application/json'
    And request requestJson
    * print requestJson.firstname
    * print requestJson.lastname
    When method post
    Then status 200
    And match response == responseSchema
    * print response.bookingid
