![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 02: variáveis e operadores lógicos/aritméticos 

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é dominar a manipulação de variáveis e operadores lógicos e aritméticos exercitando o raciocínio lógico para a criação de algoritmos.  

Variáveis em linguagens de programação são espaços na memória que armazenam valores que podem ser manipulados durante a execução do programa, permitindo a criação de algoritmos dinâmicos e flexíveis. Operadores aritméticos, como soma (+), subtração (-), multiplicação (*) e divisão (/), realizam cálculos matemáticos essenciais para o processamento de dados. Já os operadores lógicos, como AND, OR e NOT, possibilitam a tomada de decisões ao avaliar expressões booleanas, controlando o fluxo do programa. A combinação desses elementos é fundamental para a construção de algoritmos eficientes e funcionais.

Para mais informações acesse [Aula 03: Fluxogramas.](https://cainaantunes.notion.site/Aula-03-Vari-veis-189bde521b3b8092a2dfdfef9190b15e?pvs=4)

***

1. Ler um número inteiro e exibir o seu dobro.
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int num = entrada.nextInt();
		System.out.println("O dobro desse número é: "+num*2);
		entrada.close();

	}

}

```
2. Ler um número inteiro e exibir o seu quadrado.
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = entrada.nextInt();
		System.out.println("O quadrado do número é: "+num*num);
		entrada.close();
	}

}
```

3. Ler um número real e exibir a quinta parte deste número.
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = entrada.nextInt();
		System.out.println("A quinta parte desse número é: "+num/5);
		entrada.close();

	}

}
```

4. Ler duas notas N1 e N2 e exibir a média.
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		System.out.println("A média das notas é: "+(nota1+nota2) / 2);
		entrada.close();
	}

}
```

5. Ler uma velocidade em $Km/h$ e converter para $m/s$.
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma velocidade em km/h: ");
		double velocidade = entrada.nextDouble();
		System.out.println("A velocidade em m/s é: "+velocidade/3.6);
		entrada.close();
	}

}
```

6. Ler uma velocidade em $m/s$ e converter para $km/h$.
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma velocidade em m/s: ");
		double velocidade = entrada.nextDouble();
		System.out.println("A velocidade em km/h é: "+velocidade*3.6);
		entrada.close();
	}

}
```

7. Ler uma medida em milímetro e converter para polegadas.
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma medida em milímetro");
		double medida = entrada.nextDouble();
		System.out.println("A medida em polegadas é: "+medida / 25.4);
		entrada.close();
	}

}
```

8. Ler uma medida em polegadas e converter para milímetros.
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma medida em polegadas");
		double medida = entrada.nextDouble();
		System.out.println("A medida em milimetros é: "+medida * 25.4);
		entrada.close();
	}

}
```

9. Ler uma medida de distância em quilômetros e converter 
para milhas.
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma distância em quilômetros");
		double distancia = entrada.nextDouble();
		System.out.println("A distância em milhas é: "+distancia / 1.609);
		entrada.close();
	}

}
```

10. Ler uma medida de distância em milhas e converter para quilômetros.
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma distância em milhas");
		double distancia = entrada.nextDouble();
		System.out.println("A distância em quilômetros é: "+distancia * 1.609);
		entrada.close();
	}

}
```

11. Entrar com o valor de temperatura em graus Celsius e exibir a temperaturacorrespondente em graus Fahrenheit.
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma temperatura em celcius: ");
		double temp = entrada.nextDouble();
		double fah = (temp * 9/5) + 32;
		System.out.println("A temperatura em fahrenheit é: "+fah);
		entrada.close();
	}

}
```

12. Ler duas notas N1 e N2 e exibir a média. 

      >Obs.: N1 tem peso 1 e N2 tem peso 2 e resultadodeve estar entre 0 e 10.
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		double nota2p = nota2 + nota2;
		System.out.println("A média das notas é: "+(nota1+nota2p) / 3);
		entrada.close();
	}

}
```

13. Receber o raio e um círculo e calcular sua área.
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o raio de um círculo: ");
		double raio = entrada.nextDouble();
		double area = 3.14 * raio * raio;
		System.out.println("A área do círculo é: "+area+"cm²");
		entrada.close();
	}

}
```

14. Receber a base e a altura de um triângulo retângulo e calcular sua área.
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a base de um triângulo retângulo: ");
		double base = entrada.nextDouble();
		System.out.println("Digite a altura de um triângulo retângulo: ");
		double altura = entrada.nextDouble();
		double area = (base*altura) / 2;
		System.out.println("A área do triângulo retângulo é: "+area+"cm²");
		entrada.close();
	}

}
```

15. Receber o raio e a altura de um cilindro e calcular seu volume.
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o raio de um cilindro");
		double raio = entrada.nextDouble();
		System.out.println("Digite a altura de um cilindro");
		double altura = entrada.nextDouble();
		double volume = Math.PI * Math.pow(raio, 2) * altura;
		System.out.println("O volume do cilindro é: "+volume+"cm³");
		entrada.close();
	}

}
```

16. Receber o raio e a altura de um cone e calcular seu volume.
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o raio de um cone");
		double raio = entrada.nextDouble();
		System.out.println("Digite a altura de um cone");
		double altura = entrada.nextDouble();
		double volume = (1.0 / 3) * Math.PI * Math.pow(raio, 2) * altura;
		System.out.println("O volume do cone é: "+volume+"cm³");
		entrada.close();
	}

}
```

17. Receber velocidade inicial, aceleração e tempo de percurso de um corpo e calcular sua velocidade.
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a velocidade inicial");
		double veli = entrada.nextDouble();
		System.out.println("Digite a aceleração");
		double acel = entrada.nextDouble();
		System.out.println("Digite o tempo de percurso");
		double tempo = entrada.nextDouble();
		double velof = veli + acel * tempo;
		System.out.println("Velocidade final: "+velof);
		entrada.close();
	}

}
```

18. Receber os coeficientes $a$ e $b$ de uma equação do primeiro grau e imprimir a solução.

      >Equação do primeiro grau: $ax + b = 0$
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Digite o coeficiente a: ");
		double a = entrada.nextDouble();
		System.out.printf("Digite o coeficiente b: ");
		double b = entrada.nextDouble();
		double x = -b / a; 
		System.out.println("Equação de primeiro grau: "+x);
		entrada.close();
	}
}
```

19. Receber os coeficientes $a$, $b$ e $c$ de uma equação do segundo grau e imprimir a solução.

      >Equação do segundo grau: $ax^2 + bx + c = 0$
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Digite o coeficiente a: ");
		double a = entrada.nextDouble();
		System.out.printf("Digite o coeficiente b: ");
		double b = entrada.nextDouble();
		System.out.printf("Digite o coeficiente c: ");
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
                System.out.printf("As raízes da equação são: x1 = %.2f e x2 = %.2f%n", x1, x2);
                entrada.close();
			}
		}
	}
}
```

20. Descobrir uma equação do segundo grau a partir de suas raízes:

      >Exemplo: <br>
      $x1 = 1$ e $x2 = 2$ <br>
      Então: <br>
      $(x -1) . (x -2)$ <br>
      Logo: <br>
      $x^2 - 3x + 2 = 0$ <br>
```java
package exercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a primeira raiz (x1): ");
        double x1 = entrada.nextDouble();
        System.out.println("Digite a segunda raiz (x2): ");
        double x2 = entrada.nextDouble();
        
        double a = 1;  
        double b = -(x1 + x2);  
        double c = x1 * x2;  
        
        System.out.printf("A equação do segundo grau é: x² + %.2fx + %.2f = 0%n", b, c);
        entrada.close();
    }
}
```