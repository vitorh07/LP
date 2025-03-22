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