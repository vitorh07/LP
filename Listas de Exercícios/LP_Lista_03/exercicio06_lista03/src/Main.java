import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número (5-9): ");
        int opcao = entrada.nextInt();

        switch (opcao){
            case 5:
                System.out.println("Você escolheu 5");
                break;
            case 6:
                System.out.println("Você escolheu 6");
                break;
            case 7:
                System.out.println("Você escolheu 7");
                break;
            case 8:
                System.out.println("Você escolheu 8");
                break;
            case 9:
                System.out.println("Você escolheu 9");
                break;
            default:
                System.out.println("Opção inválida");
        }
        entrada.close();
    }
}