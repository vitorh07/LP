import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        System.out.print("Digite um número inteiro: ");
        int num = entrada.nextInt();
        for (int i = 0; i < 10; i++) {
            if (num == numbers[i]){
                System.out.println("SIM");
            } else{
                System.out.println("Valor não encontrado");
                break;
            }
        }
    }
}