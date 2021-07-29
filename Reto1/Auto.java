public class Auto {
    private String Placa;
    private int DiasDesdeUltimoMantenimiento;
    private boolean TieneSeguro;

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


    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public int getDiasDesdeUltimoMantenimiento() {
        return DiasDesdeUltimoMantenimiento;
    }


    public void setDiasDesdeUltimoMantenimiento(int DiasDesdeUltimoMantenimiento) {
        this.DiasDesdeUltimoMantenimiento = DiasDesdeUltimoMantenimiento;
    }


    public boolean isTieneSeguro() {
        return TieneSeguro;
    }

    public void setTieneSeguro(boolean TieneSeguro) {
        this.TieneSeguro = TieneSeguro;
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
