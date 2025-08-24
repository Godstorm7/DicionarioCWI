# Dicionário Java

Projeto simples de dicionário bilíngue (Inglês-Português) com tratamento de exceções personalizadas.

## Funcionalidades

- Adicionar palavras e traduções nos dicionários de Inglês e Português
- Traduzir palavras entre os idiomas
- Lançar exceção personalizada (`PalavraNaoEncontradaException`) quando a palavra não for encontrada

## Estrutura

- `src/Dicionario.java`: Classe principal do dicionário
- `src/TipoDicionario.java`: Enum para identificar o idioma
- `src/PalavraNaoEncontradaException.java`: Exceção personalizada
- `src/Main.java`: Testes unitários usando JUnit

## Como executar os testes

1. Abra o projeto no IntelliJ IDEA.
2. Execute a classe `Main.java` como teste JUnit.

## Exemplo de uso

```java
Dicionario dicionario = new Dicionario();
dicionario.adicionarPalavra("Carro", "Car", TipoDicionario.INGLES);
String traducao = dicionario.traduzir("carro", TipoDicionario.INGLES); // Retorna "Car"