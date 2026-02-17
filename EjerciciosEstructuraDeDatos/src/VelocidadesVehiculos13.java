import java.util.Scanner;
public class VelocidadesVehiculos13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la velocidad del primer vehiculo en km/h: ");
        double velocidad1 = sc.nextDouble();
        System.out.println("ingrese la velocidad del segundo vehiculo en km/h: ");
        double velocidad2 = sc.nextDouble();
        System.out.println("Ingrese la distancia entre los dos vehiculos metros: ");
        double distancia = sc.nextDouble();

        if (velocidad1 > velocidad2) {
            double tiempo = distancia / (velocidad1 - velocidad2);
            System.out.println("El primer vehiculo alcanzara al segundo en: " + tiempo*60 + " minutos");
        } else if (velocidad2 > velocidad1) {
            double tiempo = distancia / (velocidad2 - velocidad1);
            System.out.println("El segundo vehiculo alcanzara al primero en: " + tiempo*60 + " minutos");
        } else {
            System.out.println("Los vehiculos tienen la misma velocidad, nunca se alcanzaran o van iguales");
        }
    }
}
