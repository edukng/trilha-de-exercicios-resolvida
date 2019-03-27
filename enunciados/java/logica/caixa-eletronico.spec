# Caixa Eletrônico

    Tags: logica, medio

Implemente o método `sacar` da classe `CaixaEletronico`. O método deve implementar a lógica de saque baseada nas notas
disponíveis no caixa eletrônico. A ideia é quebrar valores maiores em múltiplas notas disponíveis. Por exemplo:

Ao sacar `70` reais, o caixa deve quebrar este valor, entregando uma nota de `50` e outra de `20`.

## Sacar dinheiro

__Notas disponíveis: 50, 20__

* Quando o valor do saque for "50", o caixa deve entregar "50"
* Quando o valor do saque for "20", o caixa deve entregar "20"
* Quando o valor do saque for "60", o caixa deve entregar "20, 20, 20"
* Quando o valor do saque for "70", o caixa deve entregar "50, 20"
* Quando o valor do saque for "80", o caixa deve entregar "20, 20, 20, 20"
* Quando o valor do saque for "90", o caixa deve entregar "50, 20, 20"
* Quando o valor do saque for "100", o caixa deve entregar "50, 50"
* Quando o valor do saque for "110", o caixa deve entregar "50, 20, 20, 20"
* Quando o valor do saque for "120", o caixa deve entregar "50, 50, 20"
* Quando o valor do saque for "140", o caixa deve entregar "50, 50, 20, 20"

* Quando o valor do saque for "10", o caixa deve lançar exceção com mensagem "Valor invalido"
* Quando o valor do saque for "25", o caixa deve lançar exceção com mensagem "Valor invalido"
* Quando o valor do saque for "30", o caixa deve lançar exceção com mensagem "Valor invalido"
* Quando o valor do saque for "130", o caixa deve lançar exceção com mensagem "Valor invalido"

