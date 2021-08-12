package clases;

import java.time.LocalDate;
 import java.time.temporal.ChronoUnit;

public class Alquiler {

    private Cliente cliente; //Esta es una relacion de composicion y por esto debe ir get
    private Auto auto; //Esta es una relacion de composicion y por esto debe ir get
    private LocalDate fecha;
    private int horasAlquiler;

    public Alquiler(Cliente cliente, Auto auto, LocalDate fecha, int horasAlquiler) {
        this.cliente = cliente; //Aca se hace la relacion composicion, por esto va en el constructor
        this.auto = auto; // Aca se hace la relacion composicion, por esto va en el constructor
        this.fecha = fecha;
        this.horasAlquiler = horasAlquiler;
    }

    public Alquiler(LocalDate fecha){
        this.fecha = fecha;
        
    }
    
    public Alquiler(int horasAlquiler){
        this.horasAlquiler = horasAlquiler;
    }

    public Alquiler() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Auto getAuto() {
        return auto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getHorasAlquiler() {
        return horasAlquiler;
    }
    
    
    public int ObtenerDescuento(Alquiler[] alquileres) {

        if (auto.NecesitaMantenimiento == false || auto.SePuedeRentar == true) {
            
            for (int i = 0; i < alquileres.length; i++){
                
                int dias;
                
                    dias = (int) ChronoUnit.DAYS.between(alquileres[i].getFecha(), getFecha());
                
                if(dias<=30){
                
                        int horasAcumuladas;
                
                        horasAcumuladas = alquileres[i].getHorasAlquiler()+getHorasAlquiler();
                        
                        if(horasAcumuladas>50){
                            
                            return 5;
                        
                        }if(horasAcumuladas>=20 && horasAcumuladas<=50){
                            
                       return 2;
                   }
                        
                        if (horasAcumuladas <20){
                              
                            return 0;
                         }
                    }
             }
        }else{
 
       
        } return 0;
    } 

    public int ObtenerDescuento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double CalcularCosto(boolean aplicaDescuento){
        if (aplicaDescuento == true){
            double valorHora = 5000.0;
            double cobrarDescuento;
            return cobrarDescuento = ((valorHora*getHorasAlquiler())*0.98);
        }else{
            double valorHora = 5000.0;
            double cobrarSin;
            return cobrarSin = valorHora*getHorasAlquiler() ; 
        }
       
    }

}
