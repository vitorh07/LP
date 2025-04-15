public class Main {
    public static void main(String[] args) {
        System.out.println("Tabela de Conversão de Celsius para Fahrenheit");
        System.out.println("---------------------------------------------");
        System.out.println("Celsius\tFahrenheit");

        for (int celsius = -80; celsius <= 80; celsius += 10) {
            double fahrenheit = (9.0 / 5.0) * celsius + 32;

            System.out.printf("%3d\t%.1f\n", celsius, fahrenheit);
        }
    }
}
