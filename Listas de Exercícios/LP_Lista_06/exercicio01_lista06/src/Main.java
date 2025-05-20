import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;

        do{
            System.out.println("Digite um inteiro maior que zero: ");
            n = entrada.nextInt();
        } while (n<=0);

        System.out.println("A soma dos antecessores de "+n+" é " + somarN(n));
    }

    public static int somarN(int n){
        if(n == 1)
            return 1;
        return n + somarN(n-1);
    }
}