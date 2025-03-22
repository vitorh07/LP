![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 03: Estruturas de Decisão 

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é dominar a manipulação do fluxo de um algorítmo através de estruturas de decisão exercitando o raciocínio lógico para a criação de algoritmos.  

Estruturas de decisão em linguagens de programação, como if-else e switch, permitem que um programa execute diferentes blocos de código com base em condições específicas, tornando-o dinâmico e adaptável. Elas são essenciais para a lógica de controle, possibilitando a tomada de decisões automáticas com base em variáveis e entradas do usuário. Sem essas estruturas, os programas seriam sequenciais e incapazes de responder a diferentes cenários, limitando sua funcionalidade e utilidade.

Para mais informações acesse [Aula 04: Estruturas de decisão.](https://cainaantunes.notion.site/Aula-04-Estruturas-de-decis-o-189bde521b3b80d08502f505c356a0bb?pvs=4)

***

1. Receba um número real e caso ele seja positivo imprima sua raiz quadrada, casocontrário imprima a mensagem: “Valor inválido!”
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número real");
        double num = entrada.nextDouble();
        if (num > 0){
            double raiz = Math.sqrt(num);
            System.out.println("Raiz quadrada: "+raiz);
        } else {
            System.out.println("Valor inválido!");
        }
        entrada.close();
    }
}
```
2. O usuário entra com dois números inteiros e o programa indica qual o maior.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = entrada.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = entrada.nextInt();
        if (num1 > num2){
            System.out.println("O maior número é o 1: "+num1);
        } else if (num2 > num1){
            System.out.println("O maior número é o 2: "+num2);
        } else{
            System.out.println("Os números são iguais");
        }
        entrada.close();
    }
}
```
3. Entrar com a nota 1 (n1) e nota 2 (n2) e o programa exibe na tela a média. Se a média for menor que 50 imprimir “Reprovado” caso contrário imprimir “Aprovado”.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite duas notas (0-100): ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int media = (num1 + num2) / 2;
        if(media < 50){
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
        entrada.close();
    }
}
```
4. Entrar com a nota 1 (n1) e nota 2 (n2) e o programa exibe na tela a média. Se a médiafor maior ou igual a 50, exibir “Aprovado”, caso contrário solicitar ao usuário a nota daprova de recuperação, tirar nova média entre a média anterior e a prova de recuperação,se a nova média for menor que 50 exibir “Reprovado” caso contrário exibir “Aprovado”.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite duas notas (0-100): ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int media = (num1 + num2) / 2;
        if(media >= 50){
            System.out.println("Aprovado");
        } else{
            System.out.println("Digite sua nota de recuperação");
            int recup = entrada.nextInt();
            int novaMedia = (recup + media) / 2;
            if(novaMedia >= 50){
                System.out.println("Aprovado");
            } else{
                System.out.println("Reprovado");
            }
        }
        entrada.close();
    }
}
```
5. Elabore um programa que calcule a média de um aluno e imprima o conceito:
    - A se a média >= 8.5
    - B se a média >= 7 e média < 8.5
    - C se a média >= 5 e média < 7
    - D se a média < 5
