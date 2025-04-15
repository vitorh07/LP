import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int num = entrada.nextInt();
        int fatorial = 1;
        for (int i=1; i<=num; i++){
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial de " + num + " é: " + fatorial);
    }
}