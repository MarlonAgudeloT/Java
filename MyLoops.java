import java.util.Scanner;
public class MyLoops{
    public static void main(String args[]) {
      
      Scanner sc=new Scanner(System.in);
      
      boolean condicion=(15>7);//true
      
      while(condicion){
          
          System.out.println("Condición= "+condicion);
          System.out.print("¿Desea cambiar la condición anterior?...Presione Si o No:");
          String seleccion=sc.next();
          System.out.println("Seleccionaste="+seleccion);
          //if (seleccion==="Si") //no funciona asi para cadenas en java
          //if("Si".equals(seleccion))
          if(seleccion.equals("Si"))
          {
            System.out.println("Condición anterior= "+condicion);
            condicion=(!condicion);
            System.out.println("Condición cambiada= "+condicion);
          }
      }
      
      
    }
}