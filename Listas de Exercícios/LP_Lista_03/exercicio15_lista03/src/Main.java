import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o dinheiro: ");
        double valor = entrada.nextDouble();
        System.out.println("------------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Café Expresso R$ 0,50");
        System.out.println("    2. Café Longo R$ 1,00");
        System.out.println("    3. Capuccino R$ 2,50");
        System.out.println("    4. Chocolate R$ 2,00");
        System.out.println("------------------------------");
        System.out.print("Escolha uma opção: ");
        int opcao = entrada.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Bebida selecionada: Café Expresso");
                if (valor >= 0.5){
                    System.out.println("Seu troco: R$ "+(valor-0.5));
                } else{
                    System.out.println("Valor insuficiente");
                }
                break;
            case 2:
                System.out.println("Bebida selecionada: Café Longo");
                if (valor >= 1){
                    System.out.println("Seu troco: R$ "+(valor-1));
                } else{
                    System.out.println("Valor insuficiente");
                }
                break;
            case 3:
                System.out.println("Bebida selecionada: Capuccino");
                if (valor >= 2.5){
                    System.out.println("Seu troco: R$ "+(valor-2.5));
                } else{
                    System.out.println("Valor insuficiente");
                }
                break;
            case 4:
                System.out.println("Bebida selecionada: Chocolate");
                if (valor >= 2){
                    System.out.println("Seu troco: R$ "+(valor-2));
                } else{
                    System.out.println("Valor insuficiente");
                }
                break;
        }
        entrada.close();
    }
}