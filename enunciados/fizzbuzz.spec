# O Tradutor Fizz Buzz

O problema:

- Se o número for divisível somente por `3`, o método retorna `Fizz`

- Se o número for divisível somente por `5`, o método retorna `Buzz`

- Se o número for divisível por ambos `3` e `5`, o método retorna `FizzBuzz`

- Se o número não for divisível por nenhum dos dois, o método retorna o próprio número em formato de String

__Dicas:__

Utilize o operador `%` para saber se um número é divisível por outro. Para saber se um número é divisível por 2, por
exemplo, podemos usar o seguinte:

```java
int numero = 4;

if (numero % 2 == 0) {
    System.out.println("O numero eh divisivel por 2");
} else {
    System.out.println("O numero nao eh divisivel por 2");
}
```

Para converter um número inteiro para String, pode-se utilizar os métodos `Integer.toString()`,
`String.valueOf` ou ainda `Objects.toString`:

```java
String numero = Integer.parseInt(2); // numero == "2"

// ou

String outroNumero = String.valueOf(4); // outroNumero == "4"

// ou

String maisUmNumero = Objects.toString(5); // maisUmNumero == "5"

```

## Traduz numeros divisiveis por 3 para Fizz

* Traduz "3" para "Fizz"
* Traduz "6" para "Fizz"
* Traduz "12" para "Fizz"

## Traduz numeros divisiveis por 5 para Buzz

* Traduz "5" para "Buzz"

## Traduz numeros divisiveis por 3 e por 5 para FizzBuzz

* Traduz "15" para "FizzBuzz"
* Traduz "30" para "FizzBuzz"
* Traduz "45" para "FizzBuzz"

