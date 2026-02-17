import java.util.Scanner;
public class DineroVendedor8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ingresa el sueldo base del vendedor: ");
    float sueldoBase = sc.nextFloat();
    System.out.println("ingresa el valor de la venta 1: ");
    float venta1 = sc.nextFloat();
    System.out.println("ingresa el valor de la venta 2: ");
    float venta2 = sc.nextFloat();  
    System.out.println("ingresa el valor de la venta 3: ");
    float venta3 = sc.nextFloat();

    float comisionTotal = (venta1 + venta2 + venta3) * 0.10f;
    float sueldoTotal = sueldoBase + comisionTotal;
    System.out.println("el sueldo total que obtendra el vendedor es: " + sueldoTotal);
  }  
}