```java
import com.sun.jdi.LocalVariable;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Digite duas notas (0-10): ");
        double num1 = entrada.nextDouble();
        double num2 = entrada.nextDouble();
        double media = (num1 + num2) / 2;
        if(media >= 8.5){
            System.out.println("A");
        } else if(media < 8.5 && media >= 7){
            System.out.println("B");
        } else if(media >= 5){
            System.out.println("C");
        } else if(media < 5){
            System.out.println("D");
        } else{
            System.out.println("Nota inválida");
        }
        entrada.close();
    }
}
```
6. Em um sistemas de caixa eletrônico o usuário deve escolher entre as opções de um menu escolhendo um número inteiro entre 5 e 9 inclusive. Crie um algoritmo que valide a entrada do usuário exibindo a opções escolhida ou a mensagem de opção inválida casoo usuário entre com um número fora do range estabelecido.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número (5-9): ");
        int opcao = entrada.nextInt();

        switch (opcao){
            case 5:
                System.out.println("Você escolheu 5");
                break;
            case 6:
                System.out.println("Você escolheu 6");
                break;
            case 7:
                System.out.println("Você escolheu 7");
                break;
            case 8:
                System.out.println("Você escolheu 8");
                break;
            case 9:
                System.out.println("Você escolheu 9");
                break;
            default:
                System.out.println("Opção inválida");
        }
        entrada.close();
    }
}
```
7. Receber os coeficientes $a$, $b$ e $c$ de uma equação do segundo grau e imprimir a solução($x_1$ e $x_2$). Equação do segundo grau: $ax^2+bx+c=0$. Exibir uma mensagem de aviso quando não houver raízes no conjunto de números Reais.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o coeficiente a, b e c: ");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        if (a == 0) {
            System.out.println("A não pode ser = 0");
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("delta negativo");
            } else if (delta == 0) {
                double x = -b / (2*a);
                System.out.printf("A equação possui uma única raiz real: x = %.2f%n", x);
            } else {

                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
                entrada.close();
            }
        }
    }
}
```
8. O usuário entra com um número inteiro e o programa indica se o número é ímpar ou par.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = entrada.nextInt();
        if(num % 2 == 0){
            System.out.println("O número é par");
        } else{
            System.out.println("O número é ímpar");
        }
    }
}
```
9. Dados três valores, verificar se eles podem ser valores dos lados de um triângulo. Se forem, imprima se é um triângulo equilátero, isósceles ou escaleno.
    >**Condição de existência de um triângulo**: <br>
    A medida de qualquer um dos lados de um triângulo deve ser menor do que a soma dos outros dois lados e maior que diferença entre essas mesmas medidas. <br>
    - **Triângulo equilátero:** possui todos os lados iguais.
    - **Triângulo isósceles:** possui apenas dois lados iguais.
    - **Triângulo escaleno**: todos os lados são diferentes.10. 
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 3 valores inteiros:");
        int ladoA = entrada.nextInt();
        int ladoB = entrada.nextInt();
        int ladoC = entrada.nextInt();
        if ((ladoA < ladoB + ladoC && ladoA > Math.abs(ladoB - ladoC)) &&
                (ladoB < ladoA + ladoC && ladoB > Math.abs(ladoA - ladoC)) &&
                (ladoC < ladoA + ladoB && ladoC > Math.abs(ladoA - ladoB))) {
            if(ladoA == ladoB && ladoB == ladoC){
                System.out.println("Triângulo equilátero");
            } else if(ladoA == ladoB || ladoB == ladoC || ladoA == ladoC){
                System.out.println("Triângulo isóceles");
            } else{
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Os valores informados NÃO podem formar um triângulo.");
        }

        entrada.close();
    }
}

```
10. Receber três números inteiros e exibi-los em ordem crescente.
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite três números inteiros: ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int num3 = entrada.nextInt();
        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);
        for (int i : numeros){
            System.out.println(i + " ");
        }
        entrada.close();
    }
}
```
11. O usuário digita um número inteiro e o programa diz qual o dia da semana correspondente, por exemplo: 

    - 1 – domingo <br> 
    - 2 – segunda-feira <br> 
    - e assim por diante. <br>
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7: ");
        int opcao = entrada.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
    }
}
```
12. Elaborar uma minicalculadora, o programa recebe 2 números e exibe um menu para que o usuário escolha a operação e em seguida exibe o resultado. Exemplo:

    ```plaintext
    Digite o primeiro numero: 2
    Digite o segundo numero: 3
    ------------------------------
    Menu:
        1. Soma
        2. Subtracao
        3. Multiplicacao
        4. Divisao
    ------------------------------
    Escolha uma opcao: 3
    ------------------------------
    Resultado: 2.0 x 3.0 = 6.0
    ```
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();
        System.out.println("------------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Soma");
        System.out.println("    2. Subtração");
        System.out.println("    3. Multiplicação");
        System.out.println("    4. Divisão");
        System.out.println("------------------------------");
        System.out.print("Escolha uma opção: ");
        int opcao = entrada.nextInt();
        System.out.println("------------------------------");

        switch (opcao){
            case 1:
                System.out.println("Resultado: "+num1+ " + "+num2+" = "+(num1+num2));
                break;
            case 2:
                System.out.println("Resultado: "+num1+ " - "+num2+" = "+(num1-num2));
                break;
            case 3:
                System.out.println("Resultado: "+num1+ " * "+num2+" = "+(num1*num2));
                break;
            case 4:
                System.out.println("Resultado: "+num1+ " / "+num2+" = "+(num1/num2));
                break;
        }
        entrada.close();
    }
}
```
13. Calculadora geométrica: exibir em um menu a opção de escolha entre três formageométricas: círculo, triangulo retângulo ou retângulo. Após a seleção da opção oprograma deverá solicitar que o usuário insira os dados necessário para realizar os cálculos de área e perímetro da forma selecionada, os resultados devem ser exibidos em seguida.Exemplo:

    ```plaintext 
    Menu:
        1. Círculo
        2. Triangulo Retângulo
        3. Retângulo
    --------------------------
    Escolha uma opção: 2
    --------------------------
    Informe a base: 3
    Informe a altura: 4
    --------------------------
    Área = 6
    Perímetro = 12
    ```
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("    1. Círculo");
        System.out.println("    2. Triangulo Retângulo");
        System.out.println("    3. Retângulo");
        System.out.println("--------------------------");
        System.out.print("Escolha uma opção: ");
        int opcao = entrada.nextInt();
        System.out.println("--------------------------");
        switch (opcao){
            case 1:
                System.out.print("Informe o raio: ");
                int raio = entrada.nextInt();
                System.out.println("--------------------------");
                System.out.println("Área = "+(Math.PI*Math.pow(raio,2)));
                System.out.println("Perímetro = "+2*Math.PI*raio);
                break;
            case 2:
                System.out.print("Informe a base: ");
                int baseT = entrada.nextInt();
                System.out.print("Informe a altura: ");
                int alturaT = entrada.nextInt();
                System.out.print("Informe a hipotenusa: ");
                int hipo = entrada.nextInt();
                System.out.println("--------------------------");
                System.out.println("Área = "+(baseT*alturaT)/2);
                System.out.println("Perímetro = "+(baseT+alturaT+hipo));
                break;
            case 3:
                System.out.print("Informe a base: ");
                int baseR = entrada.nextInt();
                System.out.print("Informe a altura: ");
                int alturaR = entrada.nextInt();
                System.out.println("--------------------------");
                System.out.println("Área = "+baseR*alturaR);
                System.out.println("Perímetro = "+((baseR*2)+(alturaR*2)));
                break;
        }
        entrada.close();
    }
}
```
14. Crie um sistema de vendas onde o usuário insere o valor da compra e escolhe a formade pagamento que pode ser: débito, crédito ou pix. Após escolher a forma de pagamentoo sistema deve mostrar o total a pagar que deve seguir as seguintes regras:

    - **Débito:** Conceder desconto de 5%.
    - **Pix:** Conceder desconto de 10%.
    - **Crédito:** taxa de 2% do valor total em parcelamento até 4 vezes ou taxa de 5% do valor total em parcelamentos superiores a 4 vezes (limite 10x).

    Exemplo:

    ```plaintext
    Insira o valor da compra: 1000,00
    ----------------------------------
    Menu:
        1. Débito
        2. Pix
        3. Crédito
    ----------------------------------
    Escolha a forma de pagamento: 3
    ----------------------------------
    Crédito Selecionado
    ----------------------------------
    Escolha o número de parcelas: 6
    Valor final da compra: R$ 1050,00
    ```
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o valor da compra: ");
        double valor = entrada.nextDouble();
        System.out.println("----------------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Débito");
        System.out.println("    2. Pix");
        System.out.println("    3. Crédito");
        System.out.println("----------------------------------");
        System.out.print("Escolha a forma de pagamento: ");
        int opcao = entrada.nextInt();
        System.out.println("----------------------------------");
        switch (opcao){
            case 1:
                System.out.println("Débito selecionado");
                System.out.println("----------------------------------");
                System.out.println("Valor final da compra: R$ "+valor*0.95);
                break;
            case 2:
                System.out.println("Pix selecionado");
                System.out.println("----------------------------------");
                System.out.println("Valor final da compra: R$ "+valor*0.90);
                break;
            case 3:
                System.out.println("Crédito selecionado");
                System.out.println("----------------------------------");
                System.out.print("Escolha o número de parcelas: ");
                int parcelas = entrada.nextInt();
                if(parcelas <= 4){
                    System.out.println("Valor final da compra: R$ "+valor*1.02);
                } else if(parcelas < 10){
                    System.out.println("Valor final da compra: R$ "+valor*1.05);
                } else{
                    System.out.println("A quantidade de parcelas é inválida, o máximo é 10x e o mínimo é 1x");
                }
                break;
        }
        entrada.close();
    }
}
```
15. Elabore um programa que simule o funcionamento de uma máquina de café, o usuário entra com o valor em reais, a máquina então apresenta um menu com as opções disponíveis e seus respectivos preços. Ao selecionar uma das opções a máquina informa a bebida selecionada e o troco calculado.

    Exemplo:
    
    ```plaintext
    Insira o dinheiro: 5,00
    ------------------------------
    Menu:
        1. Café Expresso R$ 0,50
        2. Café Longo R$ 1,00
        3. Capuccino R$ 2,50
        4. Chocolate R$ 2,00
    ------------------------------
    Escolha uma opção: 3
    ------------------------------
    Bebida selecionada: Capuccino
    Seu Troco: R$ 2,50
    ```
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o dinheiro: ");
        double valor = entrada.nextDouble();
        System.out.println("------------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Café Expresso R$ 0,50");
        System.out.println("    2. Café Longo R$ 1,00");
        System.out.println("    3. Capuccino R$ 2,50");
        System.out.println("    4. Chocolate R$ 2,00");
        System.out.println("------------------------------");
        System.out.print("Escolha uma opção: ");
        int opcao = entrada.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Bebida selecionada: Café Expresso");
                if (valor >= 0.5){
                    System.out.println("Seu troco: R$ "+(valor-0.5));
                } else{
                    System.out.println("Valor insuficiente");
                }
                break;
            case 2:
                System.out.println("Bebida selecionada: Café Longo");
                if (valor >= 1){
                    System.out.println("Seu troco: R$ "+(valor-1));
                } else{
                    System.out.println("Valor insuficiente");
                }
                break;
            case 3:
                System.out.println("Bebida selecionada: Capuccino");
                if (valor >= 2.5){
                    System.out.println("Seu troco: R$ "+(valor-2.5));
                } else{
                    System.out.println("Valor insuficiente");
                }
                break;
            case 4:
                System.out.println("Bebida selecionada: Chocolate");
                if (valor >= 2){
                    System.out.println("Seu troco: R$ "+(valor-2));
                } else{
                    System.out.println("Valor insuficiente");
                }
                break;
        }
        entrada.close();
    }
}
```


