package Modelos;

public class Cliente {

    private String nombreCompleto;
    private String dni;
    private Boolean poseeRegistro;

    public Cliente() {
    }

    public Cliente(String nombreCompleto, String dni, Boolean poseeRegistro) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.poseeRegistro = poseeRegistro;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Boolean getPoseeRegistro() {
        return poseeRegistro;
    }

    public void setPoseeRegistro(Boolean poseeRegistro) {
        this.poseeRegistro = poseeRegistro;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", dni='" + dni + '\'' +
                ", poseeRegistro=" + poseeRegistro +
                '}';
    }
}
