import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int resposta;
        boolean status = true;
        System.out.println("Jogo da Tabuada");
        System.out.println("----------------------");
        System.out.println("Começar? (S ou N)");
        char opcao = entrada.next().charAt(0);
        while (opcao == 'S') {
            status = true;
            System.out.println("Começando");
            for (int i = 1; i <= 10; i++) {
                for (int j = 0; j <= 10; j++) {
                    System.out.print(i + " x " + j + " = ");
                    resposta = entrada.nextInt();
                    int resultado = i * j;
                    if (resposta == resultado) {
                        continue;
                    } else {
                        status = false;
                        break;
                    }
                }
                if (!status) {
                    System.out.println("Você perdeu!");
                    opcao = 'N';
                    break;
                } else if(i < 10){
                    System.out.println("Deseja continuar? (S ou N)");
                    opcao = entrada.next().charAt(0);
                    continue;
                }

            }
            if (status){
                System.out.println("Parabéns, você ganhou!");
                break;
            }
        }
    }
}