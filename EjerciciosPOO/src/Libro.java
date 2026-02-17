import java.util.Scanner;
public class Libro {
   Scanner sc = new Scanner(System.in);
   private String titulo;
   private String autor;
   private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
         this.titulo = titulo;
         this.autor = autor;
         this.añoPublicacion = añoPublicacion;
    }

    public void mostrarInformacion() {
        System.out.println("El titulo del libro es: " + this.titulo);
        System.out.println("El autor del libro es: " + this.autor);
        System.out.println("El año de publicación del libro es: " + this.añoPublicacion);
    }

    public void cambiarAñoPublicacion() {
        System.out.println("Ingrese el nuevo año de publicación:");
        int nuevoAño = sc.nextInt();
        this.añoPublicacion = nuevoAño;
        System.out.println("El nuevo año de publicación es: " + this.añoPublicacion);
    }
    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605);

        libro1.mostrarInformacion();
        libro1.cambiarAñoPublicacion();
        libro1.mostrarInformacion();
        System.out.println();
        libro2.mostrarInformacion();
        libro2.cambiarAñoPublicacion();
        libro2.mostrarInformacion();
    }
}

