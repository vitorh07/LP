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