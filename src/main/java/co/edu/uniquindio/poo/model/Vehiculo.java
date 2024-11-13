package co.edu.uniquindio.poo.model;

public abstract class Vehiculo {
    private String marca, modelo, matricula;
    private int cambios;
    private double velocidadMaxima, cilindraje;
    private Enum<EnumTransmision> transmision;
    private boolean esNuevo;
    private RevisionTecnica revisionTecnica;
    private double precio;
    private boolean disponible;

    public Vehiculo(String marca, String modelo, String matricula, int cambios, double velocidadMaxima, double cilindraje,
            Enum<EnumTransmision> transmision, boolean esNuevo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.transmision = transmision;
        this.esNuevo = esNuevo;
        this.precio = precio;
        this.disponible = false;
        this.matricula = matricula;
    }
    public boolean pasaRevisionTecnica(){
        boolean sentinela = false;
        if(revisionTecnica.isAprobado()){
           sentinela = true;
        } return sentinela;

    }
    public void revisionTecnica(RevisionTecnica revision) {
        setRevisionTecnica(revision);
        setDisponible(true);
        System.out.println("Se ha completado la revision Tecnica");

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public Enum<EnumTransmision> getTransmision() {
        return transmision;
    }

    public void setTransmision(Enum<EnumTransmision> transmision) {
        this.transmision = transmision;
    }

    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }

    public RevisionTecnica getRevisionTecnica() {
        return revisionTecnica;
    }

    public void setRevisionTecnica(RevisionTecnica revisionTecnica) {
        this.revisionTecnica = revisionTecnica;
    }

}
