import java.util.Scanner;
public class AsociacionVinicultores23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el precio inicial: ");
        double precioInicial = sc.nextDouble();

        System.out.println("ingrese la cantidad de kilos llevados: ");
        double kilosLlevados = sc.nextDouble();

        System.out.println ("Ingrese el tipo de uva (A o B): ");
        String tipoUva = sc.next();

        System.out.println("Ingrese el tamaño de la uva (1 o 2): ");
        byte tamañoUva = sc.nextByte();

        switch (tipoUva) {
            case "A":
                if (tamañoUva == 1) {
                    double precioFinal = (precioInicial + 0.20)*kilosLlevados;
                    System.out.println("El precio final es: " + precioFinal);
                } else if (tamañoUva == 2) {
                    double precioFinal = (precioInicial + 0.30)*kilosLlevados;
                    System.out.println("El precio final es: " + precioFinal);
                } else {
                    System.out.println("Tamaño de uva no valido");
                }
                break;

            case "B":
                if (tamañoUva == 1) {
                    double precioFinal = (precioInicial - 0.30)*kilosLlevados;
                    System.out.println("El precio final es: " + precioFinal);
                } else if (tamañoUva == 2) {
                    double precioFinal = (precioInicial - 0.50)*kilosLlevados;
                    System.out.println("El precio final es: " + precioFinal);
                } else {
                    System.out.println("Tamaño de uva no valido");
                }
                break;
            default:
                System.out.println("Tipo de uva no valido");
        }
    }
}
