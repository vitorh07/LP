import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o coeficiente a, b e c: ");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        if (a == 0) {
            System.out.println("A não pode ser = 0");
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("delta negativo");
            } else if (delta == 0) {
                double x = -b / (2*a);
                System.out.printf("A equação possui uma única raiz real: x = %.2f%n", x);
            } else {

                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
                entrada.close();
            }
        }
    }
}