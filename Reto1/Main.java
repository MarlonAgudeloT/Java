public class Main {
    
    public static void main(String[] args) {
        
        Auto auto;
        
        auto = new Auto();
        
        auto.setPlaca("ADK847");
        auto.setDiasDesdeUltimoMantenimiento(25);
        auto.setTieneSeguro(true);
        //System.out.println(auto.NecesitaMantenimiento());
        System.out.println(auto.SePuedeRentar());
    }
}
