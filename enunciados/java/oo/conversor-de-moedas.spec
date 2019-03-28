# Conversor de moedas

  Tags: dificil, oo

Crie uma aplicação que converta valores de uma moeda para outra.


Para converter valores de uma moeda para outra, precisamos de `taxas de cambio`, que são valores que indicam quanto uma
moeda vale em relação à outra. Ou seja, quando dizem que `2 reais` vale `0.53 centavos de dolár` reais, se utiliza a
taxa de câmbio de `0.26`, pois:

```
2 * 0.26 = 0.53
```

O padrão [ISO-4217](https://en.wikipedia.org/wiki/ISO_4217#Active_codes) estipula códigos de três letras para representar
moedas. Por exemplo:

    - Reais brasileiros: `BRL`
    - Dólares americanos: `USD`
    - Euro: `EUR`
    - Pesos Chilenos: `CLP`

O programa deve utilizar este padrão para manipular os valores.

Ou seja, neste caso, a taxa de câmbio de real para dólar é `0.26`. Estas taxas são relativas ao mercado, o que significa
que não é possível calculá-las, portanto, o programa deve armazenar algumas taxas de câmbio.

O programa somente deve suportar conversões entre as seguintes moedas:

  - `BRL`: Real brasileiro
  - `CLP`: Peso Chileno
  - `EUR`: Euro

As taxas de câmbio entre estas moedas são as seguintes:

  - `BRL > CLP: 175.65`
  - `BRL > EUR: 0.23`
  - `CLP > BRL: 0.0057`
  - `CLP > EUR: 0.0013`
  - `EUR > BRL: 4.29`
  - `EUR > CLP: 754.01`


O programa receberá a entrada no seguinte formato:

```
EUR100 BRL
```

```
CLP1000 BRL
```

E deve mostrar o resultado no seguinte formato:

```
BRL429
```

```
BRL5.7
```

__Regras de negócio__

  - O programa receberá uma entrada por vez, ou seja, irá efetuar apenas uma conversão.
  - Considere que a entrada sempre estará no formato correto, não é necessário validar o formato
  - Ainda que a entrada esteja num formato válido, a moeda recebida pode não ser suportada pela aplicação, neste caso,
  a aplicação deve mostrar um erro

__Desenvolvendo o exercicio__

O código deve ser desenvolvido na classe `Conversor`, que está dentro do pacote `com.thoughtworks.aceleradora.oo.conversor`.
Neste mesmo pacote, haverá a classe `Teste` que pode ser utilizada caso você queira testar o código.

Tente utilizar mais de uma classe, evite desenvolver toda a lógica dentro da classe conversor.

Para dar algumas ideias, pense em conceitos como:

  - Moeda
  - Valor monetário
  - Interpretador de entrada
  - Conversao
  - Taxa de câmbio

Tente utilizar classes para representar estes conceitos dentro da sua solução.

__Casos de teste__

## Deve converter valores de uma moeda para outra

* Deve converter "EUR100 BRL" para "BRL429"
* Deve converter "CLP1000 BRL" para "BRL5.7"

## Deve informar usuário quando a moeda utilizada não for suportada

* Ao receber "USD100 BRL" deve retornar mensagem "Moeda nao suportada: USD"
* Ao receber "CLP1000 GBP" deve retornar mensagem "Moeda nao suportada: GBP"
