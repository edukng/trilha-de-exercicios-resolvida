# Biblioteca

  Tags: medio, oo

Vamos praticar um pouco de orientação a objetos modelando a ideia de um carro em uma classe. Em outras palavras, vamos
pensar em como representar um carro em nosso programa, descrevendo atributos e comportamentos que esperamos ver em um
carro da vida real.

## Instancie as listas de formato e autoras da classe Livro

Um livro pode possuir diversos formatos e autores. Para representar estas informações, a classe possui uma lista que
armazena as autoras e outra que armazena os formatos do livro. Estas listas devem ser instanciadas no momento de criação
dos objetos do tipo livro. Podemos utilizar o construtor da classe para fazer isso no momento certo.

* A lista de formatos deve ser instanciada no construtor da classe Livro
* A lista de autores deve ser instanciada no construtor da classe Livro

## Crie métodos para acessar e atribuir valores privados

Os atributos da classe livro são privados, ou seja, não são visíveis por objetos externos. Deixar as coisas privadas nos
ajudam a controlar o que pode ser acessado e/ou sobrescrito. A isso denominamos encapsulamento. No caso dos livros, queremos
que os autores e os formatos sejam acessíveis por objetos externos, mas não queremos que estes atributos sejam sobrescritos
por entidades externas. Neste caso, adicionamos métodos getters:

* A classe livro deve ter o método getAutores
* A classe livro deve ter o método getFormatos

* A classe livro deve ter o método setAnoDeLancamento
* A classe livro deve ter o método getAnoDeLancamento

## Crie um método que sirva para adicionar novas autoras a um livro

Estes métodos servem como atalhos, facilitando nossa vida quando precisamos adicionar novas autoras ou formatos a
um livro.

* Quando o método adicionarAutor receber por parâmetro a autora Chimamanda Adichie, o primeiro item da lista de autores do livro deve ser Chimamanda Adichie

Obs.: Não se preocupe em criar um objeto `Autor` com essas características. Pense na lógica necessária para adicionar um
autor recebido por parâmetro à lista de autores do livro.

## Crie um método que sirva para adicionar novos formatos a um livro

* Quando o método adicionarFormato receber por parâmetro o formato PDF, o primeiro item da lista de formatos do livro deve ser PDF

## Preencha a enciclopedia

A classe `Enciclopedia` possui uma lista de livros. No construtor da classe, preencha a lista com os seguintes títulos:

* O livro "0" foi escrito por "Chimamanda Adichie", seu título é "Sejamos todos feministas" e foi lançado em "2014". O livro está disponível nos formatos "EBOOK"
* O livro "1" foi escrito por "Alejandro Olchik", seu título é "Management 3.0" e foi lançado em "2017". O livro está disponível nos formatos "PDF, FISICO"
* O livro "2" foi escrito por "George Orwell", seu título é "1984" e foi lançado em "1948". O livro está disponível nos formatos "PDF, FISICO, EBOOk"
* O livro "3" foi escrito por "Julia Naomi", seu título é "Lean Game Development" e foi lançado em "2017". O livro está disponível nos formatos "PDF, EBOOk"
* O livro "4" foi escrito por "Eduardo Galeano", seu título é "Las venas abiertas de Latinoamerica" e foi lançado em "1971". O livro está disponível nos formatos "FISICO, PDF, EBOOk"
* O livro "5" foi escrito por "Kathy Sierra, Elizabeth Freeman", seu título é "Use a cabeça: Padrões de projeto" e foi lançado em "2004". O livro está disponível nos formatos "FISICO, PDF"
* O livro "6" foi escrito por "Chimamanda Adichie", seu título é "Americanah" e foi lançado em "2013". O livro está disponível nos formatos "EBOOK, PDF, FISICO"

## Buscar título do enésimo livro

Implemente o método `tituloDoEnesimoLivro` da classe `Enciclopedia` de modo que ele retorne o título do livro armazenado no índice recebido por parâmetro. Para verificar que a lógica está correta:

