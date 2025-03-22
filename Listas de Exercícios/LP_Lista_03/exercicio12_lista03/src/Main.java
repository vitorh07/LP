import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();
        System.out.println("------------------------------");
        System.out.println("Menu:");
        System.out.println("    1. Soma");
        System.out.println("    2. Subtração");
        System.out.println("    3. Multiplicação");
        System.out.println("    4. Divisão");
        System.out.println("------------------------------");
        System.out.print("Escolha uma opção: ");
        int opcao = entrada.nextInt();
        System.out.println("------------------------------");

        switch (opcao){
            case 1:
                System.out.println("Resultado: "+num1+ " + "+num2+" = "+(num1+num2));
                break;
            case 2:
                System.out.println("Resultado: "+num1+ " - "+num2+" = "+(num1-num2));
                break;
            case 3:
                System.out.println("Resultado: "+num1+ " * "+num2+" = "+(num1*num2));
                break;
            case 4:
                System.out.println("Resultado: "+num1+ " / "+num2+" = "+(num1/num2));
                break;
        }
        entrada.close();
    }
}