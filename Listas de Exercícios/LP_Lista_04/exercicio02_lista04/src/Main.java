import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite um valor: ");
            nums[i] = entrada.nextInt();
        }

        int maior = nums[0];
        int menor = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maior) {
                maior = nums[i];
            }
            if (nums[i] < menor) {
                menor = nums[i];
            }
        }
        System.out.println("\nMaior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
