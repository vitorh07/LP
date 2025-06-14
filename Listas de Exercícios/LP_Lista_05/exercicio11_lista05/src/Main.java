import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe linhas e colunas da 1ª matriz (li1 col1): ");
        int li1 = sc.nextInt();
        int col1 = sc.nextInt();

        System.out.print("Informe linhas e colunas da 2ª matriz (li2 col2): ");
        int li2 = sc.nextInt();
        int col2 = sc.nextInt();

        if (col1 != li2) {
            System.out.println("\nNão é possível multiplicar: "
                    + "colunas da 1ª matriz (" + col1 + ") "
                    + "≠ linhas da 2ª matriz (" + li2 + ").");
            return;
        }

        int[][] matriz1 = new int[li1][col1];
        int[][] matriz2 = new int[li2][col2];

        System.out.println("\nDigite os elementos da 1ª matriz (" + li1 + "x" + col1 + "):");
        for (int i = 0; i < li1; i++) {
            for (int j = 0; j < col1; j++) {
                matriz1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nDigite os elementos da 2ª matriz (" + li2 + "x" + col2 + "):");
        for (int i = 0; i < li2; i++) {
            for (int j = 0; j < col2; j++) {
                matriz2[i][j] = sc.nextInt();
            }
        }

        int[][] matrizProduto = new int[li1][col2];
        for (int i = 0; i < li1; i++) {
            for (int j = 0; j < col2; j++) {
                int soma = 0;
                for (int k = 0; k < col1; k++) {
                    soma += matriz1[i][k] * matriz2[k][j];
                }
                matrizProduto[i][j] = soma;
            }
        }

        System.out.println("\nMatriz produto (" + li1 + "x" + col2 + "):");
        for (int i = 0; i < li1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.printf("%d ", matrizProduto[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
