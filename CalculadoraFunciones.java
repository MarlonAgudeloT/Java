import java.util.Scanner;

public class CalculadoraFunciones {

    public static float sumar(float numero1, float numero2) {
        return numero1 + numero2;
    }

    public static float restar(float numero1, float numero2) {
        return numero1 - numero2;
    }

    public static float multiplicar(float numero1, float numero2) {
        return numero1 * numero2;
    }

    public static float division(float numero1, float numero2) {
        return numero1 / numero2;
    }

    public static float residuo(float numero1, float numero2) {
        return numero1 % numero2;

    }

    public static void cuadratica(Double a, Double b, Double c) {
        double temp, x1, x2;
        temp = b * b - 4 * a * c;

        if (temp >= 1) {
            if (2 * a != 0) {
                x1 = -b - Math.sqrt(temp) / 2 * a;
                x2 = -b + Math.sqrt(temp) / 2 * a;
                System.out.println("Las raices son:");
                System.out.println("x1: " + x1);
                System.out.println("x2: " + x2);

            }

        }

    }

    public static void primos(int n) {
        int divisores = 2, contador = 2;

        while (contador<n)
        {
            if(n%contador == 0)
            {
                divisores ++;
                break;
            }
            contador++;
        }
        if(divisores>2)
        {
            System.out.println("El numero "+ n + " NO es primo");
        }
        else{
            System.out.println("El numero "+ n + " es primo");
        }
    }

    public static float numero1() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero 1: ");
        float numero1 = lector.nextInt();
        return numero1;

    }

    public static float numero2() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero 2: ");
        float numero2 = lector.nextInt();
        return numero2;

    }

    public static double numeroA() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero a: ");
        double a = lector.nextInt();
        return a;
    }

    public static double numeroB() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero b: ");
        double b = lector.nextInt();
        return b;
    }

    public static double numeroC() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero c: ");
        double c = lector.nextInt();
        return c;
    }
    public static int numeroN() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un numero para averiguar si es primo: ");
        int n = lector.nextInt();
        return n;
    }

    public static void main(String[] args) {

        System.out.println("Seleccionar entre las siguientes opciones: ");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicación");
        System.out.println("4. división");
        System.out.println("5. residuo");
        System.out.println("6. cuadratica");
        System.out.println("7. primos");
        System.out.println("8. salir");

        System.out.println("Ingrese el numero de la opcion elegida: ");

        Scanner lector = new Scanner(System.in);
        int opcion = lector.nextInt();

        /*if (opcion == 8) {
            System.out.println("Saliendo...");
            System.exit(0);
        } 
        if( (opcion > 8)||(opcion<0)){
            System.out.println("Opcion invalida");
            System.exit(0);
        }*/
        switch (opcion) {
            case 1 -> {
                float d = numero1();
                float e = numero2();
                System.out.println("La suma de " + d + "+" + e + "es =" + sumar(d, e));
                break;
            }

            case 2 -> {
                float d = numero1();
                float e = numero2();
                System.out.println("La resta de " + d + "-" + e + "es =" + restar(d, e));
                break;
            }
            case 3 -> {
                float d = numero1();
                float e = numero2();
                System.out.println("La multiplicación de " + d + "*" + e + "es =" + multiplicar(d, e));
                break;
            }

            case 4 -> {
                float d = numero1();
                float e = numero2();
                System.out.println("La división de " + d + "/" + e + "es =" + division(d, e));
                break;
            }

            case 5 -> {
                float d = numero1();
                float e = numero2();
                System.out.println("El residuo de " + d + "%" + e + "es =" + residuo(d, e));
                break;
            }
            case 6 -> {
                double a = numeroA();
                double b = numeroB();
                double c = numeroC();
                cuadratica(a, b, c);
                break;
            }
            case 7 ->{
                int n = numeroN();
                primos(n);
                
            }
            case 8 -> {
                System.out.println("Saliendo...");
                System.exit(0);
            }
            
            
            default ->
            {
                System.out.println("Usted a ingrersado una opcion invalida, por favor ingrese una opcion valida: ");
                
            }

        }

    }
}
