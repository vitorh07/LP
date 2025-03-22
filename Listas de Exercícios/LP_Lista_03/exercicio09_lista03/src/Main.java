import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 3 valores inteiros:");
        int ladoA = entrada.nextInt();
        int ladoB = entrada.nextInt();
        int ladoC = entrada.nextInt();
        if ((ladoA < ladoB + ladoC && ladoA > Math.abs(ladoB - ladoC)) &&
                (ladoB < ladoA + ladoC && ladoB > Math.abs(ladoA - ladoC)) &&
                (ladoC < ladoA + ladoB && ladoC > Math.abs(ladoA - ladoB))) {
            if(ladoA == ladoB && ladoB == ladoC){
                System.out.println("Triângulo equilátero");
            } else if(ladoA == ladoB || ladoB == ladoC || ladoA == ladoC){
                System.out.println("Triângulo isóceles");
            } else{
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Os valores informados NÃO podem formar um triângulo.");
        }

        entrada.close();
    }
}
