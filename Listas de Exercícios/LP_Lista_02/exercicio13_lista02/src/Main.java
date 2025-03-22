import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o raio de um círculo: ");
        double raio = entrada.nextDouble();
        double area = 3.14 * raio * raio;
        System.out.println("A área do círculo é: "+area+"cm²");
        entrada.close();
    }
}