import java.util.Scanner;
public class NombreSaludar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa tu nombre");
        String nombre = sc.next();
        System.out.println("Hola, " + nombre); 
    }
}