* O método tituloDoEnesimoLivro retorna o título "Sejamos todos feministas" quando o índice pesquisado for "0"
* O método tituloDoEnesimoLivro retorna o título "Use a cabeça: Padrões de projeto" quando o índice pesquisado for "5"

## Buscar livros disponiveis em PDF

Implemente o método `livrosDisponiveisEmPdf` da classe `Enciclopedia`. Este método deve retornar uma lista com todos os livros que estejam disponíveis no formato PDF:

* O livro "0" retornado por livrosDisponiveisEmPdf foi escrito por "Alejandro Olchik", seu título é "Management 3.0" e foi lançado em "2017". O livro está disponível nos formatos "PDF, FISICO"
* O livro "1" retornado por livrosDisponiveisEmPdf foi escrito por "George Orwell", seu título é "1984" e foi lançado em "1948". O livro está disponível nos formatos "PDF, FISICO, EBOOk"
* O livro "2" retornado por livrosDisponiveisEmPdf foi escrito por "Julia Naomi", seu título é "Lean Game Development" e foi lançado em "2017". O livro está disponível nos formatos "PDF, EBOOk"
* O livro "3" retornado por livrosDisponiveisEmPdf foi escrito por "Eduardo Galeano", seu título é "Las venas abiertas de Latinoamerica" e foi lançado em "1971". O livro está disponível nos formatos "FISICO, PDF, EBOOk"
* O livro "4" retornado por livrosDisponiveisEmPdf foi escrito por "Kathy Sierra, Elizabeth Freeman", seu título é "Use a cabeça: Padrões de projeto" e foi lançado em "2004". O livro está disponível nos formatos "FISICO, PDF"
* O livro "5" retornado por livrosDisponiveisEmPdf foi escrito por "Chimamanda Adichie", seu título é "Americanah" e foi lançado em "2013". O livro está disponível nos formatos "EBOOK, PDF, FISICO"


## Buscar livros da autora Chimamanda Adichie

Implemente o método `buscaPorAutora` da classe `Enciclopedia`. Este método deve retornar uma lista com todos os livros que tenham sido escritos por Chimamanda Adichie:

* O livro "0" retornado por buscaPorAutora foi escrito por "Chimamanda Adichie", seu título é "Sejamos todos feministas" e foi lançado em "2014". O livro está disponível nos formatos "EBOOK"
* O livro "1" retornado por buscaPorAutora foi escrito por "Chimamanda Adichie", seu título é "Americanah" e foi lançado em "2013". O livro está disponível nos formatos "EBOOK, PDF, FISICO"

## Buscar livros lançados em 2017

Implemente o método `buscaPorAnoDeLancamento` da classe `Enciclopedia`. Este método deve retornar uma lista com todos os livros que foram lançados no ano de 2017:

* O livro "0" retornado por buscaPorAnoDeLancamento foi escrito por "Alejandro Olchik", seu título é "Management 3.0" e foi lançado em "2017". O livro está disponível nos formatos "PDF, FISICO"
* O livro "1" retornado por buscaPorAnoDeLancamento foi escrito por "Julia Naomi", seu título é "Lean Game Development" e foi lançado em "2017". O livro está disponível nos formatos "PDF, EBOOk"

## Buscar livros lançados entre 1920 e 2010

Implemente o método `buscaPorPeriodoDeLancamento` da classe `Enciclopedia`. Este método deve retornar uma lista com todos os livros que tenham sido lançados entre 1920 e 2010:

* O livro "0" retornado por buscaPorPeriodoDeLancamento foi escrito por "George Orwell", seu título é "1984" e foi lançado em "1948". O livro está disponível nos formatos "PDF, FISICO, EBOOk"
* O livro "1" retornado por buscaPorPeriodoDeLancamento foi escrito por "Eduardo Galeano", seu título é "Las venas abiertas de Latinoamerica" e foi lançado em "1971". O livro está disponível nos formatos "FISICO, PDF, EBOOk"
* O livro "2" retornado por buscaPorPeriodoDeLancamento foi escrito por "Kathy Sierra, Elizabeth Freeman", seu título é "Use a cabeça: Padrões de projeto" e foi lançado em "2004". O livro está disponível nos formatos "FISICO, PDF"
