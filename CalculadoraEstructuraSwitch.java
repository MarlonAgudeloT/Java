import java.util.Scanner;

public class CalculadoraEstructuraSwitch {

    public static float sumar (float numero1 , float numero2)
    {
    return numero1 + numero2;
    }
    public static float restar (float numero1, float numero2)
    {
        return numero1 - numero2;
    }
    public static float multiplicar ( float numero1, float numero2)
    {
        return numero1 * numero2;
    }
    public static float division (float numero1, float numero2)
    {
        return numero1 / numero2;
    }
    public static float residuo (float numero1, float numero2)
    {
        return numero1 % numero2;
    } 

        public static void main(String[] args) {

        System.out.println("Seleccionar entre las 5 opciones: ");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicación");
        System.out.println("4. división");
        System.out.println("5. residuo");
        System.out.println("6. salir");

        System.out.println("Ingrese el numero de la opcion elegida: ");

        Scanner lector = new Scanner (System.in);
        int opcion = lector.nextInt();

        if (opcion == 6) {
            System.out.println("Saliendo...");
            System.exit(0);
        } 
        if( (opcion > 6)||(opcion<0)){
            System.out.println("Opcion invalida");
            System.exit(0);
        }

        System.out.println("Ingrese el numero 1: ");
        float numero1 = lector.nextInt();
        System.out.println("Ingrese el numero 2: ");
        float numero2 = lector.nextInt();
        
        switch (opcion)
            {  
            case 1:
            System.out.println("La suma de "+ numero1 + "+" + numero2 + "es =" + sumar(numero1,numero2));
            break;
            case 2:
            System.out.println("La resta de "+ numero1 + "-" + numero2 + "es =" + restar(numero1,numero2));
            break;
            case 3: 
            System.out.println("La multiplicación de "+ numero1 + "*" + numero2 + "es =" + multiplicar(numero1,numero2));
            break;
            case 4: 
            System.out.println("La división de "+ numero1 + "/" + numero2 + "es =" + division(numero1,numero2));
            break;
            case 5: 
            System.out.println("El residuo de "+ numero1 + "%" + numero2 + "es =" + residuo(numero1,numero2));
            break; 
            
        }

    }
}