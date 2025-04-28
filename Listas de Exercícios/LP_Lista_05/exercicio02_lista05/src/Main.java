public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1,1,1,1,1,1};
        for(int i = 0; i <= 9; i++) {
            if (i % 2 == 0){
                numbers[i] = numbers[i] + 2;
                System.out.println(numbers[i]);
            } else{
                numbers[i] = numbers[i] * 2;
                System.out.println(numbers[i]);
            }
        }
    }
}