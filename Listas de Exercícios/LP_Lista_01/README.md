![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite sua Nota entre 0 e 100\] 
        input --> inputB[\ Digite sua frequência em %\]      
        inputB --> verification{ Nota >= 50? }
        verification --> |Não| B[/ Reprovado /] --> b([ Fim ])
        verification --> |Sim| A{Frequência >= 75% } --> |Não| B[/ Reprovado /]
        A --> |Sim| Aprovado[/Aprovado/] -->
            b([ Fim ])
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite o primeiro número \] 
        input --> inputB[\ Digite o segundo número \]
        inputB --> process[num1 + num2 = resultado]
        process --> resultado[/ resultado /]
        resultado --> finish([ Fim ])
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite um número \] 
        input --> verification{ num >= 0? }
        verification --> |Sim| A[/ Positivo /]
        verification --> |Não| B[/ Negativo /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite sua idade \] 
        input --> inputB[\ Você possuí título de eleitor? \]      
        inputB --> verification{idade >= 16 && possuí titulo?}
        verification --> |Sim| A[/ Pode votar /]
        verification --> |Não| B[/ Não pode /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite o primeiro número \] 
        input --> inputB[\ Digite o segundo número \]      
        inputB --> verification{num1 > num2?}
        verification --> |Sim| A[/ num1 /]
        verification --> |Não| B[/ num2 /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite o primeiro número \]
      input --> inputB[\ Digite o segundo número \]
      inputB --> inputC[\ Digite o terceiro número \]
      inputC --> verification1{num1 > num2 && num1 > num3?}
      verification1 --> |Sim| output1[/num1/] --> finish([ Fim ])
      verification1 --> |Não| verification2{num2 > num1 && num2 > num3} 
      verification2 --> |Sim| output2[/num2/] --> finish
      verification2 --> |Não| verification3{num3 > num1 && num3 > num2}
      verification3 --> |Não| output4[/Iguais/] -->
        finish
      verification3 --> |Sim| output3[/num3/] -->
      finish
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite o número \]
      input --> process[fatorial = 1]
      process ---> loop{n > 1?}
      loop --> |Sim| conta[for: Multiplique fatorial por n]
      conta --> decremento[n = n - 1]
      decremento --> loop
      loop --> |Não| output[/Resultado = fatorial/] -->
      finish([ Fim ])
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
      start(( Início )) --> input[\ Digite o número \]   
        input --> verification{num % 2 == 0?}
        verification --> |Sim| A[/ É par /]
        verification --> |Não| B[/ É ímpar /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
    start((Start)) 
    --> input[\ Digite o número \]
    input --> verification{n <= 1?}
    verification --> |Sim| A[/Não é primo/]
    verification --> |Não| C[Definir i = 2]
    C --> D{ i <= √n? }
    D --> |Não| E[/É primo/]
    D --> |Sim| F{n % i == 0?}
    F --> |Sim| B[/Não é primo/]
    F --> |Não| G[Incrementar i++]
    G --> D
    A --> finish([Fim])
    B --> finish
    E --> finish

   ```