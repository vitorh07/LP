public class Main {
    public static void main(String[] args) {
        int [] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] v2 = new int[10];
        for (int i = 0; i < 10; i++) {
            v2[i] = v1[v1.length - 1 - i];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("v1 = "+ v1[i]);
        }
        System.out.println("--------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println("v2 = "+ v2[i]);
        }
    }
}