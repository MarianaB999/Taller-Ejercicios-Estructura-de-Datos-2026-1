public class Persona {
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private int añoNacimiento;
    private String paisNacimiento;
    private char genero;

    public Persona (String nombre, String apellido, String numeroDocumento,int añoNacimiento, String paisNacimiento,char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.añoNacimiento = añoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    public void mostrarInformacion () {
        System.out.println("El nombre de la persona es: " + this.nombre);
        System.out.println("El apellido de la persona es: " + this.apellido);
        System.out.println("E numero de documento de la persona es: " + this.numeroDocumento);
        System.out.println("El año de nacimiento de la persona es: " + this.añoNacimiento);
        System.out.println("El pais de nacimiento de la persona es: " + paisNacimiento);
        System.out.println("El genero de la persona es: " + this.genero);
    }

    public static void main(String[]args) {
        Persona sofia = new Persona("Sofia", "Bolivar", "1027803798", 
        2006, "Grecia", 'F');
        Persona julio = new Persona("Julio", "Buritica", "70783798", 
        1970, "Colombia", 'M');
        sofia.mostrarInformacion();
        julio.mostrarInformacion();
    }
}
