import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a velocidade inicial");
        double veli = entrada.nextDouble();
        System.out.println("Digite a aceleração");
        double acel = entrada.nextDouble();
        System.out.println("Digite o tempo de percurso");
        double tempo = entrada.nextDouble();
        double velof = veli + acel * tempo;
        System.out.println("Velocidade final: "+velof);
        entrada.close();
    }
}