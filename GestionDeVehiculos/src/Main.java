public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota", 2020, 1500);
        Vehiculo camion1   = new Camion("JKL012", "Scania", 2018, 5000, true);
        Vehiculo auto1     = new Auto("MNO345", "Honda", 2021, 800, 5);

        VehiculoPrinter.imprimir(vehiculo1);
        System.out.println("----------------");
        VehiculoPrinter.imprimir(camion1);
        System.out.println("----------------");
        VehiculoPrinter.imprimir(auto1);
    }
}
