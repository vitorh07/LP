public class Main {
    public static void main(String[] args) {
        int[][] matriz1 = {
                {1, 2},
                {1, 2},
                {1, 2}
        };

        int[][] matriz2 = {
                {1, 2},
                {1, 2}
        };

        int[][] produto = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                produto[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    produto[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("Matriz Produto:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(produto[i][j] + " ");
            }
            System.out.println();
        }
    }
}
