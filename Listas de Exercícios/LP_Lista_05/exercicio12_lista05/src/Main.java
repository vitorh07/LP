public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {2, 3, 1},
                {4, 1, 5},
                {7, 2, 6}
        };

        int somaPrincipal = 0;
        int somaSecundaria = 0;

        for (int i = 0; i < 3; i++) {
            somaPrincipal += matriz[0][i % 3] * matriz[1][(i + 1) % 3] * matriz[2][(i + 2) % 3];
        }

        for (int i = 0; i < 3; i++) {
            somaSecundaria += matriz[0][(2 - i + 3) % 3] * matriz[1][(1 - i + 3) % 3] * matriz[2][(3 - i) % 3];
        }

        int determinante = somaPrincipal - somaSecundaria;

        System.out.println("Determinante da matriz 3x3: " + determinante);
    }
}
