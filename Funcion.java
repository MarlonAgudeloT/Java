public class Funcion {

    public static void saludar(){
        System.out.println("Hola Mundo");
    }
    public static double sumar(double a, double b){

            return a + b;
    }
    public static void main(String[] args) {
        
        saludar();
        System.out.println("la suma de 4 + 456 es = "+sumar(4,456));
    }
}
