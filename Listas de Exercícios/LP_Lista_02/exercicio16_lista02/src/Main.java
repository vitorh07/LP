import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o raio de um cone");
        double raio = entrada.nextDouble();
        System.out.println("Digite a altura de um cone");
        double altura = entrada.nextDouble();
        double volume = (1.0 / 3) * Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("O volume do cone é: "+volume+"cm³");
        entrada.close();
    }
}