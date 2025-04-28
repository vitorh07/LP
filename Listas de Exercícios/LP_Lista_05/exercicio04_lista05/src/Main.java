import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numbers = new int[10];
        int maior, menor;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            numbers[i] = entrada.nextInt();
        }

        maior = menor = numbers[0];

        for (int i = 1; i < 10; i++) {
            if (numbers[i] > maior) {
                maior = numbers[i];
            }
            if (numbers[i] < menor) {
                menor = numbers[i];
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
