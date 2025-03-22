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