import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a base (valor inteiro): ");
        x = entrada.nextInt();

        do{
            System.out.print("Digite o expoente (valor inteiro maior ou igual a 0): ");
            y = entrada.nextInt();
        }while(y<0);

        System.out.println(x + "^" + y +" = "+ pow(x, y));
    }

    public static int pow(int x, int y){
        if(y==0)
            return 1;
        int result = x;
        for(;y>1;y--){
            result*=x;
        }
        return result;
    }
}