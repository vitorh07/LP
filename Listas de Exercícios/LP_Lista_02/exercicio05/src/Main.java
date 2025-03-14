import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma velocidade em km/h: ");
        double velocidade = entrada.nextDouble();
        System.out.println("A velocidade em m/s é: "+velocidade/3.6);
        entrada.close();
    }
}