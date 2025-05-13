public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {5, 8, 12, 7, 6},
                {9, 4, 3, 5, 11},
                {13, 6, 2, 14, 9},
                {8, 11, 5, 1, 4},
                {3, 7, 9, 6, 10}
        };

        System.out.println("Diagonal Secundária:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length-1-i] + " ");
        }
    }
}
