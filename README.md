# Trilha de Exercícios


[![Gauge Badge](https://gauge.org/Gauge_Badge.svg)](https://gauge.org)

Lista de exercícios da Aceleradora.

## Como usar

__Primeiro passo: Ambiente-se com os erros__

Antes de mais nada, execute os testes e observe-os falhar no terminal.

Para executar os enunciados de Java:

```bash
./gradlew testeJava
```

Para executar os enunciados de Javascript:

```bash
./gradlew testeJs
```

Seu objetivo é fazer com que estes testes passem. Antes de tentar resolver qualquer problema, tome uns minutos para familiarizar-se com o
terminal. Tente interpretar todas as mensagens de erro que aparecem na tela. Não se preocupe se nada ficar claro num primeiro momento, a
única regra é __não temer o terminal nem suas mensagens de erro__. Sempre tente interpretar o que está acontecendo.

__Segundo passo: Leia os enunciados de cada exercício__

Depois de ver tudo falhar, dê uma olhada nos enunciados de cada exercício. Um relatório é gerado e exibido no navegador após a execução dos
testes. Este relatório contém os enunciados de cada problema.

Além do relatório, também é possível visualizar os enunciados no código fonte em arquivos `.spec`.

- Os enunciados de Java estão em `src/java/spec`
- Os enunciados de Javascript estão em `src/javascript/spec`

__Terceiro passo: Veja o código__

Depois de ver quais são os exercícios disponíveis, navegue pela estrutura do projeto para encontrar o código que precisa ser alterado para
resolver cada exercício.

- Para exercícios Java, você deve alterar o código em `src/java/main`
- Para exercícios Javascript, você deve alterar o código em `src/javascript/main`

> Se quiser, aventure-se também nas pastas `test` de cada linguagem para espiar como os testes foram implementados, mas __não altere nada
> lá__.

__Quarto passo: Implemente suas soluções__

Tente fazer os testes passarem. Tudo que você precisa fazer é colocar sua ideia em prática no código e executar novamente o comando
`./gradlew testeJava` ou `./gradlew testeJs` para exercícios Java e Javascript respectivamente.
