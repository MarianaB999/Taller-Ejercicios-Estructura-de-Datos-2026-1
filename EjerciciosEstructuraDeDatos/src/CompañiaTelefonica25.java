import java.util.Scanner;
public class CompañiaTelefonica25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuanto tiempo duro la llamada en minutos?: ");
        int duracion = sc.nextInt();
        System.out.println("Es domingo? (si/no): ");
        String dia = sc.next();
        double precio = 0;
        double impuesto = 0;

        if (duracion <= 5){
             precio = 1; 
        } else if (duracion <= 8) {
             precio = 1.80f;
        } else if (duracion <=10) {
             precio = 2.5f;
        } else {
             precio = 2.5f + (duracion - 10) * 0.50f;
        }

        if (dia.equalsIgnoreCase("si")) {
            impuesto = precio * 0.03f;
        } else {
            System.out.println("ingrese el turno (mañana/tarde):");
            String turno = sc.next();
            if (turno.equalsIgnoreCase("mañana")){
                impuesto = precio * 0.15f;
            } else if (turno.equalsIgnoreCase("tarde")){
                impuesto = precio * 0.10f;
            } else {
                System.out.println("ingresaste un turno no valido");
            }
        }

        double total = precio + impuesto;
        
        System.out.println("el precio total de la llamada es: " + total + " con un impuesto de: " 
            + impuesto + " y un precio base de: " + precio);
    }
}
