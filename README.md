# tp2-estoque
[![CircleCI](https://circleci.com/gh/mbissonho/tp2-estoque.svg?style=svg)](https://circleci.com/gh/mbissonho/tp2-estoque)
  
Projeto simples da disciplina de Testes usado para demonstrar a utilização do framework Java Spring com Thymeleaf como template engine, 
para a criação de uma aplicação simples com testes de BDD.

[Demonstração](https://tp2-estoque.herokuapp.com)

- A aplicação demonstra uma simples listagem de produtos com saldo mínimo em estoque filtrando por Categoria 
e Fabricante do produto.

- É possível também listar adicionando o critério de margem cujo valor será somado ao saldo mínimo de determinado produto 
para a listagem dos produtos que estão próximos de saldo mínimo em estoque.

- A aplicação criará um banco de dados H2 em memória.

- Os testes de BDD com Cucumber/Selenium irão ativar o Firefox em mode headless por padrão, dessa forma a janela do navegador NÃO abrirá durante os mesmos.

## Para executar:

1. Gere o jar.

    `$ mvn clean package`

2. Acesse o diretório /target.

    `$ cd target/`

3. Rode a aplicação que estará escutando em http://localhost:8282/.

    `$ java -jar estoque-0.0.1-SNAPSHOT.jar`

### Para executar exclusivamente os testes: 

1. Execute com o Maven instalado.
   
   `$ mvn test -e`

2. Execute vendo os testes acontecerem no Firefox(modo headless desabilitado).

    `$ mvn test -e -Denable-headless-mode=false`

### Para mais informações sobre essa abordagem de teste

- [BDD](https://dannorth.net/introducing-bdd/)

## Ambiente:

1. Maven 3.6.0
2. Jdk 1.8.0_231-b11
3. Firefox 72.0.2