import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = entrada.nextInt();
        boolean primo = true;
        if(num <= 1){
            primo = false;
        } else{
            for (int i=2; i<num; i++){
                if(num % i == 0){
                    primo = false;
                }
            }
        }
        if(primo){
            System.out.println(num + " é primo");
        } else {
            System.out.println(num + " não é primo");
        }
    }
}