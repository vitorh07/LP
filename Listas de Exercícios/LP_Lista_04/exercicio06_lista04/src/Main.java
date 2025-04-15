import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira o primeiro número inteiro");
        int num1 = entrada.nextInt();
        System.out.println("Insira o segundo número inteiro");
        int num2 = entrada.nextInt();
        if (num1 > num2){
            for (int i=(num1-1); i>num2; i--){
                System.out.println(i);
            }
        } else if(num2 > num1){
            for (int i=(num2-1); i>num1; i-- ){
                System.out.println(i);
            }
        } else{
            System.out.println("Os números são iguais");
        }
    }
}