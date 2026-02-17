import java.util.Scanner;

public class PerimetroAreaRectangulo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Ingrese la medida de la base del rectangulo: ");
        float base = sc.nextFloat();
        System.out.println("Ingrese la altura del rectangulo");
        float altura = sc.nextFloat();

        float perimetro = (base*2)+(altura*2);
        float area = base * altura;

        System.out.println("El area del rectangulo es: " + area + " y su perimetro es: " + perimetro);
    }
}
