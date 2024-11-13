package co.edu.uniquindio.poo.model;

public abstract class VehiculoElectrico extends Vehiculo {
    private double autonomiaCarga;
    private double tiempoPromedioCarga;


    public VehiculoElectrico(String marca, String modelo, String matricula, int cambios, double velocidadMaxima, double cilindraje,
            Enum<EnumTransmision> transmision, boolean esNuevo, double precio, double autonomiaCarga,
            double tiempoPromedioCarga) {
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, transmision, esNuevo, precio);
        this.autonomiaCarga = autonomiaCarga;
        this.tiempoPromedioCarga = tiempoPromedioCarga;
    }

    public double getAutonomiaCarga() {
        return autonomiaCarga;
    }

    public void setAutonomiaCarga(double autonomiaCarga) {
        this.autonomiaCarga = autonomiaCarga;
    }

    public double getTiempoPromedioCarga() {
        return tiempoPromedioCarga;
    }

    public void setTiempoPromedioCarga(double tiempoPromedioCarga) {
        this.tiempoPromedioCarga = tiempoPromedioCarga;
    }

}
