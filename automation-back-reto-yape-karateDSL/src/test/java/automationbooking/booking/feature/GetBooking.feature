@regression-all
@getBooking-regression
Feature: Get Booking

  Background:
    Given url apiUrlBooking
    #Obetenos el IdBooging
    * def newBookingResponse = call read('classpath:automationbooking/booking/feature/CreateBooking.feature')
    * def idBooking = newBookingResponse.response.bookingid

     #Obtenemos el Schema
    * def responseSchema = read('classpath:automationbooking/booking/schema/responseGetUpdateBooking.json')

  @getBooking-test-01
  Scenario: Get booking details with specified Accept header
    Given url 'https://restful-booker.herokuapp.com/booking/' + idBooking
    And header Accept = 'application/json'
    When method get
    Then status 200
    And match response != null
    And match response == responseSchema
