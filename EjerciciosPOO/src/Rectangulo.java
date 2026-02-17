public class Rectangulo {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularArea() {
        double area = ancho * alto;
        System.out.println("El area del rectangulo es: " + area);
        return area;
    }

    public double calcularPerimetro() {
        double perimetro = 2 * (ancho + alto);
        System.out.println("EL perimetro del rectangulo es: " + perimetro);
        return perimetro;
    }
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(5, 3);
        Rectangulo rectangulo2 = new Rectangulo(7.5, 4.5);

        rectangulo1.calcularArea();
        rectangulo1.calcularPerimetro();
        rectangulo2.calcularArea();
        rectangulo2.calcularPerimetro();
    }
}
