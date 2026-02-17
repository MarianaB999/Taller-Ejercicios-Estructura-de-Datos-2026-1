import java.util.Scanner;
public class DistanciaPuntos11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer par de numeros en cm: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.println("ingrese el segundo par de numeros en cm: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("la distancia entre los puntos es: " + distancia + " cm");
    }
}