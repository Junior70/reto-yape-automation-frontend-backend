@regression-all
@auth-regression
Feature: Generar Token

  Background:
    * url apiUrlBooking
    * def requestJson = read('classpath:automationbooking/auth/request/requestAuth.json')

  @auth-test-01
  Scenario: Authenticate User
    Given path 'auth'
    And header Content-Type = 'application/json'
    And request requestJson
    When method post
    Then status 200
    * def token = response.token
    And def result = { token: token }
    * match result == { token: '#notnull' }
    * print token
