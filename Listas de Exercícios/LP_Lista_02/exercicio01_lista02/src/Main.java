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