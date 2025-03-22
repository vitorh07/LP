import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma velocidade em m/s: ");
        double velocidade = entrada.nextDouble();
        System.out.println("A velocidade em km/h é: "+velocidade*3.6);
        entrada.close();
    }
}