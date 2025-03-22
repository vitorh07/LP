import com.sun.jdi.LocalVariable;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Digite duas notas (0-10): ");
        double num1 = entrada.nextDouble();
        double num2 = entrada.nextDouble();
        double media = (num1 + num2) / 2;
        if(media >= 8.5){
            System.out.println("A");
        } else if(media < 8.5 && media >= 7){
            System.out.println("B");
        } else if(media >= 5){
            System.out.println("C");
        } else if(media < 5){
            System.out.println("D");
        } else{
            System.out.println("Nota inválida");
        }
        entrada.close();
    }
}