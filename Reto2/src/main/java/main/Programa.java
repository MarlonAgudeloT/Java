
package main;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

import clases.Alquiler;
import clases.Auto;
import clases.Cliente;


public class Programa {

    //private static boolean SePuedeRentar;
    //private static boolean NecesitaMantenimiento;
    
    public static void main(String[] args) {
        
        Auto auto = new Auto("DBZ645",2,true);
        
        //Auto auto1 = new Auto("DBZ645",2,true);//Auto de prueba
        
        Cliente cliente1 = new Cliente("1234",20,"Luis");
        //Alquiler horas = new Alquiler(26);
        //Alquiler fecha = new Alquiler(LocalDate.parse("2021-07-19"));
        Alquiler alquiler1 = new Alquiler (cliente1,auto,LocalDate.parse("2021-07-19"),26);
        
        Cliente cliente2 = new Cliente("5678",31,"Gio");
        Cliente cliente3 = new Cliente("91011",40,"Maria");
        
        
        Alquiler[] alquileres = {new Alquiler(cliente1,auto,LocalDate.parse("2021-06-12"),48),new Alquiler(cliente2,auto,LocalDate.parse("2021-07-12"),30),
                                 new Alquiler(cliente1,auto,LocalDate.parse("2021-07-14"),25),new Alquiler (cliente3,auto,LocalDate.parse("2021-07-14"),25),
                                new Alquiler(cliente1,auto,LocalDate.parse("2021-07-16"),8)};
        

        //int x = alquiler1.ObtenerDescuento(alquileres);
        
        //System.out.println(x);
        
        Alquiler alquiler_prueba = new Alquiler (cliente1,auto,LocalDate.parse("2021-07-19"),124);
        
        System.out.println(alquiler_prueba.CalcularCosto(true));
        
        
        /*auto.setPlaca("ADK847");
        auto.setDiasDesdeUltimoMantenimiento(2);
        auto.setTieneSeguro(true);*/
        //System.out.println(auto1.NecesitaMantenimiento());
        //System.out.println(auto1.SePuedeRentar());
        //System.out.println(alquiler1.ObtenerDescuento(alquileres));
        //Alquiler alquileres_2 = new Alquiler (cliente2,auto,LocalDate.parse("2021-06-12"),124);
        //alquileres_1.ObtenerDescuento(true);
        //Cliente Cliente;
        //Cliente = new Cliente("1234",28,"Marlon");
        //LocalDate AlquilerFecha = new Fecha("2012-01-01");
        //System.out.println(AutoNoEsValido(auto.SePuedeRentar(),auto.NecesitaMantenimiento()));
        //System.out.println("Este es el nombre del cliente "+Cliente.getNombre());
        //ArrayList<Alquiler> alquileres = new ArrayList<>();
        //Alquiler[] alquileres = {new Alquiler(Cliente,auto,("2012-01-01"),10)};
        
    }

}

