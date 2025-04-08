public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota", 2020, 1500);
        Vehiculo vehiculo2 = new Vehiculo("DEF456", "Ford", 2019, 1800);
        Vehiculo vehiculo3 = new Vehiculo("GHI789", "Chevrolet", 2021, 1300);

        vehiculo1.mostrarInformacion();
        System.out.println("----------------");
        vehiculo2.mostrarInformacion();
        System.out.println("----------------");
        vehiculo3.mostrarInformacion();
    }
}
