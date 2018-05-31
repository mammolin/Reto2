#Author: mammolin@bancolombia.com.co
@Regresion
Feature: 10 tiquetes mas baratos
Yo como área contable requiero que se realice búsqueda de los 10 tiquetes más económicos para la primera página en el sítio despegar.com
  criterios de aceptación:
  1 que el sítio donde se realice la búsqueda sea https://www.despegar.com.co/
  2 que el origen de la búsqueda sea Medellín
  3 que el destino de la búsqueda sea Cartagena
  4 el número de viajeros deben ser 2 personas
  5 la fecha de inicio del vuelo debe ser 01/09/2018
  6 la fecha de regreso debe ser 29/09/2018
  7 que se guarde en excel los 7 precios más baratos de la primera página del sitio
  8 Marcar en verde el precio más económico
  
  @CasoExitoso
  Scenario: Diligenciamiento exitoso del formulario para obtener los 10 precios más baratos de tiquetes
    Given Diligencio ingreso a pagina
    When Diligencio formulario de busqueda
      | Origen   | Destino   |
      | Medellin | Cartagena |
    # And selecciono fechas del viaje
    #| Año inicio | Mes inicio | Dia inicio | Año fin | Mes fin | Dia fin |
    #|       2018 |         09 |         01 |    2018 |      09 |      29 |
    Then Genero reporte externo
