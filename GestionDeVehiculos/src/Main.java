import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

        String patenteBuscada = "JKL012";
        Optional<Vehiculo> encontrado = vehiculos.stream()
                .filter(v -> v.getPatente().equalsIgnoreCase(patenteBuscada))
                .findFirst();

        if (encontrado.isPresent()) {
            System.out.println("Vehículo con patente " + patenteBuscada + " encontrado:");
            VehiculoPrinter.imprimir(encontrado.get());
        } else {
            System.out.println("No se encontró vehículo con la patente " + patenteBuscada);
        }
    }
}
