
package clases;

public class Cliente {
    private String Cedula;
    private int Edad;
    private String Nombre;

    public Cliente(String cedula, int edad, String nombre) {
        this.Cedula = cedula;
        this.Edad = edad;
        this.Nombre = nombre;
    }

    public Cliente(String string, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    Object getAuto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int ObtenerDescuento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
