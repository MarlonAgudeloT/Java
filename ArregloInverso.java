public class ArregloInverso{


public static void main(String[] args) {
        
    int arreglo [];
    arreglo = new int [5];

    arreglo [0] = 4;
    arreglo [1] = 34;
    arreglo [2] = 12;
    arreglo [3] = 8;
    arreglo [4] = -2;

    for (int i = 4; i<arreglo.length; i--) 
    // Con arreglo.length sabemos la longitud del array
    //for(int i:arreglo)
    {
        System.out.println("En la posicion "+(i)+". " + "el valor almacenado es: "+ arreglo[i]);
        //System.out.println(i); // Esta es otra forma de mostrar la informacion
    }
}

}