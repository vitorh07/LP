import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int year;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        name = entrada.next();
        System.out.print("Digite sua data de nascimento: ");
        year = entrada.nextInt();
        gerarSaudacao(name, year);
        gerarMenu();
    }

    public static void gerarMenu(){
        System.out.println("Menu:");
        System.out.println("Opção 1");
        System.out.println("Opção 2");
        System.out.println("Opção 3");
    }

    public static void gerarSaudacao(String user, int year){
        System.out.println("Bem vindo "+user);
        System.out.println("Você tem: "+calcularIdade(year)+" anos.");
    }

    public static int calcularIdade(int year){
        return 2025-year;
    }
}