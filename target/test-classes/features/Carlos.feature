Feature: Buscar en el mapa y tomar foto del departamento

   @Mapa
  Scenario: busqueda de apartamento en prishtina kosovo polje con precio menor de un millon
    Given se debe realizar una busqueda de departamento
    When escojo las condiciones de departamento
    Then busco en el mapa y hago el reporte
