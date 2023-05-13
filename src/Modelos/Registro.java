package Modelos;

import constantes.TipoVehiculo;

import java.util.ArrayList;
import java.util.Objects;

public class Registro {

    private ArrayList<Alquiler> registrointerno;

    public Registro() {
    }

    public Registro(ArrayList<Alquiler> registrointerno) {
        this.registrointerno = registrointerno;
    }

    public ArrayList<Alquiler> getRegistrointerno() {
        return registrointerno;
    }

    public void setRegistrointerno(ArrayList<Alquiler> registrointerno) {
        this.registrointerno = registrointerno;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "registrointerno=" + registrointerno +
                '}';
    }

    public void encontrarMayorMontoAlquiler(){

        Alquiler aux;

        int valor = 0;

        aux = this.registrointerno.get(valor);

        while (valor<this.registrointerno.size()){

            if(registrointerno.get(valor).getMonto()> aux.getMonto()){

                aux=registrointerno.get(valor);
            }

            valor++;
        }

        System.out.println(aux.toString());
        }

        public void cantidadDeAlquileres(){

        int cantidadDosPuertas = 0;
        int cantidadCuatroPuertas = 0;
        int cantidadCamioneta = 0;
        int aux = 0;

        while (aux<this.registrointerno.size()){

            if(this.registrointerno.get(aux).getVehiculo().getTipoVehiculo() == TipoVehiculo.CAMIONETA){
                cantidadCamioneta = cantidadCamioneta + 1;
            }
            else if (this.registrointerno.get(aux).getVehiculo().getTipoVehiculo() == TipoVehiculo.CUATROPUERTAS){
                cantidadCuatroPuertas = cantidadCuatroPuertas + 1;
            }
            else {
                cantidadDosPuertas = cantidadDosPuertas +1;
            }
            }
        }

}

