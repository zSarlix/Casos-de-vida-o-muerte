#languaje: es
Feature: registro de un usuario en AdvantajeDemo

  Scenario Outline:
    Given que me encuentro en la pagina principal de AdvantageDemo <url>
    When registro un usuario
    Then Valido que el usuario sea creado exitosamente
    Examples:
      | url                                        |
      | https://www.advantageonlineshopping.com/#/ |
