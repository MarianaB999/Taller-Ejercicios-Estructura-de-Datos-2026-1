import java.util.Scanner;
public class UsuarioContraseña17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contraseñaCorrecta = "contraseña123";
        String usuarioCorrecto = "usuario123";

        System.out.println("Ingrese su nombre de usuario:");
        String usuarioIngresado = sc.nextLine();
        System.out.println("Ingrese su contraseña:");
        String contraseñaIngresada = sc.nextLine();

        if (usuarioIngresado == usuarioCorrecto && contraseñaIngresada == contraseñaCorrecta) {
            System.out.println("Haz entrado al sistema");
        } else {
            System.out.println("Error, usuario o contraseña incorrectos");
        }
    }
}
