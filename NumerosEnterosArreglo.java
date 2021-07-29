
public class NumerosEnterosArreglo {
    public static void main(String[] args) {
        
        int arreglo [];

        arreglo = new int[200];

        
        for (int i = 0; i<arreglo.length; i++ ){
            arreglo[i] = i+1;

            }

        for (int y = 0; y < arreglo.length; y++){
            if(arreglo[y]%2 == 0){
                System.out.println("El numero que se encuentra en la posicion"+ y + "es par: " + arreglo[y]);
            }
        }

    }

}
    


