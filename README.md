# Trilha de Exercícios


[![Gauge Badge](https://gauge.org/Gauge_Badge.svg)](https://gauge.org)

Lista de exercícios da Aceleradora.

## Como usar

__Primeiro passo: Ambiente-se com os erros__

Antes de mais nada, execute os testes e observe-os falhar no terminal:

```bash
./gradlew testes
```

Seu objetivo é fazer com que estes testes passem. Antes de tentar resolver qualquer problema, tome uns minutos para familiarizar-se com o
terminal. Tente interpretar todas as mensagens de erro que aparecem na tela. Não se preocupe se nada ficar claro num primeiro momento, a
única regra é __não temer o terminal nem suas mensagens de erro__. Sempre tente interpretar o que está acontecendo.

__Segundo passo: Leia os enunciados de cada exercício__

Depois de ver tudo falhar, dê uma olhada nos enunciados de cada exercício. Você pode fazer isso de duas maneiras:

Ler os arquivos `.spec` dentro da pasta `enunciados`.

Ou

Gerar o relatório com o resultado dos testes:

```bash
./gradlew relatorio
```

__Terceiro passo: Veja o código__

Depois de ver quais são os exercícios disponíveis, navegue pela estrutura do projeto para encontrar o código que precisa ser alterado para
resolver cada exercício. Dê um olhada dentro da pasta `src/main/java`. Se quiser, aventure-se também na pasta `src/test/java`, mas __não
altere nada lá__.

__Quarto passo: Implemente suas soluções__

Tente fazer os testes passarem. Tudo que você precisa fazer é colocar sua ideia em prática no código e executar novamente o comando

```
./gradlew testes
```

Se preferir ler o relatório no browser, execute também:

```
./gradlew relatorio
```
