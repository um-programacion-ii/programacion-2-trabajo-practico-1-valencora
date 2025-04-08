public class VehiculoPrinter {

    public static void imprimir(Vehiculo vehiculo) {

        System.out.println("Vehículo:");
        System.out.println("  Patente: " + vehiculo.getPatente());
        System.out.println("  Marca: " + vehiculo.getMarca());
        System.out.println("  Año: " + vehiculo.getAnio());
        System.out.println("  Capacidad de carga: " + vehiculo.getCapacidadCargaKg() + " kg");

        if (vehiculo instanceof Camion) {
            Camion camion = (Camion) vehiculo;
            System.out.println("  ¿Tiene acoplado?: " + (camion.isTieneAcoplado() ? "Sí" : "No"));
        }
    }
}