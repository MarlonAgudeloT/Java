import java.util.Scanner; // Importamos Scanner para poder pedir numeros por consola

public class Saludar {

    public static void main(String [] args) {
        

    System.out.println("Ingrese un numero: ");

        Scanner lector = new Scanner (System.in);
        int dato = lector.nextInt();

    if (dato > 0) {
        System.out.println("Feliz día");
    }

    if(dato == 0){
        System.out.println("Vamos muy bien");
    }
    else if(dato < 0){
        System.out.println("Para atrás ni para coger impulso");
        }

    }
    
}
