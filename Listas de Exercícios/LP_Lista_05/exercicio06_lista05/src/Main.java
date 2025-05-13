public class Main {
    public static void main(String[] args) {
        int [] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int aux;

        System.out.println("Array Original");
        for(int valor : numbers) {
            System.out.print(valor + " ");
        }

        for(int i = 0; i < numbers.length / 2; i++) {
            aux = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = numbers[i];
            numbers[i] = aux;
        }
        System.out.println();
        System.out.println("Array Invertida");
        for(int valor : numbers) {
            System.out.print(valor + " ");
        }
    }
}