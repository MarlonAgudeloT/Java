public class Acumulador {
   public static void main(String[] args) {
       int acumulador = 2;
    
       do{
           System.out.println("El valor de la i: "+ acumulador);
           acumulador +=10;
       }while (acumulador<1000);
       System.out.println("El valor final de i: "+ acumulador);
    } 
}
