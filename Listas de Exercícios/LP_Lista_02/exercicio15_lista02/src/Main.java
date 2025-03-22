import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o raio de um cilindro");
        double raio = entrada.nextDouble();
        System.out.println("Digite a altura de um cilindro");
        double altura = entrada.nextDouble();
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("O volume do cilindro é: "+volume+"cm³");
        entrada.close();
    }
}