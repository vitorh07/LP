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

        for (int i = 0; i < 10; i++) {
            if(numbers[i] > numbers[i+1]){
                maior = numbers[i];
                System.out.println("Maior: " + maior);
            }
            if(numbers[i] < numbers[i+1]){
                menor = numbers[i];
                System.out.println("Menor: " + menor);
            }
        }
    }
}