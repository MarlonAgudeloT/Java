
package clases;

public class Auto {


    private String Placa;
    private int DiasDesdeUltimoMantenimiento;
    private boolean TieneSeguro;
    public boolean NecesitaMantenimiento;
    public boolean SePuedeRentar;

    public Auto() {
    }

    public Auto(String Placa, int DiasDesdeUltimoMantenimiento, boolean TieneSeguro) {
        this.Placa = Placa;
        this.DiasDesdeUltimoMantenimiento = DiasDesdeUltimoMantenimiento;
        this.TieneSeguro = TieneSeguro;
    }

    public String getPlaca() {
        return Placa;
    }

    public int getDiasDesdeUltimoMantenimiento() {
        return DiasDesdeUltimoMantenimiento;
    }

    public boolean isTieneSeguro() {
        return TieneSeguro;
    }

    public boolean NecesitaMantenimiento(){
       
        if (DiasDesdeUltimoMantenimiento<=20)
        {
            return false;
            
        }else{
            return true;
        }
    }
 
      public boolean SePuedeRentar (){
         
            if (TieneSeguro == true && DiasDesdeUltimoMantenimiento <=20 ){
                
            return true;
                       
            }else {
                return false;
            }
      }   


   }
