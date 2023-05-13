package Modelos;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

public class Alquiler {

    private LocalDateTime fechaInicio;
    private Sucursal sucursalInicio;
    private Date fechaFinal;
    private Sucursal sucursalFinal;
    private Cliente cliente;
    private Vehiculo vehiculo;

    private int monto;

    public static final Integer COSTOKILOMETRO = 50;

    public Alquiler() {
    }

    public Alquiler(Sucursal sucursalInicio, Date fechaFinal, Sucursal sucursalFinal, Cliente cliente, Vehiculo vehiculo) {

        if (cliente.getPoseeRegistro() == Boolean.TRUE){
            this.fechaInicio = LocalDateTime.now();
            this.sucursalInicio = sucursalInicio;
            this.fechaFinal = fechaFinal;
            this.sucursalFinal = sucursalFinal;
            this.cliente = cliente;
            this.vehiculo = vehiculo;
            this.monto = calcularMonto();
        }
        else {
            System.out.println("El cliente no es valido - No posee Registro");
        }
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Sucursal getSucursalInicio() {
        return sucursalInicio;
    }

    public void setSucursalInicio(Sucursal sucursalInicio) {
        this.sucursalInicio = sucursalInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Sucursal getSucursalFinal() {
        return sucursalFinal;
    }

    public void setSucursalFinal(Sucursal sucursalFinal) {
        this.sucursalFinal = sucursalFinal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "fechaInicio=" + fechaInicio +
                ", sucursalInicio=" + sucursalInicio +
                ", fechaFinal=" + fechaFinal +
                ", sucursalFinal=" + sucursalFinal +
                ", cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                '}';
    }

    public int calcularMonto(){

        Random n = new Random();
        int kilometros = n.nextInt(3000 - 100+1) +100;
        int dias =(int) (this.fechaFinal.getTime() - this.fechaInicio.getDayOfMonth());

        int monto = kilometros * COSTOKILOMETRO + this.vehiculo.getTarifaFija() * dias;
        return monto;
    }
}
