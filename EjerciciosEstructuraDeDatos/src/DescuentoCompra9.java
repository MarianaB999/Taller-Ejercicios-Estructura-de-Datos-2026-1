import java.util.Scanner;
public class DescuentoCompra9 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el total de la compra: ");
        float totalCompra = sc.nextFloat();

        float descuento = totalCompra * 0.15f;
        float totalPagar = totalCompra - descuento;
        System.out.println("el total a pagar con el descuento del 15% es: " + totalPagar);
    }
}
