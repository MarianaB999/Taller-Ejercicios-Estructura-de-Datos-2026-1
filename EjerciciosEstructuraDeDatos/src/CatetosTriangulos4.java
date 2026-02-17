import java.util.Scanner;
public class CatetosTriangulos4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el valor del cateto 1: ");
        float cateto1 = sc.nextFloat();
        System.out.println("ingrese el valor del cateto 2: ");
        float cateto2 = sc.nextFloat();

        float hipotenusa = (float) Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2, 2));
        System.out.println("El valor de la hipotenusa es: " + hipotenusa);
    }
}
