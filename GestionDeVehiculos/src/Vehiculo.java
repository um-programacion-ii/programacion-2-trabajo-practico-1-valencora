public class Vehiculo {
    private String patente;
    private String marca;
    private int anio;
    private double capacidadCargaKg;

    // Constantes para validaciones.
    public static final int MIN_ANIO = 1900;
    public static final int MAX_ANIO = java.time.Year.now().getValue();

    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg) {
        if (patente == null || patente.isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser null ni vacía.");
        }
        if (anio < MIN_ANIO || anio > MAX_ANIO) {
            throw new IllegalArgumentException("El año debe estar entre " + MIN_ANIO + " y " + MAX_ANIO);
        }
        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser un valor positivo.");
        }

        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if (patente == null || patente.isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser null ni vacía.");
        }
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio < MIN_ANIO || anio > MAX_ANIO) {
            throw new IllegalArgumentException("El año debe estar entre " + MIN_ANIO + " y " + MAX_ANIO);
        }
        this.anio = anio;
    }

    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    public void setCapacidadCargaKg(double capacidadCargaKg) {
        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser un valor positivo.");
        }
        this.capacidadCargaKg = capacidadCargaKg;
    }

}
