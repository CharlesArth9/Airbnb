Feature:
  Scenario Outline: busqueda de apartamento en prishtina kosovo polje con precio menor de un millon
    Given se debe realizar una busqueda de departamento <id>
    When escojo las condiciones de departamento
    Then busco en el mapa y hago el reporte
    Examples:
    |id|
    |1|

