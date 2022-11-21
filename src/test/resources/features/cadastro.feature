#language:pt

Funcionalidade: Cadastro

  Esquema do Cenário: Realizar o cadastro com <identificacao>
    Dado que eu queira realizar o cadastro
    Quando os campos de cadastro forem preenchido da seguinte forma
      | nomeSobrenome  | <nomeSobrenome>  |
      | email          | <email>          |
      | senha          | <senha>          |
      | cpf            | <cpf>            |
      | telefone       | <telefone>       |
      | dataNascimento | <dataNascimento> |
    E seleciono a opção "Declaro que li e aceito os termos e condicoes"
    E seleciono a opção " Quero Receber cupons"
    E clico no botão "Criar conta com email e senha"
    Entao realizo o cadastro
    Exemplos:
      | identificacao                 | nomeSobrenome                 | email                                 | cpf | senha  | confirmaSenha |
      | todos os campos preenchidos   | "Nathan Benício Luiz Pereira" | "nathan-pereira70@senioraereo.com.br" | "056.940.560-27" | "1234" | "1234"        |
      | campos obrigatórios com saldo | "Felipe Emanuel da Mota"      | "felipe_damota@alfredoimoveis.com.br" | "201.883.061-96" | "1234" | "1234"        |
      | campos obrigatórios sem saldo | "Marcos Vinicius Vitor Pires" | "marcosviniciuspires@isbt.com.br"     | "662.708.056-78" | "1234" | "1234"        |


