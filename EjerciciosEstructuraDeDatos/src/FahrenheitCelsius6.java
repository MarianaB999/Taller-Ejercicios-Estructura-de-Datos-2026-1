import java.util.Scanner;
public class FahrenheitCelsius6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la temperatura en grados fahrenheit: ");
        float fahrenheit = sc.nextFloat();
        float celsius = (fahrenheit - 32) * 5/9;
        System.out.println("la temperatura de fahrenheit a celcius es: " + celsius);
    }
}
