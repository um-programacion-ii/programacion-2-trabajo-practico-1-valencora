import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("ABC123", "Toyota", 2020, 1500));
        vehiculos.add(new Camion("JKL012", "Scania", 2018, 5000, true));
        vehiculos.add(new Auto("MNO345", "Honda", 2021, 800, 5));

        for (Vehiculo v : vehiculos) {
            VehiculoPrinter.imprimir(v);
            System.out.println("----------------");
        }
    }
}
