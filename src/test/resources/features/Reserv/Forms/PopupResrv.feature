#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Reserva completa para Hoteles cualquier destino y sin/con acompañanates

  @CasoNoExitoso
  Scenario Outline: Reserva sin Login
    Given Seleccionar la opcion Hoteles
    And Seleccionar cualquier destino <txtDestination>
    And Ingresar la fecha de Check In <txtFechain>
    And Ingresar la fecha de Check Out <txtfechaout>
    And Selecciona 2 Adultos 
    And Seleccionar 0 Niños
    When Seleccionar la opcion Buscar
    Then No se este logueado <status>
    
    
    Examples: 
      | txtDestination               |txtFechain | txtfechaout |
      |Alzer Hotel Istanbul, Istanbul|14/02/2021 | 19/02/20121 |
     