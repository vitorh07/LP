import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma medida em milímetro");
        double medida = entrada.nextDouble();
        System.out.println("A medida em polegadas é: "+medida / 25.4);
        entrada.close();
    }
}