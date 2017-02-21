Projeto
===========

Este projeto é um exemplo simples sobre como aplicar TDD com um problema de números romanos
Todos os exemplos estão escritos na linguagem Java utilizando o framework de teste unitário JUnit.



Criaremos o teste `converterOSimboloIX()` na classe `ConversorDeRomanosTest7`. Ao executarmos o teste visualizamos que o mesmo falha. Deveriamos ter o resultado 9 mas a função converte nos retorna 11.

Esse é o momento de refatoramos o nosso método converte. Uma possível implementação é verificar se subtrair o valor da esquerda para direita quando este número for menor que seu vizinho na direita, senão acumulamos o valor.
