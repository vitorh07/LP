import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("    1. Círculo");
        System.out.println("    2. Triangulo Retângulo");
        System.out.println("    3. Retângulo");
        System.out.println("--------------------------");
        System.out.print("Escolha uma opção: ");
        int opcao = entrada.nextInt();
        System.out.println("--------------------------");
        switch (opcao){
            case 1:
                System.out.print("Informe o raio: ");
                int raio = entrada.nextInt();
                System.out.println("--------------------------");
                System.out.println("Área = "+(Math.PI*Math.pow(raio,2)));
                System.out.println("Perímetro = "+2*Math.PI*raio);
                break;
            case 2:
                System.out.print("Informe a base: ");
                int baseT = entrada.nextInt();
                System.out.print("Informe a altura: ");
                int alturaT = entrada.nextInt();
                System.out.print("Informe a hipotenusa: ");
                int hipo = entrada.nextInt();
                System.out.println("--------------------------");
                System.out.println("Área = "+(baseT*alturaT)/2);
                System.out.println("Perímetro = "+(baseT+alturaT+hipo));
                break;
            case 3:
                System.out.print("Informe a base: ");
                int baseR = entrada.nextInt();
                System.out.print("Informe a altura: ");
                int alturaR = entrada.nextInt();
                System.out.println("--------------------------");
                System.out.println("Área = "+baseR*alturaR);
                System.out.println("Perímetro = "+((baseR*2)+(alturaR*2)));
                break;
        }
        entrada.close();
    }
}