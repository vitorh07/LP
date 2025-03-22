import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite duas notas (0-100): ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int media = (num1 + num2) / 2;
        if(media < 50){
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
        entrada.close();
    }
}