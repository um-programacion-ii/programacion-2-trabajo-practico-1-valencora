public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota", 2020, 1500);
        Camion camion1    = new Camion("JKL012", "Scania", 2018, 5000, true);

        VehiculoPrinter.imprimir(vehiculo1);
        System.out.println("----------------");
        VehiculoPrinter.imprimir(camion1);
    }
}
