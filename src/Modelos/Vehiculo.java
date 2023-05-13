package Modelos;

public class Vehiculo {

    private String modelo;
    private Integer kilometraje;
    private Integer año;
    private Integer codigoInterno;
    private Integer tarifaFija;

    private String tipoVehiculo;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, Integer kilometraje, Integer año, Integer codigoInterno, Integer tarifaFija, String tipoVehiculo) {
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.año = año;
        this.codigoInterno = codigoInterno;
        this.tarifaFija = tarifaFija;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Integer kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public Integer getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(Integer codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public Integer getTarifaFija() {
        return tarifaFija;
    }

    public void setTarifaFija(Integer tarifaFija) {
        this.tarifaFija = tarifaFija;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "modelo='" + modelo + '\'' +
                ", kilometraje=" + kilometraje +
                ", año=" + año +
                ", codigoInterno=" + codigoInterno +
                ", tarifaFija=" + tarifaFija +
                ", tipoVehiculo='" + tipoVehiculo + '\'' +
                '}';
    }
}
