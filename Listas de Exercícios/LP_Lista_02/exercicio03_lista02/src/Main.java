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