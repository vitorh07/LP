import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma temperatura em celcius: ");
        double temp = entrada.nextDouble();
        double fah = (temp * 9/5) + 32;
        System.out.println("A temperatura em fahrenheit é: "+fah);
        entrada.close();
    }
}