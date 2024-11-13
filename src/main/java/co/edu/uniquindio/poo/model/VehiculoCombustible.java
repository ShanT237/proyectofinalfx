package co.edu.uniquindio.poo.model;

public abstract class VehiculoCombustible extends Vehiculo {
    private double capacidadCombustible;
    private double consumoPorKm;
    private Enum<EnumCombustible> tipoCombustible;

    

    public VehiculoCombustible(String marca, String modelo, String matricula, int cambios, double velocidadMaxima, double cilindraje,
            Enum<EnumTransmision> transmision, boolean esNuevo, double precio, double capacidadCombustible,
            double consumoPorKm, Enum<EnumCombustible> tipoCombustible) {
        super(marca, modelo, matricula, cambios, velocidadMaxima, cilindraje, transmision, esNuevo, precio);
        this.capacidadCombustible = capacidadCombustible;
        this.consumoPorKm = consumoPorKm;
        this.tipoCombustible = tipoCombustible;
    }


    public double getCapacidadCombustible() {
        return capacidadCombustible;
    }


    public void setCapacidadCombustible(double capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }


    public double getConsumoPorKm() {
        return consumoPorKm;
    }


    public void setConsumoPorKm(double consumoPorKm) {
        this.consumoPorKm = consumoPorKm;
    }


    public Enum<EnumCombustible> getTipoCombustible() {
        return tipoCombustible;
    }


    public void setTipoCombustible(Enum<EnumCombustible> tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    } 

    

    
}
