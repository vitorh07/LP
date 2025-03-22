import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a base de um triângulo retângulo: ");
        double base = entrada.nextDouble();
        System.out.println("Digite a altura de um triângulo retângulo: ");
        double altura = entrada.nextDouble();
        double area = (base*altura) / 2;
        System.out.println("A área do triângulo retângulo é: "+area+"cm²");
        entrada.close();
    }
}