import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma distância em quilômetros");
        double distancia = entrada.nextDouble();
        System.out.println("A distância em milhas é: "+distancia / 1.609);
        entrada.close();
    }
}