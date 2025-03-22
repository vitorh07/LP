import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite o coeficiente a: ");
        double a = entrada.nextDouble();
        System.out.printf("Digite o coeficiente b: ");
        double b = entrada.nextDouble();
        double x = -b / a;
        System.out.println("Equação de primeiro grau: "+x);
        entrada.close();
    }
}