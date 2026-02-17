import java.util.Scanner;

public class Edad10Años2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu edad?");
        int edad = sc.nextInt();
        System.out.println("Tu edad en 10 años sera: " + (edad+10));
    }
}
