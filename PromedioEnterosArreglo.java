public class PromedioEnterosArreglo {

    
    public static void calcularPromedio(double datos[]){
        double ans = 0;
        
        for (double numero:datos){
                ans+=numero;
            }
            ans= ans/datos.length;
            System.out.println(" El promedio es" + ans);
            }


    public static void main(String[] args) {
        
        double arreglo [];

        arreglo = new double[200];

        
        for (int i = 0; i<arreglo.length; i++ ){
            arreglo[i] = i+1;

            }

        for (int y = 0; y < arreglo.length; y++){
            if(arreglo[y]%2 == 0){
                System.out.println("El numero que se encuentra en la posicion"+ y + "es par: " + arreglo[y]);

            }
            
        }
        calcularPromedio(arreglo);

    }

}
    

