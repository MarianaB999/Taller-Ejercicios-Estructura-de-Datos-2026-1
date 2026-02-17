import java.util.Scanner;
public class CuentaBancaria {
    Scanner sc = new Scanner(System.in);
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void consignarDinero(){
        System.out.println("ingrese el monto a consignar:");
        double consignar = sc.nextDouble();
        saldo += consignar;
        System.out.println("El nuevo saldo es: " + saldo);
    }

    public void retirarDinero(){
        System.out.println("ingrese el monto a retirar:");
        double retirar = sc.nextDouble();
        if (retirar > saldo) {
            System.out.println("No se puede retirar esa cantidad, saldo insuficiente.");
        } else {
            saldo -= retirar;
            System.out.println("El nuevo saldo es: " + saldo);
        }
    }

    public void consultarSaldo() {
        System.out.println("El saldo actual es: " + saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("123456789", "Juan Perez", 
        1000.0);

        cuenta1.consignarDinero();
        cuenta1.retirarDinero();
        cuenta1.consultarSaldo();
    }
}