import java.util.Scanner;
public class Planeta {
    private Scanner sc = new Scanner(System.in);
    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaMediaAlSol;

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaMediaAlSol) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaAlSol = distanciaMediaAlSol;
    }

    public void llenarInformarcion() {
        System.out.println("Ingrese el nombre del planeta:");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese la cantidad de satelites del planeta:");
        this.cantidadSatelites = sc.nextInt();
        System.out.println("Ingrese la masa del planeta:");
        this.masa = sc.nextDouble();
        System.out.println("Ingrese el volumen del planeta:");
        this.volumen = sc.nextDouble();
        System.out.println("Ingrese el diametro del planeta:");
        this.diametro = sc.nextInt();
        System.out.println("Ingrese la distancia media al sol del planeta:");
        this.distanciaMediaAlSol = sc.nextInt();
    }

    public void mostrarInformacion() {
        System.out.println("El nombre del planeta es: " + this.nombre);
        System.out.println("La cantidad de satelites del planeta es: " + this.cantidadSatelites);
        System.out.println("La masa del planeta es: " + this.masa);
        System.out.println("El volumen del planeta es: " + this.volumen);
        System.out.println("El diametro del planeta es: " + this.diametro);
        System.out.println("La distancia media al sol del planeta es: " + this.distanciaMediaAlSol);
    }
    public static void main(String[] args) {
        Planeta planeta1 = new Planeta(null, 0, 0, 0, 0, 0);
        planeta1.llenarInformarcion();
        planeta1.mostrarInformacion();
    }
}
