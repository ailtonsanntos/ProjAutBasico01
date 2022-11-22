#language:pt

Funcionalidade: Pesquisar Voo

  Esquema do Cenario: Realizar a pesquisa de voo com <identificacao>
    Dado que eu queira realizar uma pesquisar de um voo
    Quando os campos forem preenchidos da seguinte forma
      | origem    | <origem>    |
      | destino   | <destino>   |
      | dataIda   | <dataIda>   |
      | dataVolta | <dataVolta> |
    Entao realizo a pesquisa do voo

    Exemplos:
    | identificacao | origem | destino | dataIda | dataVolta |
    | todos os campos preenchidos | RIO | POA | 16/10/2023 | 31/10/2023 |
    | somente ida                 | RIO | POA | 16/10/2023 | 31/10/2023 |
