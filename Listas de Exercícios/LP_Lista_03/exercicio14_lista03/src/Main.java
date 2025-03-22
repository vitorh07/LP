import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o valor da compra: ");
        double valor = entrada.nextDouble();
        System.out.println("----------------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Débito");
        System.out.println("    2. Pix");
        System.out.println("    3. Crédito");
        System.out.println("----------------------------------");
        System.out.print("Escolha a forma de pagamento: ");
        int opcao = entrada.nextInt();
        System.out.println("----------------------------------");
        switch (opcao){
            case 1:
                System.out.println("Débito selecionado");
                System.out.println("----------------------------------");
                System.out.println("Valor final da compra: R$ "+valor*0.95);
                break;
            case 2:
                System.out.println("Pix selecionado");
                System.out.println("----------------------------------");
                System.out.println("Valor final da compra: R$ "+valor*0.90);
                break;
            case 3:
                System.out.println("Crédito selecionado");
                System.out.println("----------------------------------");
                System.out.print("Escolha o número de parcelas: ");
                int parcelas = entrada.nextInt();
                if(parcelas <= 4){
                    System.out.println("Valor final da compra: R$ "+valor*1.02);
                } else if(parcelas < 10){
                    System.out.println("Valor final da compra: R$ "+valor*1.05);
                } else{
                    System.out.println("A quantidade de parcelas é inválida, o máximo é 10x e o mínimo é 1x");
                }
                break;
        }
        entrada.close();
    }
}