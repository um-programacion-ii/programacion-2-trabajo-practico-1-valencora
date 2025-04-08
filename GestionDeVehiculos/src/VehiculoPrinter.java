public class VehiculoPrinter {

    public static void imprimir(Vehiculo vehiculo) {
        System.out.println("Vehículo (desde VehiculoPrinter):");
        System.out.println("  Patente: " + vehiculo.getPatente());
        System.out.println("  Marca: " + vehiculo.getMarca());
        System.out.println("  Año: " + vehiculo.getAnio());
        System.out.println("  Capacidad de carga: " + vehiculo.getCapacidadCargaKg() + " kg");
    }
}
