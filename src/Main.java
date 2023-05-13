import Modelos.*;
import constantes.TipoVehiculo;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ArrayList listaOperaciones = new ArrayList<Alquiler>();
        Registro miLocal = new Registro(listaOperaciones);

        Sucursal localDelMar = new Sucursal("Mar del plata", "Bolivar 2343", "4758475");
        Sucursal localCapital = new Sucursal("Buenos Aires", "9 de Julio 2301", "5487645");
        Sucursal localMiramar = new Sucursal("Miramar", "Independencia 2145", "4895501");

        Vehiculo vehiculo1 = new Vehiculo("Toyota", 3200, 2004, 301, 200, TipoVehiculo.DOSPUERTAS);
        Vehiculo vehiculo2 = new Vehiculo("Falcon", 6400, 1999, 302, 500, TipoVehiculo.CUATROPUERTAS);
        Vehiculo vehiculo3 = new Vehiculo("Fiat", 97411, 2010, 303, 120, TipoVehiculo.DOSPUERTAS);
        Vehiculo vehiculo4 = new Vehiculo("Camaro", 25000, 2005, 304, 500, TipoVehiculo.CAMIONETA);
        Vehiculo vehiculo5 = new Vehiculo("Fiat", 40000, 2003, 305, 300, TipoVehiculo.CUATROPUERTAS);

        Cliente cliente1 = new Cliente("Carlos Martin", "20154879", Boolean.TRUE);
        Cliente cliente2 = new Cliente("Marta Bragado", "27945862", Boolean.FALSE);
        Cliente cliente3 = new Cliente("Ulises Smiriglio", "39541220", Boolean.TRUE);
        Cliente cliente4 = new Cliente("Camila Ruiz Diaz", "28457111", Boolean.TRUE);

        Alquiler operacion1 = new Alquiler(localDelMar, new Date("15/6/2023"), localCapital, cliente2, vehiculo3);
        Alquiler operacion2 = new Alquiler(localDelMar, new Date("06/08/2023"), localDelMar, cliente1, vehiculo5);
        Alquiler operacion3 = new Alquiler(localCapital, new Date("23/082023"), localMiramar, cliente3, vehiculo4);
        Alquiler operacion4 = new Alquiler(localMiramar, new Date("25/05/2023"), localMiramar, cliente4, vehiculo1);
        Alquiler operacion5 = new Alquiler(localMiramar, new Date("25/05/2023"), localMiramar, cliente4, vehiculo2);

        miLocal.getRegistrointerno().add(operacion1);
        miLocal.getRegistrointerno().add(operacion2);
        miLocal.getRegistrointerno().add(operacion3);
        miLocal.getRegistrointerno().add(operacion4);
        miLocal.getRegistrointerno().add(operacion5);

        miLocal.encontrarMayorMontoAlquiler();

        miLocal.cantidadDeAlquileres();


    }
}