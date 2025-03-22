import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número real");
        double num = entrada.nextDouble();
        if (num > 0){
            double raiz = Math.sqrt(num);
            System.out.println("Raiz quadrada: "+raiz);
        } else {
            System.out.println("Valor inválido!");
        }
        entrada.close();
    }
}